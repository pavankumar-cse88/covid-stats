package clients;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import entities.CovidStatsResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CovidReport {



    public CovidStatsResponse getCovidStats() throws JsonProcessingException {

        Gson gson = new Gson();
        Response response = given()
                            .header("x-rapidapi-key","5458fbb48fmshf1b2eb729658e61p15fea4jsnb28b8ba3806e")
                            .header("x-rapidapi-host","covid-19-india2.p.rapidapi.com")
                            .header("useQueryString",true)
                            .get("https://covid-19-india2.p.rapidapi.com/details.php");

        System.out.println(response.body().asString());

        ObjectMapper mapper = new ObjectMapper();
        return gson.fromJson(response.asString(), CovidStatsResponse.class);

    }
}
