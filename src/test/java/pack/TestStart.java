package pack;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestStart {
    private static Logger logger = LoggerFactory.getLogger(TestStart.class);

    private static String oneKiloByteString;
    static {
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<100; j++) { 
            String message = "1234567890";
            sb.append(message);
        }
        oneKiloByteString = sb.toString();
    }

    private static void log1MegaByteIn10Seconds() throws Exception {
        for(int i=0; i<1000; i++) {
            logger.warn(i + " - " + oneKiloByteString);
            Thread.sleep(10);
        }
    }
    
    private static void log1MegaByteInOneSecond() throws Exception {
        for(int i=0; i<1000; i++) {
            logger.warn(i + " - " + oneKiloByteString);
            Thread.sleep(1);
        }
    }

    @Test
    public void test() throws Exception{
        log1MegaByteInOneSecond();
    }
    
}
