package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) throws InterruptedException {
        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();

        //Go to browser ("https://syntaxprojects.com/basic-checkbox-demo.php");
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //Check the checkbox
        WebElement cb1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean stateofcb1 = cb1.isSelected();
        if (!stateofcb1) {
            cb1.click();
        }
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkBox : checkBoxes) {
            if (checkBox.getAttribute("value").equals("Option-3")) {
                checkBox.click();
            }
        }


        //Step 1 to enable checkbox button

        // Step 1: Click the Enable Checkboxes button
        WebElement enableBtn = driver.findElement(By.id("enabledcheckbox"));
        enableBtn.click();

        // Optional delay to allow checkboxes to become enabled
        Thread.sleep(1000);

        // Step 2: Get all checkboxes with value 'Checkbox-1' to 'Checkbox-4'
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input.checkbox-field"));

        for (WebElement checkbox : checkboxes) {
            if (checkbox.isEnabled()) {
                checkbox.click();
                System.out.println("✅ Selected: " + checkbox.getAttribute("value"));
            } else {
                System.out.println("❌ Still disabled: " + checkbox.getAttribute("value"));
            }
        }
        // Cleanup
        Thread.sleep(2000);
        driver.quit();
    }
}








