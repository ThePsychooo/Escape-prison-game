package Test.AdventureGameTest.src.org.academiadecodigo.apiores.Commands;

public enum Directions {



    GO_NORTH("n"),
    GO_SOUTH("s"),
    GO_EAST("e"),
    GO_WEST("w");


    private String input;

    Directions(String input){
        this.input = input;

    }

    public String getInput() {
        return this.input;
    }

}
