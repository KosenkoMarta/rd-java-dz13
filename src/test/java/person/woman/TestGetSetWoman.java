package person.woman;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGetSetWoman {
    private Woman woman;
    private Man man;

    @BeforeClass(alwaysRun = true)
    public void addNewWomenObject(){
        woman = new Woman("Firstname", "Lastname", 44, man, "Maidenname");
        man = new Man("Firstname", "Lastname", 45, woman);

    }

    @Test(groups = {"GettersTest"})
    public void testFirstname(){
        woman.setFirstName("Marta");
        Assert.assertEquals(woman.getFirstName(), "Marta", "Ім'я не встановлено правильно. Очікувалося 'Marta'.");
    }

    @Test(groups = {"GettersTest"})
    public void testLastname(){
        woman.setLastName("Shevchenko");
        Assert.assertEquals(woman.getLastName(), "Shevchenko", "Призвище не встановлено правильно. Очікувалося 'Shevchenko'.");
    }

    @Test(groups = {"GettersTest"})
    public void testAge(){
        woman.setAge(60);
        Assert.assertEquals(woman.getAge(), 60, "Вік встановлено невірно. Очікувалося '60'");
    }

    @Test(groups = {"GettersTest"})
    public void testPartner(){
        woman.setPartner(man);
        Assert.assertEquals(woman.getPartner(), man, "Партнер не встановлений правильно. Очікувався партнер man.");
    }
}
