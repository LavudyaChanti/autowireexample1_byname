
public class DemoBean				
{		
	private SampleBean sb;			
	//setters
	public void setSb(SampleBean sb)
	{
		System.out.println("I am setter");
		this.sb=sb;
	}
	//constructor
	public DemoBean(SampleBean sb) {
		System.out.println("I am constructor");
		this.sb = sb;
	}

	//business component
	public void showMsg()
	{
		System.out.println("Hello I am Demo Bean(OB)");
		sb.m();
	}

	}
