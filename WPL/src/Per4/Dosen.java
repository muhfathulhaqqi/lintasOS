package Per4;

public class Dosen extends Manusia{
    public void aktivitas(){
        System.out.println("Dosen: Mengajar");
    } 
}
class Utama {
    public static void main(String[] args){
    Dosen dos= new Dosen();
    dos.aktivitas();
    dos.berbicara();
    }
}