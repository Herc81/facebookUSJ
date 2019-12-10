package com.facebookUSJ.models;



public class Perfil {

    private String nome;
    private String email;
    private String dataNascimento;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(String idade) {
        this.dataNascimento = dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}