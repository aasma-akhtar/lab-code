package first;
class TestVarEncap {
	private int id=10;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId() {
		return id;
	}
}
public class Call
{
	public static void main(String args[])
	{
		TestVarEncap c=new TestVarEncap();
		c.setId(12);
		System.out.println("Value= "+c.getId());
	}
}
