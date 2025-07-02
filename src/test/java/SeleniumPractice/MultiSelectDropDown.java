package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();

        //Maximize window
        driver.manage().window().maximize();

        //Go to browser https://syntaxprojects.com/basic-select-dropdown-demo.php
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //Find the dropdown
        //make sure that u are writing down the select tag
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        // check if the dropdown is multi select
        Select sel = new Select(DD);
        boolean MultiSel = sel.isMultiple();
        System.out.println("The dropdown is multi select");
        sel.selectByIndex(0);
        sel.selectByVisibleText("New Jersey");
        sel.selectByValue("Texas");

        Thread.sleep(2000);

        sel.deselectByIndex(0);


    }
}
