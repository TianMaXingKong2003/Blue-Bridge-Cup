
public class Test
{
	public static void main(String[] args)
	{
		int n = 26;
		int capa = 8; // ����
		
		int ���� = (n+capa-1) / capa;
		
		//if(n%capa > 0) ����++;
		
		int ���� = n / ����;
		int ��ͷ = n % ����;
		
		for(int i=0; i<����; i++){
			if(i<��ͷ)
				System.out.println(����+1);
			else
				System.out.println(����);
		}
	}
}