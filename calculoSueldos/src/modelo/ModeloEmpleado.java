package modelo;

import java.util.Objects;

public class ModeloEmpleado {

    String nombres;
    int anios;
    Double sueldo;
    String tipoEmpleado;
    Double sueldoBono;

    public ModeloEmpleado() {
    }

    public ModeloEmpleado(String nombres, int anios, Double sueldo) {
        this.nombres = nombres;
        this.anios = anios;
        this.sueldo = sueldo;
        switch ((0 <= anios && anios < 5) ? 0 : (5 <= anios && anios < 15) ? 1 : (15 <= anios) ? 2 : 3) {
            case 0:
                this.tipoEmpleado = "junior";
                this.sueldoBono = sueldo;
                break;
            case 1:
                this.tipoEmpleado = "senior";
                this.sueldoBono = sueldo * 1.1;
                break;
            case 2:
                this.tipoEmpleado = "veterano";
                this.sueldoBono = sueldo * 1.2;
                break;
        }

    }

    public ModeloEmpleado(String nombres, int anios, Double sueldo, String tipoEmpleado, Double sueldoBono) {
        this.nombres = nombres;
        this.anios = anios;
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
        this.sueldoBono = sueldoBono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Double getSueldoBono() {
        return sueldoBono;
    }

    public void setSueldoBono(Double sueldoBono) {
        this.sueldoBono = sueldoBono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModeloEmpleado other = (ModeloEmpleado) obj;
        if (this.anios != other.anios) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.tipoEmpleado, other.tipoEmpleado)) {
            return false;
        }
        if (!Objects.equals(this.sueldo, other.sueldo)) {
            return false;
        }
        return Objects.equals(this.sueldoBono, other.sueldoBono);
    }

    @Override
    public String toString() {
        return "ModeloEmpleado{" + "nombres=" + nombres + ", anios=" + anios + ", sueldo=" + sueldo + ", tipoEmpleado=" + tipoEmpleado + ", sueldoBono=" + sueldoBono + '}';
    }

}
