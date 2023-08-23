class Rightrotate
{
public static void main(String [] args)
{
  int a[]=new int []{10,15,30,20,19,17,54,99,77,125};
  int x,rotate=6;
   for(x=a.length-rotate;x<a.length;x++)
    {
         System.out.println(a[x]);
    }
       for(x=0;x<a.length-rotate;x++)
        {
          System.out.println(a[x]);
        }
    
}
}