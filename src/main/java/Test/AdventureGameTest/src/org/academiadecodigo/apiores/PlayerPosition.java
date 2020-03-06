package Test.AdventureGameTest.src.org.academiadecodigo.apiores;

public class PlayerPosition {

    private int currentWidth;
    private  int currentHeight;

    Room room = new Room();


    PlayerPosition(int currentWidth, int currentHeight){
        this.currentWidth = currentWidth;
        this.currentHeight = currentHeight;
    }

    public void updatePosition (String command){

        if (command.equals("n")){
            if(currentHeight == 1){
                System.out.println("There's a wall in front of you! You can't advance!");
            } else {
               currentHeight--;
                System.out.println("You moved North.");
            }
        }

        if (command.equals("s")){
            if(currentHeight == room.roomHeight){
                System.out.println("There's a wall in front of you! You can't advance!");
            } else {
                currentHeight++;
                System.out.println("You moved South.");
            }
        }

        if (command.equals("e")){
            if(currentWidth == room.roomWidth){
                System.out.println("There's a wall in front of you! You can't advance!");
            } else {
                currentWidth++;
                System.out.println("You moved East.");
            }
        }

        if (command.equals("w")){
            if(currentWidth == 1){
                System.out.println("There's a wall in front of you! You can't advance!");
            } else {
                currentWidth--;
                System.out.println("You moved West.");
            }
        }
    }

    public int getCurrentHeight() {
        return currentHeight;
    }

    public int getCurrentWidth() {
        return currentWidth;
    }
}
