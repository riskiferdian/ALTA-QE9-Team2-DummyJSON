package starter.DummyJSON;

import starter.DummyJSON.Utils.Constant;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class DummyJsonAPI {

    public static String GET_SINGLE_PRODUCT = Constant.BASE_URL +"/products/{id}";

    @Step("get single product")
    public void getSingleProduct(int id){
        SerenityRest.given().pathParam("id",id);
    }

    @Step("get invalid single product")
    public void getInvalidSingleProduct(String id){
        SerenityRest.given().pathParam("id",id);
    }
}
