/**
 * @author 65364565 Veerapat Pitchwannakham
 */

import java.util.Arrays;



public class App {
    public static void main(String[] args) throws Exception {
        Mushroom m1 = new Mushroom(Color.Red);
        FireFlower f1 = new FireFlower();
        Starman s1 = new Starman();

        m1.setAppear(true);
        s1.setAppear(false);

        m1.show();

        s1.run(new int[]{10,10});

        System.out.printf("Mushroom location: " + Arrays.toString(m1.getLocation()) + "\n");
        m1.run(new int[]{5,0});

        Day d = Day.SUNDAY;
        System.out.println(d.ordinal());
        if(d.ordinal() == 6 ){
            System.out.println("Happy Weekend");
        }
        else if(d.ordinal() >= 1 & d.ordinal() < 5){
            System.out.println("Happy Working Day");
        }
        else{
            System.out.println("Happy Sunday");
        }

        var x = 5;
        var age = "Twenty";
        age = "if";
    }
}
