import java.util.Scanner;

public class Rekening {
    private String noRek;
    private String nama;
    private int saldo;

    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNoRek() {
        return noRek;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public void menabung(int jumlah) {
        saldo += jumlah;
    }

    public void tarik(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak cukup!");
        }
    }

    public void cekSaldo() {
        System.out.println("Saldo anda: " + saldo);
    }
}

class MainATM extends Rekening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rekening acc = new Rekening();

        System.out.print("Inputkan No Rekening: ");
        acc.setNoRek(sc.nextLine());
        System.out.print("Inputkan Nama: ");
        acc.setNama(sc.nextLine());
        System.out.print("Inputkan Saldo awal: ");
        acc.setSaldo(sc.nextInt());

        int pilihan;
        do {
            System.out.println("\nSaldo ada " + acc.getSaldo());
            System.out.println("1. Menabung");
            System.out.println("2. Tarik Uang");
            System.out.println("3. Cek Saldo");
            System.out.println("0. Keluar");
            System.out.print("Silakan pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Inputkan nominal: ");
                    acc.menabung(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Inputkan nominal: ");
                    acc.tarik(sc.nextInt());
                    break;
                case 3:
                    acc.cekSaldo();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
