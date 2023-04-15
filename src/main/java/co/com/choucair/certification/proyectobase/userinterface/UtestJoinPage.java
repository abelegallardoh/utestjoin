package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to join")
            .located(By.xpath("//*[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target FIRST_NAME = Target.the("where do we write our first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("where do we write our last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS = Target.the("where do we write our email")
            .located(By.id("email"));

    public static final Target DATE_MONTH = Target.the("where do we put our month of birth")
            .located(By.id("birthMonth"));

    public static final Target DATE_DAY = Target.the("where do we put our day of birth")
            .located(By.id("birthDay"));

    public static final Target DATE_YEAR = Target.the("where do we put our year of birth")
            .located(By.id("birthYear"));

    public static final Target NEXT_BUTTON = Target.the("button that go to next form location")
            .located(By.xpath("//*[@class='btn btn-blue']"));

    public static final Target ZIP_CODE = Target.the("where do we put our zip or postal code")
            .located(By.id("zip"));

    public static final Target NEXT_BUTTON2 = Target.the("button that go to next form devices")
            .located(By.xpath("//*[@class='btn btn-blue pull-right']"));

    public static final Target NEXT_BUTTON3 = Target.the("button that go to next form last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target NEW_PASSWORD = Target.the("where do we type our password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("where do we type our confirm password")
            .located(By.id("confirmPassword"));

    public static final Target TERMS_CHECK = Target.the("where do we accept the  of use")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY_CHECK = Target.the("where do we accept the privacy policy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_SETUP = Target.the("button that complete the setup")
            .located(By.id("laddaBtn"));

    public static final Target WELCOME_MESSAGE = Target.the("Message that appears we you join the community")
            .located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freelance software testers!\")]"));


}
