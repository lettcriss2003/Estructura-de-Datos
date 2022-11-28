package controlador;

import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloEmpleado;
import org.json.JSONException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControladorCalculo {

    public DefaultTableModel generarTablaPorJSONArray(String ruta, DefaultTableModel model) {
        File file = new File(ruta);
        if (file.exists()) {
            ModeloEmpleado[] listaEmpleados = null;
            try {
                FileReader archivo = new FileReader(ruta);
                listaEmpleados = new GsonBuilder().create().fromJson(archivo, ModeloEmpleado[].class);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            if (listaEmpleados != null) {
                for (int i = 0; i < listaEmpleados.length; i++) {
                    try {
                        model.addRow(new Object[]{listaEmpleados[i].getNombres(), listaEmpleados[i].getAnios(), listaEmpleados[i].getSueldo(), listaEmpleados[i].getTipoEmpleado(), listaEmpleados[i].getSueldoBono()});
                    } catch (JSONException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }
        return model;
    }
    
    public DefaultTableModel generarTablaPorJSONLista(String ruta, DefaultTableModel model) {
        File file = new File(ruta);
        if (file.exists()) {
            List<ModeloEmpleado> listaEmpleados = new ArrayList<>();
            try {
                FileReader archivo = new FileReader(ruta);
                listaEmpleados = Arrays.asList(new GsonBuilder().create().fromJson(archivo, ModeloEmpleado[].class));
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            if (listaEmpleados != null) {
                for (int i = 0; i < listaEmpleados.size(); i++) {
                    try {
                        model.addRow(new Object[]{listaEmpleados.get(i).getNombres(), listaEmpleados.get(i).getAnios(), listaEmpleados.get(i).getSueldo(), listaEmpleados.get(i).getTipoEmpleado(), listaEmpleados.get(i).getSueldoBono()});
                    } catch (JSONException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
        }
        return model;
    }

    public String guardarDatosTablaAJSONArray(DefaultTableModel model) {
        Gson arreglo = new GsonBuilder().setPrettyPrinting().create();
        ModeloEmpleado[] listaEmpleados = new ModeloEmpleado[model.getRowCount()];
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                ModeloEmpleado empleado = new ModeloEmpleado(model.getValueAt(i, 0).toString(), Integer.parseInt(model.getValueAt(i, 1).toString()), Double.valueOf(model.getValueAt(i, 2).toString()));
                listaEmpleados[i] = empleado;
            }
        }
        return arreglo.toJson(listaEmpleados);
    }

    public String guardarDatosTablaAJSONLista(DefaultTableModel model) {
        Gson arreglo = new GsonBuilder().setPrettyPrinting().create();
        List<ModeloEmpleado> listaEmpleados = new ArrayList<>();
        if (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); i++) {
                ModeloEmpleado empleado = new ModeloEmpleado(model.getValueAt(i, 0).toString(), Integer.parseInt(model.getValueAt(i, 1).toString()), Double.valueOf(model.getValueAt(i, 2).toString()));
                listaEmpleados.add(empleado);
            }
        }
        return arreglo.toJson(listaEmpleados);
    }

    public int calcularAnios(LocalDate fecha) {
        Period anios = Period.between(fecha, LocalDate.now());
        return anios.getYears();
    }

}
