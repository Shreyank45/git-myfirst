 abstract class outer{
    
    public static  void display()
    {
        System.out.println("This is an Ananomysous inner class ");
    }
    abstract class inner{
    abstract public void display1();
    }
}
class demo{
    outer o = new outer() {
        
    };
    outer.inner i = o.new inner(){
        @Override
        public void display1()
        {
            System.out.println(" This is a Inner class anonymus class ");
        }
    };
}

class Exam{
    public static void main(String[] args) {
        demo  d= new demo();
        d.i.display1();

        
    }
}