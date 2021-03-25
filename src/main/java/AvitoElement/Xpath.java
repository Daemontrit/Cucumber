package AvitoElement;
import org.openqa.selenium.By;
public enum Xpath {
    SelectCategorys(By.id("category")),
    VvodPrinterVstroku(By.id("search")),
    ClickGorod(By.xpath("//div[@class='main-text-2PaZG']")),
    VvodVladivostok(By.xpath("//input[@class='suggest-input-3p8yi']")),
    SelectClickFirstItem(By.xpath("//li[@data-marker='suggest(0)']")),
    ClickPoisk(By.xpath("//button[@data-marker='popup-location/save-button']")),
    ClickCheckBox(By.xpath("//div[contains(@class,'filters-root')]//label[contains(@class,'checkbox')][position()=2]")),
    ClickPoisk2(By.xpath("//button[@data-marker='search-filters/submit-button']")),
    SelectDoroje(By.xpath("//div[@class='sort-select-3QxXG select-select-box-3LBfK select-size-s-2gvAy']//select[@class='select-select-3CHiM']")),
    ListPriner(By.xpath("//div[@class='items-items-38oUm']/div[@data-marker='item']")),
    Nazvanie(By.xpath(".//h3[@class='title-root-395AQ iva-item-title-1Rmmj title-list-1IIB_ title-root_maxHeight-3obWc text-text-1PdBw text-size-s-1PUdo text-bold-3R9dt']")),
    Cena(By.xpath(".//span[@class='price-text-1HrJ_ text-text-1PdBw text-size-s-1PUdo']"))
    ;
    public final By by;

    Xpath(By by) {
        this.by = by;
    }

}

