package december4Api;

import base_urls.PetStoreBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Post01 extends PetStoreBaseUrl {
      /*
         Given
           1) https://petstore.swagger.io/v2/store/order
           2)  {
                  "petId": 10,
                  "quantity": 5,
                  "shipDate": "2022-12-04T12:21:46.297+0000",
                  "status": "placed",
                  "complete": true
                }
        When
            I send POST Request to the Url

        Then
            Status code is 200
        And
            response body is like {
                                    "id": 4465899024354589,
                                    "petId": 10,
                                    "quantity": 5,
                                    "shipDate": "2022-12-04T12:21:46.297+0000",
                                    "status": "placed",
                                    "complete": true
                                }
     */

    @Test
    public void post01(){
        //Set the url
        spec.pathParams("first","store","second","order");

        //Set the expected data
        Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("petId",10);
        expectedData.put("quantity",5);
        expectedData.put("shipDate","2022-12-04T12:21:46.297+0000");
        expectedData.put("status","placed");
        expectedData.put("complete",true);

        System.out.println("expectedData = " + expectedData);

        //Send the request and get the response
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
        response.prettyPrint();



    }


}