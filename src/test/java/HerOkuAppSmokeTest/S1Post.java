package HerOkuAppSmokeTest;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.BookingDatesPojo;
import pojos.BookingPojo;
import pojos.BookingResponsePojo;
import utils.JsonUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class S1Post extends HerOkuAppBaseUrl {
     /*Type an automation smoke test by using "https://restful-booker.herokuapp.com/apidoc/index.html" documentation.
     Create a booking then update, read and delete the booking you created.
    */
    /*
    Given
        https://restful-booker.herokuapp.com/booking
    And
        {
            "firstname" : "Jim",
            "lastname" : "Brown",
            "totalprice" : 111,
            "depositpaid" : true,
            "bookingdates" : {
                "checkin" : "2018-01-01",
                "checkout" : "2019-01-01"
            },
            "additionalneeds" : "Breakfast"
        }
    When
        User sends Post request
    Then
        Status code must be 200
    And
        Response body is like {
                                "bookingid": 18217,
                                "booking": {
                                    "firstname": "Jim",
                                    "lastname": "Brown",
                                    "totalprice": 111,
                                    "depositpaid": true,
                                    "bookingdates": {
                                        "checkin": "2018-01-01",
                                        "checkout": "2019-01-01"
                                        },
                                    "additionalneeds": "Breakfast"
                                    }
                                }
     */

    static int bookingid;//static türünde belirlediğimiz için aynı package içindeki class'larda kullanabiliriz.
    @Test
    public void post01(){
        //Set the url
        spec.pathParam("first","booking");

        //Set the expected data
        BookingDatesPojo bookingDatesPojo = new BookingDatesPojo("2018-01-01","2019-01-01");
        BookingPojo expectedData = new BookingPojo("Jim","Brown",111,true,bookingDatesPojo, "Breakfast");
        System.out.println("expectedData = " + expectedData);
        //expectedData = BookingPojo{firstname='Jim', lastname='Brown', totalprice=111, depositpaid=true,
        // bookingdates=BookingDatesPojo{checkin='2018-01-01', checkout='2019-01-01'}, additionalneeds='Breakfast'}

        //Send the request and get the response
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}");
        response.prettyPrint();
        /*{
            "bookingid": 10189,
            "booking": {
                "firstname": "Jim",
                "lastname": "Brown",
                "totalprice": 111,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2018-01-01",
                    "checkout": "2019-01-01"
                     },
                "additionalneeds": "Breakfast"
                }
            }
         */

        //Do Assertion
        BookingResponsePojo actualData = JsonUtils.convertJsonToJavaObject(response.asString(), BookingResponsePojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getFirstname(),actualData.getBooking().getFirstname());
        assertEquals(expectedData.getLastname(),actualData.getBooking().getLastname());
        assertEquals(expectedData.getTotalprice(),actualData.getBooking().getTotalprice());
        assertEquals(expectedData.getDepositpaid(),actualData.getBooking().getDepositpaid());

        assertEquals(bookingDatesPojo.getCheckin(),actualData.getBooking().getBookingdates().getCheckin());
        assertEquals(bookingDatesPojo.getCheckout(),actualData.getBooking().getBookingdates().getCheckout());

        assertEquals(expectedData.getAdditionalneeds(),actualData.getBooking().getAdditionalneeds());

        bookingid = actualData.getBookingid();  //response'ta yani actual data'da bana sistem bookingid üretip veriyor,
                                                // biz de bunu alıyoruz update yapmak için
        //actualData = BookingResponsePojo{bookingid=10189, booking=BookingPojo{firstname='Jim', lastname='Brown', totalprice=111,
        //depositpaid=true, bookingdates=BookingDatesPojo{checkin='2018-01-01', checkout='2019-01-01'}, additionalneeds='Breakfast'}}

    }
}