package com.company;

public class Contatos {
    private String email;
    private String celular;

    public Contatos(String email, String celular)
    {
        this.email = email;
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
