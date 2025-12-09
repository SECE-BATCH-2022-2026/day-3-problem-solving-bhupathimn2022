import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] inp = new String[n];
        for (int i = 0; i < n; i++) {
            inp[i] = sc.nextLine();
        }

        int index = sc.nextInt();

        String res = "";

        for (String s : inp) {
            if (index <= s.length()) {
                res = res + s.charAt(index - 1);
            } else {
                res = res + "$";
            }
        }

        System.out.println(res);
    }
}
