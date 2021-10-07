## Código do desafio DEV'SCOOL da E-Core


### Como o programa foi implementado:


O código é dividido em duas classes: **<code>Main</code>** e **<code>Pessoa</code>**.


#### Classe <code>Pessoa</code>:

Conta com três atributos que são: <code>String nome</code>, <code>int idade</code> e <code>CategoriaIdade classificacao</code>.


(Sendo o último deles um atributo do tipo <code>enum</code> com as opções: <code>Criança</code>, <code>Adolescente</code>, <code>Adulto</code> e <code>Idoso</code>).


No seu construtor é definido que os atributos de <code>nome</code> e <code>idade</code> receberão os valores passados por parâmetro na criação do objeto e também é chamado o método <code>setCategoriaIdade</code> que armazena o valor do atributo <code>classificacao</code> de acordo com o valor de <code>idade</code>.


Os outros métodos da classe são apenas Getters para acessar o valor dos atributos em outras classes.


#### Classe <code>Main</code>:


São cinco métodos: <code>adicionaPessoa()</code>, <code>ordenaPessoaNome()</code>, <code>ordenaPessoaIdade()</code>, <code>exibeListaFuncionalidades()</code> e <code>main()</code>.


<code>adicionaPessoa()</code> recebe por parâmetro uma lista de objetos do tipo **<code>Pessoa</code>**, um nome e uma idade. O que o método faz é criar um objeto da classe **<code>Pessoa</code>** com o nome e idade recebidos por parâmetro e adiciona esse objeto na lista também recebida como parâmetro. Por fim, o método imprime uma mensagem de confirmação da operação.


<code>ordenaPessoaNome()</code> recebe uma lista de objetos do tipo **<code>Pessoa</code>**. O que ele faz é ordenar essa lista utilizando o método <code>sort()</code> da **interface List**, que aceita um **Comparator** por parâmetro, por meio do método *comparing*. O *comparing* recebe uma lista e usa o atributo lista.nome para ordená-la alfabeticamente.


O método <code>ordenaPessoaIdade()</code> faz o exato mesmo procedimento que o método anterior, porém utilizando o *comparingInt* e o atributo lista.idade para ordená-la de forma ascendente.


<code>exibeListaFuncionalidades()</code> é um método auxiliar que tem o propósito de imprimir em tela os comandos criados para utilizar as funcionalidade do programa via terminal.


O último método é o <code>main()</code> que é o método utilizado para execução do programa. Ele inicia criando um Arraylist de objetos do tipo **<code>Pessoa</code>** que implementa a **interface List**. Temos também um **Scanner** para possibilitar a leitura de inputs via terminal e por fim uma lógica de whiles e ifs encadeados para controlar o uso das funcionalidades que o programa oferece. Dependendo do caminho percorrido nessa lógica encadeada de respostas, será chamada uma funcionalidade específica do programa e, ao final de sua execução, retornará para lista de funcionalidades.


### Como utilizar o programa:


Ao iniciar a execução do programa automaticamente será criada uma lista de objetos do tipo **<code>Pessoa</code>** vazia e será impresso instruções no terminal. Basicamente o programa tem três funcionalidades que são:
* Adicionar pessoas na lista: Para isso é necessário escrever o comando "adicionar pessoa" no terminal. Então será perguntado qual o nome desejado (não podendo a resposta ser em branco) e depois sua idade (não podendo ser menor que 0 e maior que 120 anos). Ao final do preenchimento dessas informações será impresso uma mensagem de confirmação e voltará para o loop de funcionalidades.
* Ordenar a lista por nomes: Para isso é necessário escrever o comando "ordenar nomes" no terminal. Então será exibida a lista com todas informações de cada uma das pessoas incluídas até o momento em ordem alfabética de nomes e retornará para o loop de funcionalidades.
* Ordenar a lista por idades: Para isso é necessário escrever o comando "ordenar idades" no terminal. Então será exibida a lista com todas informações de cada uma das pessoas incluída até o momento em ordem crescente de idade e retornará para o loop de funcionalidades.


