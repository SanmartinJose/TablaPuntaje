
package ec.edu.espe.scoretable.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Player {
    private String name;
    private int score;
    private int time;

    public Player(String name, int score, int time) {
        this.name = name;
        this.score = score;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", score=" + score + ", time=" + time + '}';
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }
}
