import org.testng.Assert;
import org.testng.annotations.Test;

public class DayOfTheWeekTest {
    @Test
    public void dayOfTheWeekTest1(){
        DayOfTheWeek dayOfTheWeek= new DayOfTheWeek();
        Assert.assertEquals(dayOfTheWeek.dayOfTheWeek(1),"Sunday");
    }
}
