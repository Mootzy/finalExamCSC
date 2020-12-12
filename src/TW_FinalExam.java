import java.util.*;
import java.io.*;

//TYLER SCOTT WALLACE
public class TW_FinalExam {
    public static void main(String[] args) {


        //QUESTION 3B before sort
        int[] arrayForSort = {21,59,28,5,57,71,85,6,40,7,31,49,69,64,52,53,54,8,12};
        bubbleSort(arrayForSort);
        //after-sort: [5, 6, 7, 8, 12, 21, 28, 31, 40, 49, 52, 53, 54, 57, 59, 64, 69, 71, 85]


        //used for question 7 on recursion
        String s = "final";
        String a = "aaaapple";
        int number = countA(s, 0);
        System.out.println ("There are " + number + " (a)s in " + s + "\n" );

    System.out.println("SECOND PORTION OF FINAL EXAM" + "\n");

        /**
         * SECOND PORTION OF EXAM, SELECTED ClassOption
         */




        //2. Create an object and output the two data members in the object. (30 pts)
        ClassOption classOption = new ClassOption();
        classOption.setNumOne(10);
        classOption.setNumTwo(20);
        System.out.println("First object made with default constructor and Set methods: ");
        classOption.printDataMembers();




        // 3. Write a second constructor that takes two numbers as parameters.  Create an object using
        //    the constructor. (20 pts)
        ClassOption classOption1 = new ClassOption(100,200);
        System.out.println("second object used making constructor with parameters: ");
        classOption1.printDataMembers();

        classOption1.printInbetweenDataMembersLowToHigh();
        classOption1.printInbetweenDataMembersHighToLow();


        //4. Create an array of objects or a linked list of objects.
        //   Have the user enter values for each new object.
        //   Stop when the array is full or the user indicates they no longer want to enter numbers by entering two zeros
       LinkedList<ClassOption> userList = addObjectsToLinkedList();
        printLinkedList(userList);


        //5. Write a method in the class that will output the numbers between the two numbers that are in the class.
        //   Output the numbers between the two numbers.
        classOption1.printInbetweenDataMembersLowToHigh();

        //6. Let the user choose to output the number from low to high or high to low.  (20 pts)
        //classOption1.printInbetweenDataMembersHighToLow();
        printNumbersHighOrLow(classOption1);
    }








    //used for question 3b
    public static void bubbleSort(int[] arrayToSort){
    System.out.println("Before sort" + Arrays.toString(arrayToSort));

        for (int i = 0; i < arrayToSort.length; i++){
            for (int j = 1; j < arrayToSort.length; j ++){
                if (arrayToSort[j] < arrayToSort[j - 1]){
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j - 1];
                    arrayToSort[j-1] = temp;
                }
            }
        }
    System.out.println("After sort " + Arrays.toString(arrayToSort));
    }



    //used for question 7; recursive method to count number of "a"'s in string
    public static int countA(String word, int index)
    {
        int count = 0;
        if (index < word.length ( ))
        {
            System.out.print ( index + " " );
            System.out.println ( word.charAt ( index ) );
            if ( word.charAt ( index ) == 'a' )
            {
                count = 1 + countA(word, index + 1 );
            }
            else
            {
                count = countA(word, index+1);
            }
        }
        return count;
    }


    public static LinkedList addObjectsToLinkedList(){

        LinkedList<ClassOption> newList = new LinkedList<>();

    while(askUserToKeepGoing() == true) {
            newList.add(askUserForDataMembers());
        }
        return newList;
    }

    public static boolean askUserToKeepGoing(){
        Scanner scanner = new Scanner(System.in);
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
    }

    public static ClassOption askUserForDataMembers(){
        Integer answerOne;
        Integer answerTwo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("datamember one? (integer)");
        answerOne = scanner.nextInt();

        System.out.println("datamember two? (integer)");
        answerTwo = scanner.nextInt();

        ClassOption classOption = new ClassOption(answerOne, answerTwo);

    System.out.println("testing what the value of the datamembers are registering as: ");
    classOption.printDataMembers();


        return classOption;
    }

    public static void printLinkedList(LinkedList<ClassOption> list) {
        for (int i =0; i <list.size();i++){
            System.out.print(list.get(i).toString());
        }
    }

    public static boolean askUserHighOrLowPrint(){
        Scanner scanner = new Scanner(System.in);
        //low = true
        boolean highLow = false;
        String keepGoingAnswer = null;


        System.out.println(
                "This will print the ClassOption instance named 'classOption1' containing data members 100 & 200,");
        System.out.println("Would you like to print from low to high or high to low? " +
                "Please enter either 'high to low' " +
                "or even simply 'low' for 'low to high' " +
                "caps will be ignored");

        keepGoingAnswer = scanner.next();

        if (keepGoingAnswer.charAt(0) == 'l' || keepGoingAnswer.charAt(0) == 'L') {
            highLow = true;
            //System.out.println(keepGoing);
        }
        else if (keepGoingAnswer.charAt(0) == 'h' || keepGoingAnswer.charAt(0) == 'H' ){
            highLow = false;
            //System.out.println(keepGoing);
        }
        return highLow;
    }


    public static void printNumbersHighOrLow(ClassOption classOption1){

        if(askUserHighOrLowPrint() == true) {
            classOption1.printInbetweenDataMembersLowToHigh();
        }
        else {
            classOption1.printInbetweenDataMembersHighToLow();
        }

    }


  /**
   * To get credit you must write your name in the comments section at the top of your program. The
   * only comment required is your name at the top of every file.
   */
}
