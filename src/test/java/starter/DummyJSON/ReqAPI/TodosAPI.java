package starter.DummyJSON.ReqAPI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.DummyJSON.Utils.Constant;

public class TodosAPI {

    public static String GET_ALL_TODOS = Constant.BASE_URL +"todos";
    public static String GET_SINGLE_TODOS = Constant.BASE_URL+"todos/{id}";


    @Step("Get all todos")
    public void getAllTodos(){
        SerenityRest.given();
    }
    @Step("Get invalid all todos")
    public void getInvalidAllTodos(int id){
        SerenityRest.given().pathParam("id",id);
    }
    @Step("Get single todos")
    public void getSingleTodos(int id){
        SerenityRest.given().pathParam("id",id);
    }
    @Step("Get invalid single todos")
    public void getinvalidSingleTodos(String id){
        SerenityRest.given().pathParam("id",id);
    }

}
