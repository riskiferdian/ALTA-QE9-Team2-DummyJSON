package starter.DummyJSON.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.DummyJSON.ReqAPI.ProductsAPI;
import starter.DummyJSON.ReqAPI.TodosAPI;

public class GetAllTodos {

    @Steps
    TodosAPI todosAPI;

    @Given("Get all todo with valid parameter")
    public void getAllTodoWithValidParameter() {
        todosAPI.getAllTodos();

    }

    @When("Send request get all todo")
    public void sendRequestGetAllTodo() {
        SerenityRest.when().get(TodosAPI.GET_ALL_TODOS);
    }

    @Given("Get all todo with invalid parameter id {int}")
    public void getAllTodoWithInvalidParameterId(int id) {
        todosAPI.getInvalidAllTodos(id);


    }
}
