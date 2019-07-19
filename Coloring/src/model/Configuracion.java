package model;

public class Configuracion {
    private int k; //not sure
    private int nota;
    private int[] casos;

    public Configuracion(int k, int nota, int[] casos) {
        this.k = k;
        this.nota = nota;
        this.casos = casos;
    }

    public Configuracion() {
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int[] getCasos() {
        return casos;
    }

    public void setCasos(int[] casos) {
        this.casos = casos;
    }
}
