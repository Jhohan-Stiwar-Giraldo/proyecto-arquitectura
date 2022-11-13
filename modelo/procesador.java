package modelo;

public class Procesador{
    int MAR[] = new int[6];
    int MBR[] = new int[6];
    String UC = new String();
    int PC[] = new int[16];
    int IR[] = new int[16];
    int AC[] = new int[6];

    int dir1[]= new int[6];
    int dir2[] = new int[6];
    int codop[] = new int[4];

    ALU alu = new ALU(dir1, dir2, codop);

    public Procesador(int MAR[], int MBR[], String UC, int PC[], int IR[],
                      int AC[], int dir1[], int dir2[], int codop[] ){
        this.MAR=MAR;
        this.MBR=MBR;
        this.UC=UC;
        this.PC=PC;
        this.IR=IR;
        this.AC=AC;
        this.dir1=dir1;
        this.dir2=dir2;
        this.codop=codop;
    }
    public void setAC(int[] aC) {
        AC = aC;
    }
    public void setAlu(ALU alu) {
        this.alu = alu;
    }
    public void setCodop(int[] codop) {
        this.codop = codop;
    }
    public void setDir1(int[] dir1) {
        this.dir1 = dir1;
    }
    public void setDir2(int[] dir2) {
        this.dir2 = dir2;
    }
    public void setIR(int[] iR) {
        IR = iR;
    }
    public void setMAR(int[] mAR) {
        MAR = mAR;
    }
    public void setMBR(int[] mBR) {
        MBR = mBR;
    }
    public void setPC(int[] pC) {
        PC = pC;
    }
    public void setUC(String uC) {
        UC = uC;
    }
    
    public int[] getAC() {
        return AC;
    }
    public ALU getAlu() {
        return alu;
    }
    public int[] getCodop() {
        return codop;
    }
    public int[] getDir1() {
        return dir1;
    }
    public int[] getDir2() {
        return dir2;
    }
    public int[] getIR() {
        return IR;
    }
    public int[] getMAR() {
        return MAR;
    }
    public int[] getMBR() {
        return MBR;
    }public int[] getPC() {
        return PC;
    }
    public String getUC() {
        return UC;
    }



}