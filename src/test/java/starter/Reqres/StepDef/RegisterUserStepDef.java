package starter.Reqres.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Reqres.ReqresAPI;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class RegisterUserStepDef {
    @Steps
    ReqresAPI reqresAPI;

//    @Given("Register user with valid json file")
//    public void registerUserWithValidJsonFileFile() {
//        File jsonb = new File(ReqresAPI.DIR+"/src/test/resources/features/Reqres/RegisterUser.json");
//        reqresAPI.setPostRegisterUser(jsonb);
//    }
//
//    @When("Send request register user")
//    public void sendRequestRegisterUser() {
//        SerenityRest.when().post(ReqresAPI.POST_REGISTER_USER);
//    }
//
//    @And("Response body id should be {int} and token {string}")
//    public void responseBodyIdShouldBeAndToken(int id, String token) {
//        SerenityRest.then()
//                .body("id",equalTo(id))
//                .body("token",equalTo(token));
//    }

    @Given("Register user with valid json")
    public void registerUserWithValidJson() {
        File jsonReq = new File(ReqresAPI.DIR+"/src/test/resources/JSON/ReqBody/UsersReqBody.json");
        reqresAPI.setPostRegisterUser(jsonReq);
    }

    @When("Send request register user")
    public void sendRequestRegisterUser() {
        SerenityRest.when().post(ReqresAPI.POST_REGISTER_USER);
    }
}
