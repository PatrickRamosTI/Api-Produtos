- API de Produtos - Portfólio

Este é um projeto de API RESTful desenvolvida com Spring Boot, com foco na criação, leitura, atualização e exclusão de produtos. O objetivo é fornecer uma API para cadastro e gestão de produtos.

-- 🚀 Funcionalidades

-   Criar um novo produto  
-   Listar todos os produtos  
-   Buscar um produto por ID  
-   Atualizar um produto existente  
-   Deletar um produto  

-- 🛠 Tecnologias Utilizadas

-   Spring Boot 3.x  
-   Spring Data JPA  
-   H2 Database (Banco de dados em memória)  
-   Swagger (Documentação da API)  
-   JUnit (Testes)  
-   Maven (Gerenciador de dependências)  

-- 🛠 Como Rodar

--- 1. Clone o repositório

git clone https://github.com/PatrickRamosTI/Api-Produtos.git

-- 🛠 Endpoints da API

POST /produtos - Criar um novo produto

GET /produtos - Listar todos os produtos

GET /produtos/{id} - Buscar produto por ID

PUT /produtos/{id} - Atualizar produto existente

DELETE /produtos/{id} - Deletar produto por ID

JSON
{
  "nome": "Produto Exemplo",
  "descricao": "Descrição do produto",
  "preco": 99.99
}

🛠 Swagger

Você pode acessar a documentação da API através do Swagger na seguinte URL:
http://localhost:8080/swagger-ui.html
