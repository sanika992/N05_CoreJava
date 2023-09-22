
public class MyException extends  Exception{
	//variable
	private static int accno[]= {101,102,103,104};
	private static String name[]= {"sani","mahi","tom","ram"};
	private static double bal[]= {10000.00,120000.00,15000.00,40000.00};
	//constructor
	 MyException() {
		 
	 }
	
	 MyException(String str) {
		super(str);
		
	}
	 //main
	 public static void main (String args[]) {
		 try {
			 System.out.println("Accountn No:"+"\t"+"Name"+"\t"+"Balence");
			 for(int i=0;i<4;i++) {
				 System.out.println(accno[i]+"\t"+name[i]+"\t"+bal[i]);
			 
			 if(bal[i]<1000) {
				 MyException e = new MyException("Balence is less than 1000 for Acoount No"+accno[i]);
				 throw e;
			 }
		 }
		 }
		 catch(MyException e) {
			 e.printStackTrace();
		
		 }
	 }
	
	

}
