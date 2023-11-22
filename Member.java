abstract class Gym3 {
    final int fees=500;
    abstract void Barbell();
    abstract void Dumnbell();
    void Name()
    {
        System.out.println("War Gym");
    }
}
class Member extends Gym3
{
    void Barbell()
    {
        System.out.println("Barbell in use");
    }
    void Dumnbell()
    {
        System.out.println("Dumbell in use");
    }
    void Name()
    {
        super.Name();
    }
    void Monthlyfees()
    {
        fees=600; //You cannot assign value since it is final
    }
    public static void main(String args[])
    {
        Member use=new Member();
        use.Barbell();
        use.Name();
    }
}
