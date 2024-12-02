package work6;
/**
 * Class what implements the interface {@link Strategy}, is a table view as a bar chart and contains function {@code showtable}
 *
 * @author Bykovets Sergey
 */
public class ConcreteStrategy1 implements Strategy {
    /**
     * Function {@code showtable} which represents a table as a colored bar chart and writes about it
     *
     * @param table table that will be presented as a diagram
     */
    @Override
    public void showtable(String[][] table) {
        System.out.println("Лінійчаста діаграма:");
        String[] colors = {
                "\u001B[31m",
                "\u001B[32m",
                "\u001B[34m",
                "\u001B[33m"
        };
        for (int i = 0; i < table.length; i++) {
            String label = table[i][0];
            int value = Integer.parseInt(table[i][1]);
            String color = colors[i % colors.length];
            System.out.print(color + label + " ");
            System.out.println("█".repeat(value) + "\u001B[0m");
        }
    }
}

