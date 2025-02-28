# Projeto de Cadastro de Usuários
Este projeto é uma aplicação Spring Boot que implementa um sistema de cadastro de usuários, permitindo o registro, atualização, listagem e exclusão de cadastros com validações de dados. A aplicação utiliza JPA para persistência no banco de dados e implementa a arquitetura de camadas para separar as responsabilidades de cada parte do sistema.

## Funcionalidades
- Cadastro de Usuários (POST): Permite o registro de novos usuários, incluindo dados como nome, e-mail, senha e endereço.

- Listagem de Cadastros (GET): Exibe todos os cadastros de usuários registrados na base de dados.

- Atualização de Cadastro (PUT): Permite atualizar os dados de um usuário, como nome, e-mail e senha, sem a necessidade de enviar o endereço novamente. Caso o endereço não seja alterado, ele permanece o mesmo.

- Exclusão de Cadastro (DELETE): Permite a exclusão de um cadastro de usuário específico, identificando-o pelo ID.

## Arquitetura
A aplicação foi estruturada com base na arquitetura em camadas, o que facilita a manutenção, o entendimento do código e a escalabilidade. A organização segue o padrão de Domain-Driven Design (DDD), com as seguintes camadas:

- Controller: Responsável pela exposição das APIs REST. Aqui estão os endpoints que lidam com as requisições HTTP.
- Service: Contém a lógica de negócio. Os serviços orquestram a execução das regras de negócio e interagem com o Repository para manipulação de dados.
- Domain: Contém as entidades do sistema, incluindo as classes de domínio (como Cadastro e Endereco), os objetos de transferência de dados (DTOs) e as regras de validação.
- Repository: Interface que permite o acesso à camada de persistência de dados usando Spring Data JPA.

# Tecnologias Utilizadas
- Spring Boot: Framework principal para construção da API REST.
- Spring Data JPA: Para persistência dos dados em banco de dados relacional.
- Banco de Dados: Utilização de um banco relacional como o MySQL ou PostgreSQL para persistir os cadastros.
- Bean Validation (javax.validation): Para garantir que os dados recebidos no cadastro atendam aos requisitos, como obrigatoriedade e formatos corretos.

## Futuras Atualizações
O projeto está em constante evolução e novas funcionalidades estão sendo planejadas para melhorar a experiência do usuário e aumentar a segurança da aplicação. Algumas das futuras atualizações incluem:

- Sistema de Login e Autenticação: Implementação de um sistema de autenticação, permitindo que os usuários façam login no sistema com segurança, utilizando tokens JWT ou outra tecnologia de autenticação.

- Segurança Aprimorada: Implementação de medidas de segurança adicionais, como criptografia de senhas (por exemplo, utilizando bcrypt ou Argon2), proteção contra ataques de injeção SQL, validação e sanitização de entradas do usuário, e uso de HTTPS para comunicação segura.
DTOs: Objetos de Transferência de Dados usados para garantir que a comunicação entre as camadas seja bem definida e validada.
