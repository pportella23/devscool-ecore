package com.devscool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void adicionaPessoa(List<Pessoa> listaPessoas, String nome, int idade){
        listaPessoas.add(new Pessoa(nome, idade));
        System.out.println(nome + " foi adicionado com sucesso!");
    }

    public static void ordenaPessoaNome(List<Pessoa> listaPessoas){
        listaPessoas.sort(Comparator.comparing(p -> p.nome));
        listaPessoas.forEach(s ->
                System.out.println("Nome: " + s.getNome() +
                        ", Idade: " + s.getIdade() +
                        ", Classificação: " + s.getCategoriaIdade()));
    }

    public static void ordenaPessoaIdade(List<Pessoa> listaPessoas){
        listaPessoas.sort(Comparator.comparingInt(p -> p.idade));
        listaPessoas.forEach(s ->
                System.out.println("Nome: " + s.getNome() +
                        ", Idade: " + s.getIdade() +
                        ", Classificação: " + s.getCategoriaIdade()));
    }

    public static void exibeListaFuncionalidades(){
        System.out.printf("\n" +
                "Escolha a funcionalidade desejada digitando um dos comandos listados entre colchetes:" +
                "%n[adicionar pessoa] Adicionar nova pessoa a lista" +
                "%n[ordenar nomes] Ordenar a lista por ordem alfabética" +
                "%n[ordenar idades] Ordenar a lista por idade" + "\n");
    }

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        String funcionalidades;

        exibeListaFuncionalidades();
        while (true) {
            funcionalidades = ler.nextLine();

            if (funcionalidades.equals("adicionar pessoa")) {
                loopdefora:
                while (true) {
                    String nome;

                    System.out.printf("\nQual o nome da pessoa que deseja adicionar?\n");
                    nome = ler.nextLine();
                    if (!nome.isEmpty()) {
                        while (true) {
                            int idade;

                            System.out.printf("\nE qual a idade?\n");
                            idade = ler.nextInt();
                            if (idade >= 0 && idade <= 120) {
                                try {
                                    adicionaPessoa(listaPessoas, nome, idade);
                                    exibeListaFuncionalidades();
                                    break loopdefora;
                                } catch (Exception e) {
                                    System.out.printf("\nErro: Não foi possivel adicionar esta pessoa! Por favor, tente novamente." +
                                            "%n log de erro: " + e);
                                    break loopdefora;
                                }
                            } else {
                                System.out.print("\nErro: A idade informada é inválida! Por favor, informe uma idade válida (entre 0 e 120 anos).\n");
                            }
                        }
                    } else {
                        System.out.print("\nErro: O nome informado não pode ser vazio! Por favor, insira um nome válido.\n");
                    }
                }
            } else if (funcionalidades.equals("ordenar nomes")) {
                ordenaPessoaNome(listaPessoas);
                exibeListaFuncionalidades();
            } else if (funcionalidades.equals("ordenar idades")) {
                ordenaPessoaIdade(listaPessoas);
                exibeListaFuncionalidades();
            } else if (funcionalidades.isEmpty()) {
                continue;
            }
            else {
                System.out.printf("\n" + "Comando não encontrado! Por favor, informe um comando válido." + "\n");
            }
        }
    }
}
