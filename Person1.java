
package utility;

public class Person1{

	private String name;
	private int age;;
	
		public Person1(String name, int age){
				
			this.name = name;
			this.age = age;
			
			System.out.println("in display Person1...... " );
			//display();
		}
		
	
	
		public void display() {
			System.out.println("Name and age is " +name+ " - "+age);
		}

}

