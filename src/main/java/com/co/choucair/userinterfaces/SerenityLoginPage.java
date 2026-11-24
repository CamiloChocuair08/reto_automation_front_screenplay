package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityLoginPage {
  public static final Target USER_NAME_INPUT = Target.the("User name input")
          .located(By.id("user-name"));
  public static final Target PASSWORD_INPUT = Target.the("Password input")
          .located(By.id("password"));
  public static final Target SUBMIT_BUTTON = Target.the("Submit button")
          .located(By.id("login-button"));

}