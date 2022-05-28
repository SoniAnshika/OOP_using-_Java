/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Mother
{
    int x;
    
    void show()
    {
        System.out.println("Mother Class Function");
    }
}

class child extends Mother
{
    void show()
    {
        System.out.println("Child Class Function");
    }
    
}

class Application
{
    public static void main(String args[])
    {
        /*Mother object calling mother function.*/
        Mother m=new Mother();
        m.show();
        /*Child object calling mother function. */
        child c=new child();
        c.show();
    }
}