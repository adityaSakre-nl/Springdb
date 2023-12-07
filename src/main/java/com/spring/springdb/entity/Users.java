package com.spring.springdb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Users implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String password;

    private boolean canSignUp;
}
