package com.sophossolutions.steps;

import com.sophossolutions.exceptions.GeneralException;
import com.sophossolutions.questions.GetNameFileFromUrl;
import com.sophossolutions.tasks.CheckPdf;
import com.sophossolutions.tasks.EnterSite;
import com.sophossolutions.userinterfaces.HomeEnterprises;
import com.sophossolutions.userinterfaces.Deposits;
import com.sophossolutions.userinterfaces.BusinessSavingsAccount;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;

public class BanistmoGeneratePdfStepDefinitions {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Given("^\"([^\"]*)\" ingresa al sitio web de Banistmo$")
    public void ingresaAlSitioWebDeBanistmo(String user) {
        theActorCalled(user).wasAbleTo(Open.browserOn(new HomeEnterprises()));
    }

    @When("^Ingresa a la seccion de documentos del apartado de cuenta de ahorro comercial$")
    public void ingresaALaSeccionDeDocumentosDelApartadoDeCuentaDeAhorroComercial() {
        theActorInTheSpotlight().attemptsTo(
                EnterSite.enter(HomeEnterprises.PRODUCTS_SERVICES_BTN),
                EnterSite.enter(HomeEnterprises.DEPOSITS_BTN),
                EnterSite.enter(Deposits.IMAGE_COMMERCIAL_SAVINGS_ACCOUNT_BTN),
                EnterSite.enter(BusinessSavingsAccount.DOCUMENTS_BTN),
                EnterSite.enter(BusinessSavingsAccount.HYPER_LINK_IMG_PDF_BTN)
        );
    }

    @Then("^Visualiza el archivo PDF nombrado como \"([^\"]*)\"$")
    public void visualizaElArchivoPDFNombradoComo(String name) {
        theActorInTheSpotlight().attemptsTo(CheckPdf.check());
        theActorInTheSpotlight().should(seeThat(
                GetNameFileFromUrl.extractUrl(), equalTo(name)).
                orComplainWith(GeneralException.class, "Nombres diferentes"));
    }

}
