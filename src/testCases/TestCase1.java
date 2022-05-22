package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactLink = driver.findElement(By.xpath("//a[@href=\"/contact-us\"]"));
        contactLink.click();

        if (driver.getCurrentUrl().equals("https://comfyelite.com/contact-us")) System.out.println("URL validation: PASSED");
        else System.out.println("URL validation: FAILED");

        WebElement image = driver.findElement(By.xpath("//img[@data-ux=\"ImageLogo\"]"));
        WebElement heading = driver.findElement(By.id("dynamic-tagline-48605"));

        if (image.isDisplayed() && image.isEnabled()) System.out.println("Image validation: PASSED");
        else System.out.println("Image validation: FAILED");

        if (heading.isEnabled() && heading.isDisplayed() && heading.getText().equals("High quality comfy pillows and accessories for travel, office and home.")){
            System.out.println("Heading validation: PASSED");
        }else System.out.println("Heading validation: FAILED");

        Driver.quitDriver();
        System.out.println("End of the program");


    }
}
