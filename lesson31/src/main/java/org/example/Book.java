package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private Integer pages;
    @Column(name = "author")
    private String person;
    @Temporal(TemporalType.DATE)
    private Date date;
    private Boolean isOnStock = true;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @Embedded
    private Price price;


}
