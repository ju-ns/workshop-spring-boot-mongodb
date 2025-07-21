# Workshop Spring Boot MongoDB

Projeto demonstrativo de uma aplicação backend com Spring Boot e MongoDB, para gerenciar usuários e posts, incluindo comentários.

---

## Descrição

Este projeto implementa uma API REST para cadastro e consulta de usuários e posts, utilizando Spring Boot para o backend e MongoDB como banco de dados NoSQL. O sistema inclui autenticação básica dos dados, operações CRUD para usuários, e busca avançada nos posts, incluindo filtros por título e por datas.

---

## Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
- REST API
- JSON para comunicação

---

## Estrutura do Código

- `com.juliang.workshopmongo.domain`: Classes modelo para Usuário (`User`) e Post (`Post`), com DTOs para transferência de dados.
- `com.juliang.workshopmongo.dto`: Objetos de transferência (`AuthorDTO`, `CommentDTO`, `UserDTO`).
- `com.juliang.workshopmongo.repository`: Repositórios MongoDB para `User` e `Post`.
- `com.juliang.workshopmongo.services`: Lógica de negócio para usuários e posts (`UserService`, `PostService`).
- `com.juliang.workshopmongo.resources`: Controladores REST para expor endpoints da API.
- `com.juliang.workshopmongo.resources.exception`: Tratamento de exceções customizadas para a API.
- `com.juliang.workshopmongo.config`: Configuração inicial e instanciador de dados para testes.

---

## Funcionalidades

### Usuários

- Listar todos os usuários
- Consultar usuário por ID
- Criar novo usuário
- Atualizar usuário existente
- Deletar usuário
- Listar posts de um usuário específico

### Posts

- Consultar post por ID
- Buscar posts por título (case-insensitive)
- Busca completa por texto (título, corpo ou comentários) com filtro por intervalo de datas

---

## Endpoints Principais

- `GET /users` — Listar usuários
- `GET /users/{id}` — Buscar usuário por ID
- `POST /users` — Criar usuário
- `PUT /users/{id}` — Atualizar

## Como Rodar o Projeto

1. Clone o repositório:
 ```bash
   git clone https://github.com/ju-ns/workshop-spring-boot-mongodb.git
```

2. Configure o MongoDB localmente ou via container Docker.
3. Importe o projeto na sua IDE preferida (IntelliJ, Eclipse, VSCode).
4. Execute a classe principal `com.juliang.workshopmongo.WorkshopmongoApplication`.
5. A API estará disponível em `http://localhost:8080`.

---

## Tratamento de Erros

O projeto implementa tratamento customizado para exceções, como `ObjectNotFoundException`, retornando status HTTP apropriados e mensagens padronizadas.

---

## Autor

Julia Anísio Nogueira Nunes

---

## Licença

Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.


