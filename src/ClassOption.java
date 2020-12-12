// second portion of the final exam



//TYLER SCOTT WALLACE

import java.util.Scanner;

// Create a class that has two numbers as data members. Make sure there are getters and setters and
// a default constructor. (30 pts)
public class ClassOption {

    //i did both versions of the defaul constructor becuase i remember our conversation
    // where i was deducted points for leaving the default constructor empty as opposed to setting dataMembers equal to 0
    // i also overloaded the constructor to make the code easier to read and write, again i did it both ways in case you deduce for this wasn't sure
    // tried to call you to confirm which version your looking for.



private int numOne = 0;
private int numTwo = 0;

    @Override
    public String toString() {
        return "ClassOption{" +
                "numOne=" + numOne +
                ", numTwo=" + numTwo +
                '}';
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }
    public ClassOption(){

    }

    /*    public ClassOption(){
        this.numOne = 0;
        this.numTwo = 0;
    }*/

    public ClassOption(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public void printDataMembers(){
    System.out.println("number one: " + this.getNumOne() + " number two: " + this.getNumTwo()+ "\n" );
    }

    //5. Write a method in the class that will output the numbers between the two numbers that are in the class.
    public void printInbetweenDataMembersLowToHigh(){
        int low = 0;
        int high = 0;
        if (this.getNumTwo() > this.getNumOne()){
            high = this.getNumTwo();
            low = this.getNumOne() + 1;
        }
        else {
            low = this.getNumTwo();
            high = this.getNumOne();
        }
            for (int i = low; i < high; i++){
                System.out.println(i);
            }
    }

    //6. Let the user choose to output the number from low to high or high to low.
    public void printInbetweenDataMembersHighToLow(){
        int low = 0;
        int high = 0;

        if (this.getNumTwo() > this.getNumOne()){
            high = this.getNumTwo();
            low = this.getNumOne() + 1;
        }
        else {
            low = this.getNumTwo();
            high = this.getNumOne();
        }
        for (int i = high - 1; i >= low ; i--){
            System.out.println(i);
        }
    }

    public boolean askUserPrintHighOrPrintLow(){

        Scanner scanner = new Scanner(System.in);
        boolean highOrLow = false;
        String keepGoingAnswer = null;

        System.out.println("Would you like to print the object 'ClassOption1', containing (100,200) from low to high or high to low?" );
        keepGoingAnswer = scanner.next();

        if (keepGoingAnswer.charAt(0) == 'l' || keepGoingAnswer.charAt(0) == 'L') {
            highOrLow = true;
            //System.out.println(keepGoing);
        }
        else if (keepGoingAnswer.charAt(0) == 'h' || keepGoingAnswer.charAt(0) == 'H'){
            highOrLow = false;
            //System.out.println(keepGoing);
        }

        return highOrLow;


    }
/*    public boolean keepGoing(){
        boolean keepGoing = false;
        String keepGoingAnswer = null;

        System.out.println("add another object to the linked list?");
        keepGoingAnswer = scanner.next();

        if (keepGoingAnswer.charAt(0) == 'y' || keepGoingAnswer.charAt(0) == 'Y') {
            keepGoing = true;
            //System.out.println(keepGoing);
        }
        else {
            keepGoing = false;
            //System.out.println(keepGoing);
        }

        return keepGoing;
    }*/
}
/*
I DID BOTH VERSIONS OF THE DEFAULT CONSTRUCTOR, PLEASE CHOOSE WHICHEVER YOU'RE LOOKING FOR THAT DOESN'T TAKE POINTS
 */