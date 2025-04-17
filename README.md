# Agendamento SUS - MVP Hackathon FIAP

## 💡 Visão Geral

O **Agendamento SUS** é uma API desenvolvida com o objetivo de otimizar o processo de **agendamento de consultas e exames** no Sistema Único de Saúde (SUS), reduzindo filas e promovendo maior eficiência no atendimento ao cidadão e no trabalho dos profissionais da saúde.

Este projeto foi desenvolvido como MVP para o Hackathon da FIAP, utilizando arquitetura moderna e boas práticas de desenvolvimento back-end.

---

## 🛠️ Tecnologias Utilizadas

- Java 22
- Spring Boot 3.2.0
- Spring Data JPA
- Spring Security
- MySQL
- Docker & Docker Compose
- Lombok
- Swagger (OpenAPI)
- JUnit + Mockito (Testes)
- Postman (coleção de testes incluída)

---

## 🚀 Como executar

### ▶️ Executar com Docker (recomendado)

```bash
docker-compose up --build
```

A aplicação será exposta em `http://localhost:8080`  
O banco de dados MySQL estará acessível em `localhost:3306`

---

### ⚙️ Executar localmente

1. Configure um banco de dados MySQL com as credenciais abaixo:
   ```
   URL: jdbc:mysql://localhost:3306/agendamento_db
   Usuário: user
   Senha: password
   ```
2. Rode o projeto com o perfil `local`:
   ```
   mvn spring-boot:run -Dspring-boot.run.profiles=local
   ```

---

## 📬 Endpoints Principais

| Método | Endpoint               | Descrição                         |
|--------|------------------------|-----------------------------------|
| GET    | `/agendamentos`        | Lista todos os agendamentos       |
| POST   | `/agendamentos`        | Cria um novo agendamento          |
| GET    | `/agendamentos/{id}`   | Busca um agendamento por ID       |
| PUT    | `/agendamentos/{id}`   | Atualiza um agendamento existente |
| DELETE | `/agendamentos/{id}`   | Cancela um agendamento            |

---

## 📚 Documentação Swagger

Acesse a interface interativa da API:

[🔗 Swagger UI](http://localhost:8080/swagger-ui.html)  
ou  
[🔗 Swagger v3](http://localhost:8080/swagger-ui/index.html)

---

## 🧪 Testes

Para rodar os testes unitários e de integração:

```bash
mvn test
```

---

## 📁 Postman Collection

Arquivo: `postman_collection.json`

Importe no Postman para testar todos os endpoints da API rapidamente.

---

## ✅ Status do MVP

- [x] API REST com CRUD de agendamento
- [x] Swagger documentado
- [x] Dockerfile e Docker Compose
- [x] Banco de dados MySQL
- [x] Testes unitários e de integração
- [x] Postman Collection

---

## 👨‍💻 Desenvolvido por

Equipe Hackathon FIAP  
Curso: Pós-graduação em Arquitetura e Desenvolvimento em Java
