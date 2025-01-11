# 🎥 Denkel - Sistema de Compra de Ingressos de Cinema

## 📖 Sobre o Projeto

O **Denkel** é uma aplicação desenvolvida para simular a compra de ingressos de cinema.

Desenvolvido com **React** no frontend, **Spring Boot** no backend e uma API RESTful robusta.

---

## 🚀 Funcionalidades Principais

- 🎬 **Explorar Filmes:** Lista de filmes em cartaz com informações detalhadas, incluindo sinopse, trailer e horários.
- 🎟️ **Seleção de Assentos:** Escolha de assentos disponíveis diretamente no mapa interativo da sala.
- 🛒 **Carrinho de Compras:** Adicionar ou remover ingressos antes da confirmação da compra.
- 💳 **Pagamento Seguro:** Integração com métodos de pagamento para finalizar as compras.
- 🔒 **Autenticação de Usuários:** Registro e login de usuários, com suporte para diferentes níveis de acesso.
- 📊 **Painel Administrativo:** Gerenciamento de filmes, horários e auditoria de vendas para administradores.

---

## 🛠️ Tecnologias Utilizadas

### **Frontend**
- [React](https://reactjs.org/): Biblioteca JavaScript para construção da interface.
- [Axios](https://axios-http.com/): Comunicação com a API RESTful.
- [React Router](https://reactrouter.com/): Gerenciamento de rotas e navegação.

### **Backend**
- [Spring Boot](https://spring.io/projects/spring-boot): Framework para desenvolvimento backend.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): Gerenciamento do banco de dados.

### **Banco de Dados**
- **MySQL:** Para armazenamento de dados, como informações de filmes, usuários e vendas.

---


### Pré-requisitos
- **Node.js** 
- **Java JDK** 
- **MySQL** 

### Passo a Passo

#### **1. Clonar o Repositório**
```bash
git clone https://github.com/seuusuario/denkel.git
cd denkel
```

#### **2. Configurar o Backend**
1. Navegue até a pasta `backend`.
2. Edite o arquivo `application.properties` para configurar o banco de dados:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/seubanco
   spring.datasource.username=seuusuario
   spring.datasource.password=suasenha
   ```
3. Compile e inicie o backend:
   ```bash
   ./mvnw spring-boot:run
   ```

#### **3. Configurar o Frontend**
1. Navegue até a pasta `frontend`.
2. Instale as dependências:
   ```bash
   npm install
   ```
3. Inicie o servidor do frontend:
   ```bash
   npm start
   ```

#### **4. Acessar a Aplicação**
- Frontend: `http://localhost:3000`
- Backend: `http://localhost:8080`

---
