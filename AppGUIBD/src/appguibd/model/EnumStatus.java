/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.model;

/**
 *
 * @author Augusto
 */
public enum EnumStatus {
    INICIADA(1, "Iniciada"),
    PENDENTE(2, "Pendente"),
    FINALIZADA(3, "Finalizada");

    private int id;
    private String nome;

    EnumStatus(int id, String nome) {
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

    public static EnumStatus getById(int id) {
        for (EnumStatus e : values()) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }
}
