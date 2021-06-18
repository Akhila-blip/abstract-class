abstract class Test4
{
abstract void m1();
abstract void m2();
abstract void m3();
void m4()
{
System.out.println("m4 method");
}
}
void m1()
{
System.out.println("m1 method");
}
void m2()
{
System.out.println("m2 method");
}
void m3()
{
System.out.println("m3 metod");
}
public static void main(String[]args)
{
Test1 t=new Test1();
t.m1();
t.m2();
Test t1=new Test1();
t1.m1();
t1.m2();
t1.m3();
t1.m4();
}
}

 