package calculator;

import static java.lang.Double.parseDouble;

public class Calculator {
    public String calcute(final String adadAval, final String adadDovom,final String operation) {
        double d1,d2=0;
        try{
            d1 = parseDouble(adadAval);
            d2 = parseDouble(adadDovom);

        }catch (NumberFormatException nfe){
            System.out.println("error number format");
            throw nfe;
        }
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
