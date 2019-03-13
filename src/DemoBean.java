
public class DemoBean				
{		
	private SampleBean sb;			
	//setters
	public void setSb(SampleBean sb)
	{
		this.sb=sb;
	}
	//business component
	public void showMsg()
	{
		System.out.println("Hello I am Demo Bean(OB)");
		sb.m();
	}
}
