package TechInnovators;

public class DepPrincipalFactory implements CEOFactory{
    @Override
    public CEO createCEO() {
        return null;
    }

    @Override
    public CEO createDepPrincipal() {
        System.out.println("Soy un nuevo departamento principal, bajo las ordenes del CEO");
        DepPrincipal createPrinciapal = new DepPrincipal("Logistics1", "Santa Tecla", " Tintoñeria");
        return null;
    }

    @Override
    public CEO createDepSecundario() {
        return null;
    }

    @Override
    public CEO createEmpleado() {
        return null;
    }
}
