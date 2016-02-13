package sudoku.csp;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by youngbinkim on 2/13/16.
 */
// tile of the board
public class Tile {
    private Set<Integer> domain = new HashSet<>();
    private static int MAX = 9;
    private int val;
    private int row;
    private int col;
    private int secNo;

    public int getNumUNeighbours() {
        return numUNeighbours;
    }

    public void decrementNumUNeighbours() {
        numUNeighbours--;
    }

    private int numUNeighbours = 20; // number of unassigned neighbours..

    public boolean isAssigned() {
        return assigned;
    }

    private boolean assigned; // if value was already assigned to this value

    public Tile(int val, int row, int col) {
        this.val = val;

        if (val == 0) {
            for (int i = 1 ; i <= MAX; i++) {
                domain.add(i);
            }
        } else {
            setAssigned();
        }
        this.row = row;
        this.col = col;
    }

    public int getVal() {
        return val;
    }

    public void setAssigned() {
        this.assigned = true;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Set<Integer> getDomain() {
        return domain;
    }

    public void removeDomain(int val) {
        domain.remove(val);
    }

    public void setSecNo(int secNo) {
        this.secNo = secNo;
    }

    public int getSecNo() {
        return secNo;
    }

    public void setVal(int val) {
        this.val = val;
    }
}