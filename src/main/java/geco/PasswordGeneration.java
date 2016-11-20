package geco;

import java.security.SecureRandom;

/**
 * Created by Franck on 20/11/2016.
 */
public class PasswordGeneration {


    static final int len = 8;
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    public String getRandomPassword(){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }




}
