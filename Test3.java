abstract class Test3
{
abstract void m1();
abstract void m2();
abstract void m3();
void m4()
{
System.out.println("m4 method");
}
public static void main(String args[])
{
Test3 t=new Test3();
t.m4();
}
}