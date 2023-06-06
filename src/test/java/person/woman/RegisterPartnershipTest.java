package person.woman;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPartnershipTest {
    private Woman woman;
    private Man man;

    @BeforeClass(alwaysRun = true)
    public void addNewWomenObject(){
        man = new Man("Dmytro", "Shevchenko", 65, null);
        woman = new Woman("Marta", "Kosenko", 62, null, "Kosenko");
    }

    @Test
    public void testRegisterPartnership(){
        SoftAssert softAssert = new SoftAssert();
        woman.registerPartnership(man);
        // Перевіряємо, що партнерство було успішно зареєстроване
        softAssert.assertEquals(man, woman.getPartner(), "Партнерство не було успішно зареєстроване. Очікувалася партнер man.");
        // Перевіряємо, що прізвище woman змінилося на прізвище man
        softAssert.assertEquals(man.getLastName(), woman.getLastName(), "Прізвище woman не змінилося на прізвище man після реєстрації партнерства.");
        softAssert.assertAll();

    }
}
