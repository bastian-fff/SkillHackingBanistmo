package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Deposits extends PageObject {

    public static final Target IMAGE_COMMERCIAL_SAVINGS_ACCOUNT_BTN = Target.
            the("Boton de imagen - 'Cuenta de Ahorro Comercial'").
            locatedBy("(//*[@title='Cuenta de Ahorro Comercial'])[1]");

}
