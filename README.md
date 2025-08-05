# 📚 Sistema de Biblioteca em Java

Este é um sistema simples de biblioteca, desenvolvido em Java, com persistência de dados utilizando SQLite e arquitetura baseada em DAO (Data Access Object).

---

## 🚀 Funcionalidades

- Cadastro de usuários
- Cadastro de livros
- Conexão com banco de dados SQLite
- Separação entre camadas (`model`, `repository`, etc)

---

## 🛠 Tecnologias Utilizadas

- Java 17
- SQLite
- JDBC
- Padrão DAO

---

## 📁 Estrutura de Pastas

```bash
src/
├── Main.java
├── Biblioteca.java
├── model/
│   └── Livro.java
│   └── Usuario.java
├── repository/
│   └── ConexaoSQLite.java
│   └── UsuarioDAO.java
│   └── TabelaUsuario.java
