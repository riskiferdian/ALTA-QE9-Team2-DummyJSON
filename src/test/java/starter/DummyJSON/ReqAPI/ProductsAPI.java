package starter.DummyJSON.ReqAPI;

import starter.DummyJSON.Utils.Constant;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ProductsAPI {

    public static String GET_SINGLE_PRODUCT = Constant.BASE_URL +"products/{id}";
    public static String GET_ALL_PRODUCT = Constant.BASE_URL +"products";

    @Step("get all product")
    public void getAllProduct(){
        SerenityRest.given();
    }

    @Step("get invalid all product")
    public void getInvalidAllProduct(){
        SerenityRest.given();
    }

    @Step("get single product")
    public void getSingleProduct(int id){
        SerenityRest.given().pathParam("id",id);
    }

    @Step("get invalid single product")
    public void getInvalidSingleProduct(String id){
        SerenityRest.given().pathParam("id",id);
    }
}
