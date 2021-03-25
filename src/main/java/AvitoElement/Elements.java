package AvitoElement;
import Driver.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class Elements {

    public void selectCategory(Categories categories) {
        selectFromList(Driver.getDriver().findElement(Xpath.SelectCategorys.by), categories.value);
    }

    public void enterTextInTheField(String string) {
        Driver.getDriver().findElement(Xpath.VvodPrinterVstroku.by).sendKeys(string);
    }

    public void clickRegion() {
        Driver.getDriver().findElement(Xpath.ClickGorod.by).click();
    }

    public void printText(String string) {
        Driver.getDriver().findElement(Xpath.VvodVladivostok.by).sendKeys(string + Keys.ENTER);
        chooseFirstOption();
    }

    public void ShowResultsButton() {
        Driver.getDriver().findElement(Xpath.ClickPoisk.by).click();
    }

    public void clickCheckBox() {
        Driver.getDriver().findElement(Xpath.ClickCheckBox.by).click();
    }

    public void selectMoneyFilter(CenaKaregory moneyFilter) {
        selectFromList(Driver.getDriver().findElement(Xpath.SelectDoroje.by), moneyFilter.value);
    }

    private void chooseFirstOption() {
        Driver.getDriver().findElement(Xpath.SelectClickFirstItem.by).click();
    }

    private void selectFromList(WebElement webElement, String string) {
        Select select = new Select(webElement);
        select.selectByValue(string);
    }

    public  void printNameANdPrice(int numberOfItems) {
        List<WebElement> webElementsList=Driver.getDriver().findElements(Xpath.ListPriner.by);
        {
            for (int i = 0; i < 3; i++) {
                System.out.println("Название: " +webElementsList.get(i).findElement(Xpath.Nazvanie.by).getText()+
                        " Цена: "+webElementsList.get(i).findElement(Xpath.Cena.by).getText());

            }
        }
    }
}



