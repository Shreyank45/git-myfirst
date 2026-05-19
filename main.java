class outerClass
{
    int n = 20;
    class innerClass
    {
        public void main1()
        {
            System.out.println("Hello this is a inner class method");
        }
    }
}
abstract  class new1
{
    int i = 47;
    abstract public void dispaly1();
    abstract public void dispaly2();
}
class main{
    new1 as = new new1() {
        public void dispaly1()
        {
            System.out.println(as.i);
        }
        public void dispaly2()
        {
            System.out.println("This is abstract mehtods");
        }
    };
    public static void main(String[] args) {
        outerClass.innerClass inner = new outerClass().new innerClass();
        inner.main1();
        main m =new main();
        m.as.dispaly1();
        m.as.dispaly2();
    }
}