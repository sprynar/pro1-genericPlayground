package pro1.Task7c;

import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.Test
    public void test01() throws Exception {

        var numbers = new double[]{78.0, 60.5, 36.7, -160.0};

        // TODO: smaž řádek
        var res = 0;

        // TODO: odkomentuj a doplň znaky tak, aby test prošel
        // var res = Arrays.stream(numbers).map( _________ ).sum();

        Assertions.assertEquals(
                335.2,
                res,
                0.001d
        );
    }
}
