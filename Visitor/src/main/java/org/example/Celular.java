package org.example;

public class Celular implements Dispositivo {

    private String numeroTelefone;

    public Celular(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.verificarCelular(this);
    }
}

