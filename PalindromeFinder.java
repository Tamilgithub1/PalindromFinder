import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		StringBuilder sb=new StringBuilder();
		sb.append(N);
		int r=Integer.parseInt(sb.reverse().toString());
		System.out.println("R is :"+r);
		if(N==r && N<=1000)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
