package calculator;

import javax.swing.*;

public class CalculatorUI {

    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    public static final int MAXROW = 4;
    public static final int MAXCOL = 4;
    private static JTextField jTextField;
    private static String adadAval;
    private static String oper;
    public static void main(String... args){
        JFrame mashinHesab = new JFrame("Mashin Hesab");

        jTextField = new JTextField();
        jTextField.setBounds(0,0,WIDTH*(MAXCOL-1),HEIGHT);
        jTextField.setEditable(false);

        JButton cancle = new JButton("C");
        cancle.setBounds(WIDTH*(MAXCOL-1),0,WIDTH,HEIGHT);
        cancle.addActionListener(e -> jTextField.setText(""));   //java 8

        mashinHesab.add(jTextField);
        mashinHesab.add(cancle);

        JButton[][] jButton=new JButton[MAXROW][MAXCOL];
        String[][] label = {{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","x"},{".","0","=","/"}};
        for(int rowIndex = 0; rowIndex < MAXROW; rowIndex++){
            for(int colIndex = 0; colIndex < MAXCOL; colIndex++){
                if ((rowIndex == MAXROW - 1) && (colIndex == MAXCOL - 2)){
                    jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * WIDTH, (rowIndex + 1) * HEIGHT, "Equal");
                }else {
                    if (colIndex < MAXCOL - 1) {
                        jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * WIDTH, (rowIndex + 1) * HEIGHT, "Number");
                    } else {
                        jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * WIDTH, (rowIndex + 1) * HEIGHT, "Operation");
                    }
                }
                mashinHesab.add(jButton[rowIndex][colIndex]);
            }
        }

        mashinHesab.setSize(WIDTH*(MAXCOL) + 20,HEIGHT*(MAXROW+2));
        mashinHesab.setLayout(null);
        mashinHesab.setVisible(true);
    }

    private static JButton getButton(String lable, int xPosition, int yPosition, String type) {
        JButton point = new JButton(lable);
        point.setBounds(xPosition, yPosition, WIDTH, HEIGHT);
        if (type.equals("Operation")){
            point.addActionListener(event -> {
                    adadAval = jTextField.getText();
                    oper = point.getText();
                    jTextField.setText("");
            });
        } else if (type.equals("Number")){
            point.addActionListener(event -> {
                if ((!point.getText().contains("."))||
                    (!jTextField.getText().contains("."))&&(point.getText().contains("."))) {
                    jTextField.setText(jTextField.getText() + point.getText());
                }
            });
        } else {
            point.addActionListener(event -> {
                final Calculator calculator = new Calculator();
                String addResult = calculator.calcute(adadAval, jTextField.getText(), oper);
                adadAval = jTextField.getText();
                jTextField.setText(addResult);
            });
        }
        return point;
    }
}
