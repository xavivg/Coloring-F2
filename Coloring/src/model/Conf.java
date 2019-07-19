package model;

public class Conf {

    private int boardDimension;
    private int numRegions;
    private int[][] regions;
    private boolean[][] adjacencies;

    public Conf() {
    }

    public int getBoardDimension() {
        return boardDimension;
    }

    public void setBoardDimension(int boardDimension) {
        this.boardDimension = boardDimension;
    }

    public int getNumRegions() {
        return numRegions;
    }

    public void setNumRegions(int numRegions) {
        this.numRegions = numRegions;
    }

    public int[][] getRegions() {
        return regions;
    }

    public void setRegions(int[][] regions) {
        this.regions = regions;
    }

    public boolean[][] getAdjacencies() {
        return adjacencies;
    }

    public void setAdjacencies(boolean[][] adjacencies) {
        this.adjacencies = adjacencies;
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
