package first;

public class Check {
	public void conditions(int a, int b){
		int c1=0,c2=0,c3=0;
		for(int i=a;i<=b;i++)
		{
			if(i%3==0)
			c1+=1;
			if(i%4==0)
			c2+=1;
			if(i%5==0)
			c3+=1;
		}
		System.out.println("Numbers divisible by 3="+c1);
		System.out.println("Numbers divisible by 4="+c2);
		System.out.println("Numbers divisible by 5="+c3);
		
	}

}
