package org.example;

public interface Visitor {
    void verificarLaptop(Laptop laptop);
    void verificarCelular(Celular celular);
    void verificarRoteador(Roteador roteador);
}
