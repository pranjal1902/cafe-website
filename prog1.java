import java.util.*;
public class prog1 {
        
        public static void main(String[] args) {
        int ch;
        float i,j,res;
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter your Choice");
        Scanner s1=new Scanner(System.in);
        ch=s1.nextInt();
       switch(ch)
        {
        	case 1:
        	{
        		System.out.println("Enter first value");
        		i=s1.nextFloat();
        		System.out.println("Enter second value");
        		j=s1.nextFloat();
        		res=i+j;
        		System.out.println("The Sum of Numbers is:" +res);
        		break;        		
        	}
        	case 2:
        	{
        		System.out.println("Enter first value");
        		i=s1.nextFloat();
        		System.out.println("Enter second value");
        		j=s1.nextFloat();
        		res=i-j;
        		System.out.println("The Subtration of Numbers is:" +res);
        		break;        		
        	}
        	case 3:
        	{
        		System.out.println("Enter first value");
        		i=s1.nextFloat();
        		System.out.println("Enter second value");
        		j=s1.nextFloat();
        		res=i*j;
        		System.out.println("The Multiplication of Numbers is:" +res);
        		break;        		
        	}
        	case 4:
        	{
        		System.out.println("Enter first value");
        		i=s1.nextFloat();
        		System.out.println("Enter second value");
        		j=s1.nextFloat();
        		res=i/j;
        		System.out.println("The Division of Numbers is:" +res);
        		break;        		
        	}
        	default:
        		System.out.println("Wrong Choice");
        }
    }
}
