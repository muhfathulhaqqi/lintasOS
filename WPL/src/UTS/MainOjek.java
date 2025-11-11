import java.util.Scanner;
import java.text.DecimalFormat;

class OjekOnline {
    protected double total;
    protected double pembayaran;

    public OjekOnline(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public double getPembayaran() {
        return pembayaran;
    }

    public void hitungPembayaran() {
        pembayaran = total;
    }
}

class Gojek extends OjekOnline {
    public Gojek(double total) {
        super(total);
    }

    @Override
    public void hitungPembayaran() {
        pembayaran = total - (total * 0.05);
    }
}

class Grab extends OjekOnline {
    public Grab(double total) {
        super(total);
    }

    @Override
    public void hitungPembayaran() {
        pembayaran = total - (total * 0.10);
    }
}

class Uber extends OjekOnline {
    public Uber(double total) {
        super(total);
    }

    @Override
    public void hitungPembayaran() {
        pembayaran = total - (total * 0.15);
    }
}

public class MainOjek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        System.out.print("Masukkan total biaya perjalanan: Rp ");
        double total = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Pilih aplikasi (Gojek / Grab / Uber): ");
        String pilihan = sc.nextLine();

        OjekOnline ojol;

        if (pilihan.equalsIgnoreCase("Gojek")) {
            ojol = new Gojek(total);
        } else if (pilihan.equalsIgnoreCase("Grab")) {
            ojol = new Grab(total);
        } else if (pilihan.equalsIgnoreCase("Uber")) {
            ojol = new Uber(total);
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        ojol.hitungPembayaran();
        System.out.println("\n=== Rincian Pembayaran ===");
        System.out.println("Total sebelum diskon: Rp " + df.format(ojol.getTotal()));
        System.out.println("Total setelah diskon: Rp " + df.format(ojol.getPembayaran()));
    }
}