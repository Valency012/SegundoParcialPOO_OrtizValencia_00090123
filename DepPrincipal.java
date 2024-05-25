package TechInnovators;

public class DepPrincipal {
    //atributos del dep principal
    private String nombreDep;
    private String direccion;
    private String funcionalidad;

    //construtor
    public DepPrincipal(String nombreDep, String direccion, String funcionalidad) {
        this.nombreDep = nombreDep;
        this.direccion = direccion;
        this.funcionalidad = funcionalidad;
    }
    //getters y setters
    public String getNombreDep() {
        return nombreDep;
    }

    public void setNombreDep(String nombreDep) {
        this.nombreDep = nombreDep;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }
}
