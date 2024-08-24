package test.java.br.com.danielsantdev;

import main.java.br.com.danielsantdev.App2;
import main.java.br.com.danielsantdev.AppGradle;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTestGradle {
    @Test public void testAppHasAGreeting() {
        AppGradle classUnderTest = new AppGradle();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
