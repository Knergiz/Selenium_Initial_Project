package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase6 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactLink = driver.findElement(By.xpath("//a[@href=\"/contact-us\"]"));
        contactLink.click();

        WebElement button = driver.findElement(By.xpath("//button[@data-aid=\"CONTACT_SUBMIT_BUTTON_REND\"]"));

        if (button.isEnabled() && button.isDisplayed() && button.getText().equals("SEND")) System.out.println("Button validation: PASSED");
        else System.out.println("Button validation: FAILED");

        driver.quit();
        System.out.println("End of program");


    }
}
