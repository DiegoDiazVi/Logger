import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) throws Exception {
        try {
            AverageList listGreaterThan5 = new AverageList(Arrays.asList(1, 2, 3, 4, 5, 6));
            AverageList listGreaterThan10 = new AverageList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
            AverageList listEmpty = new AverageList(new ArrayList<>());
        } catch (Exception e) {
            logger.error("La Lista esta vacia " + e);
        }
    }
}