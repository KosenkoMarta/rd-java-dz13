package dataProviders;

import com.rd.world.Man;
import com.rd.world.Person;
import org.testng.annotations.DataProvider;

public class TestDataProviderWoman {

    @DataProvider(name = "womenAfterRetired")
    public Object[][] womenAfterRetired(){
        Person partnerSecond = new Man("Yaroslav", "Lysenko", 65, null);
        return new Object[][] {{"Alina", "Lysenko", 60, partnerSecond, "maidenAlina"},
                {"Alina", "Lysenko", 65, partnerSecond, "maidenAlina"},
                {"Alina", "Lysenko", 70, partnerSecond, "maidenAlina"}};
    }

    @DataProvider(name = "womenBeforeRetired")
    public Object[][] womenBeforeRetired(){
        Person partner = new Man("Dmytro", "Shevchenko", 65, null);
        return new Object[][] {{"Marta", "Kosenko", 50, partner, "Kosenko"},
                {"Marta", "Kosenko", 55, partner, "Kosenko"},
                {"Marta", "Kosenko", 59, partner, "Kosenko"}};
    }


}
