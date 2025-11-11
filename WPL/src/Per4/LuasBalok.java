package Per4;

public class LuasBalok extends RumusBalok {

    public LuasBalok(Double p, Double l, Double t) {
        super(p, l, t);
    }

    @Override
    public Double HitungBalok() {
        Double p = getPanjang();
        Double l = getLebar();
        Double t = getTinggi();

        return 2 * ((p * l) + (p * t) + (l * t));
    }
}