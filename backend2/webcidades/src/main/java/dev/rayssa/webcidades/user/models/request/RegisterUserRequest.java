package dev.rayssa.webcidades.user.models.request;

import org.springframework.data.annotation.Id;

public class RegisterUserRequest {

    private String name;
    private String email;
    private String password;
    private String uf;
    private String city;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUf() {
        return uf;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "RegisterUserRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", uf='" + uf + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
