package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificacaoSegurancaVisitorTest {

    @Test
    void deveVerificarLaptop() {
        Laptop laptop = new Laptop("usuarioLaptop");
        VerificacaoSegurancaVisitor visitor = new VerificacaoSegurancaVisitor();


        laptop.aceitar(visitor);


        assertNotNull(laptop.getUsuario());
        assertEquals("usuarioLaptop", laptop.getUsuario());
    }

    @Test
    void deveVerificarCelular() {
        Celular celular = new Celular("11999998888");
        VerificacaoSegurancaVisitor visitor = new VerificacaoSegurancaVisitor();

        celular.aceitar(visitor);

        assertNotNull(celular.getNumeroTelefone());
        assertEquals("11999998888", celular.getNumeroTelefone());
    }

    @Test
    void deveVerificarRoteador() {
        Roteador roteador = new Roteador("192.168.0.1");
        VerificacaoSegurancaVisitor visitor = new VerificacaoSegurancaVisitor();

        roteador.aceitar(visitor);

        assertNotNull(roteador.getIp());
        assertEquals("192.168.0.1", roteador.getIp());
    }
}