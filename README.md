Trabalho API REST
A REST API for managing Produtos (Products), Clientes (Clients), and Pedidos (Orders). This collection covers CRUD operations for each resource.

Base URL: http://localhost:8080

Resources
Produtos — Manage products: list, create, retrieve by ID, and delete.
Clientes — Manage clients: list, create, retrieve by ID, and delete.
Pedidos — Manage orders: list, create, retrieve by ID, and delete.
﻿

Pedidos
Endpoints for managing orders (Pedidos). Supports listing, creating, retrieving by ID, and deleting orders.

﻿

Clientes
Endpoints for managing clients (Clientes). Supports listing, creating, retrieving by ID, and deleting clients.

﻿

GET
Geral Clientes
http://localhost:8080/clientes
Returns a list of all registered clients.

﻿

POST
Criar Clientes
http://localhost:8080/clientes
Creates a new client. Send the client data in the request body as JSON.

﻿

Body
raw (json)
json
{
    "name" : "Joao" , 
    "clienteDesde" : "2026-10-05"
    
}

GET
Get id Clientes
http://localhost:8080/clientes/1
Retrieves a specific client by their ID. Replace the ID in the URL path with the desired client ID.

﻿

DELETE
Delete Clientes
http://localhost:8080/clientes/2
Deletes a client by their ID. Replace the ID in the URL path with the client ID to be deleted.

﻿

Produtos
Endpoints for managing products (Produtos). Supports listing, creating, retrieving by ID, and deleting products.

﻿

GET
Geral Produtos
http://localhost:8080/produtos
Returns a list of all registered products.

﻿

POST
Criar Produtos
http://localhost:8080/produtos
Creates a new product. Send the product data in the request body as JSON.

﻿

Body
raw (json)
json
{
    "name" : "Paozinho Chines",
    "preco" : 1.5,
    "estoque" : 10
}
GET
Get id Produtos
http://localhost:8080/produtos/2
Retrieves a specific product by its ID. Replace the ID in the URL path with the desired product ID.

﻿

DELETE
Delete Produtos
http://localhost:8080/produtos/1
Deletes a product by its ID. Replace the ID in the URL path with the product ID to be deleted.

<img width="756" height="892" alt="Diagrama Trabalho API REST drawio" src="https://github.com/user-attachments/assets/faaafe05-2566-4fbe-87bf-bd1b489f50d1" />

﻿



