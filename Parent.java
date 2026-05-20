
class Parent1{
    int a ;
    int b;

    Parent1(int a,  int b) {
        this.a = a;
        this.b =b;

    }
    
    public void display()
    {
        System.out.println("hello this is a parent class");
    }
}
class child extends Parent1
{
    String str ;

    public child(int a,int b) {
        super(a,b);
        
    }
    child(int a, int b,String str)
    {
        this(a, b);
        this.str = str;
    }
    @Override
    public void display()
    {
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.str);
    }
}
class Parent
{
    public static void main(String[] args) {
        child s = new child(12,34,"Ullas");
        s.display();
        
    }
}