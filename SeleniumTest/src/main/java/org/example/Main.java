
package org.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            // Membuka browser
            driver.manage().window().maximize();

            // Membuka halaman demo Selenium
            driver.get(
                    "https://www.selenium.dev/selenium/web/web-form.html"
            );

            System.out.println("Halaman dibuka: " + driver.getTitle());

            // Mencari kolom teks
            WebElement textBox = driver.findElement(
                    By.name("my-text")
            );

            // Mengisi formulir
            textBox.sendKeys("Selenium WebDriver Demo - Qin");

            System.out.println("Form berhasil diisi.");

            // Menekan tombol Submit
            driver.findElement(
                    By.cssSelector("button")
            ).click();

            System.out.println("Tombol Submit diklik.");

            // Menunggu hasil pengiriman
            WebDriverWait wait = new WebDriverWait(
                    driver,
                    Duration.ofSeconds(10)
            );

            WebElement message = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("message")
                    )
            );

            // Memeriksa hasil
            String result = message.getText();

            System.out.println("Hasil: " + result);

            if (result.equals("Received!")) {
                System.out.println(
                        "PASS: Form berhasil dikirim!"
                );
            } else {
                System.out.println(
                        "FAIL: Hasil tidak sesuai."
                );
            }

            // Memberikan waktu untuk melihat browser
            Thread.sleep(4000);

        } catch (Exception e) {

            System.out.println("Terjadi kesalahan: " + e.getMessage());

            e.printStackTrace();

        } finally {

            // Menutup browser
            driver.quit();
        }
    }
}
