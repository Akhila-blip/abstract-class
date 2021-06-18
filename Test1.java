abstract class Test1
{
public int a=10;
public final int b=20;
public static final int c=30;
void disp1()
{
System.out.println("a value is="+a);
}
}
class Test2 extends Test1
{
void disp2()
{
System.out.println("b value is="+b);
System.out.println("c value is="+c);
}
public static void main(String args[])
{
Test2 t=new Test2();
t.disp1();
t.disp2();
}java Test1

}