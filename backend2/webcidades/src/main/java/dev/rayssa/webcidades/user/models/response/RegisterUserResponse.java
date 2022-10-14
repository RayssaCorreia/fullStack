package dev.rayssa.webcidades.user.models.response;

public class RegisterUserResponse {

    private String email;
    private String uf;
    private String city;
    private String token;
    private Boolean isLogged;
    private String name;

    public RegisterUserResponse() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RegisterUserResponse{" +
                "email='" + email + '\'' +
                ", uf='" + uf + '\'' +
                ", city='" + city + '\'' +
                ", token='" + token + '\'' +
                ", isLogged=" + isLogged +
                ", name='" + name + '\'' +
                '}';
    }
}
