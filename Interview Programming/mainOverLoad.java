class main1
{
    public void run(){}

    public static void main(Object ...args)
    {
        System.out.println("Super Object main");
    }
}

public class mainOverLoad extends main1 {
    public static void main(String[] args) {
        System.out.println("String main");

        Object[] arr = null;
        //main(null); calls string main recursively
        //main(arr)// calls object main
        
    }  

    @Override
    public void run(){}
    
    public static void main(Object ...args){
        System.out.println("Object main");
    }
}
