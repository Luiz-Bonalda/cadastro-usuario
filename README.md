
# Cadastro de Usuários

API REST desenvolvida em **Java e Spring Boot** para gerenciamento de usuários. O projeto permite realizar operações de cadastro, consulta, atualização e exclusão de usuários, utilizando Spring Data JPA para persistência de dados e banco de dados H2.

## 🚀 Tecnologias utilizadas

- Java 25
- Spring Boot 3.5.6
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## ⚙️ Funcionalidades

- Cadastro de usuários.
- Busca de usuários por e-mail.
- Atualização de dados por ID.
- Exclusão de usuários por e-mail.
- Persistência de dados utilizando Spring Data JPA.
- Identificação automática dos usuários por ID.

## 📋 Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

- Java JDK 25 ou superior compatível.
- Git.

O projeto possui Maven Wrapper, portanto não é necessário instalar o Maven separadamente.

## 🔧 Como executar o projeto

**1. Clone o repositório:**

```bash
git clone https://github.com/Luiz-Bonalda/cadastro-usuario.git
```

**2. Entre na pasta do projeto:**

```bash
cd cadastro-usuario
```

**3. Execute a aplicação:**

Windows:

```bash
mvnw.cmd spring-boot:run
```

Linux / macOS:

```bash
./mvnw spring-boot:run
```

A aplicação será iniciada no endereço:

```text
http://localhost:8080
```

## 🔗 Endpoints da API

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/usuario` | Cadastrar usuário |
| GET | `/usuario?email={email}` | Buscar usuário por e-mail |
| PUT | `/usuario?id={id}` | Atualizar usuário |
| DELETE | `/usuario?email={email}` | Excluir usuário por e-mail |

### Exemplo de cadastro

**POST** `/usuario`

Corpo da requisição:

```json
{
    "name": "Luiz Fernando",
    "email": "luiz@email.com"
}
```

### Exemplo de consulta

**GET**

```text
/usuario?email=luiz@email.com
```

### Exemplo de atualização

**PUT**

```text
/usuario?id=1
```

Corpo da requisição:

```json
{
    "name": "Luiz Fernando Bonalda",
    "email": "luizfernando@email.com"
}
```

### Exemplo de exclusão

**DELETE**

```text
/usuario?email=luiz@email.com
```

## 🗄️ Banco de dados

O projeto utiliza o **H2 Database**, um banco de dados em memória, configurado para facilitar o desenvolvimento e os testes.

O console do H2 pode ser acessado pelo endereço:

```text
http://localhost:8080/h2-console
```

Configurações de conexão:

- JDBC URL: `jdbc:h2:mem:usuarios`
- User Name: `sa`
- Password: deixar em branco.

**Observação:** por utilizar um banco de dados em memória, os dados são perdidos quando a aplicação é encerrada.
