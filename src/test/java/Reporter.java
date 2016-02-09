import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.*;

/**
 * Created by saipkri on 09/02/16.
 */
public class Reporter {

    public static void main(String[] args) throws Exception {
        String projectName = args[0];
        File reportOutputDirectory = new File("target/cucumber_reports");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("./target/cucumber.json");

        String jenkinsBasePath = "";
        boolean skippedFails = true;
        boolean pendingFails = false;
        boolean undefinedFails = true;
        boolean missingFails = true;
        boolean parallelTesting = false;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setStatusFlags(skippedFails, pendingFails, undefinedFails, missingFails);
        configuration.setParallelTesting(parallelTesting);
        configuration.setJenkinsBasePath(jenkinsBasePath);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
