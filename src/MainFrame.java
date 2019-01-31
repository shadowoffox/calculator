import netscape.javascript.JSObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public char Sign;
    public MainFrame()  {
        super("Simple calculator");

       // setSize(400,400);
        JPanel MainPanel = new JPanel();
        BorderLayout brl = new BorderLayout();

        MainPanel.setLayout(brl);

        JPanel MathsSigns = new JPanel();
        GridLayout bxl1 = new  GridLayout(1,5);

        JPanel Fields = new JPanel();
        BoxLayout bxl2 = new BoxLayout(Fields,0);


        JButton ButtonPlus = new JButton("+");
        JButton ButtonMinus = new JButton("-");
        JButton ButtonMulti = new JButton("*");
        JButton ButtonDiv = new JButton("/");
        JButton ButtonEqual = new JButton("=");
        MathsSigns.setLayout(bxl1);



        Fields.setLayout(bxl2);

        JTextField FirstField = new JTextField();
        JTextField SecondField = new JTextField();
        JTextField FinalField = new JTextField();


       MathsSigns.add(ButtonPlus);
        MathsSigns.add(ButtonMinus);
        MathsSigns.add(ButtonMulti);
        MathsSigns.add(ButtonDiv);
        MathsSigns.add(ButtonEqual);

        Fields.add(FirstField);
        Fields.add(SecondField);
        Fields.add(FinalField);
        MainPanel.add(Fields,"North");
     //   MainPanel.add(Buttons,"Center");
        MainPanel.add(MathsSigns,"Center");


        //Операции
        ButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (FirstField.getText().length() > 0)
                   Sign='+';
               }
        });
        ButtonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FirstField.getText().length() > 0)
                    Sign='-';

            }
        });
        ButtonMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FirstField.getText().length() > 0)
                    Sign='*';
            }
        });

        ButtonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (FirstField.getText().length() > 0)
                    Sign='/';
            }
        });

        ButtonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (Sign) {
                    case '+': {
                        double result = Double.parseDouble(FirstField.getText()) + Double.parseDouble(SecondField.getText());
                        FinalField.setText(Double.toString(result));
                        break;
                    }
                    case '-': {
                        double result = Double.parseDouble(FirstField.getText()) - Double.parseDouble(SecondField.getText());
                        FinalField.setText(Double.toString(result));
                        break;
                    }
                    case '*': {
                        double result = Double.parseDouble(FirstField.getText()) * Double.parseDouble(SecondField.getText());
                        FinalField.setText(Double.toString(result));
                        break;
                    }
                    case '/': {
                        Double result;
                        try {
                            result = Double.parseDouble(FirstField.getText()) / Double.parseDouble(SecondField.getText());
                        } catch (ArithmeticException e1) {
                            FinalField.setText("ДЕЛЕНИЕ НА 0!!!");
                            result = 0.0;
                        }
                        FinalField.setText(Double.toString(result));
                        break;
                    }
                }
            }
        });

        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(MainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /**
         * переделать
         * textField.addKeyListener(new KeyAdapter() {
         *  public void keyTyped(KeyEvent e) {
         *  char c = e.getKeyChar();
         *  if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
         *  e.consume(); // consume non-numbers
         *  }
         *  }
         *  });
         */

    }
}
