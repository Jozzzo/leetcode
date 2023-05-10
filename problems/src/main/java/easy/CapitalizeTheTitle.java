package easy;

public class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        String input = title.toLowerCase();
        StringBuilder result = new StringBuilder();
        String[] str = input.split(" ");
        int i;
        for (i = 0; i < str.length; i++) {
            if (str[i].length() <= 2) {
                result.append(str[i]).append(" ");
            } else {
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
                result.append(str[i]).append(" ");
            }
        }
        return String.valueOf(result.substring(0, result.length() - 1));
    }

    public static void main(String[] args) {
        // Creating an object class inside main() method
        CapitalizeTheTitle obj = new CapitalizeTheTitle();
        String title = "First leTTeR of EACH Word";

        // Calling the class object inside main() method
        System.out.println(obj.capitalizeTitle(title));
    }
}
