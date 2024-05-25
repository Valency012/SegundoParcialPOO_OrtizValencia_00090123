package TechInnovators;

public class Empleado {
    //atributos del empleado
    private String nombreEmpleado;
    private String edad;
    private String IDempleado;

    private String cargo;

    //constructor
    public Empleado(String nombreEmpleado, String edad, String IDempleado, String cargo) {
        this.nombreEmpleado = nombreEmpleado;
        this.edad = edad;
        this.IDempleado = IDempleado;
        this.cargo = cargo;
    }
    //get y setters

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIDempleado() {
        return IDempleado;
    }

    public void setIDempleado(String IDempleado) {
        this.IDempleado = IDempleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
