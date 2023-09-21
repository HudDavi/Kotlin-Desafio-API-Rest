# Projeto Spring Boot com Kotlin

Este é um projeto Spring Boot em Kotlin que utiliza o Gradle como sistema de build. Ele é configurado para criar uma aplicação web com suporte a JPA (Java Persistence API) e validação, bem como geração de documentação OpenAPI (Swagger).

## Conteúdo

- [Visão Geral](#visão-geral)
- [Requisitos](#requisitos)
- [Configuração](#configuração)
- [Como Usar](#como-usar)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Visão Geral

Este projeto utiliza as seguintes tecnologias e frameworks:

- Spring Boot: Um framework para criar aplicativos Java/Kotlin prontos para produção.
- Kotlin: Uma linguagem de programação moderna e concisa que se integra bem com o ecossistema Spring.
- Gradle: Um sistema de build para gerenciar as dependências e compilar o código.
- Spring Data JPA: Um módulo do Spring para simplificar a interação com bancos de dados relacionais.
- Spring Validation: Para validação de entrada de dados.
- Springdoc OpenAPI: Para geração de documentação OpenAPI (Swagger).
- Flyway: Para controle de versão de banco de dados.

## Requisitos

Certifique-se de que você tenha as seguintes ferramentas instaladas:

- Java (JDK) 17 ou superior
- Gradle

## Configuração

1. Clone o repositório:

```bash
git clone https://github.com/HudDavi/Kotlin-Desafio-API-Rest.git
cd Kotlin-Desafio-API-Rest
```

2. Execute o projeto:

```bash
./gradlew bootRun
```

O servidor estará disponível em `http://localhost:8080`.

## Como Usar

Este projeto é uma base para desenvolver sua aplicação Spring Boot. Você pode adicionar suas entidades, serviços e controladores conforme necessário. Certifique-se de revisar a documentação do Spring Boot, Spring Data JPA e outros módulos relevantes para entender como eles funcionam.

## Contribuição

Se você deseja contribuir para este projeto, siga as etapas abaixo:

1. Fork o projeto.
2. Crie uma nova branch com a sua funcionalidade: `git checkout -b feature/nova-funcionalidade`.
3. Faça commit das suas alterações: `git commit -am 'Adicionei uma nova funcionalidade'`.
4. Faça push para a branch: `git push origin feature/nova-funcionalidade`.
5. Abra uma solicitação pull no GitHub.

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).