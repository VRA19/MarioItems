public class Mushroom extends Item {
    Color mushroomColor = Color.Green;

    public Mushroom(Color c){
        this.mushroomColor = c;
    }

    @Override
    public void show(){
        setAppear(true);
        System.out.printf("Block is cracked! %s Mushroom is appearing.\n",this.mushroomColor);
        if(this.mushroomColor == Color.Green){//this.mushroomColor.equals("Green")
            System.out.println("Gain 1 exrtra life");
        }
        else if(this.mushroomColor == Color.Red){
            System.out.println("Break block");
        }
    }

    public void setMushroomColor(Color mushroomColor){
        this.mushroomColor = mushroomColor;
    }

    /**
     * @param distance
     */

    public void run(int[] distance){
        if(getAppear()){
            int [] currentLocation = getLocation();
            System.out.println("Mushroom is at "+ currentLocation[0] + "," + currentLocation[1]);
            System.out.println("Mushroom is running!");
            currentLocation[0] = currentLocation[0] + distance[0] + 5;
            currentLocation[1] = currentLocation[1] - distance[1];
            setLocation(currentLocation);
            System.out.println("Mushroom is at " + currentLocation[0] +"," + currentLocation[1]);

        }else{System.out.println("Mushropom is disappear!");}
    }
    
}
