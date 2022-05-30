package Assertions;

import org.junit.Assert;
import org.junit.Test;

public class HardAssertions_1 {
    @Test
    public void Sample()
    {
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        Assert.assertEquals("Harsh","Harsh");
       // Assert.assertEquals("Harsh","harsh");
    }
}
