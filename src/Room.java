/**
 * Created by adam on 9/2/16.
 */
public class Room implements iRoom {

    public void welcome(){
        System.out.println("you walking into a room.");
        System.out.println("its quiet... too quiet.");
    } //description of the room

    public void decision(){

        System.out.println("do you go right, left, or forward?");
        System.out.print(">");

        Choice choice = new Choice();


    } //calling the class for userinput and saving

    public void fate(){}  //did you die?

}
