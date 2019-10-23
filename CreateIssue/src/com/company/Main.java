package com.company;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

   // public static void main(String[] args) {

        public class LinguaLeo3 {
            @Test
            public void firstTest() throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "D:\\123\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://lingualeo.com/ru");
                driver.findElement(By.xpath("//div[contains(text(), 'У МЕНЯ УЖЕ ЕСТЬ АККАУНТ')]")).click();
                driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mila.studentova@gmail.com");
                driver.findElement(By.xpath("//input[@name='password']")).sendKeys("friends");
                driver.findElement(By.xpath("//span[contains(text(), 'ВОЙТИ')]")).click();

                // write your code here
            }
        }}
