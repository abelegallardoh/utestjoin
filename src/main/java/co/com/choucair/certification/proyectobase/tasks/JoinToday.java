package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class JoinToday implements Task {


    public static JoinToday onThePage() {
        return Tasks.instrumented(JoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestJoinPage.JOIN_BUTTON),
                //Tell us about yourself
                Enter.theValue("Abel").into(UtestJoinPage.FIRST_NAME),
                Enter.theValue("Gallardo").into(UtestJoinPage.LAST_NAME),
                Enter.theValue("ernestoh3232507@gmail.com").into(UtestJoinPage.EMAIL_ADDRESS),
                Click.on(UtestJoinPage.DATE_MONTH),
                SelectFromOptions.byVisibleText("July").from(UtestJoinPage.DATE_MONTH),
                Click.on(UtestJoinPage.DATE_DAY),
                SelectFromOptions.byVisibleText("23").from(UtestJoinPage.DATE_DAY),
                Click.on(UtestJoinPage.DATE_YEAR),
                SelectFromOptions.byVisibleText("1997").from(UtestJoinPage.DATE_YEAR),
                Click.on(UtestJoinPage.NEXT_BUTTON),

                //Add your address
                Enter.theValue("0601").into(UtestJoinPage.ZIP_CODE),
                Click.on(UtestJoinPage.NEXT_BUTTON2),

                //Tell us about your devices
                Click.on(UtestJoinPage.NEXT_BUTTON3),

               //The last step
                Click.on(UtestJoinPage.NEW_PASSWORD),
                Enter.theValue("Abelgallardo2023*").into(UtestJoinPage.NEW_PASSWORD),
                Click.on(UtestJoinPage.CONFIRM_PASSWORD),
                Enter.theValue("Abelgallardo2023*").into(UtestJoinPage.CONFIRM_PASSWORD),
                Click.on(UtestJoinPage.TERMS_CHECK),
                Click.on(UtestJoinPage.PRIVACY_CHECK),
                Click.on(UtestJoinPage.COMPLETE_SETUP)


        );

    }
}
