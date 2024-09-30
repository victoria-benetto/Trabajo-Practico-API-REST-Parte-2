package com.example.inicial1.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Audited

@Table(name = "libro")
public class Libro extends Base{


    @Column(name= "gemero")
    private String genero;

    @Column(name= "titulo")
    private String titulo;

    @Column(name= "paginas")
    private int paginas;

    @Column(name= "fecha")
    private int fecha;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
