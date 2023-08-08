# RestAssuredTest
Projeto basico em RestAssured com cenários de teste Inserção, Alteração, Deleção de massa automaticamente

*******  ATENÇÂO   *******

Após baixar o projeto, cadastre um usuário e senha no site:  https://seubarriga.wcaquino.me/cadastro
e substitua as linhas 37 e 38 respectivamente com suas informações na classe **SuiteTeste.java**
		login.put("email", "**COLOQUESEUEMAILCADASTRADO**");
		login.put("senha", "**COLOQUESUASENHACADASTRADANOSITE**");

Para rodar um cenário específico é só comentar os que vc não quiser rodar com "//" nessa parte do código.
"
@SuiteClasses({
	
	MovimentacaoTest.class,
	SaldoTest.class,
	TestesGerais.class,
	AuthTest.class,
})

"
=-=-=-=-=-=-=-=-=-=-=
Bons Estudos !   
