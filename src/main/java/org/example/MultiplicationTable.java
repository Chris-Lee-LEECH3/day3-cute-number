package org.example;

public class MultiplicationTable {

    public String create(int startNumber, int endNumber) {
        if (!isValid(startNumber, endNumber)) {
            return null;
        }

        return generateTable(startNumber, endNumber);
    }

    public boolean isValid(int startNumber, int endNumber) {
        if (!isInRange(startNumber) || !isInRange(endNumber)) {
            return false;
        }

        if (isStartNumGreaterThanEndNum(startNumber, endNumber)) {
            return false;
        }

        return true;
    }


    public boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public boolean isStartNumGreaterThanEndNum(int startNumber, int endNumber) {
        return startNumber > endNumber;
    }

    public String generateTable(int startNumber, int endNumber) {
        StringBuilder table = new StringBuilder();

        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= i; j++) {
                table.append(generateExpression(i, j));
            }
            table.append("\n");
        }

        return table.toString();
    }

    public String generateExpression(int i, int j) {
        return j + " * " + i + " = " + (i * j) + "\t";
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        String table = multiplicationTable.create(1, 5);
        System.out.println(table);

        // Test invalid cases
        System.out.println(multiplicationTable.create(0, 5));
        System.out.println(multiplicationTable.create(5, 1001));
        System.out.println(multiplicationTable.create(10, 5));
    }

}
