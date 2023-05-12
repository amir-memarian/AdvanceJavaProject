package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {
    public String calcute(final String adadAval, final String adadDovom,final String operation) {
        final double d1 = parseDouble(adadAval);
        final double d2 = parseDouble(adadDovom);
        final double result;
        if (operation == "+") {
            result = d1 + d2;
        } else if (operation == "-") {
            result = d1 - d2;
        } else if (operation == "/") {
            result = d1 / d2;
        } else if (operation == "x"){
            result = d1 * d2;
        } else {
            result = 0;
        }
        return String.valueOf(result);
    }
}
