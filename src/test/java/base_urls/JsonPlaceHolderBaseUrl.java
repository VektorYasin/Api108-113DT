package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrl {

    protected RequestSpecification spec;

    @Before
    //if you use @Before annotation at the top of the method,
    // it will work just before every other test method.

    public void setUp(){
        spec=new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com/").build();



    }

}
