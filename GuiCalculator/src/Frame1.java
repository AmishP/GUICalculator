import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import java.awt.Font;
import java.util.Scanner;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class Frame1 {

	private JFrame frmJavaCalculator;
	private JLabel lblDisplay;
	private static final int ONE = 1;
	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int FOUR = 4;
	private static final int FIVE = 5;
	private static final int SIX = 6;
	private static final int SEVEN = 7;
	private static final int EIGHT = 8;
	private static final int NINE = 9;
	private static final int ZERO = 0;
	private int firstNumber;
	private int secondNumber;
	private String type;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmJavaCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaCalculator = new JFrame();
		frmJavaCalculator.setTitle("Java Calculator");
		frmJavaCalculator.setBounds(100, 100, 405, 340);
		frmJavaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCalculator.getContentPane().setLayout(null);

		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// lblDisplay.setText("You have pressed the button: " + ONE);
				if (type != null) {
					secondNumber = secondNumber + ONE;
				} else {
					firstNumber = firstNumber + ONE;
				}
				lblDisplay.setText("firstNumber: " + firstNumber
						+ "secondNumber: " + secondNumber);
			}
		});
		button_1.setBounds(9, 121, 66, 49);
		frmJavaCalculator.getContentPane().add(button_1);

		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (type != null) {
					secondNumber = secondNumber + TWO;
				} else {
					firstNumber = firstNumber + TWO;
				}
				lblDisplay.setText("firstNumber: " + firstNumber
						+ "secondNumber: " + secondNumber);
			}
		});
		button_2.setBounds(85, 121, 66, 49);
		frmJavaCalculator.getContentPane().add(button_2);

		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + THREE);
				firstNumber = THREE;
			}
		});
		button_3.setBounds(161, 121, 66, 49);
		frmJavaCalculator.getContentPane().add(button_3);

		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + FOUR);
				firstNumber = FOUR;
			}
		});
		button_4.setBounds(9, 181, 66, 49);
		frmJavaCalculator.getContentPane().add(button_4);

		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + FIVE);
				firstNumber = FIVE;
			}
		});
		button_5.setBounds(85, 181, 66, 49);
		frmJavaCalculator.getContentPane().add(button_5);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + SIX);
				firstNumber = SIX;
			}
		});
		button_6.setBounds(161, 181, 66, 49);
		frmJavaCalculator.getContentPane().add(button_6);

		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + SEVEN);
				firstNumber = SEVEN;
			}
		});
		button_7.setBounds(9, 241, 66, 49);
		frmJavaCalculator.getContentPane().add(button_7);

		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + EIGHT);
				firstNumber = EIGHT;
			}
		});
		button_8.setBounds(85, 241, 66, 49);
		frmJavaCalculator.getContentPane().add(button_8);

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + NINE);
				firstNumber = NINE;
			}
		});
		button_9.setBounds(161, 241, 66, 49);
		frmJavaCalculator.getContentPane().add(button_9);

		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDisplay.setText("You have pressed the button: " + ZERO);
			}
		});
		button_0.setBounds(237, 241, 66, 49);
		frmJavaCalculator.getContentPane().add(button_0);

		lblDisplay = new JLabel("");
		lblDisplay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDisplay.setBounds(10, 59, 369, 51);
		frmJavaCalculator.getContentPane().add(lblDisplay);

		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type = "-";
			}
		});
		button_minus.setBounds(237, 121, 66, 49);
		frmJavaCalculator.getContentPane().add(button_minus);

		JButton button_addition = new JButton("+");
		button_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type = "+";
			}
		});
		button_addition.setBounds(237, 181, 66, 49);
		frmJavaCalculator.getContentPane().add(button_addition);

		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type = "/";
			}
		});
		button_divide.setBounds(313, 121, 66, 49);
		frmJavaCalculator.getContentPane().add(button_divide);

		JButton button_multiply = new JButton("x");
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type = "*";
			}
		});
		button_multiply.setBounds(313, 181, 66, 49);
		frmJavaCalculator.getContentPane().add(button_multiply);

		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int total = add(firstNumber, secondNumber);
				String totalS = String.valueOf(total);

				lblDisplay.setText(totalS);
			}
		});
		button_equals.setBounds(313, 241, 66, 49);
		frmJavaCalculator.getContentPane().add(button_equals);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(9, 11, 200, 26);
		frmJavaCalculator.getContentPane().add(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmJavaCalculator.dispose();
			}
		});
		mnFile.add(mntmClose);

	}

	public static int add(int a, int b) {
		int total;
		total = a + b;
		System.out.println("Total: " + total);
		return total;
	}

	public static int minus(int a, int b) {
		int total;
		total = a - b;
		System.out.println("Total: " + total);
		return total;
	}

	public static int multiply(int a, int b) {
		int total;
		total = a * b;
		System.out.println("Total: " + total);
		return total;
	}

	public static int divide(int a, int b) {
		int total;
		total = a / b;
		System.out.println("Total: " + total);
		return total;
	}
}
