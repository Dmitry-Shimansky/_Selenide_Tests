package demoTestSelenide.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import demoTestSelenide.pages.BookingLoginPage;
import demoTestSelenide.settings.ConfigUsers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;

public class BookingLoginTest extends BookingLoginPage {

    @Test
    public void loginTest() {

        Configuration.pageLoadStrategy = "eager";
        Configuration.startMaximized = true;
//        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;
        
        open("https://booking.com/");

        clickLoginButton();

        enterLogin(ConfigUsers.USER_BOOKING_LOGIN);
        clickContinueButton();

        enterPass(ConfigUsers.USER_BOOKING_PASSWORD);
        clickSignInButton();

        $(byText("Your account")).shouldHave(text("Your account"));
    }
}
