package doctorEkhane.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DoctorEkhaneHomePage extends DriverSetup {
    @Test
    public void testHomePage() throws InterruptedException {
        driver.navigate().to("https://doctorekhane.com/");
        //Locate Top header email
        WebElement email = driver.findElement(By.cssSelector("p[class='font-medium text-[#2992F2] fon-inter font-noto text-[14px]']"));
        //email.click();

        //Locate top header Phone number
        WebElement phoneNumber = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > p:nth-child(2) > a:nth-child(1)"));
        //phoneNumber.click();

        //Locate WhatsApp number
        WebElement whatsAppNumber = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > p:nth-child(2) > a:nth-child(1)"));
        //whatsAppNumber.click();

        //Locate Bangla language button
        WebElement banglaLanguage = driver.findElement(By.xpath("(//p[contains(@class,'text-base font-medium leading-6 text-[#3F3F3F]')][contains(text(),'বাংলা')])[1]"));
        //banglaLanguage.click();

        //Locate English Language button
        WebElement englishLanguage = driver.findElement(By.xpath("(//p[contains(text(),'English')])[1]"));
        //englishLanguage.click();
        //----------------------------------------------

        //Locate Logo icon
        WebElement logoIcon = driver.findElement(By.xpath("(//img[contains(@class,'w-[67px] h-auto')])[1]"));
        //logoIcon.click();

        //Locate Doctor Linked Text
        WebElement doctorLink = driver.findElement(By.xpath("(//p[contains(@class,'text-base leading-6 text-[#343434] font-noto font-medium lg:border-none lg:py-0 border-b py-1 hover:text-primary')][normalize-space()='Doctor'])[1]"));
        //doctorLink.click();

        WebElement hospitalLink = driver.findElement(By.xpath("(//p[contains(@class,'text-base leading-6 text-[#343434] font-noto font-medium lg:border-none lg:py-0 border-b py-1 hover:text-primary')][normalize-space()='Hospital'])[1]"));
        //hospitalLink.click();

        //Locate Blood Donor Link
        WebElement bloodDonorLink = driver.findElement(By.xpath("(//p[contains(@class,'text-base leading-6 text-[#343434] font-noto font-medium lg:border-none lg:py-0 border-b py-1 hover:text-primary')][normalize-space()='Blood donor'])[1]"));
        //bloodDonorLink.click();

        //Locate Ambulance Link
        WebElement ambulanceLink = driver.findElement(By.xpath("(//p[contains(@class,'text-base leading-6 text-[#343434] font-noto font-medium lg:border-none lg:py-0 border-b py-1 hover:text-primary')][normalize-space()='Ambulance'])[1]"));
        //ambulanceLink.click();

        //Locate Test Link
        WebElement testLink = driver.findElement(By.cssSelector("a[href='/test']"));
        //testLink.click();

        //Locate Blog Link
        WebElement blogLink = driver.findElement(By.cssSelector("a[href='/blog']"));
        //blogLink.click();

        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact']"));
        //contactUsLink.click();

        //Locate Log in or Register button
        WebElement logInOrRegisterButton = driver.findElement(By.xpath("(//button[normalize-space()='Login/Register'])[1]"));
        logInOrRegisterButton.click();


        Thread.sleep(3000);
    }

}
