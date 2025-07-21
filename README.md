# Workshop Spring Boot com MongoDB

Este projeto é uma API RESTful desenvolvida com **Spring Boot** e **MongoDB**, com o objetivo de demonstrar os fundamentos da criação de aplicações web usando arquitetura em camadas, repositórios com Spring Data, tratamento de exceções, uso de DTOs e integração com banco NoSQL.

---

## 🧠 Objetivo

Criar um sistema de gerenciamento de usuários e postagens, simulando uma rede social básica, com funcionalidades como:

- CRUD de usuários
- CRUD de postagens
- Comentários em postagens
- Busca por título
- Busca por data com filtro

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
- Postman (para testes)

---

## 🛠️ Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [MongoDB](https://www.mongodb.com/try/download/community)
- [Maven](https://maven.apache.org/install.html)

---

## 💻 Como Rodar o Projeto Localmente

1. **Clone o repositório:**

```bash
git clone https://github.com/ju-ns/workshop-spring-boot-mongodb.git
```
2. Acesse o diretório do projeto:

 ```bash
 cd workshop-spring-boot-mongodb
 ```
3. Suba o MongoDB localmente (caso não esteja rodando):

 ```bash
mongod
 ```
4. Execute a aplicação via Maven ou pela IDE:
 
 ```bash
./mvnw spring-boot:run
 ```

## 📬 Principais Endpoints

| Método | Endpoint                                                  | Descrição                                    |
|--------|-----------------------------------------------------------|----------------------------------------------|
| GET    | `/users`                                                  | Lista todos os usuários                      |
| GET    | `/users/{id}`                                             | Busca um usuário por ID                      |
| POST   | `/users`                                                  | Cria um novo usuário                         |
| PUT    | `/users/{id}`                                             | Atualiza os dados de um usuário              |
| DELETE | `/users/{id}`                                             | Deleta um usuário                            |
| GET    | `/posts/{id}`                                             | Retorna uma postagem com comentários         |
| GET    | `/posts/titlesearch?text=abc`                             | Busca por título (case insensitive)          |
| GET    | `/posts/fullsearch?text=abc&minDate=2020-01-01&maxDate=2024-12-31` | Busca por data e texto                      |

## 📂 Estrutura do Projeto

```text
src
├── main
│ ├── java
│ │ └── com.juliang.workshopmongo
│ │ ├── config # Instancia dados de teste
│ │ ├── controller # Controladores REST
│ │ ├── domain # Entidades (User, Post, Comment)
│ │ ├── dto # Data Transfer Objects
│ │ ├── repository # Interfaces de repositório
│ │ ├── services # Lógica de negócio
│ │ └── services.exception # Exceções personalizadas
│ └── resources
│ └── application.properties
```

## 🧪 Exemplos de Requisições

### 📌 Criar um usuário (`POST /users`)

**Requisição JSON:**

```json
{
  "name": "Maria Silva",
  "email": "maria@gmail.com"
}
```
### 🔍 Buscar postagens por título (`GET /posts/titlesearch?text=viagem`)

Retorna todas as postagens cujo título contenha **"viagem"**.

---

### ⚠️ Tratamento de Erros

Quando um recurso não é encontrado, a API retorna uma resposta como:

```json
{
  "timestamp": "2025-07-21T15:34:12.569+00:00",
  "status": 404,
  "error": "Not Found",
  "message": "Object not found",
  "path": "/users/123"
}
```

## 📄 Licença
Este projeto está licenciado sob a licença MIT. Veja mais detalhes em LICENSE.

## ✍️ Autoria
Projeto desenvolvido durante estudos com base em conteúdos da DevSuperior e aprimorado por Julia Nunes.



