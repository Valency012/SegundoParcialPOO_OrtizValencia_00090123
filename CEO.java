package TechInnovators;

public class CEO {
    //atributos
    private String nombre;
    private String cargo;
    private int edad;

    private String ID;

    //constructor
    public CEO(String nombre, String cargo, int edad, String ID) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.edad = edad;
        this.ID = ID;
    }
    //getters and setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
