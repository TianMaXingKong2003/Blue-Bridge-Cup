
public class Test2
{
	static int f(String s)
	{
		s = s + "+";
		
		int sum = 0;
		int ���� = 0;
		int ���� = 1;
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c>='0' && c<='9'){
				���� = ���� * 10 + (c - '0');
			}
			if(c=='+'){
				sum = sum + ���� * ����; 
				���� = 0;
				���� = 1;
			}
			if(c=='-'){
				sum = sum + ���� * ����; 
				���� = 0;
				���� = -1;
			}		}
		
		//sum += ���� * ����;
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		//System.out.println(f("1 2+3-4-5"));
		
		/*
		for(int i=1; i<100; i++){
			int a = i * i * i;
			int b = a * i;
			if((a+"").length() != 4) continue;
			if((b+"").length() != 6) continue;
			System.out.println(i + ": " + a + b);
		}
		*/
		
		/*
		double a = 1;
		for(int i=1; i<=99; i++) a *= i;
		System.out.println(a);
		*/
	}
}