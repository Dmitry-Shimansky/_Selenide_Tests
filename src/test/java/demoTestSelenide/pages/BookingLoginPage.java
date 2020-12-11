package demoTestSelenide.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class BookingLoginPage {

    public void clickLoginButton() {
        $(byText("Sign in")).click();
    }

    public void enterLogin(String login) {
        $("#username").sendKeys(login);
    }

    public void clickContinueButton() {
        $(byText("Continue with email")).click();
    }

    public void enterPass(String password) {
        $(By.id("password")).sendKeys(password);
    }

    public void clickSignInButton() {
        $(byText("Sign in")).click();
    }
}
