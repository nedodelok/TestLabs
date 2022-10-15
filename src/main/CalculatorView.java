import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculatorView implements ICalculatorView{
    JFormattedTextField FirstArgField;
    JFormattedTextField SecondArgField;

    JTextField ResultField;
    // creating 4 buttons
    JButton btn1 = new JButton("+");
    JButton btn2 = new JButton("-");
    JButton btn3 = new JButton("*");
    JButton btn4 = new JButton(":");
    CalculatorView(){
        //creating main frame
        JFrame frameObj = new JFrame();

        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.ENGLISH);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.setGroupingUsed(false);
        decimalFormat.setMaximumFractionDigits(10);
        FirstArgField = new JFormattedTextField(numberFormat);
        FirstArgField.setValue(0);
        FirstArgField.setColumns(10);
        SecondArgField = new JFormattedTextField(numberFormat);
        SecondArgField.setValue(0);
        SecondArgField.setColumns(10);
        //creating text fields
        ResultField = new JTextField("Result will be there");
        ResultField.setEditable(false);


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

    @Override
    public void printResult(double result) {
        ResultField.setText(String.valueOf(result));
    }

    @Override
    public void displayError(String message) {
        System.out.println(message);
    }

    @Override
    public String getFirstArgumentAsString() {
        return this.FirstArgField.getText();
    }

    @Override
    public String getSecondArgumentAsString() {
        return this.SecondArgField.getText();
    }
}
