package com.example.neoflex.Hack30.entity;

import org.jetbrains.annotations.NotNull;

//import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

//@Entity
public class User {
//    @Id
//    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
