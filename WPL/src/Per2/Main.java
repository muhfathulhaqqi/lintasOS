/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    // Run | Debug | Main.java
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Login user1 = new Login("admin", "123"); // default admin
        Login user2 = null; // user tambahan
        int pilih = 0;

        while (pilih != 5) {
            System.out.println("\n=== MENU LOGIN ===");
            System.out.println("1. Login Admin");
            System.out.println("2. Tambah Username");
            System.out.println("3. Ubah Password");
            System.out.println("4. Lihat Data User");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = Integer.parseInt(br.readLine());

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Username: ");
                    String u = br.readLine();
                    System.out.print("Masukkan Password: ");
                    String p = br.readLine();

                    if (u.equals(user1.getUsername()) && p.equals(user1.getPassword())) {
                        System.out.println("LOGIN BERHASIL!");
                    } else {
                        System.out.println("LOGIN GAGAL!");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan Username Baru: ");
                    String newUser = br.readLine();
                    System.out.print("Masukkan Password Baru: ");
                    String newPass = br.readLine();
                    user2 = new Login(newUser, newPass);
                    System.out.println("\nUSER BERHASIL DITAMBAH!");
                    break;

                case 3:
                    System.out.print("Masukkan Password Lama: ");
                    String oldPass = br.readLine();

                    if (oldPass.equals(user1.getPassword())) {
                        System.out.print("Masukkan Password Baru: ");
                        String newPassword = br.readLine();
                        user1.setPassword(newPassword);
                        System.out.println("\nPASSWORD BERHASIL DIUBAH!");
                    } else {
                        System.out.println("\nPASSWORD LAMA SALAH!");
                    }
                    break;

                case 4:
                    System.out.println("\n=== Data User ===");
                    System.out.println("Username : " + user1.getUsername());
                    System.out.println("Password : " + user1.getPassword());
                    if (user2 != null) {
                        System.out.println("Username : " + user2.getUsername());
                        System.out.println("Password : " + user2.getPassword());
                    }
                    break;

                case 5:
                    System.out.println("\nKeluar dari program...");
                    break;

                default:
                    System.out.println("\nMenu tidak tersedia!");
            }
        }
    }
}

class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

