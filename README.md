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
  - Descrição do país e indicadores (esse item está em um endpoint diferente do primeiro,
atenção nesse ponto);
* Criar uma Tela de Favoritos onde você vai:
  - Salvar e exibir as informações acima localmente;
* Diferencial:
  - Programação assíncrona;
  - Clareza na organização de componentes utilizados para construir a tela;
  - Preocupação com a UI/UX da aplicação;
  - Teste Automatizado de alguma das funções desenvolvidas;

## O app

Iniciamos o projeto com um template, <i>Tabbed Activity</i>, pois ele se encaixou na ideia inicial que seria disponibilizar o aplicativos em 3 abas (Listagem, Detalhes e Favoritos).
Porém, visando a usabilidade para o usuário, separamos os Detalhes em uma nova <i>Activity</i> e chamamos ela a partir das abas Paises e Favoritos. Cada <i>Activity</i> e <i>Fragment</i> possuem
seus layouts próprios, existe também um layout para a listagem dos paises e um para os detalhes, que são utilizados pelas <i>Recyclers Views</i>. O App abre diretamente na tela de
listagem dos paises, para que a requisição seja feita o usuário deve clicar no <i>Floating button</i> e logo em seguida teremos a lista completa dos paises na tela. Caso o usuário pretenda buscar
por um pais especifico, ele deve inserir a sigla no <i>TextView</i> e refazer a requisição. Utilizando um clique sob o pais, o usuário será levado a uma nova tela onde será exibido apenas
as informações daquele pais na tela. Utilizando um clique longo sob o pais, ele será adicionado aos favoritos onde o usuário também poderá clicar sob o item e ser levado a tela de detalhes,
para deletar dos favoritos basta utilizar o clique longo novamente.


### 🔧 Instalação

Uma série de exemplos passo-a-passo que informam o que você deve executar para ter um ambiente de desenvolvimento em execução.

Diga como essa etapa será:

```
Dar exemplos
```

E repita:

```
Até finalizar
```

Termine com um exemplo de como obter dados do sistema ou como usá-los para uma pequena demonstração.

## ⚙️ Executando os testes

Explicar como executar os testes automatizados para este sistema.

### 🔩 Analise os testes de ponta a ponta

Explique que eles verificam esses testes e porquê.

```
Dar exemplos
```

### ⌨️ E testes de estilo de codificação

Explique que eles verificam esses testes e porquê.

```
Dar exemplos
```

## 📦 Desenvolvimento

Adicione notas adicionais sobre como implantar isso em um sistema ativo

## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - O framework web usado
* [Maven](https://maven.apache.org/) - Gerente de Dependência
* [ROME](https://rometools.github.io/rome/) - Usada para gerar RSS

## Autor

* **Christian Alberton Alexandre** - [Linkedin](https://www.linkedin.com/in/christian-alexandre/)
