import java.util.Arrays;

public class personMain {
    public static void main(String[] args) {
        person person = new person();
        person.name = "Rayan Slim";
        person.nationality = "Canadian";
        person.DateOfBirth = "01/01/111";
        person.Passport = new String[]{person.name, person.nationality, person.DateOfBirth};
        person.SeatNumber = 5;

        System.out.println(person.name);
        System.out.println(person.nationality);
        System.out.println(person.DateOfBirth);
        System.out.println(Arrays.toString(person.Passport));
        System.out.println(person.SeatNumber);

    }
}
