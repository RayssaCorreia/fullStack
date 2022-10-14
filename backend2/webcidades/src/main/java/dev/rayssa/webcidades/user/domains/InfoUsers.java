//#### MODELO DO BANCO DE DADOS ####//
package dev.rayssa.webcidades.user.domains;

import org.springframework.data.annotation.Id;

public class InfoUsers {

    @Id
    private String userId;

    private String email;
    private String uf;
    private String password;
    private String city;
    private String token;
    private Boolean isLogged;
    private String name;

    public static void put(String email, InfoUsers userModel) {
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getLogged() {
        return isLogged;
    }

    public void setLogged(Boolean logged) {
        isLogged = logged;
    }

    @Override
    public String toString() {
        return "InfoUsers{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", uf='" + uf + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", token='" + token + '\'' +
                ", isLogged=" + isLogged +
                '}';
    }
}
