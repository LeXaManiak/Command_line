
public class Comm_line {

	
	
final static String arg_fmt="--ARG=";
	
	
	public Comm_line() {
		
		
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
if (args.length==0){System.out.println("�������� ����������, ������ ��������"+arg_fmt);}
		


		for(String i: args )	
		{
			System.out.println (i);
			
			
			if ( i.startsWith(arg_fmt) ){
			i=i.substring(arg_fmt.length());	
			System.out.println("��������="+i);
			
			}
			else {
				System.out.println(i);	
				System.out.println("���-�� ����������");	
				}
				
	
}





	}

}
