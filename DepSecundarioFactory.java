package TechInnovators;

import java.sql.SQLOutput;

public class DepSecundarioFactory  implements CEOFactory{
    @Override
    public CEO createEmpleado() {
        return null;
    }

    @Override
    public CEO createCEO() {
        return null;
    }

    @Override
    public CEO createDepSecundario() {
        System.out.println("Soy un nuevo departamento Secundario, puedo estar a las ordenes del Ceo y de algunos del primer Departamento");
        DepSecundario createDepSecundario = new DepSecundario("Logistics02", "Industria Fuerte", " 24 integrantes");
        return null;
    }

    @Override
    public CEO createDepPrincipal() {
        return null;
    }
}
