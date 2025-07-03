package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTablePart2 {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open browser
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/imdex.php/auth/login");

        //Login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        //Click on PIM option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        // Get the column by id
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean notFound = true;
        while (notFound) {
            int count = 1;

            for (WebElement id : allIDs) {
                String idNo = id.getText();
                if (idNo.equals("117074A")) {
                    System.out.println(count);
                    //Find the checkbox and click on it
                    WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                    checkBox.click();
                    //exit the while loop
                    notFound = false;
                }
                count = count + 1;
            }
            if (notFound) {
                WebElement nextButton = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextButton.click();
                allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));


            }
        }
    }
}
