package starter.DummyJSON.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.internal.util.SafeExceptionRethrower;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.DummyJSON.ReqAPI.ProductsAPI;

public class PostSearchProduct {
    @Steps
    ProductsAPI productsAPI;

    @Given("post search product with valid path")
    public void postSearchProductWithValidPath() {
        productsAPI.postSearchProduct();
    }

    @When("Send request post search product")
    public void sendRequestPostSearchProduct() {
        SerenityRest.when().post(ProductsAPI.POST_SEARCH_PRODUCT);
    }
}
