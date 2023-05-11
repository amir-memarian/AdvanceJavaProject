package calculator;

import sun.text.normalizer.UCharacter;

import javax.swing.*;

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
                if (colIndex<3) {
                    jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * 50, (rowIndex + 1) * 50, false);
                }else{
                    jButton[rowIndex][colIndex] = getButton(label[rowIndex][colIndex], colIndex * 50, (rowIndex + 1) * 50,  true);
                }
                mashinHesab.add(jButton[rowIndex][colIndex]);
            }
        }

        jButton[3][2].addActionListener(e -> {
//            if (operation == "=" || operation.isEmpty()){
//                jTextField.setText("");
//            }else {
                Calculator calculator = new Calculator();
                String addResult = calculator.calcute(adadAval, jTextField.getText(), oper);
                jTextField.setText(addResult);
//            }
        });

        mashinHesab.setSize(600,600);
        mashinHesab.setLayout(null);
        mashinHesab.setVisible(true);
    }

    private static JButton getButton(String lable, int xPosition, int yPosition, boolean operation) {
        JButton point = new JButton(lable);
        point.setBounds(xPosition, yPosition, 50, 50);
        if (operation == true){
            point.addActionListener(event -> {
                adadAval = jTextField.getText();
                oper = point.getText();
                jTextField.setText("");
            });
        } else {
            point.addActionListener(event -> jTextField.setText(jTextField.getText() + point.getText()));
        }
        return point;
    }
}
