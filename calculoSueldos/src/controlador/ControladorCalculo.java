package controlador;
//
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloEmpleado;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ControladorCalculo {

    public DefaultTableModel generarTablaPorJSON(String ruta, DefaultTableModel model) {
        File file = new File(ruta);
        if (file.exists()) {
            InputStream is = null;
            try {
                is = new FileInputStream(ruta);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            String jsonTxt = "";
            try {
                jsonTxt = IOUtils.toString(is, "UTF-8");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            JSONObject json = new JSONObject(jsonTxt);
            JSONArray jsonArray = new JSONArray();
            try {
                jsonArray = json.getJSONArray("empleados");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (jsonArray.length() > 0) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    try {
                        JSONObject jsonIndice = jsonArray.getJSONObject(i);
                        model.addRow(new Object[]{jsonIndice.get("nombres"), jsonIndice.get("anios"), jsonIndice.get("sueldo"), jsonIndice.get("tipoEmpleado"), jsonIndice.get("sueldoBono")});
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return model;
    }

    public JSONObject guardarDatosTablaAJSON(DefaultTableModel model) {
        JSONObject jsonPreparado = new JSONObject();
        if (model.getRowCount() > 0) {
            JSONArray array = new JSONArray();
            for (int i = 0; i < model.getRowCount(); i++) {
                ModeloEmpleado empleado = new ModeloEmpleado(model.getValueAt(i, 0).toString(), Integer.parseInt(model.getValueAt(i, 1).toString()), Double.valueOf(model.getValueAt(i, 2).toString()));
                JSONObject objetoJSON = new JSONObject();
                objetoJSON.put("nombres", empleado.getNombres());
                objetoJSON.put("anios", empleado.getAnios());
                objetoJSON.put("sueldo", empleado.getSueldo());
                objetoJSON.put("tipoEmpleado", empleado.getTipoEmpleado());
                objetoJSON.put("sueldoBono", empleado.getSueldoBono());
                array.put(objetoJSON);
            }
            jsonPreparado.put("empleados", array);
        }
        return jsonPreparado;
    }

    public int calcularAnios(LocalDate fecha) {
        Period anios = Period.between(fecha, LocalDate.now());
        return anios.getYears();
    }

}
