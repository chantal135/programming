class Employee{
	
	String name, place, position, department;
	double salary = 250000.0;
	
	}
	class Department{
		String name, place, position;
		int age;
		}

public class Similar {
	public static void main(String[]args){
		Employee a = new Employee();
		a.name = "Aline";
		a.place = "Kigali";
		a.position = "Manager";
		a.department = "BME";
		//a.salary = 300000.00;
		System.out.println("your name is:"+a.name+ "your place is:"+a.place+ "your position is:"+a.position+ " your department is:"+a.department+ "your salary is :"+a.salary);
		
        Employee b = new Employee();
        b.name = " Chantal";
        b.place = " Nyagatare";
        b.position = " CEO";
        b.department = "INS";
        b.salary = 500000.0;
        System.out.println("your name is :"+b.name+ "your place is :"+b.place+ "your position is :"+b.position+ " your department is :"+b.department+ "your salary is:"+b.salary);
        Department x = new Department();
        x.name = "Grace";
        x.place = "Kayonza";
        x.position ="Manager";
        x.age = 24;
        System.out.println("your name is:"+x.name+ "your place is :"+x.place+ " your position is :"+x.position+ "your age is:"+x.age);
        
		
		
		
		
		
		}}
