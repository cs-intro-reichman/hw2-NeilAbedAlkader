public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int timeInMinutes = hours * 60 + minutes + minutesToAdd;
        int newMinutes = timeInMinutes%60;
        int newHours = ((timeInMinutes-newMinutes)/60)%24;
        System.out.println(newHours + " : " + newMinutes);



    }
}
