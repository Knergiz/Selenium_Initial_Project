package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactLink = driver.findElement(By.xpath("//a[@href=\"/contact-us\"]"));
        contactLink.click();

        WebElement firstName = driver.findElement(By.xpath("//label[text()='First Name*']"));
        WebElement lastName = driver.findElement(By.xpath("//label[text()='Last Name*']"));
        WebElement email = driver.findElement(By.xpath("//label[text()='Email*']"));
        WebElement message = driver.findElement(By.xpath("//textarea[@aria-label=\"Message*\"]"));

        if (firstName.isDisplayed() && firstName.isEnabled() && firstName.getText().equals("First Name*"))
            System.out.println("First name validation: PASSED");
        else System.out.println("First name validation: FAILED");

        if (lastName.isDisplayed() && lastName.isEnabled() && lastName.getText().equals("Last Name*"))
            System.out.println("Last name validation: PASSED");
        else System.out.println("Last name validation: FAILED");

        if (email.isDisplayed() && email.isEnabled() && email.getText().equals("Email*"))
            System.out.println("Email validation: PASSED");
        else System.out.println("Email validation: FAILED");

        if (message.isDisplayed() && message.isEnabled() && message.getAttribute("placeholder").equals("Message*"))
            System.out.println("Message validation: PASSED");
        else System.out.println("Message validation: FAILED");

        driver.quit();




    }
}
