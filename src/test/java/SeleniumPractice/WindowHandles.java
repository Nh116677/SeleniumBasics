package SeleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        //Declare instance
        WebDriver driver = new ChromeDriver();
        //Maximize window
        driver.manage().window().maximize();
        //Go to the browser
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        //get window handle of the main page and print it out on the console
        String mainPageWH = driver.getWindowHandle();
        System.out.println("The window handle of the main page is " + mainPageWH);
        //click on the buttons for instagram
        WebElement igBT = driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        WebElement fbBtn = driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));
        //Click them
        igBT.click();
        fbBtn.click();
        // Task: sends keys to fb.com input box
        //Get all the window handles
        Set<String> allHandles= driver.getWindowHandles();
        for (String handle : allHandles){
            driver.switchTo().window(handle);
            String url= driver.getCurrentUrl();
            if(url.contains("https://www.facebook.com/syntaxtechs/")){
                //Find the textbox and send some keys
                WebElement inputBox = driver.findElement(By.xpath("(//input{@name='email'])[2]"));
                inputBox.sendKeys("hello");
                break;
            }
        }
        System.out.println("The current focus of driver is on window " + driver.getCurrentUrl());
        driver.switchTo().window(mainPageWH);

        System.out.println("The current focus of driver is on window " + driver.getCurrentUrl());

    }
}
