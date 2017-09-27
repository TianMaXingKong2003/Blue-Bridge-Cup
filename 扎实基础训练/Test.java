
public class Test
{
	public static void main(String[] args)
	{
		int n = 26;
		int capa = 8; // 容量
		
		int 组数 = (n+capa-1) / capa;
		
		//if(n%capa > 0) 组数++;
		
		int 基数 = n / 组数;
		int 零头 = n % 组数;
		
		for(int i=0; i<组数; i++){
			if(i<零头)
				System.out.println(基数+1);
			else
				System.out.println(基数);
		}
	}
}