package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
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

    }
}



