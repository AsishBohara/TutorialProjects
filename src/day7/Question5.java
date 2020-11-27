package day7;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
	

	final double PI = Math.PI;
	String r = JOptionPane.showInputDialog("Enter radius: ");
	double radius = Double.parseDouble(r);
	
	double areaofcircle = PI * Math.pow(radius, 2);
	JOptionPane.showMessageDialog(null, "Area of circle is: " + areaofcircle);
	
	System.out.println(Math.random()*100);
	
	
	
		
		
		
		
	}
	
	
	

}
