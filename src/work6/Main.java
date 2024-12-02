package work6;
/**
 * Main class which creates a data table, a context for the view, and changes the chart type for the table view
 */
public class Main {
    /**
     * The main method which creates the table, the context, represents the table and changes the chart type to represent the table
     */
    public static void main(String[] args) {
        String[][] table = {
                {"A", "8"},
                {"B", "3"},
                {"C", "5"},
                {"D", "9"}
        };
        Context table1 = new Context(table, new ConcreteStrategy1());
        table1.show();
        System.out.println();
        table1.setStrategy(new ConcreteStrategy2());
        table1.show();
    }
}