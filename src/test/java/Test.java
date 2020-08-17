import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.onet.pl/");
        webDriver.close();
        System.out.println("Jest ok");
    }
}
