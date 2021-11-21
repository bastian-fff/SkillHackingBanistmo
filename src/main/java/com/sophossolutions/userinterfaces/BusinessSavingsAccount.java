package com.sophossolutions.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BusinessSavingsAccount extends PageObject {

    public static final Target DOCUMENTS_BTN = Target.
            the("Boton de 'Documentos'").
            locatedBy("(//*[text()='Documentos'])[1]");
    public static final Target HYPER_LINK_IMG_PDF_BTN = Target.the("Boton de imagen de PDF").
            locatedBy("(//*[@title='Contrato Único de Productos y Servicios Bancarios'])[1]");

}
