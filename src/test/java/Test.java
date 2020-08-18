import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    @org.junit.Test
    public void testA() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.onet.pl/");
        webDriver.close();
        System.out.println("Jest ok");
    }
}
