import java.awt.*;
import java.awt.event.*;

public class minicalculator {
    private static double num1 = 0, num2 = 0, result = 0;
    private static String operator = "";

    public static void main(String[] args) {
        Frame fr = new Frame("Calculator");
        TextField t = new TextField();
        t.setBounds(50, 50, 230, 40);
        
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b0 = new Button("0");
        Button bMul = new Button("*");
        Button bPlus = new Button("+");
        Button bMinus = new Button("-");
        Button bDivide = new Button("/");
        Button bEqual = new Button("=");
        Button bAC = new Button("AC");

        b1.addActionListener(e -> t.setText(t.getText() + "1"));
        b2.addActionListener(e -> t.setText(t.getText() + "2"));
        b3.addActionListener(e -> t.setText(t.getText() + "3"));
        b4.addActionListener(e -> t.setText(t.getText() + "4"));
        b5.addActionListener(e -> t.setText(t.getText() + "5"));
        b6.addActionListener(e -> t.setText(t.getText() + "6"));
        b7.addActionListener(e -> t.setText(t.getText() + "7"));
        b8.addActionListener(e -> t.setText(t.getText() + "8"));
        b9.addActionListener(e -> t.setText(t.getText() + "9"));
        b0.addActionListener(e -> t.setText(t.getText() + "0"));
        
        bPlus.addActionListener(e -> handleOperator(t, "+"));
        bMinus.addActionListener(e -> handleOperator(t, "-"));
        bMul.addActionListener(e -> handleOperator(t, "*"));
        bDivide.addActionListener(e -> handleOperator(t, "/"));
        
        bEqual.addActionListener(e -> {
            num2 = Double.parseDouble(t.getText());
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
            }
            t.setText(String.valueOf(result));
            operator = "";
        });

        bAC.addActionListener(e -> t.setText(""));

        b1.setBounds(50, 100, 50, 40);
        b2.setBounds(110, 100, 50, 40);
        b3.setBounds(170, 100, 50, 40);
        bMul.setBounds(230, 100, 50, 40);

        b4.setBounds(50, 150, 50, 40);
        b5.setBounds(110, 150, 50, 40);
        b6.setBounds(170, 150, 50, 40);
        bDivide.setBounds(230, 150, 50, 40);

        b7.setBounds(50, 200, 50, 40);
        b8.setBounds(110, 200, 50, 40);
        b9.setBounds(170, 200, 50, 40);
        bPlus.setBounds(230, 200, 50, 40);

        b0.setBounds(50, 250, 50, 40);
        bEqual.setBounds(110, 250, 110, 40);
        bMinus.setBounds(230, 250, 50, 40);
        bAC.setBounds(50, 300, 230, 40);

        fr.add(t);
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);
        fr.add(b5);
        fr.add(b6);
        fr.add(b7);
        fr.add(b8);
        fr.add(b9);
        fr.add(b0);
        fr.add(bPlus);
        fr.add(bMinus);
        fr.add(bMul);
        fr.add(bDivide);
        fr.add(bEqual);
        fr.add(bAC);

        fr.setSize(350, 400);
        fr.setLayout(null);
        fr.setVisible(true);

        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    private static void handleOperator(TextField t, String op) {
        num1 = Double.parseDouble(t.getText());
        operator = op;
        t.setText("");
    }
}
