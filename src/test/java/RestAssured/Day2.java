package RestAssured;
import java.util.HashMap;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Day2 {

    //Different ways to create post request body


    //1 by using hash map
    @Test(priority = 1)
    void testPostUsingHashmap(){
        HashMap data=new HashMap();
        data.put("name","Scott");
        data.put("location","France");
        data.put("phone","224833787");

        String courseArr[]={"nodeJs","react"};
        data.put("courses",courseArr);

        given()
                .contentType("application/json")
                .body(data)

        .when()
                .post("http://localhost:3000/Students")

        .then()
                .statusCode(201)
                .body("name",equalTo("Scott"))
                .body("location",equalTo("France"))
                .body("phone",equalTo("224833787"))
                .body("courses[0]",equalTo("nodeJs"))
                .body("courses[1]",equalTo("react"))
                .header("Content-Type","application/json")
                .log().all();

    }

    //delete record
    @Test(priority = 2)
    void deleteRecord(){
        given()

                .when()
                .delete("http://localhost:3000/Students/4")

                .then()
                .statusCode(200);

    }
}
