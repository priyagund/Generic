import com.bridgelabz.maximum.MaximumNumbe;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest
{
    @Test
    public void getMaximumNumber_shouldReturnResult()
    {
       MaximumNumbe maximumNumbe= new MaximumNumbe();
       Integer integer= maximumNumbe.checkNumber(Integer.valueOf(20),Integer.valueOf(40),Integer.valueOf(60));
        Assert.assertEquals(60,integer.intValue());
    }
}
