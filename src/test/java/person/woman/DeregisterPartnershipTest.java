package person.woman;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeregisterPartnershipTest {
    private Woman woman;
    private Man man;

    @BeforeClass(alwaysRun = true)
    public void addNewWomenObject(){
        man = new Man("Dmytro", "Shevchenko", 64, woman);
        woman = new Woman("Marta", "Shevchenko", 59, man, "Kosenko");
    }

    @Test
    public void testDeregisterPartnership(){
        SoftAssert softAssert = new SoftAssert();
        woman.deregisterPartnership();
        // Перевіряємо, що партнерство зняте та партнер став рівним null
        softAssert.assertNull(woman.getPartner(), "Партнерство не було коректно скасовано. Очікувалось, що партнер буде null.");

        // Перевіряємо, що прізвище повернулося до вихідного
        softAssert.assertEquals("Kosenko", woman.getLastName(), "Прізвище не було коректно повернуто після скасування партнерства. Очікувалось 'Kosenko'");
        softAssert.assertAll();
}

}
