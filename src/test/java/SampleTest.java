import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {


    @Test
    public void positiveTest() {
        Assert.assertTrue(true,"Verified that the flag is true");
    }

    @Test
    public void failedTest() {
        Assert.fail("Test failed due to invalid response.");
    }

}
