package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificacaoSegurancaVisitorTest {

    @Test
    void deveVerificarLaptop() {
        Laptop laptop = new Laptop("usuarioLaptop");
        VerificacaoSegurancaVisitor visitor = new VerificacaoSegurancaVisitor();

        // Simulamos a verificação de permissões do laptop
        laptop.aceitar(visitor);

        // Aqui, poderíamos validar se a verificação do laptop ocorreu corretamente.
        // Como o método `aceitar` apenas imprime para o console, o assert seria um exemplo para fins de prática.
        assertNotNull(laptop.getUsuario());
        assertEquals("usuarioLaptop", laptop.getUsuario());
    }

    @Test
    void deveVerificarCelular() {
        Celular celular = new Celular("11999998888");
        VerificacaoSegurancaVisitor visitor = new VerificacaoSegurancaVisitor();

        // Simulamos a atualização do certificado de segurança do celular
        celular.aceitar(visitor);

        // Validações similares para o celular
        assertNotNull(celular.getNumeroTelefone());
        assertEquals("11999998888", celular.getNumeroTelefone());
    }

    @Test
    void deveVerificarRoteador() {
        Roteador roteador = new Roteador("192.168.0.1");
        VerificacaoSegurancaVisitor visitor = new VerificacaoSegurancaVisitor();

        // Simulamos a verificação da configuração de segurança do roteador
        roteador.aceitar(visitor);

        // Validações específicas do roteador
        assertNotNull(roteador.getIp());
        assertEquals("192.168.0.1", roteador.getIp());
    }
}