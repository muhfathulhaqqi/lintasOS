/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Per2;

public class Login {
    private String username;
    private String password;

    // Constructor tanpa parameter (nilai default)
    public Login() {
        this.username = "admin";
        this.password = "123456";
    }

    // Constructor dengan parameter
    public Login(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    // Setter
    public void setUsername(String user) {
        this.username = user;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    // Getter
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
