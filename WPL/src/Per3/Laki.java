public class Laki extends Manusiaaa {
    public Laki(double tb) {
        super(tb);
    }
    @Override
    public double HtgBB() {
        return (super.getTinggiBadan() - 100) * 0.9;
    }
}
