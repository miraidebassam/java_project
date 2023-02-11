package vue;

import java.awt.BorderLayout;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretListener;

import Observer.Observer;
import contrôleur.CurrencyController;
import modele.CurrencyModel;
import Observer.Subject;
@SuppressWarnings("serial")
public class CurrencyView extends JFrame  implements Observer {

	CurrencyController controller; 
    private JTextField amountField;
    @SuppressWarnings("rawtypes")
	private JComboBox currenciesList;
    private CurrencyModel model;

    String[] currencies = { "Naira", "Dollar", "Pounds", "Euros", "Francs Guinéen" };
    private JLabel cfaValue;
    private Subject subject = new Subject();
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public CurrencyView() {
        subject.attach(this);

        setTitle("TO CFA Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);

        JPanel inputPanel = new JPanel();
        amountField = (new JTextField(10));
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(new JLabel("From:"));
        
        currenciesList = new JComboBox(currencies);

        
        inputPanel.add(currenciesList);

        JPanel buttonPanel = new JPanel();
       

        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        
        cfaValue = new JLabel("");
        buttonPanel.add(cfaValue);
        setVisible(false);
        setResizable(false);
    
    }
    
    public void start() {
    	setVisible(true);
    }
    
    public void setcfaValue(String cfa) {
    	cfaValue.setText(cfa);
    }
  

	public void addCaretListener(CaretListener caretListener) {
		amountField.addCaretListener(caretListener);
	}
	public void addItemListener(ItemListener itemListener) {
		currenciesList.addItemListener(itemListener);
	}

	public String getAmountFieldText(){
		return amountField.getText();
	}
	public int getcurrenciesListIndex() {
		return currenciesList.getSelectedIndex();
	}

    @Override
    public void update(double result) {
        try {

            DecimalFormat df = new DecimalFormat("0.00");
            setcfaValue(df.format(result));
        } catch (Exception error) {

        }
    }
}
