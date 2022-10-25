package com.example.conectarigualdad;

public enum TipoEventoEnum {
    VIRTUAL("Virtual", 1),
    PRESENCIAL("Presencial", 2);

    private String tipo;
    private int index;

    TipoEventoEnum(String type, int index)
    {
        this.tipo = type;
        this.index = index;
    }

    public String GetTipoEvento()
    {
        return tipo;
    }

    public int GetIndex()
    {
        return index;
    }
}
