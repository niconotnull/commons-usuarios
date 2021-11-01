package com.springboot.commons.usuarios.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 30)
    private String nombre;
}
