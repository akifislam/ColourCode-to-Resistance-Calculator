import java.util.Scanner;

import static java.lang.Math.pow;

class Resistance{
    int colour1;
    int colour2;
    int colour3;

    void SetColour(){
        System.out.printf("Brown = 1\nRed=2\nOrange=3\nYellow = 4\nGreen=5\n");
                System.out.printf("Blue = 6\nViolet=7\nGrey=8\nWhite=9\n");
                        Scanner input = new Scanner(System.in);

        colour1= input.nextInt();
        colour2= input.nextInt();
        colour3= input.nextInt();

    }
    void Value() {
        int result;
        result = ((colour1*10)+colour2)*(int)pow(10,colour3);
        System.out.printf("Your resistance is %d Ohm\n",result);
    }



}

class ResTest{

    public static void main(String args[])
    {

        Resistance sample = new Resistance();
        sample.SetColour();
        sample.Value();


    }
}