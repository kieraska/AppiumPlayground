import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleCalculatorPage {

    protected AndroidDriver driver;
    @FindBy(id="digit_2")
    WebElement two;

    @FindBy(id="digit_6")
    WebElement six;

    @FindBy(id="op_add")
    WebElement plus;

    @FindBy(id="eq")
    WebElement equals;

    @FindBy(id="result")
    WebElement result;

    @FindBy(id="op_mul")
    WebElement multiply;

    public SimpleCalculatorPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
