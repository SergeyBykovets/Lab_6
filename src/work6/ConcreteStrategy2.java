package work6;
/**
 * Class what implements the interface {@link Strategy}, is a table view as a columnar chart and contains function {@code showtable}
 *
 * @author Bykovets Sergey
 */
public class ConcreteStrategy2 implements Strategy{
    /**
     * Function {@code showtable} which represents a table as a colored columnar chart and writes about it
     *
     * @param table table that will be presented as a diagram
     */
    @Override
    public void showtable(String[][] table) {
        System.out.println("Стовпчаста діаграма:");
        String[] colors = {
                "\u001B[31m",
                "\u001B[32m",
                "\u001B[34m",
                "\u001B[33m"
        };
        int max = 0;
        for (String[] row : table) {
            max = Math.max(max, Integer.parseInt(row[1]));
        }
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < table.length; j++) {
                int value = Integer.parseInt(table[j][1]);
                String color = colors[j % colors.length];
                if (value >= i) {
                    System.out.print(color + " █ " + "\u001B[0m");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int j = 0; j < table.length; j++) {
            System.out.print(colors[j % colors.length] + " " + table[j][0] + " " + "\u001B[0m");
        }
        System.out.println();
    }
}
