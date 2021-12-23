# Case-XXXXX-XXXX

Projeto desenvolvido para a vaga X durante um processo seletivo na Y, onde o intuito é entender como funciona a organização, raciocínio e
conhecimento do candidato na área.


## Objetivos

* Estudar a documentação da API que logo abaixo será utilizada para as consultas que vão construir os
requisitos citados.
  - API países https://servicodados.ibge.gov.br/api/docs/paises
* Criar uma Tela Inicial para aplicação, onde deve contemplar:
  - Listar os países: nome, continente, idioma e informações que considerar interessante;
  - Prepare o item acima com foco em navegar para diferentes telas;
* Criar uma Tela de Detalhes onde a mesma deve contemplar:
  - Descrição do país e <s>indicadores</s> (esse item está em um endpoint diferente do primeiro,
atenção nesse ponto);
* Criar uma Tela de Favoritos onde você vai:
  - Salvar e exibir as informações acima <s>localmente</s>;
* Diferencial:
  - Programação assíncrona;
  - Clareza na organização de componentes utilizados para construir a tela;
  - Preocupação com a UI/UX da aplicação;
  - <s>Teste Automatizado de alguma das funções desenvolvidas;</s>

## O app

<p align="justify">
Iniciamos o projeto com um template, <i>Tabbed Activity</i>, pois ele se encaixou na ideia inicial que seria disponibilizar o aplicativos em 3 abas (Listagem, Detalhes e Favoritos).
Porém, visando a usabilidade para o usuário, separamos os Detalhes em uma nova <i>Activity</i> e chamamos ela a partir das abas Paises e Favoritos. Cada <i>Activity</i> e <i>Fragment</i> possuem
seus layouts próprios, existe também um layout para a listagem dos paises e um para os detalhes, que são utilizados pelas <i>Recyclers Views</i>. O App abre diretamente na tela de
listagem dos paises, para que a requisição seja feita o usuário deve clicar no <i>Floating button</i> e logo em seguida teremos a lista completa dos paises na tela. Caso o usuário pretenda buscar
por um pais especifico, ele deve inserir a sigla no <i>TextView</i> e refazer a requisição. Utilizando um clique sob o pais, o usuário será levado a uma nova tela onde será exibido apenas
as informações daquele pais na tela. Utilizando um clique longo sob o pais, ele será adicionado aos favoritos onde o usuário também poderá clicar sob o item e ser levado a tela de detalhes,
para deletar dos favoritos basta utilizar o clique longo novamente. 
Abaixo detalhes visuais do projeto:
</p>

<p float="left">
  <img src="https://github.com/christianalexandre/Case-XXXXX-XXXX/blob/master/app/release/1.jpeg" width="200" />
  <img src="https://github.com/christianalexandre/Case-XXXXX-XXXX/blob/master/app/release/2.jpeg" width="200" /> 
  <img src="https://github.com/christianalexandre/Case-XXXXX-XXXX/blob/master/app/release/3.jpeg" width="200" />
  <img src="https://github.com/christianalexandre/Case-XXXXX-XXXX/blob/master/app/release/4.jpeg" width="200" />
</p>

* Ou veja em vídeo <a href="https://www.youtube.com/watch?v=etf0OjPG3TM&ab_channel=ChristianAlexandre">clicando aqui</a>

## Instalação

Para utilizar e testar, basta clonar o repositório ou instalar o apk:

```
git clone https://github.com/christianalexandre/Case-XXXXX-XXXX
```

* <a href="https://github.com/christianalexandre/Case-XXXXX-XXXX/blob/master/app/release/app-release.apk">APK</a>


## Dificuldades

* Utilização do endpoint para busca dos indicadores
* Utilização do Retrofit para requisição http
* Conversão de JSON para um Objeto Java
* Utilização de gestos no Android

## Melhorias necessárias

* Criar uma classe externa para a requisição http
* Utilização de gestos para adicionar e remover aos favoritos
* Checar se o usuário já adicionou o item aos favoritos 
* Checar se o usuário já excluiu o item dos favoritos

## Construído com

* [Android Studio](https://developer.android.com/studio) - IDE
* [Kotlin](https://kotlinlang.org/) - Linguagem
* [Retrofit](https://square.github.io/retrofit/) - HTTP Client
* [Gson](https://github.com/google/gson) - Convert JSON to Java Object

## Autor

* **Christian Alberton Alexandre** - [Linkedin](https://www.linkedin.com/in/christian-alexandre/)
