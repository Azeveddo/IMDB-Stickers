<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white" />
  <img src="https://img.shields.io/badge/IMDb%20API-API%20Key-red.svg" />
  <img src="https://img.shields.io/badge/License-MIT-blue.svg" />
</p>

<h1 align="center">Imersão Java Alura</h1>

<p align="center">
  Essa aplicação está sendo desenvolvida durante a Imersão Java da Alura e consome a API's para gerar figurinhas personalizadas para compartilhar no WhatsApp.
</p>
<p align="center">
  Também é feito a criação de uma API no alura-project, no qual foi utilizado MongoDB + JAVA.
</p>

## Funcionalidades

- Geração de figurinhas personalizadas para compartilhar no WhatsApp
- Consumo de API criada

## Tecnologias utilizadas até o momento

- Java 20
- MongoDB
- API do IMDb
- API da Nasa
- API Criada

## Pré-requisitos

- Java 20 instalado
- Conta de desenvolvedor do IMDb (para obter a chave de API)
- Conta de desenvolvedor da Nasa (para obter a chave de API)
- Conta no MongoDB

## Instalação e Configuração
1. Certifique-se de ter o MongoDB instalado e em execução na porta padrão.
2. Certifique-se de ter o Java 20 instalado e configurado na sua IDE e terminal.
3. Clone este repositório em sua máquina local.
4. Importe o projeto em sua IDE de preferência.
5. Configure as informações do banco de dados no arquivo application.properties.
6. Instale as dependencias do projeto `mvn install`

## Como executar

1. Após concluir a configuração do application.properties, execute o arquivo ProjectAluraApplication.java para iniciar a aplicação.
2. Acesse a API pelo `http://localhost:suaporta`
3. Após confirmar que a API está funcionado, teste utilizando o método POST
4. Após confirmar, execute o arquivo App.Java (/alura-stickers/src/)
5. As imagens adicionadas através do POST vão ser baixadas e gerar um Sticker automaticamente.


## Licença

Esse projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.
