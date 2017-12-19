/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class Tarefa {

    private int id;
    private String nome;
    private Usuario responsavel;
    private Date dataInicio;
    private Date dataFim;
    private List<Recurso> recursos;

    public Tarefa() {
    }

    public Tarefa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public double custoTotal() {
        double total = 0;
        for (Recurso r : recursos) {
            total += r.getCusto();
        }
        return total;
    }

    public long duracaoEmMinutos() {
        long tempoMillis = this.dataFim.getTime() - this.dataInicio.getTime();
        return tempoMillis / 60000;
    }

    public long duracaoEmHoras() {
        return duracaoEmMinutos() / 60;
    }
}
