# Repositório do Sistema de Login

Este repositório contém a implementação de um sistema simples de login utilizando Java e MySQL.

## Descrição do Código

O código consiste na classe `User`, que é responsável por verificar as credenciais de login de um usuário no banco de dados. Ela realiza a conexão com o banco, executa uma consulta SQL e verifica se as credenciais fornecidas correspondem a um usuário registrado.

## Funcionalidade da Classe `User`

A classe `User` contém os seguintes métodos principais:

- `conectarBD()`: Estabelece uma conexão com o banco de dados MySQL.
- `verificarUsuario(String login, String senha)`: Verifica se as credenciais de login fornecidas correspondem a um usuário no banco de dados.

## Como Usar

1. **Configuração do Banco de Dados**:
   - Certifique-se de que o banco de dados MySQL esteja em funcionamento e que a tabela `usuarios` exista, com as colunas `login`, `senha`, e `nome`.

2. **Execução**:
   - A classe `User` pode ser usada em conjunto com outros componentes para realizar o login no sistema.

## Javadoc

A documentação do código foi gerada utilizando Javadoc e pode ser acessada [aqui](./doc/index.html).

## Como Contribuir

1. Faça um fork deste repositório.
2. Crie uma branch para suas modificações.
3. Faça commit das suas alterações.
4. Envie um pull request com a descrição das suas modificações.
