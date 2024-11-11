package org.example;

public class Roteador implements Dispositivo {

    private String ip;

    public Roteador(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.verificarRoteador(this);
    }
}
