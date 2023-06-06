package person.man;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeregisterPartnershipTest {
    private Man man;
    private Woman woman;

    @BeforeClass(alwaysRun = true)
    public void addNewMenObject() {
        woman = new Woman("Marta", "Shevchenko", 59, man, "Kosenko");
        man = new Man("Dmytro", "Shevchenko", 64, woman);

    }

    @Test
    public void testDeregisterPartnership(){
        man.deregisterPartnership();
        // Перевіряємо, що партнерство зняте та партнер став рівним null
        Assert.assertNull(man.getPartner(), "Партнерство не було коректно скасовано. Очікувалось, що партнер буде null.");

    }

}
