import java.util.*;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1 number: ");
		int n1=sc.nextInt();
		System.out.println("Enter the 2 number: ");
		int n2=sc.nextInt();
		String carry=" " , sum=" ", rs=" ";
		int s=0, carr=0, c=0;
		
		while(n1!=0 || n2!=0 || carr!=0)
		{
			int x=(n1>0)?n1%10:0;
			int y=(n1>0)?n2%10:0;
			n1=n1/10;
			n2=n2/10;
			c++;
			s=(carr+x+y)%10;
			sum =s+sum;
			carr=(carr+x+y)/10;
			carry=carr+carry;
			rs +=""+"step"+c+""+":{ "+""+"carryString"+""+":"+" "+carry+""+","+" "+"sumstring"+" "+":"+""+sum+""+"},"+"\n";
			
		}
		rs=rs.substring(0,rs.length()-2);
		System.out.println(rs);
		
	}

}
