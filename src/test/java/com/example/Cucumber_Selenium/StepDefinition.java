package com.example.Cucumber_Selenium;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Först skriver vi innehåll i RunCucumberTest
// Sedan skriver vi vår Gherkin-kod i vår feature-fil
// För att sedan definiera våra given/when/then här i StepDefinition.
public class StepDefinition {

    static WebDriver driver;

    @Given("SVT Play is available")
    public void svt_play_is_available() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
        driver.get("httpS://svtplay.se");
    }
    @When("User visits SVT Play")
    public void user_visits_svt_play() {
        driver.manage().window().maximize();
    }

    // Strängen tas från vår Gherkin-kod och ges som en parameter
    // till metoden.
    @Then("The title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle, "Titeln stämmer inte");
    }

}
