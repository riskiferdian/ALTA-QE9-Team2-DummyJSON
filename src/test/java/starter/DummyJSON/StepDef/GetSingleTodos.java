package starter.DummyJSON.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.DummyJSON.ReqAPI.TodosAPI;

public class GetSingleTodos {
    @Steps
    TodosAPI todosAPI;
//    POSITIVE CASE
    @Given("Get a single todo with walid parameter id {int}")
    public void getASingleTodoWithWalidParameterId(int id) {
        todosAPI.getSingleTodos(id);

    }
    @When("Send request get a single todo")
    public void sendRequestGetASingleTodo() {
        SerenityRest.when().get(TodosAPI.GET_SINGLE_TODOS);
    }

    @Given("Get a single todo with invalid parameter {string}")
    public void getASingleTodoWithInvalidParameter(String id) {
        todosAPI.getinvalidSingleTodos(id);
    }
}
