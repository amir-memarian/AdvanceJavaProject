package calculator;

import javax.swing.*;

public class CalculatorUI {

    private static JTextField jTextField;
    private static String adadAval;
    public static void main(String... args){
        JFrame mashinHesab = new JFrame("Mashin Hesab");

        jTextField = new JTextField();
        jTextField.setBounds(0,0,150,50);
        jTextField.setEditable(false);

        JButton cancle = new JButton("C");
        cancle.setBounds(150,0,50,50);
        cancle.addActionListener(e -> jTextField.setText(""));   //java 8

        JButton one = getButton("1", 0, 50);
        JButton two = getButton("2", 50, 50);
        JButton three = getButton("3", 100, 50);

        JButton plus = new JButton("+");
        plus.setBounds(150,50,50,50);
        plus.addActionListener(event -> {
            adadAval = jTextField.getText();
            jTextField.setText("");
        });

        JButton four = getButton("4", 0, 100);
        JButton five = getButton("5", 50, 100);
        JButton six = getButton("6", 100, 100);

        JButton minus = new JButton("-");
        minus.setBounds(150,100,50,50);

        JButton seven = getButton("7", 0, 150);
        JButton eight = getButton("8", 50, 150);
        JButton nine = getButton("9", 100, 150);

        JButton multiplay = new JButton("x");
        multiplay.setBounds(150,150,50,50);

        JButton point = getButton(".", 0, 200);
        JButton zero = getButton("0", 50, 200);

        JButton equal = new JButton("=");
        equal.setBounds(100,200,50,50);
        equal.addActionListener(e -> {
            Calculator calculator = new Calculator();
            String addResult = calculator.add(adadAval, jTextField.getText());
            jTextField.setText(addResult);
        });
        JButton division = new JButton("/");
        division.setBounds(150,200,50,50);

        mashinHesab.add(jTextField);
        mashinHesab.add(cancle);
        mashinHesab.add(one);
        mashinHesab.add(two);
        mashinHesab.add(three);
        mashinHesab.add(plus);
        mashinHesab.add(four);
        mashinHesab.add(five);
        mashinHesab.add(six);
        mashinHesab.add(minus);
        mashinHesab.add(seven);
        mashinHesab.add(eight);
        mashinHesab.add(nine);
        mashinHesab.add(multiplay);
        mashinHesab.add(point);
        mashinHesab.add(zero);
        mashinHesab.add(equal);
        mashinHesab.add(division);

        mashinHesab.setSize(600,600);
        mashinHesab.setLayout(null);
        mashinHesab.setVisible(true);



    }

    private static JButton getButton(String lable, int xPosition, int yPosition) {
        JButton point = new JButton(lable);
        point.setBounds(xPosition, yPosition, 50, 50);
        point.addActionListener(event -> jTextField.setText(jTextField.getText() + point.getText()));
        return point;
    }
}
