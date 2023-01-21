# Testes Automatizados - Site Task it!​ :man_technologist: :woman_technologist:

Esse projeto de automação foi criado com a utilização do Selenium WebDriver com Java e Junit e é importante mencionar que toda a sua estrutura está no padrão Page Object.

A suite de teste apresenta **X** validações sendo elas:

- ***Validar tentativa de cadastro com dados invalidos***
- ***Validar realização login na pagina do Serasa***
- ***Validar acesso ao Histórico do Score na aba Saúde Financeira*** 



#### **Ajustes de diretórios em algumas páginas do projeto e no CSV**

Abaixo irei listar alguns ajustes necessários referente a diretórios e no arquivo CSV.

**Pages - Alterações** 

1. ***Web Page*** - Alterar no método ***createChrome*** o diretório do driver do navegador para onde o driver do seu navegador esta localizado.
2. ***InformacoesUsuarioTest Page*** - Na variável ***diretório*** alterar para o diretório onde você deseja que as evidências sejam salvas.



**CSV - InformacoesUsuarioTest.csv - Alterações**

1. ***testValidaLogin*** - em INSERIR CPF, INSERIR SENHA, INSERIR NOME COMPLETO DO USUARIO
   1. INSERIR CPF - Inserir CPF valido com cadastro ativo para realizar login.
   2. INSERIR SENHA - Inserir Senha valida para realizar o login
   3. INSERIR NOME COMPLETO DO USUARIO - Inserir nome completo apresentado após clicar na sigla do usuario quando realizado o login.
2. ***testHistorico*** - em INSERIR CPF, INSERIR SENHA
   1. INSERIR CPF - Inserir CPF valido com cadastro ativo para realizar login.
   2. INSERIR SENHA - Inserir Senha valida para realizar o login

