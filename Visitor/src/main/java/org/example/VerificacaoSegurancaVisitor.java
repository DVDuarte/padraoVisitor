package org.example;

public class VerificacaoSegurancaVisitor implements Visitor {

    @Override
    public void verificarLaptop(Laptop laptop) {
        System.out.println("Verificando permissões de acesso do laptop do usuário: " + laptop.getUsuario());
    }

    @Override
    public void verificarCelular(Celular celular) {
        System.out.println("Atualizando certificado de segurança do celular com número: " + celular.getNumeroTelefone());
    }

    @Override
    public void verificarRoteador(Roteador roteador) {
        System.out.println("Checando configuração de segurança do roteador com IP: " + roteador.getIp());
    }
}
