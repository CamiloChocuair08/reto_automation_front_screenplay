package com.co.choucair.tasks;

import com.co.choucair.userinterfaces.LoginPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Login implements Task {

    String user;
    String pass;

    public Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.USER_NAME_INPUT, isClickable()),
                Enter.theValue(user).into(LoginPage.USER_NAME_INPUT),
                Enter.theValue(pass).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.SUBMIT_BUTTON)
        );
    }

    public static Login onTheSite(String user, String pass){
        return Instrumented.instanceOf(Login.class).withProperties(user, pass);
    }
}
