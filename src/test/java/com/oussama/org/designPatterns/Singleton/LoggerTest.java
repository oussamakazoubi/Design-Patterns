package com.oussama.org.designPatterns.Singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTest {

    @Test
    public void testSingletonInstance() {
        Logger firstInstance = Logger.getInstance();
        Logger secondInstance = Logger.getInstance();
        assertSame(firstInstance, secondInstance, "Both instances should be the same");
    }

    @Test
    public void testLogMethod() {
        Logger logger = Logger.getInstance();
        assertEquals("Logged Message "+(logger.getNumMessage()+1), logger.log());
    }
}
