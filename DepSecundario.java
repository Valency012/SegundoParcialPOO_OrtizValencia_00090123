package TechInnovators;

public class DepSecundario {
    //atributos
    private String nombreDep2;
    private String funcionalidad;

    private String integrantes;

    //constructor
    public DepSecundario(String nombreDep2, String funcionalidad, String integrantes) {
        this.nombreDep2 = nombreDep2;
        this.funcionalidad = funcionalidad;
        this.integrantes = integrantes;
    }
    //getters and setters

    public String getNombreDep2() {
        return nombreDep2;
    }

    public void setNombreDep2(String nombreDep2) {
        this.nombreDep2 = nombreDep2;
    }

    public String getFuncionalidad() {
        return funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }
}
