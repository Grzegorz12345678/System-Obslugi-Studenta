package com.example.SOS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Sale")
public class Sala {

    @Id
    @GeneratedValue
    @Column(name = "id_sali")
    private int idSali;
    @Column(name = "nazwa")
    private String nazwa;
    @Column(name = "liczba_miejsc")
    private int liczbaMiejsc;

}
