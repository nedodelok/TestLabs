import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPresenter implements ICalculatorPresenter {

    Calculator calculatorObj = new Calculator();
    CalculatorView calculatorViewObj = new CalculatorView();

    CalculatorPresenter(){

        calculatorViewObj.btn1.addActionListener(new PlusListener());
        calculatorViewObj.btn2.addActionListener(new MinusListener());
        calculatorViewObj.btn3.addActionListener(new MultiplyListener());
        calculatorViewObj.btn4.addActionListener(new DivideListener());

    }

    public static void main(String[] args) {
        CalculatorPresenter calculatorPresenterObj = new CalculatorPresenter();

    }

    public class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            onPlusClicked();
        }
    }
    public class MinusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            onMinusClicked();
        }
    }public class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            onDivideClicked();
        }
    }public class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            onMultiplyClicked();
        }
    }
    @Override
    public void onPlusClicked() {

        double first = Double.parseDouble(calculatorViewObj.getFirstArgumentAsString());
        double second = Double.parseDouble(calculatorViewObj.getSecondArgumentAsString());

        calculatorViewObj.printResult(calculatorObj.sum(first, second));
    }

    @Override
    public void onMinusClicked() {

        double first = Double.parseDouble(calculatorViewObj.getFirstArgumentAsString());
        double second = Double.parseDouble(calculatorViewObj.getSecondArgumentAsString());

        calculatorViewObj.printResult(calculatorObj.subtract(first, second));

    }

    @Override
    public void onDivideClicked() {
        double first = Double.parseDouble(calculatorViewObj.getFirstArgumentAsString());
        double second = Double.parseDouble(calculatorViewObj.getSecondArgumentAsString());

        try {
            calculatorViewObj.printResult(calculatorObj.divide(first, second));
        }
        catch(Exception except){
            calculatorViewObj.displayError(except.toString());
        }
    }

    @Override
    public void onMultiplyClicked() {

        double first = Double.parseDouble(calculatorViewObj.getFirstArgumentAsString());
        double second = Double.parseDouble(calculatorViewObj.getSecondArgumentAsString());

        calculatorViewObj.printResult(calculatorObj.multiply(first, second));

    }
}
