package beans;

public class Concepto {
    String codigo;
    String incluidoExcluido;
    double importe;

    public Concepto(String codigo, String incluidoExcluido, double importe) {
        this.codigo = codigo;
        this.incluidoExcluido = incluidoExcluido;
        this.importe = importe;
    }
}
