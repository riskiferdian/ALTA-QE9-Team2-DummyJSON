package starter.DummyJSON.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.DummyJSON.ReqAPI.ProductsAPI;

public class GetAllProducts {
    @Steps
    ProductsAPI productsAPI;

    @Given("Get all product list")
    public void getAllProductList() {
        productsAPI.getAllProduct();
    }

    @When("Send request get all products")
    public void sendRequestGetAllProducts() {
        SerenityRest.when().get(ProductsAPI.GET_ALL_PRODUCT);
    }
}
