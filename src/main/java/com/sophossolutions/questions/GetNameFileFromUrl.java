package com.sophossolutions.questions;

import com.sophossolutions.utilities.Adjust;
import com.sophossolutions.utilities.Extract;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class GetNameFileFromUrl implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Adjust.adjustFileName(Extract.extractDataFromUrl(getDriver().getCurrentUrl()));
    }

    public static GetNameFileFromUrl extractUrl(){
        return new GetNameFileFromUrl();
    }

}
