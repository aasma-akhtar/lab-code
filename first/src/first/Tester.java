package first;
import java.util.ArrayList;
import java.util.List;
class AccData
{
	int id;
	String accountName;
	long accountNum;
	double balance;
	public AccData(int id, String accountName, long accountNum, double balance) {
		super();
		this.id = id;
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Module [Id=" + id + ", AccountName=" + accountName + ", AccountNum=" + accountNum + ", Balance="
				+ balance + "]";
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
public class Tester {
  public static void main(String[] args) {
	AccData aasma= new AccData(1, "Aasma", 1234, 120000);
	AccData rehan= new AccData(2, "Rehan", 12345, 210000);
	AccData eshika=new AccData(3, "Eshika", 123456, 1000);
	List<AccData> list=new ArrayList<>();
	list.add(aasma);
	list.add(rehan);
	list.add(eshika);
	double max=0;
	String name="";
	for(AccData x:list)
	{
		System.out.println(x);
	}
	for(AccData x:list)
	{
		if(x.getBalance()>max)
		{
			max=x.getBalance();
			name=x.getAccountName();
		}
    }
	System.out.println("Account with highest balance:");
	System.out.println(name+" "+max);
  }
}

