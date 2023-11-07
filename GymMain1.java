public class Gym {

    boolean member;
    public String name;
    private String Trainer;
    Gym()
    {
        member=false;
        name="";
        Trainer="Nattu";
    }

    Gym(String name)
    {
        member=true;
        this.name=name;
        Trainer="Nattu";
    }

    public void Ismember()
    {
        System.out.println(this.name+"You are not registered. Do the payment and complete registeration \n1.600rs -Without Trainer \n2.1000rs -With Trainer!(Mention Diet Plan)");
    }
    public void Ismember(int payment)
    {
        System.out.println("payment of "+payment+" is done "+this.name+ "is regsitered!(Without Trainer)");
    }
    public void Ismember(int payment,String diet)
    {
        System.out.println("payment of "+payment+" is done.Diet Plan:"+diet);
    }

}
public class OutsideGym  extends Gym{
    void AccessTrainer()
    {
        System.out.println("Trainer is not available"+Trainer);
    }
}
public class GymMain1{
    public static void main(String args[])
    {
        // Gym obj=new Gym();
        // obj.Ismember();
        Gym obj1=new Gym("hiran");
        // obj1.Ismember(600);
        obj1.Ismember(1000,"Weight Gain");
        OutsideGym obj2=new OutsideGym();
        // obj2.AccessTrainer();
    }
}
