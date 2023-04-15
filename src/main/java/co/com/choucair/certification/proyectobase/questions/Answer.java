package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.tasks.JoinToday;
import co.com.choucair.certification.proyectobase.userinterface.UtestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Question<Boolean> toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeCommunity= Text.of(UtestJoinPage.WELCOME_MESSAGE).viewedBy(actor).asString();
        if(question.equals(welcomeCommunity)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
