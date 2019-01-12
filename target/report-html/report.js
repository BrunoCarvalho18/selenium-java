$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_conta.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language:pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de contas",
  "description": "\nComo um usuário \nGostaria de cadastrar contas\nPara que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "id": "cadastro-de-contas",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 10,
  "name": "Deve inserir uma conta com sucesso",
  "description": "",
  "id": "cadastro-de-contas;deve-inserir-uma-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 9,
      "name": "@CadastrarConta"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "preencho os campos",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "a conta é inserida com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "InserirContasSteps.estouAplicacao()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InserirContasSteps.preenchoCampos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "InserirContasSteps.validaContaInseridacomSucesso()"
});
formatter.result({
  "status": "skipped"
});
});