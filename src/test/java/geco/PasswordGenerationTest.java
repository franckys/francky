package geco;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Franck on 20/11/2016.
 */
public class PasswordGenerationTest {

    @Test
    public void testGetRandomPassword() throws Exception {
        PasswordGeneration passwordGeneration = new PasswordGeneration();
        String randomPassword = passwordGeneration.getRandomPassword();
        Assert.assertEquals(8, randomPassword.length());
        String newRandomPassword = passwordGeneration.getRandomPassword();
        Assert.assertNotEquals(newRandomPassword,randomPassword);
    }
}