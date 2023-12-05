import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TaskThree obj = new TaskThree();
        String str1= "idNumber: 160363311";
        String str2= "dob: 01/01/1995";
        String str3= "gender: M";
        String str4= "lastNameEn: MEN";
        String str5= "firstNameEn: CHENDA";
        String str6= "expiredDate: 21/06/2024";
//        System.out.println(obj.exerciseOne(str6));

        String str = "IDKHM1603633111<<<<<<<<<<<<<<<,9501016M2406215KHM<<<<<<<<<<<6,MEN<<CHENDA<<<<<<<<<<<<<<<<<<<";
        String[] result = obj.exerciseTwo(str);
        System.out.println(Arrays.toString(result));




    }
}