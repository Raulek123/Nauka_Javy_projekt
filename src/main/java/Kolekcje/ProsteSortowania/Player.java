package Kolekcje.ProsteSortowania;

import java.util.Comparator;
import java.util.Objects;

public class Player implements Comparable<Player> {
    private String pseudonim;
    private int score;

    public Player(String pseudonim, int score) {
        this.pseudonim = pseudonim;
        this.score = score;
    }

    public String getPseudonim() {
        return pseudonim;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {
        if(score > o.score) {
            return -1;
        } else if (score < o.score) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return  "pseudonim='" + pseudonim + '\'' +
                ", score=" + score +
                '}';
    }

    public static class PlayerNameComparator implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            return o1.getPseudonim().compareToIgnoreCase(o2.getPseudonim());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score && Objects.equals(pseudonim, player.pseudonim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pseudonim, score);
    }
}
