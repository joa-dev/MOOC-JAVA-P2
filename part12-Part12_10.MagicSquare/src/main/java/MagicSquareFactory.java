
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int number = 1;
        int row = 0;
        int column = square.getWidth() / 2;
        square.placeValue(column, row, number);

        while (number < size * size) {

            row -= 1;
            column += 1;
            number += 1;

            if (row < 0) {
                row = square.getHeight() - 1;
            }

            if (column == square.getWidth()) {
                column = 0;
            }

            if (square.readValue(column, row) > 0) {
                row += 2;
                column -= 1;
                if (row > square.getHeight() - 1) {
                    row -= square.getHeight();
                }
                if (column < 0) {
                    column = square.getWidth() - 1;
                }
            }

            square.placeValue(column, row, number);
        }
        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }
}
