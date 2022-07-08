import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test {
    public static void main(String[] args) {
       // RestAssured.baseURI = "https://rahulshettyacademy.com   ";
       Response response= RestAssured.given().log().all().queryParam("key","qaclick123").header("Content-Type", "application/json")
                .body("sample2.json").when().post("https://rahulshettyacademy.com/maps/api/place/add/json");

        System.out.println(response.getBody().toString());
    }
}
