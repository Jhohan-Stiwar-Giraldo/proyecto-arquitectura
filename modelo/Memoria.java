package modelo; 

public class Memoria{
    int[][] discoDuro = new int[6][32];
    int [][] RAM = new int[6][16];
    int [][] Registros = new int[6][5];
    public int[][] getDiscoDuro() {
        return discoDuro;
    }
    public void setDiscoDuro(int[][] discoDuro) {
        this.discoDuro = discoDuro;
    }
    public int[][] getRAM() {
        return RAM;
    }
    public void setRAM(int[][] rAM) {
        RAM = rAM;
    }
    public int[][] getRegistros() {
        return Registros;
    }
    public void setRegistros(int[][] registros) {
        Registros = registros;
    }
}