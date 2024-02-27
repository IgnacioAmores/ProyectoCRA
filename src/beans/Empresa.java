package beans;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String codigoCuentaCotizacion;
    private String año;
    private String mes;
    private List<Trabajador> trabajadores;

    public Empresa(String codigoCuentaCotizacion, String año, String mes) {
        this.codigoCuentaCotizacion = codigoCuentaCotizacion;
        this.año = año;
        this.mes = mes;
        this.trabajadores = new ArrayList<>();
    }

}
