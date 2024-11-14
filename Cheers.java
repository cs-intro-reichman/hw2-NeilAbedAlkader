import javax.print.DocFlavor;

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String str = args[0];
            int count = 0;
            int count2 = 0;
            boolean flag = true;
            String a = "AEFHILMNORSX";
            while(str.length()!=count){
                while(a.length()!=count2){
                    if(str.charAt(count) == a.charAt(count2)) {
                        flag = false;
                        break;
                    }
                    count2++;
                }
                if(flag == false)
                System.out.println("Give me an " +  str.charAt(count) + ": "+str.charAt(count)+"!" );

                else
                    System.out.println("Give me a " +  str.charAt(count) + ": "+str.charAt(count)+"!" );

                flag = true;
                count++;
            }
            System.out.println("What does that spell?");

            for(int i =0; i < 3; i++)
            System.out.println(str + "!!!");


        }
}
