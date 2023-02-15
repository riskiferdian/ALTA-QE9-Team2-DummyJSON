package starter.DummyJSON.ReqAPI;

import io.restassured.http.ContentType;
import org.checkerframework.checker.units.qual.C;
import starter.DummyJSON.Utils.Constant;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class ProductsAPI {

    public static String GET_SINGLE_PRODUCT = Constant.BASE_URL +"products/{id}";
    public static String GET_ALL_PRODUCT = Constant.BASE_URL +"products";
    public static String POST_ADD_PRODUCT = Constant.BASE_URL +"products/add";
    public static String POST_SEARCH_PRODUCT = Constant.BASE_URL +"products/search?q=phone";

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

    @Step("post add new product")
    public void getAddNewProduct(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("post invalid add new product")
    public void getInvalidAddNewProduct(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("post search product")
    public void postSearchProduct(){
        SerenityRest.given();
    }


}
