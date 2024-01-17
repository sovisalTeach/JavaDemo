import TaskEight.*;
public class Main {
    public static void main(String[] args) {
        OtherBank obj = new OtherBank("Sovisal","chendasovisal@gmail.com","111222333",1000, "ABA");
        obj.checkBalance();
        obj.withdraw(500);
        obj.checkBalance();
    }
}