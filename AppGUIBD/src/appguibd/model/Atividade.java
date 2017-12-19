/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Augusto
 */
public class Atividade {

    String descricao;
    TipoAtividade tipoAtividade;
    Date dataInicio;
    Date dataFinal;
    EnumStatus status;
    List<Tarefa> tarefas;
    Usuario responsavel;

    public long duracaoTotal(EnumUnidadeTempo tipoTempo) {
        long tempo = 0;
        for (Tarefa t : tarefas) {
            tempo += t.duracaoEmMinutos();
        }

        if (tipoTempo.equals(EnumUnidadeTempo.HORA)) {
            tempo /= 60;
        }

        if (tipoTempo.equals(EnumUnidadeTempo.DIA)) {
            tempo /= 1440;
        }
        return tempo;
    }

    public double custoTotal() {
        double custo = 0;
        for (Tarefa t : tarefas) {
            custo += t.custoTotal();
        }
        return custo;
    }

    public List<Usuario> pessoasAlocadas() {
        List<Usuario> listaPessoas = new ArrayList<>();

        for (Tarefa t : tarefas) {
            listaPessoas.add(t.getResponsavel());
        }
        return listaPessoas;
    }

    public List<Recurso> recursosAlocados() {
        List<Recurso> listaRecursos = new ArrayList<>();

        for (Tarefa t : tarefas) {
            listaRecursos.addAll(t.getRecursos());
        }
        return listaRecursos;
    }

}
