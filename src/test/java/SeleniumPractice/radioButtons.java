package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButtons {
    public static void main(String[] args) throws InterruptedException {
        //Declare the instance
        WebDriver driver = new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Navigate browser "https://syntaxprojects.com/basic-radiobutton-demo.php"
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //Find and select the radio button male if it is not selected
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        boolean stateoORadioBtn = maleRadioBtn.isSelected();
        if(!stateoORadioBtn){
            maleRadioBtn.click();
        }

        //Make sure that the selection is done
        boolean selectionOfMalebtn = maleRadioBtn.isSelected();
        System.out.println("The male radio button is selected: " +  selectionOfMalebtn);

        //Find and select the radio button male if it is not selected
        WebElement maleRadioBtn2 = driver.findElement(By.xpath("//input[@value='gender-male' and @name='gender-identity']"));
        boolean stateOfRadioBtn2 =maleRadioBtn2.isSelected();
        if(!stateOfRadioBtn2){
            maleRadioBtn2.click();
        }
        //make sure that the selection is done
        boolean selectionofMaleBtn2 = maleRadioBtn2.isSelected();
        System.out.println("The male radio button is selected: " + selectionofMaleBtn2);

        //List of WebElement
        List<WebElement> ageOpt = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for(WebElement age : ageOpt){
            if(age.getAttribute("value").equals("5 - 15")) {
                age.click();
            }

        }






    }
}
