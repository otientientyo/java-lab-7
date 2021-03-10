public class Bicycle{
    boolean gear;
    public Bicycle(String vId, String vName, int tyres, float price, boolean gear);

    super( vId, vName, tyres, price);
    gear=gear;
}
@Override
public void printDetails(){
    if(gear==true)
        System.out.println("Geared: Yes");
    else
        System.out.println("Geared: No");
}

    public static void main(String[] args) {
        TwoWheeler obj = new    Bicycle(args[0], args[1], Integer. parseInt(args[2]), args[3], args[4]);
        obj.printDetails();
    }