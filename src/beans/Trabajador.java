package beans;

import java.util.ArrayList;
import java.util.List;

import beans.Concepto;

public class Trabajador {
    String NAF;
    List<Concepto> conceptos;

    public Trabajador(String NAF) {
        this.NAF = NAF;
        this.conceptos = new ArrayList<>();
    }
}
