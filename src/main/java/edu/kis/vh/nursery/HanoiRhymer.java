package edu.kis.vh.nursery;

/**
 * HanoiRhymer to klasa dziedzicząca DefaultCountingOutRhymer i przysłania metodę countIn.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * totalRejected to liczba odrzuconych numerów.
     */
    private int totalRejected = 0;

    /**
     *  reportRejected to metoda zwracająca liczbe całkowitą totalRejected.
     * @return totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
