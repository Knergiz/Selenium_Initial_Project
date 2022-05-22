package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactLink = driver.findElement(By.xpath("//a[@href=\"/contact-us\"]"));
        contactLink.click();

        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div/section/div/div/div[1]/span/div/div/div/form/div[5]/label/div"));
        WebElement text = driver.findElement(By.xpath("//p[text()='Sign up for our email list for updates, promotions, and more.']"));

        checkbox.click();
        if (checkbox.isEnabled() && checkbox.isSelected()){
            System.out.println("Checkbox validation: PASSED");
        }else System.out.println("Checkbox validation: FAILED");

        if (text.isDisplayed() && text.isEnabled() && text.getText().equals("Sign up for our email list for updates, promotions, and more."))
            System.out.println("Checkbox text validation: PASSED");
        else System.out.println("Checkbox text validation: FAILED");

        driver.quit();
        System.out.println("End of program");


    }
}
