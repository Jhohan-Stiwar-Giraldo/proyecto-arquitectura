package modelo;

public class Bus {
    int bDatos[]= new int[6];
    int bControl[]= new int[4];
    int bIntruccion[]= new int[16];
    public int[] getbDatos() {
        return bDatos;
    }
    public void setbDatos(int[] bDatos) {
        this.bDatos = bDatos;
    }
    public int[] getbControl() {
        return bControl;
    }
    public void setbControl(int[] bControl) {
        this.bControl = bControl;
    }
    public int[] getbIntruccion() {
        return bIntruccion;
    }
    public void setbIntruccion(int[] bIntruccion) {
        this.bIntruccion = bIntruccion;
    }
}