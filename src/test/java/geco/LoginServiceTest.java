package geco;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by Franck on 20/11/2016.
 */

public class LoginServiceTest {

    static LoginService mockLoginService;

    static final String ANEM = "ANEM";
    static final String ABIL = "ABIL";
    static public String[] start={ANEM};
    static public LoginService ls = new LoginService(start);


    @Test
    public void loginMeth(){
        boolean res = ls.loginExists(ANEM);
        Assert.assertTrue(res);
        res = ls.loginExists(ABIL);
        Assert.assertFalse(res);
        List<String> allLogins = ls.findAllLogins();
        int len = allLogins.size();
        Assert.assertEquals(1,len);
        List<String> starta = ls.findAllLoginsStartingWith("a");
        Assert.assertEquals(0,starta.size());
        List<String> startaUpper = ls.findAllLoginsStartingWith("A");
        Assert.assertEquals(1,startaUpper.size());
    }

}
