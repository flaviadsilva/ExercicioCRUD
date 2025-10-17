🍽️ Sobre o projeto

O Sistema de Gerenciamento de Restaurante tem como objetivo organizar o controle de clientes e pedidos, permitindo cadastrar, listar, atualizar e excluir informações de forma prática e segura.
O sistema foi desenvolvido em Java (NetBeans) com MySQL, aplicando a arquitetura em camadas (MVC) para manter o código organizado e de fácil manutenção.

O projeto segue os seguintes padrões:

DTO (Data Transfer Object) → responsável por armazenar e transportar os dados.

DAO (Data Access Object) → responsável pela comunicação com o banco de dados.

VIEW → responsável pela interface gráfica (telas do sistema).

⚙️ Funcionalidades

 Gerenciamento de Clientes: cadastrar, atualizar, excluir e listar clientes.

 Gerenciamento de Pedidos: registrar novos pedidos, editar informações e consultar o histórico.

 Integração com o Banco de Dados: todas as operações são salvas e atualizadas diretamente no MySQL.

 Consultas Rápidas: pesquisa de pedidos e clientes cadastrados.

 🗄️ Banco de Dados

O sistema utiliza o MySQL para armazenar os dados de clientes e pedidos.
As tabelas estão relacionadas por meio de chaves estrangeiras, garantindo integridade e consistência das informações.

🚀 Como Executar o Projeto

Clone o repositório ou importe o projeto no NetBeans.

Crie o banco de dados no MySQL executando o script SQL fornecido.

Ajuste o usuário e a senha do banco na classe ConexaoDAO.

Compile e execute o projeto a partir da classe principal (TelaPrincipal.java).

Use as telas de cadastro para testar o sistema.

📜Script SQL
-- Tabela de Clientes
CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(20),
    email VARCHAR(100)
);

drop table clientes;

-- Tabela de Pedidos
CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    data_pedido DATE,
    valor_total DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);	
select *from clientes;
describe Clientes;
drop table pedidos;

select * from pedidos;
