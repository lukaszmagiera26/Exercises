package quizzshow;

import java.util.Random;
import java.util.Scanner;

public class Facade {

    Support support = new Support();
    Syso syso = new Syso();

    private int Random4Host1 = 0;
    private int Random4Host2 = 0;
    private int answerInt = 0;
    private String answerString = "";
    private int wingates = 0;
    Scanner in = new Scanner(System.in);
    Random r = new Random();

    public void run() {

        while (true) {
            wingates = r.nextInt(3) + 1;
            syso.print("info for host - winning gates " + wingates);
            syso.print("Which gate You choose: 1, 2, 3? ");
            answerString = in.nextLine();

            while (true) {
                if (answerString.equals("1") || answerString.equals("2") || answerString.equals("3")) {
                    try {
                        answerInt = Integer.parseInt(answerString);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println(e); } }
                syso.print("Error!(" + answerString + ") Please enter a number of gate: ");
                answerString = in.nextLine(); }
            syso.print("You choose gate nr " + answerInt);

            do {
                Random4Host1 = r.nextInt(3) + 1;
            }
            while (Random4Host1 == wingates || Random4Host1 == answerInt);
            do {
                Random4Host2 = r.nextInt(3) + 1;
            }
            while ((Random4Host2 == Random4Host1 || Random4Host2 == answerInt));

            do {
                if (answerInt == wingates) {
                    hostInfo();
                    answerString = in.nextLine();
                    support.support4answer(answerString, Random4Host2, answerInt, wingates);
                } else {

                    hostInfo();
                    answerString = in.nextLine();
                    support.support4answer(answerString, Random4Host2, answerInt, wingates);
                }
            } while (answerString == "");

            syso.print(" official result = \n win= " + support.getWin() + "\n loose= " + support.getLoose());
            syso.print(" All Winn =  " + support.getNumberAllWinn() + " \n All Loose= "
                    + support.getNumberAllLoose());

            support.resetResult(); } }

    public void hostInfo() {
        syso.print("I tell You in gates " + Random4Host1 + " is empty");
        syso.print("do You wont to switch for " + Random4Host2 + " y/n ?");
    }

}








