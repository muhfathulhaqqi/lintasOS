public class Dosen extends Manusiaa{
    public void aktivitas(){
        System.out.println("Aktivitas Dosen: Mengajar");
    }

    public static void main(String[] args){
        Dosen dosen1 = new Dosen();
        Manusiaa manusia1 = new Manusiaa();
        dosen1.aktivitas();
        manusia1.aktivitas();
    }
}
