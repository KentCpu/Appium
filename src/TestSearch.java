import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TestSearch extends CoreTestCase {
    @Test
    public void testSearch(){
        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        SearchPageObject.click("resource-id","org.wikipedia:id/fragment_onboarding_skip_button");
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("Хоббит, или Туда и обратно");
        SearchPageObject.click("text", "повесть английского писателя Джона Р. Р. Толкина");
        SearchPageObject.click("resource-id","org.wikipedia:id/page_save");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SearchPageObject.click("resource-id","org.wikipedia:id/snackbar_action");
        SearchPageObject.enterText("org.wikipedia:id/text_input", "Хоббит");
        SearchPageObject.click("resource-id","android:id/button1");
        SearchPageObject.click("resource-id","org.wikipedia:id/snackbar_action");
        SearchPageObject.click("resource-id","org.wikipedia:id/item_overflow_menu");
        SearchPageObject.click("text","Удалить список");
        SearchPageObject.click("resource-id","android:id/button1");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
