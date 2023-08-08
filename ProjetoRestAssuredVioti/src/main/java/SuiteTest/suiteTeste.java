package SuiteTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import io.restassured.RestAssured;
import rest.core.BaseTest;
import rest.tests.AuthTest;
import rest.tests.MovimentacaoTest;
import rest.tests.SaldoTest;
import rest.tests.TestesGerais;


@RunWith(Suite.class)
@SuiteClasses({
	
	MovimentacaoTest.class,
	SaldoTest.class,
	TestesGerais.class,
	AuthTest.class,


})

public class suiteTeste extends BaseTest {

	//CADASTRE UM USUÁRIO E SENHA EM https://seubarriga.wcaquino.me/cadastro
	
	@BeforeClass
	public static void login() {
		Map<String, String> login = new HashMap<String, String>();
		login.put("email", "COLOQUESEUEMAILCADASTRADO");
		login.put("senha", "COLOQUESUASENHACADASTRADANOSITE");
		
		// login na API
		//Receber o Token
		
		String TOKEN =	given()
			.log().all()
			.body(login)
		.when()
			.post("/signin")
		.then()
			.log().all()
			.statusCode(200)
			.extract().path("token");
		
		RestAssured.requestSpecification.header("authorization" , "JWT " + TOKEN);
		
		RestAssured.get("/reset").then().statusCode(200);

	}
	

	

}
