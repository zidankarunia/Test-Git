
public class Main {
    public static void main(String[] args) {

        String[][] Students = { { "Marsani", "008124234325" }, { "Bill", "082243255" } };

        int i = 1;
        for (String[] student : Students) {
            System.out.println("Student " + i + ":");
            System.out.println("---------------------------");
            System.out.println("Name: " + student[0]);
            System.out.println("HP: " + student[1]);
            System.out.println("");

            i++;
        }

    }
}