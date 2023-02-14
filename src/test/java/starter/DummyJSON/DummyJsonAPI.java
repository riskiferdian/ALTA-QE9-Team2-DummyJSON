package starter.DummyJSON;

import DummyJSON.Utils.Constant;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class DummyJsonAPI {

    public static String GET_SINGLE_PRODUCT = Constant.BASE_URL +"products/{id}";

    @Step("get single product")
    public void getSingleProduct(int id){
        SerenityRest.given().pathParam("id",id);
    }

    @Step("get invalid single product")
    public void getInvalidSingleProduct(String id){
        SerenityRest.given().pathParam("id",id);
    }
}
