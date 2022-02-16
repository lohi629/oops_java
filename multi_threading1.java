import java.util.Random;
class Mythread2 extends Thread
{
int x;
Mythread2(int n)
{
x=n;
//System.out.println("second thread");
}
public void run()
{
if(x%2==0)
{
int s=x*x;
System.out.println("squre:"+s);
}
}
}
class Mythread3 extends Thread
{
int x;
Mythread3(int n)
{
x=n;
//System.out.println("third thread");
}
public void run()
{
if(x%2!=0)
{
int c=x*x*x;
System.out.println("cube:"+c);
}
}
}
class Mythread1 extends Thread
{
public void run()
{
Random r=new Random();
for(int i=1;i<5;i++)
{
int rand_int=r.nextInt(100);
System.out.println("thread1:"+rand_int);
Mythread2 t=new Mythread2(rand_int);
t.start();
Mythread3 t1=new Mythread3(rand_int);
t1.start();
}
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
class demo
{
public static void main(String[] args)
{
Mythread1 t2=new Mythread1();
t2.start();
}
}
