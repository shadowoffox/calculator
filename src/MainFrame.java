import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame()  {
        super("Simple calculator");

       // setSize(400,400);
        JPanel MainPanel = new JPanel();
        BorderLayout brl = new BorderLayout();

        MainPanel.setLayout(brl);

        JPanel Buttons = new JPanel();
        GridLayout gl =new GridLayout(4,4);

        JPanel MathsSigns = new JPanel();
        BoxLayout bxl1 = new BoxLayout(MathsSigns,1);

        JPanel Fields = new JPanel();
        BoxLayout bxl2 = new BoxLayout(Fields,0);

        Buttons.setLayout(gl);

        JButton Button1 = new JButton("1");
        JButton Button2 = new JButton("2");
        JButton Button3 = new JButton("3");
        JButton Button4 = new JButton("4");
        JButton Button5 = new JButton("5");
        JButton Button6 = new JButton("6");
        JButton Button7 = new JButton("7");
        JButton Button8 = new JButton("8");
        JButton Button9 = new JButton("9");
        JButton Button0 = new JButton("0");
        JButton ButtonDot = new JButton(".");
        JButton ButtonEqual = new JButton("=");
        JButton ButtonPlus = new JButton("+");
        JButton ButtonMinus = new JButton("-");
        JButton ButtonMulti = new JButton("*");
        JButton ButtonDiv = new JButton("/");
      //  JButton ButtonEnter = new JButton("=");
        MathsSigns.setLayout(bxl1);



        Fields.setLayout(bxl2);

        JTextField FirstField = new JTextField();
        JTextField SecondField = new JTextField();
        JTextField FinalField = new JTextField();



        Buttons.add(Button1);
        Buttons.add(Button2);
        Buttons.add(Button3);
        Buttons.add(Button4);
        Buttons.add(Button5);
        Buttons.add(Button6);
        Buttons.add(Button7);
        Buttons.add(Button8);
        Buttons.add(Button9);
        Buttons.add(ButtonDot);
        Buttons.add(Button0);
        Buttons.add(ButtonEqual);
       /* Buttons.add(ButtonPlus);
        Buttons.add(ButtonMinus);
        Buttons.add(ButtonMulti);
        Buttons.add(ButtonDiv);
        Buttons.add(ButtonEnter);*/

       MathsSigns.add(ButtonPlus);
        MathsSigns.add(ButtonMinus);
        MathsSigns.add(ButtonMulti);
        MathsSigns.add(ButtonDiv);


        Fields.add(FirstField);
        Fields.add(SecondField);
        Fields.add(FinalField);

        MainPanel.add(Fields,"North");
        MainPanel.add(Buttons,"Center");
        MainPanel.add(MathsSigns,"East");


        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(MainPanel);

        frame.pack();
        frame.setVisible(true);

    }

}
