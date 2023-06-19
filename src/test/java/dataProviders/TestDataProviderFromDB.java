package dataProviders;

import org.testng.annotations.DataProvider;
import utils.DBReader;

public class TestDataProviderFromDB {

    @DataProvider(name = "persons")
    public static Object[][] personsFromDB() {

        return DBReader.getPersonsFromDB().stream().map(person -> new Object[]{person.getId(), person.getFirstName(),
                person.getLastName(), person.getAge(), person.getGender()}).toArray(Object[][]::new);
    }
}
