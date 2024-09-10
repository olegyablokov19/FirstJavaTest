import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaTests {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @Test
//    public void firstTest() {
//        driver.get("https://google.com");
//
//        By fieldLocator = By.id("APjFqb");
//        WebElement field = driver.findElement(fieldLocator);
//
//        field.sendKeys("автоматизированное тестирование");
//        field.sendKeys(Keys.ENTER);
//
//        By articleLinkLocator = By.xpath("//a[*//span[text()='Википедия']]");
//        WebElement articleLink = driver.findElement(articleLinkLocator);
//        articleLink.click();
//
//        Assertions.assertEquals("https://ru.wikipedia.org/wiki/%D0%90%D0%B2%D1%82%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D0%B7%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5_%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5",
//                driver.getCurrentUrl());
//    }
//    @Test
//    public void secondTest() {
//        driver.get("https://google.com");
//
//        By fieldLocator = By.id("APjFqb");
//        WebElement field = driver.findElement(fieldLocator);
//
//        field.sendKeys("автоматизированное тестирование");
//        field.sendKeys(Keys.ENTER);
//
//        By articleLinkLocator = By.xpath("//a[*//span[text()='Википедия']]");
//        WebElement articleLink = driver.findElement(articleLinkLocator);
//        articleLink.click();
//
//        Assertions.assertEquals("https://ru.wikipedia.orgD0%90%D0%B2%D1%82%D0%BE%D0%BC%D0%B0%D1%82%D0%B8%D0%B7%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5_%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5",
//                driver.getCurrentUrl());
//    }

    @Test
    public void goToSosiski() {
        driver.get("http://notify_stage.local.sosiska.ru/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
