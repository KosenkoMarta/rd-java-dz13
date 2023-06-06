package person.woman;

import com.rd.world.Person;
import com.rd.world.Woman;
import dataProviders.TestDataProviderWoman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanIsRetiredTest {
    private Woman women;
    private Woman womenSecond;

    //test is retired
    @Test(dataProvider = "womenAfterRetired", dataProviderClass = TestDataProviderWoman.class, groups = {"TestIsRetired"})
    public void testIsRetired(String firstName, String lastName, int age, Person partner, String maidenName){
        women = new Woman(firstName, lastName, age, partner, maidenName);
        Assert.assertTrue(women.isRetired(), "Статус перевірки isRetired повинен бути true");
    }
    //test is not retired
    @Test(dataProvider = "womenBeforeRetired", dataProviderClass = TestDataProviderWoman.class, groups = {"TestIsNotRetired"})
    public void testIsNotRetired(String firstName, String lastName, int age, Person partner, String maidenName){
        womenSecond = new Woman(firstName, lastName, age, partner, maidenName);
        Assert.assertFalse(womenSecond.isRetired(), "Статус перевірки isRetired повинен бути false");
    }
}
