public class TaskThree {
    public String exerciseOne(String str){
        String[] result = new String[2];
        result = str.split(":");
        return result[1].trim();
    }

    public String[] exerciseTwo(String str){
        String[] result = new String[6];
        String[] temp = str.split(",");
        //Get Id Card
        result[0] = temp[0].substring(5,14);

        //Get date of birth
        String dobYear = (Integer.parseInt(temp[1].substring(0,2))<=99 || Integer.parseInt(temp[1].substring(0,2))>=25)?"19"+temp[1].substring(0,2):"20"+temp[1].substring(0,2);
        String dobMonth = temp[1].substring(2,4);
        String dobDay = temp[1].substring(4,6);
        result[1] = dobDay+"/"+dobMonth+"/"+dobYear;

        //Get Gender
        String gender = String.valueOf(temp[1].charAt(7));
        result[2] = gender;

        //Get ExpiredDate
        String expYear = "20"+temp[1].substring(8,10);
        String expMonth = temp[1].substring(10,12);
        String expDay = temp[1].substring(12,14);
        result[5] = expDay+"/"+expMonth+"/"+expYear;

        //Get lastName and firstName
        String[] name = temp[2].split("<<");
        String lastName = name[0];
        result[3] = lastName;
        String firstName = name[1];
        result[4] = firstName;

        return result;
    }
}
