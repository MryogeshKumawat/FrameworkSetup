import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.selenium.dev/");
        Thread.sleep(5000);
        driver.close();
//            driver.findElement(By.xpath("//button[contains(text(),'Test my mic')]")).click();
//            System.out.println(driver.getCurrentUrl());
//            Thread.sleep(5000);
//        driver.getWindowHandle();

    }
}