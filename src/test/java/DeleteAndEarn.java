import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteAndEarn {

    @Test
    public void arrayIsEmpty(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{};
        Assert.assertEquals(m.earnMax(n),0);
    }

    @Test
    public void arraySizeOne(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2};
        Assert.assertEquals(m.earnMax(n),2);
    }

    @Test
    public void arraySizeTwo_consecutiveNumbers(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2,3};
        Assert.assertEquals(m.earnMax(n),3);
    }

    @Test
    public void arraySizeTwo_nonConsecutiveNumbers(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2,4};
        Assert.assertEquals(m.earnMax(n),6);
    }
    @Test
    public void arraySizeTwo_sameNumbers(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2,2};
        Assert.assertEquals(m.earnMax(n),4);
    }

    @Test
    public void arraySizeThree_sameNumbers(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2,2,2};
        Assert.assertEquals(m.earnMax(n),6);
    }

    @Test
    public void arraySizeThree_consecutiveNumbers(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2,3,4};
        Assert.assertEquals(m.earnMax(n),6);
    }

    @Test
    public void arraySizeThree_consecutiveNumbersTwoSame(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2,3,3};
        Assert.assertEquals(m.earnMax(n),6);
    }

    @Test
    public void arraySizeFpur_consecutiveNumbersTwoSame(){
        org.example.DeleteAndEarn m =new org.example.DeleteAndEarn();
        int[] n = new int[]{2,3,3,3,4};
        Assert.assertEquals(m.earnMax(n),9);
    }
}
