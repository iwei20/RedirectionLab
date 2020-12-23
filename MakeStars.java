import java.util.Scanner;

public class MakeStars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()) {
            Scanner sub = new Scanner(s.nextLine());
            while(sub.hasNext()) {
                String word = sub.next();
                for(int i = 0; i < word.length(); ++i) {
                    System.out.print('*');
                }
                if(sub.hasNext()) {
                    System.out.print(' ');
                }
            }
            sub.close();
            System.out.println();
        }
        s.close();
    }

}