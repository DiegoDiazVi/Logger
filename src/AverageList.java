import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AverageList {

    private List<Integer> integerList = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(AverageList.class);

    public AverageList(List<Integer> integers) throws Exception {
        this.integerList = integers;

        if (integers.size() > 5 ) logger.info("La longitud de la lista es mayor a 5 y el promedio es: " + this.average());
        if (integers.size() > 10 ) logger.info("La longitud de la lista es mayor a 10 y el promedio es: " + this.average());
        if (integers.isEmpty()) throw new Exception();
    }

    public int average () {
        int sum = 0;
        for (Integer number : this.integerList) {
            sum += number;
        }
        return sum / this.integerList.size();
    }
}
