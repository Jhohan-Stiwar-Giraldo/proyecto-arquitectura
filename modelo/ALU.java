package modelo;

public class ALU{

    int dir1[]= new int[6];
    int dir2[] = new int[6];
    int codop[] = new int[4];

    public ALU (int dir1[], int dir2[], int codop[]){
        this.codop= codop;
        this.dir1=dir1;
        this.dir2=dir2;
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
    
    public int[] getCodop() {
        return codop;
    }
    public int[] getDir1() {
        return dir1;
    }
    public int[] getDir2() {
        return dir2;
    }


}