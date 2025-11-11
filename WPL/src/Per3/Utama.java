public class Utama {
    public static void main(String[] args){
        Manusiaa[] mns = new Manusiaa[4];
        mns[0] = new Manusiaa();
        mns[1] = new Mahasiswaa();
        mns[2] = new Dosen();
        mns[3] = new Programmer();

        for(int i=0; i<mns.length;i++){
            mns[i].aktivitas();
            System.out.println("");
        }
    }
}
