import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void tokenizeTest(){
        String [] a = {"haha", "hehe","haha"};
        Assert.assertEquals(a,new Solution("haha hehe haha").firstRepeatedWord());

    }

}