package work6;
/**
 * Class what is a context to represent the table as a specific chart and contains functions {@code setStrategy}, {@code show}
 *
 * @author Bykovets Sergey
 */
public class Context {
    /**
     * The table itself which will be presented as a table
     */
    private String[][] table;
    /**
     * Type of chart in the form of which the table will be presented
     */
    private Strategy strategy;
    /**
     * Constructs a new context with table and chart type to represent
     *
     * @param table table that will be presented as a diagram
     * @param strategy type of chart in the form of which the table will be presented
     */
    public Context(String[][] table, Strategy strategy) {
        this.table = table;
        this.strategy = strategy;
    }
    /**
     * Function {@code setStrategy} which changes the chart type to represent the table
     *
     * @param strategy new chart type for table view
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    /**
     * Function {@code show} which represents a table as a chart of a certain type
     */
    public void show() {
        strategy.showtable(table);
    }
}
