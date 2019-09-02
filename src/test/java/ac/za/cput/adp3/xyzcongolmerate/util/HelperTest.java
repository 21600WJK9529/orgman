package ac.za.cput.adp3.xyzcongolmerate.util;

import ac.za.cput.adp3.xyzcongolmerate.factory.demography.GenderFactory;
import org.junit.Test;
import java.util.UUID;
import static org.junit.Assert.*;

public class HelperTest {
    String SUFFIX = Helper.getSuffixFromClassName(GenderFactory.class);
    @Test
    public void generateRandomGivenSuffix() {
        assertNotNull(SUFFIX + "-" + UUID.randomUUID().toString());
        String test=SUFFIX + "-" + UUID.randomUUID().toString();
        System.out.println("generateRandomGivenSuffix output: "+test);
    }

    @Test
    public void getClassName() {
    assertNotNull(Helper.getClassName(GenderFactory.class));
    String className=Helper.getClassName(GenderFactory.class);
        System.out.println("Class name: "+className);
    }

    @Test
    public void getSuffixFromClassName() {
        assertNotNull(Helper.getSuffixFromClassName(GenderFactory.class));
        String test2=Helper.getSuffixFromClassName(GenderFactory.class);
        assertNotNull(test2);
        System.out.println("Class suffix: "+test2);
    }
}