package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Open browser
        driver.get("https://www.syntaxprojects.com/table-search-filter-demo.php");

        //Print all the rows of the table
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        for(WebElement row : allRows){
            System.out.println(row.getText());
        }
        //Print just the column number 3
        List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        for(WebElement cData : columnData){
            System.out.println(cData.getText());
        }
        //Print the row in which the status is in progress

        List<WebElement> statuses = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));
        int count = 1;
        for (WebElement status : statuses){
            String statusValue = status.getText();
            if(statusValue.equals("in progress")){
                //print this particular row
                System.out.println(count);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+ count +"]"));
                System.out.println(row.getText());
            }
            count = count+1;
        }





    }
}
