public class Item {
    private String name;
    private boolean appear;
    private int[] location = new int[]{0,0} ;

    public int [] getLocation(){
        return location;
    }

    public String getName(){
        return this.name;
    }

    public boolean getAppear(){
        return this.appear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAppear(boolean appear){
        this.appear = appear;
    }

    public void setLocation (int[] location){
        this.location = location;
    }

    public void show(){
        setAppear(true);
        System.out.println("Block is cracked, item is appearing.");
        
    }
    /**
     * 
     * @param distance between current location to new location
     * 
     */
    public void run(int[] distance){
        if(getAppear()){
            int [] currentLocation = getLocation();
            System.out.println("Item is at "+ currentLocation[0] + "," + currentLocation[1]);
            System.out.println("Item is running!");
            currentLocation[0] = currentLocation[0] + distance[0];
            currentLocation[1] = currentLocation[1] + distance[1];
            setLocation(currentLocation);
            System.out.println("Item is at " + currentLocation[0] +"," + currentLocation[1]);

        }else{System.out.println("Item is disappeared!");}
    }
}
