package Abstraction;

public abstract class AbsClassExam 
{
	private String Emp_name;
	private int Emp_id;
	public void setter(String Emp_name,int Emp_id)
	{
		this.Emp_name=Emp_name;
		this.Emp_id=Emp_id;
	}
	public void getter()
	{
		System.out.println("Employee name: "+Emp_name);
		System.out.println("Employee id: "+Emp_id);
	}
	public abstract void salary();
}
