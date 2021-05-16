package covidreporttests;

import clients.CovidReport;
import com.fasterxml.jackson.core.JsonProcessingException;
import entities.CovidStatsResponse;
import org.testng.annotations.Test;

public class CovidStatTests {

    @Test
    public void getCovidReportIndia() throws JsonProcessingException {

        CovidStatsResponse covidStats = new CovidReport().getCovidStats();

        System.out.println(covidStats.getKarnataka().getCured());

    }
}
