package com.sophossolutions.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterSite implements Task {

    private Target link;

    public EnterSite(Target link){
        this.link = link;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(link),
                Click.on(link)
        );
    }

    public static EnterSite enter(Target link){
        return instrumented(EnterSite.class, link);
    }

}
