package lab01;

import javax.swing.JOptionPane;

public class ShowTwoNumber{
	public static void main(String[] args){
		String strNum1, strNum2; double num1, num2;
		String strNotification = "Nguyen Trung Dat - 20215029 - You've just entered: ";

		strNum1 = JOptionPane.showInputDialog(null, "Nguyen Trung Dat - 20215029 - Please input the first number: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);

		strNotification += strNum1 + " and ";

		strNum2 = JOptionPane.showInputDialog(null, "Nguyen Trung Dat - 20215029 - Please input the second number: ", "Input the number", JOptionPane.INFORMATION_MESSAGE);
		
		strNotification += strNum2;

		JOptionPane.showMessageDialog(null, strNotification, "Nguyen Trung Dat - 20215029 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);}}