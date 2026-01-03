package Abstraction;

public class AbsChildExam extends AbsClassExam
{
	public void salary()
	{
		int incent=4000;
		int Emp_sal=incent+80000;
		System.out.println("Employee salary: "+Emp_sal);
	}
	public static void main(String[] args) 
	{
		AbsChildExam ob=new AbsChildExam();
		ob.setter("Anjana",215866);
		ob.getter();
		ob.salary();
	}

}
