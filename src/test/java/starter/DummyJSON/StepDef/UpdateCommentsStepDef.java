package starter.DummyJSON.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.DummyJSON.ReqAPI.CommentsAPI;
import starter.DummyJSON.DummyjsonResponses;
import starter.DummyJSON.Utils.Constant;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class UpdateCommentsStepDef {
    @Steps
    CommentsAPI commentsApi;

    //Scenario Put update comment with valid json
    @Given("put comment by id {int}")
    public void putCommentById(int id) {
        File json = new File(Constant.JSON_REQUEST+"/Comments/RequestPutComment.json");
        commentsApi.putUpdateComment(id, json);
    }
    @When("send request put Update comment")
    public void sendRequestPutUpdateComment() {
        SerenityRest.when().put(CommentsAPI.PUT_COMMENTS);
    }

    @And("response body post ID should be {int}, user ID {int}, and body is {string}")
    public void responseBodyUserIDShouldBeAndBodyIs(int postID, int userID, String body) {
        SerenityRest.then()
                .body(DummyjsonResponses.POST_ID, equalTo(postID))
                .body(DummyjsonResponses.USER_ID, equalTo(userID))
                .body(DummyjsonResponses.BODY, equalTo(body));
    }

    @And("validate json schema put comments")
    public void validateJsonSchemaPutComments() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "/Comments/SuccessPutComment.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    //Scenario Put update comment with invalid json
    @Given("put comment by id {int} with invalid json")
    public void putCommentByIdWithInvalidJson(int id) {
        File json = new File(Constant.JSON_REQUEST+"/Comments/InvalidRequestPutComment.json");
        commentsApi.putUpdateComment(id, json);
    }
}
