package geco;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Franck on 20/11/2016.
 * for close again with tag again and again
 * with assign fix #9
 */
public class LoginGeneratorTest {
    private LoginGenerator aLoginGenerator ;

    @Before
    public void setupMeth() {
        String[] start = new String[]{"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"};
        aLoginGenerator = new LoginGenerator(new LoginService(start));
    }

    @Test
    public void loginPDUR(){
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        Assert.assertEquals("PDUR",login);
    }

    @Test
    public void loginPDUR2(){
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        Assert.assertEquals("PDUR",login);
    }


    @Test
    public void loginJROLNumber(){
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        Assert.assertEquals("JROL1",login);
    }

    @Test
    public void loginJRALNumber(){
        String login = aLoginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        Assert.assertEquals("JRAL2",login);
    }
}
