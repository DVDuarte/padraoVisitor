package org.example;

public class Laptop implements Dispositivo {

    private String usuario;

    public Laptop(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.verificarLaptop(this);
    }
}