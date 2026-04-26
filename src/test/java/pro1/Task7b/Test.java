package pro1.Task7b;

import pro1.Task6.Resistor;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.Test
    public void test01() throws Exception {

        var r = new Resistor(5.0);
        var allVoltages = new double[]{50.0, 150.0, 300.0, 1000.0};

        // TODO: smaž řádek
        var allCurrents = new double[]{};

        // TODO: odkomentuj a doplň znaky tak, aby test prošel
        //var allCurrents = Arrays.stream(allVoltages).map( _____________ ).toArray();

        assertArrayEquals(
                new double[]{10.0, 30.0, 60.0, 200.0},
                allCurrents
        );
    }
}
