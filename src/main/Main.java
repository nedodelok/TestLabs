import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    Main(){
        //creating main frame
        JFrame frameObj = new JFrame();

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.setGroupingUsed(false);
        JFormattedTextField FirstArgField = new JFormattedTextField(numberFormat);
        FirstArgField.setValue(0);
        FirstArgField.setColumns(10);
        JFormattedTextField SecondArgField = new JFormattedTextField(decimalFormat);
        SecondArgField.setValue(0);
        SecondArgField.setColumns(10);
        //creating text fields
        JTextField ResultField;
        ResultField = new JTextField("Result will be there");
        ResultField.setEditable(false);

// creating 4 buttons
        JButton btn1 = new JButton("+");
        JButton btn2 = new JButton("-");
        JButton btn3 = new JButton("*");
        JButton btn4 = new JButton(":");

// adding buttons to the frame
// since, we are using the parameterless constructor, therfore;
// the number of columns is equal to the number of buttons we
// are adding to the frame. The row count remains one.
        frameObj.add(FirstArgField);
        frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);frameObj.add(btn4);
        frameObj.add(SecondArgField);
        frameObj.add(ResultField);

// setting the grid layout using the parameterless constructor
        frameObj.setLayout(new GridLayout());

        frameObj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameObj.setSize(800, 100);
        frameObj.setLocation(400,400);
        frameObj.setVisible(true);
    }

    public static void main(String[] args) {

        new CalculatorPresenter();
        Calculator calculatorObj = new Calculator();
        try {
            System.out.println(calculatorObj.divide(0.2, 0.000000000009));
        }
        catch(Exception except){
            System.out.println("ХАХАХАХАХА");
        }
//        System.out.println(0.2 / 0.000000000009);
    }
}