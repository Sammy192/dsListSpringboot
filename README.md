# List Game

## Sobre o projeto
ListGame é uma aplicação java spring construída durante mais uma edição da Semana DevSuperior, evento organizado pela [DevSuperior](https://devsuperior.com/).

A aplicação consiste em retornar lista de games e a quais gêneros de games eles pertencem.
É possível reordenar a posição de um game retornado na lista.

Até o momento não desenvolvemos o front end.

# Modelo de domínio DSList

![image](https://github.com/Sammy192/dsListSpringboot/assets/53224915/594fd3ed-de09-49c3-aa6d-189d15fee1d7)

## Tecnologias utilizadas
- Java
- SQL
- Framework Spring Boot
- BD Postgresql
- API Rest - Cliente/servidor com HTTP
- Utilizado Container Docker no ambiente

# Como executar o projeto localmente
## Back end
Pré-requisitos: Java 17

```
# clonar repositório - neste caso usando link ssh como exemplo
git clone git@github.com:Sammy192/dsListSpringboot.git

Pode acessar o projeto utilizando a IDE [Spring Tools 4 for Eclipse](https://spring.io/tools)
para ajustar o ambiente ou executar no bash.

Acessar arquivo de configuração de ambiente.
arquivo: application.properties

Aqui você indica em qual modo executará o ambiente:
prod: Como prod está na nuvem.
test: será executado com banco de dados em memória H2.
dev: será executado com banco de dados postgres. É necessário ter um banco com nome
Descrito no arquivo de configuração ´application-dev.properties´

# entrar na pasta do projeto 
# executar o projeto
./mvnw spring-boot:run
```
## Exemplo de endpoint API Rest
Lista um game de ID 2
![image](https://github.com/Sammy192/dsListSpringboot/assets/53224915/b6838912-0644-431a-bc33-4bc2f15df000)

Reposiciona um game na lista, passando no corpo da requisição a posição inicial do game e a posição final.

![image](https://github.com/Sammy192/dsListSpringboot/assets/53224915/611826c3-6cc6-4115-a2f5-2a42765c653e)

# Autor
Samuel Rodrigues Borges

[Meu Linkedin](https://www.linkedin.com/in/samuel-rodrigues-borges-585178166/)
