public class Mahasiswaaa {
    public double hitungBiayaKuliah(int sks){
        return 0;
    }
}

class MahasiswaS1 extends Mahasiswaaa{
    @Override
    public double hitungBiayaKuliah(int sks){
        return sks * 150000;
    }
}

class MahasiswaS2 extends Mahasiswaaa{
    @Override
    public double hitungBiayaKuliah(int sks){
        return sks * 250000;
    }
}

class MahasiswaS3 extends Mahasiswaaa{
    @Override
    public double hitungBiayaKuliah(int sks){
        return sks * 400000;
    }
}
