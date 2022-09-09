<h1 align="center">Bem vindo ao <u>DSMeta</u> ⚡</h1>

<p align="center"><code>App de avaliação de vendas com notificação SMS</code></p>

<div align="center">
  <img src="https://img.shields.io/badge/made%20by-William%20Jesus-ff8400"/>
  <img src="https://img.shields.io/github/repo-size/williamjesusdev/dsmeta?color=ff8400"/> 
  <img src="https://img.shields.io/github/languages/count/williamjesusdev/dsmeta?color=ff8400"/>
  <a aria-label="Dia 3 de 4" href="https://devsuperior.com.br/evento-sds?episodio=3">
  <img src="https://img.shields.io/badge/SemanaSpringReact-8.0-ff8400"/>
  </a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-ff8400"/>
</div>

<div align="center">
  <img src="https://img.shields.io/badge/java-17.0.4-red?logo=java&logoColor=red"/>
  <img src="https://img.shields.io/badge/backend-v0.1.0-red"/>
  <img src="https://img.shields.io/badge/node-16.15.0-green?logo=node.js"/>
  <img src="https://img.shields.io/badge/react-18.2.0-informational?logo=react"/>
  <img src="https://img.shields.io/github/package-json/v/williamjesusdev/dsmeta?color=blue&filename=frontend%2Fpackage.json&label=frontend"/>    
</div>

<img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png">


<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-layout">Layout</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-deploy">Deploy</a>
</p>
 
<br>

## 💻 Projeto

Projeto desenvolvido durante a Semana Spring React da [DevSuperior] para aprendizado fullstack de spring boot e react no mercado.

- Deploys: backend no [Heroku](https://w-dsmeta-api.herokuapp.com/sales) frontend no [Netlify](https://w-dsmeta.netlify.app)
- Integração com a plataforma da [Twilio](https://www.twilio.com/docs) para envio de notificação por SMS
- Padrão de projeto em camadas
- Padrão de Código
- Criar endpoint API REST
- Criar filtragem por datas
  
<br>

## ☕ Desenvolvimento
Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub no diretório de sua preferência.

``` powershell
git clone https://github.com/williamjesusdev/dsmeta.git
cd dsmeta/
```
<br>

## 🚀 Execução
Para executar o projeto localmente será necessário verificar as seguintes dependencias.
* [JDK 17: para executar o projeto Java](https://www.oracle.com/java/technologies/downloads)
* [Maven 3.8.6: para realizar o build do projeto Java](https://maven.apache.org/download.cgi)
* [NodeJS LTS: para executar o frontend](https://nodejs.org/en/download)

Após a instalação e configuração das dependências, executar os comandos.

``` bash
# Na raiz do projeto (FRONTEND)
cd frontend

# Com seu gerenciador favorito (Yarn de preferência)
yarn install | npm install # para instalar as dependências
yarn dev | npm run dev # para iniciar o ambiente DEV

# De volta a raiz do projeto (BACKEND)
cd backend 

# Com maven instalado
mvn spring-boot:run # para iniciar o ambiente DEV
```

<br>

## ✨ Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [backend](./backend/)
  - [Java 17](https://docs.oracle.com/en/java/javase/17)
  - [Maven](https://maven.apache.org/what-is-maven.html)
  - [Spring-boot](https://spring.io/projects/spring-boot)
  
- [frontend](./frontend/)
  - [JavaScript](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript)
  - [TypeScript](https://typescriptlang.org/)
  - [Axios](https://npmjs.com/package/axios)

- [database](./)
  - [H2 Database](https://h2database.com/html/main.html)

- [ferramentas](./)
  - [Insomnia](https://insomnia.rest/download)

<br>

## 🖼️ Layout

Você pode visualizar o layout do projeto através [desse link](https://www.figma.com/file/kYYqAkUSRr52H5ivzDSDJF/DSMeta).

<br>

## 🛸 Deploy

Você pode testar e usar a Aplicação através [desse link](https://w-dsmeta.netlify.app).

<br>

<img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png">
<h3 align ="center">Projeto realizado por: <b>William Jesus</b>®</h3>