<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white" />
  <img src="https://img.shields.io/badge/IMDb%20API-API%20Key-red.svg" />
  <img src="https://img.shields.io/badge/License-MIT-blue.svg" />
</p>

# API Alura
API criada em Java utilizando o banco de dados MongoDB. 
Possui os métodos POST e GET para a criação e consulta de registros contendo "title", "image" e "ranking".
API criada para utilização junto a aplicação de gerador de Stickers para Whatsapp.

## Tecnologias Utilizadas

- Java
- MongoDB

## Instalação e Configuração
1. Certifique-se de ter o MongoDB instalado e em execução na porta padrão.
2. Certifique-se de ter o Java 20 instalado e configurado na sua IDE e terminal.
3. Clone este repositório em sua máquina local.
4. Importe o projeto em sua IDE de preferência.
5. Configure as informações do banco de dados no arquivo application.properties.
6. Instale as dependencias do projeto `mvn install`
7. Execute o arquivo ProjectAluraApplication.java para iniciar a aplicação.
8. Acesse a API pelo `http://localhost:suaporta`
## Endpoints

- `POST /items`

    Cria um novo registro com as seguintes informações:
    
    ```
    {
        "title": "Título do Item",
        "image": "http://exemplo.com/imagem.png",
        "ranking": 4
    }
    ```

- `GET /items`
    ```
    Retorna todos os registros criados com as informações de título, imagem e ranking.
    ```


## Contribuições

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais informações.
