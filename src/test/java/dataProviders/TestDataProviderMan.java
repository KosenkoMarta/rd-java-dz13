package dataProviders;

import com.rd.world.Person;
import com.rd.world.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProviderMan {

    @DataProvider(name = "menAfterRetired")
    public Object[][] menAfterRetired(){
        Person partner = new Woman("Marta", "Shevchenko", 62, null, "Kosenko");
        return new Object[][] {{"Dmytro", "Shevchenko", 65, partner},
                {"Dmytro", "Shevchenko", 70, partner},
                {"Dmytro", "Shevchenko", 75, partner}};
    }

    @DataProvider(name = "menBeforeRetired")
    public Object[][] menBeforeRetired(){
        Person partnerSecond = new Woman("Alina", "Lysenko", 50, null, "maidenAlina");
        return new Object[][] {{"Yaroslav", "Lysenko", 55, partnerSecond},
                {"Yaroslav", "Lysenko", 59, partnerSecond},
                {"Yaroslav", "Lysenko", 64, partnerSecond}};
    }


}
