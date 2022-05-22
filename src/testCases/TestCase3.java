package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactLink = driver.findElement(By.xpath("//a[@href=\"/contact-us\"]"));
        contactLink.click();

        WebElement heading = driver.findElement(By.xpath("//h2[@data-aid=\"CONTACT_SECTION_TITLE_REND\"]"));
        WebElement message = driver.findElement(By.xpath("//h4[@data-ux=\"HeadingMinor\"]"));

        if (heading.isDisplayed() && heading.isEnabled() && heading.getText().equals("Contact Us"))
            System.out.println("Heading validation: PASSED");
        else System.out.println("Heading validation: FAILED");

        if (message.isDisplayed() && message.isEnabled() && message.getText().equals("SEND US A MESSAGE"))
            System.out.println("Message validation: PASSED");
        else System.out.println("Message validation: FAILED");

        driver.quit();
        System.out.println("End of the program");



    }
}
