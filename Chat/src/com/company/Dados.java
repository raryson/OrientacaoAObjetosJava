package com.company;

public class Dados {
    private String nome;
    private String ip;
    private String mensagem;

    public Dados(String nome, String ip) {
        this.nome = nome;
        this.ip = ip;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public String getIp() {
        return ip;
    }

    public String getMensagem() {
        return mensagem;
    }
}
