package com.spring.springdb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Employee implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private long salary;


}
