package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {
    public String calcute(String adadAval, String adadDovom,String operation) {
        double d1 = parseDouble(adadAval);
        double d2 = parseDouble(adadDovom);
        double result;
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
