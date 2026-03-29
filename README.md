# 🌍 Sistema de Países

> Sistema de cadastro de países e capitais via terminal, desenvolvido em Java utilizando o padrão de arquitetura MVC.

![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=flat-square)
![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)

---

## 💡 Sobre o Projeto

Sistema de gerenciamento de países desenvolvido em Java para rodar no terminal. O projeto foi criado com foco em praticar o padrão de arquitetura **MVC (Model-View-Controller)**, separando responsabilidades entre as camadas do sistema.

---

## ✅ Funcionalidades

- [x] Adicionar país e capital
- [x] Listar todos os países cadastrados
- [x] Remover país pelo nome
- [x] Limpar toda a lista
- [ ] Busca por capital *(planejado)*
- [ ] Persistência em banco de dados *(planejado)*

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Finalidade |
|------------|------------|
| Java 17+   | Linguagem principal |
| ArrayList  | Estrutura de dados em memória |
| Scanner    | Entrada de dados via terminal |
| Git & GitHub | Versionamento |

---

## 🏗️ Arquitetura MVC

```
sistema-paises-java/
├── Main.java           → Ponto de entrada e menu interativo
├── Pais.java           → Model: representa um país com nome e capital
├── PaisController.java → Controller: regras de negócio e manipulação da lista
└── PaisView.java       → View: exibição dos dados no terminal
```

---

## 🚀 Como Rodar o Projeto

### Pré-requisitos

- [Java JDK 17+](https://adoptium.net/) instalado
- [Git](https://git-scm.com/) instalado

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/Ryan22-ai/sistema-paises-java.git

# 2. Entre na pasta do projeto
cd sistema-paises-java

# 3. Compile os arquivos
javac *.java

# 4. Execute
java Main
```

---

## 🧠 Aprendizados

Durante o desenvolvimento deste projeto, pratiquei:

- **Padrão MVC** — separação clara entre Model, View e Controller
- **Orientação a Objetos** — encapsulamento, construtores e métodos
- **ArrayList e List** — manipulação de coleções em Java
- **Lambda expressions** — uso de `removeIf()` com expressão lambda
- **Scanner** — captura de entrada do usuário via terminal
- **Git & GitHub** — versionamento e publicação do projeto

---

## Autor

**Ryan Nicolas**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat-square&logo=linkedin&logoColor=white)](https://linkedin.com/in/ryan-linhares)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=flat-square&logo=gmail&logoColor=white)](mailto:ryan22.nicolas@gmail.com)
[![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=github&logoColor=white)](https://github.com/Ryan22-ai)

---

⭐ Se este projeto te ajudou, deixa uma estrela!
