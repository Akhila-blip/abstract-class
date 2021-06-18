abstract class Bank4
{
abstract int getRateOfInterest();
}
class SBI extends Bank4
{
int getRateOfInterest()
{
return 7;
}
}
class PNB extends Bank4
{
int getRateOfInterest()
{
return 8;
}
}
class TestBank
{
public static void main(String args[])
{
Bank4 b;
b=new SBI();
System.out.println("Rate Of Interest is :"+b.getRateOfInterest()+"%");
b=new PNB();
System.out.println("Rate Of Interest is:"+b.getRateOfInterest()+"%");
}
}