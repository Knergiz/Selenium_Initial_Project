package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactLink = driver.findElement(By.xpath("//a[@href=\"/contact-us\"]"));
        contactLink.click();

        WebElement heading = driver.findElement(By.xpath("//div[@data-ux=\"Intro\"]"));
        WebElement facebookLink = driver.findElement(By.xpath("//a[@data-aid=\"SOCIAL_FACEBOOK_LINK\"]"));
        WebElement instagramLink = driver.findElement(By.xpath("//a[@href=\"https://www.instagram.com/comfyelite\"]"));

        if (heading.isDisplayed() && heading.isEnabled() && heading.getText().equals("Connect With Us"))
            System.out.println("Heading validation: PASSED");
        else System.out.println("Heading validation: FAILED");

        if (facebookLink.isDisplayed() && facebookLink.isEnabled() && facebookLink.getAttribute("href").equals("https://www.facebook.com/103179127717601")){
            System.out.println("Facebook link validation: PASSED");
        }else System.out.println("Facebook validation: FAILED");


        if (instagramLink.isEnabled() && instagramLink.isDisplayed() && instagramLink.getAttribute("href").equals("https://www.instagram.com/comfyelite")){
            System.out.println("Instagram link validation: PASSED");
        }else System.out.println("Instagram validation: FAILED");

        driver.quit();
        System.out.println("End of the program");


    }
}
