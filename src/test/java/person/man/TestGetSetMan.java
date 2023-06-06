package person.man;

import com.rd.world.Man;
import com.rd.world.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGetSetMan {
    private Man man;
    private Woman woman;

    @BeforeClass(alwaysRun = true)
    public void addNewMenObject(){
        man = new Man("Firstname", "Lastname", 45, woman);
        woman = new Woman("Firstname", "Lastname", 44, man, "Maidenname");
    }

    @Test(groups = {"GettersTest"})
    public void testFirstname(){
        man.setFirstName("Dmytro");
        Assert.assertEquals(man.getFirstName(), "Dmytro", "Ім'я не встановлено правильно. Очікувалося 'Dmytro'.");
    }

    @Test(groups = {"GettersTest"})
    public void testLastname(){
        man.setLastName("Shevchenko");
        Assert.assertEquals(man.getLastName(), "Shevchenko", "Призвище не встановлено правильно. Очікувалося 'Shevchenko'.");
    }

    @Test(groups = {"GettersTest"})
    public void testAge(){
        man.setAge(66);
        Assert.assertEquals(man.getAge(), 66, "Вік встановлено невірно. Очікувалося '66'.");
    }

    @Test(groups = {"GettersTest"})
    public void testPartner(){
        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman, "Партнер не встановлений правильно. Очікувався партнер woman.");
    }
}
