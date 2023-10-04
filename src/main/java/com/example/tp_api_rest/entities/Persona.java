package com.example.tp_api_rest.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Persona extends Base {

    @Column(name = "nombre")
    private String name;

    @Column(name="apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    //relacion persona a domicilio
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    //relacion persona a libro
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) //orphanRemoval true indica que al eliminar una persona se van a eliminar sus libros
    @JoinTable(
            name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<>();

}
