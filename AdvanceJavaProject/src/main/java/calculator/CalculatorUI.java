package calculator;

import sun.text.normalizer.UCharacter;

import javax.swing.*;
import java.awt.*;

public class CalculatorUI {

    private static JTextField jTextField;
    private static String adadAval;
    private static String oper;
    public static void main(String... args){
        JFrame mashinHesab = new JFrame("Mashin Hesab");

        jTextField = new JTextField();
        jTextField.setBounds(0,0,150,50);
        jTextField.setEditable(false);

        JButton cancle = new JButton("C");
        cancle.setBounds(150,0,50,50);
        cancle.addActionListener(e -> jTextField.setText(""));   //java 8

        mashinHesab.add(jTextField);
        mashinHesab.add(cancle);

        JButton[][] jButton=new JButton[4][4];
        String[][] label = {{"1","2","3","+"},{"4","5","6","-"},{"7","8","9","x"},{".","0","=","/"}};
        for(int rowIndex=0;rowIndex < 4;rowIndex++){
            for(int colIndex=0;colIndex < 4;colIndex++){
                if ((rowIndex == 3) && (colIndex == 2)){
                    jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * 50, (rowIndex + 1) * 50, "Equal");
                }else {
                    if (colIndex < 3) {
                        jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * 50, (rowIndex + 1) * 50, "Number");
                    } else {
                        jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * 50, (rowIndex + 1) * 50, "Operation");
                    }
                }
                mashinHesab.add(jButton[rowIndex][colIndex]);
            }
        }

        mashinHesab.setSize(220,300);
        mashinHesab.setLayout(null);
        mashinHesab.setVisible(true);
    }

    private static JButton getButton(String lable, int xPosition, int yPosition, String type) {
        JButton point = new JButton(lable);
        point.setBounds(xPosition, yPosition, 50, 50);
        if (type.equals("Operation")){
            point.addActionListener(event -> {
                    adadAval = jTextField.getText();
                    oper = point.getText();
                    jTextField.setText("");
            });
        } else if (type.equals("Number")){
            point.addActionListener(event -> {
                if (jTextField.getText().indexOf(".") == -1) {
                    jTextField.setText(jTextField.getText() + point.getText());
                }
            });
        } else {
            point.addActionListener(event -> {
                Calculator calculator = new Calculator();
                String addResult = calculator.calcute(adadAval, jTextField.getText(), oper);
                adadAval = jTextField.getText();
                jTextField.setText(addResult);
            });
        }
        return point;
    }
}
