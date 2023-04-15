package co.com.choucair.certification.proyectobase.runners.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.JoinToday;
//import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
//import co.com.choucair.certification.proyectobase.tasks.Search;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than abel wants to join community at utest$")
    public void thanAbelWantsToJoinCommunityAtUtest() {
        OnStage.theActorCalled("Abel").wasAbleTo(OpenUp.thePage());
    }

    @When("^he fills all the forms needed on the utest platform$")
    public void heFillsAllTheFormsNeededOnTheUtestPlatform() {
        OnStage.theActorCalled("Abel").wasAbleTo(JoinToday.onThePage());
    }

    @Then("^he see the message (.*)$")
    public void heSeeTheMessageWelcomeToTheWorldSLargestCommunityOfFreelanceSoftwareTesters(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}

