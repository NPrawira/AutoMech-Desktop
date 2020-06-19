package application;

import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class LoginTest {
    
    public LoginTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void username(){
        Login l = new Login();
        String user = l.user("admin@automech.com");
        String exp = "admin@automech.com";
        if(!user.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Username = " + user);
        }
        assertThat(user, allOf(startsWith("admin"),containsString("@"),
                containsString("automech"),endsWith(".com"),
                is(notNullValue())));
        assertEquals(exp, user);
    }
    
    @Test
    public void password(){
        Login l = new Login();
        String pass = l.user("Admin123");
        String exp = "Admin123";
        if(!pass.equals(exp)){
            System.err.println("Input berbeda dari ekspetasi!");
        }else{
            System.out.println("Password = " + pass);
        }
        assertThat(pass, allOf(startsWith("Admin"),endsWith("123"),
                is(notNullValue())));
        assertEquals(exp, pass);
    }
    
    @Ignore
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BuatData.main(args);
    }
    
}
