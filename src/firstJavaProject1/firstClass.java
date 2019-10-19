package firstJavaProject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Iterator;

public class firstClass {
	
	//public static int age; //start with 0
	
	public static int hage;
	public static int wage;
	public static String husbandName, wifeName;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader read = new BufferedReader (new InputStreamReader(System.in));//creating a object of a bufferedreader which is a existing method in java libraries
		System.out.println("What is your age and name?"); //how to print 
		//age= Integer.parseInt(read.readLine());//reading a string and converting it to integer
		hage= Integer.parseInt(read.readLine());//reading a string and converting it to integer
		wage= Integer.parseInt(read.readLine());//reading a string and converting it to integer
		husbandName=read.readLine();
		wifeName=read.readLine();
		System.out.println(hage +" "+wage +" " +husbandName+" "+wifeName);
		
	
		//System.out.println(hage +" "+ wage);
	
		int sumTotalAge =totalAge(hage, wage);
		
		
		System.out.println(sumTotalAge);		
		
		System.out.println(totalAge(hage, wage));

		ageMulti(hage,wage);
		
		
		firstClass obj=new firstClass();
		obj.ageMulti2(hage, wage);
		
		secondClass names=new secondClass();
		System.out.println (names.numberCharacters(wifeName, husbandName));
		
		ArrayList<String> people=new ArrayList<String>();
		people.add(husbandName);
		people.add(wifeName);
		
		//read from array
		Iterator<String> itr = people.iterator();
		while(itr.hasNext())
			System.out.println("Printing the array" +itr.next());
		

	} //end main method
	
	public static int totalAge(int a, int b){
		
				return Integer.sum(a,b);	
				
		
	}//end totalAge method
	
	
public static void ageMulti(int a, int b){
	int total=a*b;
	System.out.println("multi =" +total);
		
	
}// end method ageMulti


public void ageMulti2(int a, int b){
	
	System.out.println("multi =" +a*b);
		
	
}// end method ageMulti2



} //end class
