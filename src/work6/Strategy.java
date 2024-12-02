package work6;
/**
 * Interface for classes {@link ConcreteStrategy1}, {@link ConcreteStrategy2} that represent specific types of diagrams in the form of which a table can be presented,
 * contains a function {@code showtable} which represents a table as a chart
 *
 * @author Bykovets Sergey
 */
public interface Strategy {
    /**
     * Function {@code showtable} which represents a table as a chart
     *
     * @param table table that will be presented as a diagram
     */
    void showtable(String[][] table);
}
