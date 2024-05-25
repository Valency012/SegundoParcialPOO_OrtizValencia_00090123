package TechInnovators;

public class EmpleadoFactory implements CEOFactory{
    @Override
    public CEO createEmpleado() {
        System.out.println("Soy un nuevo empleado, tratenme bien, soy nuevo");
        Empleado createEmpleado = new Empleado("Juan Perez", "30 años", "75822", "Ing. Civil");
        return null;
    }
    @Override
    public CEO createDepPrincipal() {
        return null;
    }

    @Override
    public CEO createDepSecundario() {
        return null;
    }

    @Override
    public CEO createCEO() {
        return null;
    }
}

