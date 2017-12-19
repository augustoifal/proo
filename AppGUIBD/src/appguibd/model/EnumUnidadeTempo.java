/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appguibd.model;

import static appguibd.model.EnumStatus.values;

/**
 *
 * @author Augusto
 */
public enum EnumUnidadeTempo {
    SEGUNDO(1), MINUTO(2), HORA(3), DIA(4), MES(5), ANO(6);

    public int getId() {
        return id;
    }

    private final int id;

    EnumUnidadeTempo(int id) {
        this.id = id;
    }

    public static EnumUnidadeTempo getById(int id) {
        for (EnumUnidadeTempo e : values()) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }

}
