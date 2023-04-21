class Program4 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 15;
		int c = 20;
 
		int res = ((a>b) ? (a>c ? a:c) : (b>c?b:c)) ;
		System.out.println(res);
	}
}
