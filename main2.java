class staff
{
    String cname;
    String loc;
staff(String cname,String loc)
{
    this.cname = cname;
    this.loc = loc;
}
}
class nonteachingstaff extends staff{
    String nt_name;
    int id;
    String department;
    nonteachingstaff(String cname,String loc,String nt_name,int id)
    {
        super(cname, loc);
        this.nt_name  = nt_name;
        this.id = id;
    }
    nonteachingstaff(String cname,String loc,String nt_name,int id,String department)
    {
       
        this(cname, loc, nt_name, id);
        this.department = department;

    }

    public void  dispaly1()
    {
        System.out.println("person  name "+this.cname);
        System.out.println("person Location "+this.loc);
        System.out.println("nonteachinf staff name   "+this.nt_name);
        System.out.println("non teching staff ID "+this.id);
        System.out.println("Non teching staff department "+this.department);
}
}
class main2
{
    public static void main(String[] args) {
        nonteachingstaff n = new nonteachingstaff("ullas", "Talya", "V S", 23);
        n.dispaly1();
    }
}