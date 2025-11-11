public class Perempuan extends Manusiaaa {
    public Perempuan(double tb) {
        super(tb);
    }

    @Override
    public double HtgBB() {
        return (super.getTinggiBadan() - 100) * 0.8;
    }


}
