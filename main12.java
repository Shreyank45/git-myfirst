class Hiding {
    private int a;

    public int geter()
    {
        return a;
    }

    public void setter(int a)
    {
        this.a = a;
    }


}
public class main12{
    public static void main(String[] args) {
        Hiding h = new Hiding();
        h.setter(20);
        System.out.println(h.geter());
    }
}
