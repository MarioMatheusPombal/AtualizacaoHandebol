package com.campeonato.spring.handebol.orm;

import jakarta.persistence.*;
import org.springframework.data.repository.query.parser.Part;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "campeonatos")
public class Campeonato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nomecampeonato")
    private String nome;
    @OneToOne
    private Time time1;
    @OneToOne
    private Time time2;
    @OneToOne
    private Partida partida1;
    @OneToOne
    private Partida partida2;

    private String classificacao;

    public Campeonato() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime1() {
        return time1;
    }

    public void setTime1(Time time1) {
        this.time1 = time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void setTime2(Time time2) {
        this.time2 = time2;
    }

    public Partida getPartida1() {
        return partida1;
    }

    public void setPartida1(Partida partida1) {
        this.partida1 = partida1;
    }

    public Partida getPartida2() {
        return partida2;
    }

    public void setPartida2(Partida partida2) {
        this.partida2 = partida2;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Campeonato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", time1=" + time1 +
                ", time2=" + time2 +
                ", partida1=" + partida1 +
                ", partida2=" + partida2 +
                ", classificacao='" + classificacao + '\'' +
                '}';
    }
}
