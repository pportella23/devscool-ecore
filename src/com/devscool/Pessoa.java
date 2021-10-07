package com.devscool;

public class Pessoa {
    String nome;
    int idade;
    private CategoriaIdade classificacao;


    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        setCategoriaIdade(this.idade);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public CategoriaIdade getCategoriaIdade() {
        return classificacao;
    }

    public void setCategoriaIdade(int idade) {
        if (idade >= 0 && idade <= 12) {
            this.classificacao = CategoriaIdade.Criança;
        } else if (idade <= 19) {
            this.classificacao = CategoriaIdade.Adolescente;
        } else if (idade <= 65) {
            this.classificacao = CategoriaIdade.Adulto;
        } else {
            this.classificacao = CategoriaIdade.Idoso;
        }
    }
}
