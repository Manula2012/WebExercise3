package org.example;

import org.jetbrains.annotations.TestOnly;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebExercise3 {


    static protected WebDriver driver;

    @Test
    public void register1() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ocado.com/webshop/startWebshop.do");
        driver.findElement(By.id("quickReg")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("registration-submit-button")));
        Select select = new Select(driver.findElement(By.tagName("select")));
        select.selectByVisibleText("Mr");
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Sam");
        driver.findElement(By.id("lastName")).sendKeys("Amara");
        driver.findElement(By.cssSelector("input#login")).sendKeys("sam.amara@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("sam123");
        driver.findElement(By.cssSelector("input#postcode")).sendKeys("UB7 7LF");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#postcode")));
        driver.findElement(By.id("registration-submit-button")).click();

    }

    @Test
    public void signIn() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.next.co.uk/");
        driver.findElement(By.linkText("My Account")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("SignInNow")));
        driver.findElement(By.cssSelector("input#EmailOrAccountNumber")).sendKeys("asm12@gmail.com");
        driver.findElement(By.cssSelector("input#Password")).sendKeys("abc123");
        driver.findElement(By.id("SignInNow")).click();
    }

    @Test
    public void register2() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.gumtree.com/");
        driver.findElement(By.className("header-nav-link")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.partialLinkText("/create-account")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-primary btn-full-width")));
        driver.findElement(By.partialLinkText("/create-account")).click();
    }
    @Test
    public void register3()
    {   System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://www.ebay.co.uk/");
        driver.findElement(By.xpath("//*[text()='register']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#ppaFormSbtBtn")));
        driver.findElement(By.cssSelector("input#firstname")).sendKeys("Sam");
        driver.findElement(By.cssSelector("input#lastname")).sendKeys("wije");
        driver.findElement(By.cssSelector("input#email")).sendKeys("abc123@gmail.com");
        driver.findElement(By.cssSelector("input#PASSWORD")).sendKeys("cde45*");
        driver.findElement(By.cssSelector("button#ppaFormSbtBtn"));
    }
    @Test
    public void signIn1() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.matalan.co.uk/");
        driver.findElement(By.xpath("//*[@class='o-list__item']//*[text()='My Account']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='new_account']/button")));
        driver.findElement(By.cssSelector("input#account_email")).sendKeys("abs123@gmail.com");
        driver.findElement(By.cssSelector("input#account_password")).sendKeys("abcd1234");
        driver.findElement(By.xpath("//*[@id='new_account']/button")).click();
    }
}

















