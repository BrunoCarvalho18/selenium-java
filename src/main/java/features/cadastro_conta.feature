# language:pt

Funcionalidade: Cadastro de contas
  
  Como um usuário 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  @CadastrarConta
  Cenário: Deve inserir uma conta com sucesso
    Dado que estou acessando a aplicação
    Quando preencho os campos 
    Então a conta é inserida com sucesso