 class model2
{
int n=121,rem=0,sum=0;

public static void main(String[]args)
{
 Test t=new Test();
 int result=t.calTest();
 t.calTest(result);
}

class Test
{
public int caltest();
 for(;n>0;n/=10)
{
 rem=n%10;
 sum=(sum+10*rem);
 n=n/10;
}
}
return sum;
{
if(n==sum)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}
}
