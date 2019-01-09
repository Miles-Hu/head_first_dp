package test1.a10state;

/**
 * @author Miles Hoo
 * @version v1.0.0
 * @since 19-1-7 下午7:02
 */
public class CandyDispenseMachine {

    private State noQuaterState;
    private State hasQuaterState;
    private State soldState;
    private State soldOutState;
    private State winner;

    private State currentState;
    private int count;

    public CandyDispenseMachine(int count) {
        noQuaterState = new NoQuaterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winner = new Winner(this);
        if (count > 0) {
            currentState = noQuaterState;
            this.count = count;
        }
    }

    public void insertQuater() {
        currentState.insertQuater();
    }

    public void returnQuater() {
        currentState.returnMoney();
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void releaseCandy() {
        System.out.println("Candy just released!");
        if (count > 0) {
            count--;
        }
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public void setNoQuaterState(State noQuaterState) {
        this.noQuaterState = noQuaterState;
    }

    public State getHasQuaterState() {
        return hasQuaterState;
    }

    public void setHasQuaterState(State hasQuaterState) {
        this.hasQuaterState = hasQuaterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getWinner() {
        return winner;
    }

    public void setWinner(State winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "CandyDispenseMachine{" +
                "count=" + count +
                '}';
    }
}
