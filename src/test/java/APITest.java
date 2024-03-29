import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITest {

    @Test
    void test1(){


       Response response = RestAssured.get("https://api.coindesk.com/v1/bpi/currentprice.json");
       System.out.println("Response : "+response.asString());
       System.out.println("Status code : "+response.getStatusCode());
       System.out.println("Body : "+response.getBody().asString());
       System.out.println("Time taken : "+response.getTime());
       System.out.println("Header : "+response.getHeader("content-type"));

       int statusCode = response.statusCode();
       Assert.assertEquals(statusCode, 200);
    }
    @Test
    void test2() {
        given().
                get("https://api.coindesk.com/v1/bpi/currentprice.json").
                then().
                statusCode(200);
    }



    }




