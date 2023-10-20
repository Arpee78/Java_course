package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private String nameOfSolver;

    public RightAnswer(String nameOfSolver) {
        this.nameOfSolver = nameOfSolver;
    }

    public String getNameOfSolver() {
        return nameOfSolver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RightAnswer that = (RightAnswer) o;

        return Objects.equals(nameOfSolver, that.nameOfSolver);
    }

    @Override
    public int hashCode() {
        return nameOfSolver != null ? nameOfSolver.hashCode() : 0;
    }
}
