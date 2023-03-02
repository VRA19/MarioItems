public class Starman extends Item{

    @Override
    public void show(){
        setAppear(true);
        System.out.println("Block is cracked, Starman is appearing.");
    }

    /**
     * @param distance
     */

    public void run(int[] distance){
        if(getAppear()){
            int [] currentLocation = getLocation();
            System.out.println("Starman is at "+ currentLocation[0] + "," + currentLocation[1]);
            System.out.println("Starman is Jumping!");
            currentLocation[0] = currentLocation[0] + distance[0];
            currentLocation[1] = currentLocation[1] + distance[1];
            setLocation(currentLocation);
            System.out.println("Starman is at " + currentLocation[0] +"," + currentLocation[1]);

        }else{System.out.println("Starman is disappeared!");}
    }
}
