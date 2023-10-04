package com.example.tp_api_rest.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@Table(name ="libro")
public class Libro extends Base {

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @Column(name = "titulo")
    private String titulo;

    //relacion libro a autor
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
