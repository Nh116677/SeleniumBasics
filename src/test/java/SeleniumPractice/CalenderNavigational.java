package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CalenderNavigational {
    public static void main(String[] args) throws InterruptedException{
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Open browser
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");
        //Click on the calendar
        driver.findElement(By.xpath("//input[@id='start_date']")).click();
        //Get the month
        WebElement month = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));
        String currentMonth = month.getText();
        // Find the next button
        WebElement nextButton = driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));
        boolean notMonth = true;
        while (notMonth) {
            //Check if we are at the desired month
            if (currentMonth.equals("July 2025")) {
                //selection of the date
                List <WebElement> dates = driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
                for(WebElement date : dates){
                    String currentDate = date.getText();
                    if(currentDate.equals("6")){
                        date.click();
                    }
                }
                notMonth = false;
            }
            //click on next
            else {
                nextButton.click();
                currentMonth = month.getText();
            }

        }
    }
}


