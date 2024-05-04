import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;

public class calculator {

	private JFrame frmScientificCalculator;
	private JTextField textField;
	private JButton btn6;
	private JButton btnPercent;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmScientificCalculator.setVisible(true);
				} catch (Exception arg0) {
					arg0.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScientificCalculator = new JFrame();
		frmScientificCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 42));
		frmScientificCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                SCIENTIFIC CALCULATOR");
		lblNewLabel.setBounds(0, 61, 507, -34);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		frmScientificCalculator.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SCIENTIFIC   CALCULATOR");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_1.setBounds(10, 10, 409, 45);
		frmScientificCalculator.getContentPane().add(lblNewLabel_1);
		
		JButton btnSquareRoot = new JButton("\u221A");
		btnSquareRoot.setEnabled(false);
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnSquareRoot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSquareRoot.setBounds(10, 156, 79, 68);
		frmScientificCalculator.getContentPane().add(btnSquareRoot);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 58, 409, 68);
		frmScientificCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnx = new JButton("1/x");
		btnx.setEnabled(false);
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnx.setBounds(10, 223, 79, 68);
		frmScientificCalculator.getContentPane().add(btnx);
		
		JButton btnXy = new JButton("x^y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		//btnXy.setBackground(new Color(240, 240, 240));
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXy.setBounds(10, 291, 79, 68);
		frmScientificCalculator.getContentPane().add(btnXy);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.setEnabled(false);
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnX_1.setBackground(new Color(240, 240, 240));
		btnX_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnX_1.setBounds(10, 358, 79, 68);
		frmScientificCalculator.getContentPane().add(btnX_1);
		
		JButton btnX = new JButton("x^2");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnX.setBackground(new Color(240, 240, 240));
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnX.setBounds(10, 425, 79, 68);
		frmScientificCalculator.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent earg0) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		//btnN.setBackground(new Color(240, 240, 240));
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnN.setBounds(10, 491, 79, 68);
		frmScientificCalculator.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argarg0) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		//btnPlusMinus.setBackground(new Color(240, 240, 240));
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlusMinus.setBounds(10, 551, 79, 68);
		frmScientificCalculator.getContentPane().add(btnPlusMinus);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnEx.setBackground(new Color(240, 240, 240));
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEx.setBounds(93, 159, 79, 68);
		frmScientificCalculator.getContentPane().add(btnEx);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnLog.setBackground(new Color(240, 240, 240));
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLog.setBounds(93, 223, 79, 68);
		frmScientificCalculator.getContentPane().add(btnLog);
		
		btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		//btnPercent.setBackground(new Color(240, 240, 240));
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPercent.setBounds(93, 291, 79, 68);
		frmScientificCalculator.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn7.setBounds(93, 358, 79, 68);
		frmScientificCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn4.setOpaque(false);
		btn4.setBounds(93, 425, 79, 68);
		frmScientificCalculator.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn1.setBounds(93, 491, 79, 68);
		frmScientificCalculator.getContentPane().add(btn1);
		
		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);	
			}
		});
		//btnSin.setBackground(new Color(240, 240, 240));
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSin.setBounds(175, 156, 79, 68);
		frmScientificCalculator.getContentPane().add(btnSin);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnSinh.setBackground(new Color(240, 240, 240));
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSinh.setBounds(175, 223, 79, 68);
		frmScientificCalculator.getContentPane().add(btnSinh);
		
		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		//btnClear.setBackground(new Color(240, 240, 240));
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(175, 291, 79, 68);
		frmScientificCalculator.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn8.setBounds(175, 358, 79, 68);
		frmScientificCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn5.setBounds(175, 425, 79, 68);
		frmScientificCalculator.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn2.setBounds(175, 491, 79, 68);
		frmScientificCalculator.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.setBounds(93, 551, 161, 68);
		frmScientificCalculator.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnCos.setBackground(new Color(240, 240, 240));
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCos.setBounds(258, 156, 79, 68);
		frmScientificCalculator.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCosh.setBounds(258, 223, 79, 68);
		frmScientificCalculator.getContentPane().add(btnCosh);
		
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 25));
		btnBackSpace.setBounds(258, 291, 79, 68);
		frmScientificCalculator.getContentPane().add(btnBackSpace);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn9.setBounds(258, 358, 79, 68);
		frmScientificCalculator.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn6.setBounds(258, 425, 79, 68);
		frmScientificCalculator.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argarg0) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn3.setBounds(258, 491, 79, 68);
		frmScientificCalculator.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDot.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		btnDot.setBounds(258, 551, 79, 68);
		frmScientificCalculator.getContentPane().add(btnDot);
		
		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnTan.setBackground(new Color(240, 240, 240));
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTan.setBounds(340, 156, 79, 68);
		frmScientificCalculator.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		//btnTanh.setBackground(new Color(240, 240, 240));
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTanh.setBounds(340, 223, 79, 68);
		frmScientificCalculator.getContentPane().add(btnTanh);
		
		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		//btnSub.setBackground(new Color(240, 240, 240));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
				
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSub.setBounds(340, 358, 79, 68);
		frmScientificCalculator.getContentPane().add(btnSub);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setEnabled(false);
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMultiply.setBounds(340, 425, 79, 68);
		frmScientificCalculator.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDivide.setBounds(340, 491, 79, 68);
		frmScientificCalculator.getContentPane().add(btnDivide);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		//btnAdd.setBackground(new Color(240, 240, 240));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			first=Double.parseDouble(textField.getText());
			textField.setText("");
			operation="+";	
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnAdd.setBounds(340, 291, 79, 68);
		frmScientificCalculator.getContentPane().add(btnAdd);
		
		JButton btnEqual = new JButton("=");
		//cbtnEqual.setEnabled(false);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
					}
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnEqual.setBounds(340, 551, 79, 68);
		frmScientificCalculator.getContentPane().add(btnEqual);
		
		JRadioButton btnON = new JRadioButton("ON");
		btnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnDot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMultiply.setEnabled(true);
				btnDivide.setEnabled(true);
				btnX.setEnabled(true);
				btnX_1.setEnabled(true);
				btnXy.setEnabled(true);
				btnx.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnN.setEnabled(true);
				btnLog.setEnabled(true);
				btnx.setEnabled(true);
				btnEx.setEnabled(true);
				btnClear.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnPercent.setEnabled(true);
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCos.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh.setEnabled(true);
				btnEqual.setEnabled(true);
				btnSquareRoot.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(btnON);
		//btnON.setBackground(new Color(240, 240, 240));
		btnON.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnON.setBounds(20, 132, 50, 21);
		frmScientificCalculator.getContentPane().add(btnON);
		
		JRadioButton rdbtnOFF = new JRadioButton("OFF");
		rdbtnOFF.setSelected(true);
		buttonGroup.add(rdbtnOFF);
		rdbtnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnDot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMultiply.setEnabled(false);
				btnDivide.setEnabled(false);
				btnX.setEnabled(false);
				btnX_1.setEnabled(false);
				btnXy.setEnabled(false);
				btnx.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnN.setEnabled(false);
				btnLog.setEnabled(false);
				btnx.setEnabled(false);
				btnEx.setEnabled(false);
				btnClear.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnPercent.setEnabled(false);
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);
				btnEqual.setEnabled(false);
				btnSquareRoot.setEnabled(false);
				textField.setEnabled(false);
			}
		});
		rdbtnOFF.setFont(new Font("Tahoma", Font.PLAIN, 17));
		//rdbtnOFF.setBackground(SystemColor.menu);
		rdbtnOFF.setBounds(93, 132, 61, 21);
		frmScientificCalculator.getContentPane().add(rdbtnOFF);
	}
}
