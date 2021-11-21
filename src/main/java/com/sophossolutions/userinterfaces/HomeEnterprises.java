package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/empresas/")

public class HomeEnterprises extends PageObject {

    public static final Target PRODUCTS_SERVICES_BTN = Target.
            the("Boton de 'Productos & Servicios'").
            locatedBy("(//*[text()='Productos & Servicios'])[1]");
    public static final Target DEPOSITS_BTN = Target.
            the("Boton de 'Depósitos'").
            locatedBy("//*[text()='Depósitos']");

}
