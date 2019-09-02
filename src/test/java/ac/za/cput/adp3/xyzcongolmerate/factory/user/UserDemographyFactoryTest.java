package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
        String dateFormat = format.format(new Date());
        Date date;
        UserDemography userDemography=UserDemographyFactory.buildUserDemography(
                "userDemoEmail@demography.com",
                "userTitleTest",
                "userGenderTest",
                "userRaceIDTest",
                 date=format.parse("22/03/1996")
        );
        assertNotNull(userDemography);
        System.out.println("User details"+userDemography);
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserDemographyFactory class
         * 4. Assert that the an object is created.
         */
    }
}