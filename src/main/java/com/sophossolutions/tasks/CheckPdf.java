package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckPdf implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toWindow(BrowseTheWeb.as(actor).getDriver().getWindowHandles().stream().reduce((first, second) -> second).get())
        );
    }

    public static CheckPdf check(){
        return instrumented(CheckPdf.class);
    }

}
