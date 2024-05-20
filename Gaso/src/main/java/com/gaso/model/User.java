package com.gaso.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Object getPassword() {
        return null;
    }

    // Getters and setters...
}
