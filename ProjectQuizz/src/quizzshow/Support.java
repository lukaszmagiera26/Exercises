package quizzshow;

public class Support {


    private int win = 0;
    private int numberAllWinn = 0;
    private int loose = 0;
    private int numberAllLoose = 0;
    Syso syso = new Syso();


    void support4answer(String yesOrNo, int gateAfterYESDecision, int gateAfterNODecision, int wingate) {
        switch (yesOrNo) {
            case "y":
                supporWinOrLoose4Yes(gateAfterYESDecision, wingate);
                break;
            case "n":
                supporWinOrLoose4Yes(gateAfterNODecision, wingate);
                break;
            default:
                yesOrNo = "";
        }
    }

    void supporWinOrLoose4Yes(int gateAfterDecision, int wingate) {
        if (gateAfterDecision == wingate) {
            wygrywanie();
        } else {
            przegrywanie();
        } }

    public void wygrywanie() {
        syso.print("win");
        win = 1;
        numberAllWinn++;
    }

    public void przegrywanie() {
        syso.print("loose");
        loose = 1;
        numberAllLoose++;
    }

    public void resetResult() {
        win = 0;
        loose = 0;
    }


    public int getNumberAllWinn() {
        return numberAllWinn;
    }

    public int getNumberAllLoose() {
        return numberAllLoose;
    }

    public int getWin() {
        return win;
    }

    public int getLoose() {
        return loose;
    }


}
