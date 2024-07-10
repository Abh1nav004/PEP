import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class NQueensVisualizer extends JFrame {
    private int[] board;
    private int size;
    private JPanel boardPanel;

    public NQueensVisualizer(int size) {
        this.size = size;
        board = new int[size];
        Arrays.fill(board, -1);

        setTitle("N-Queens Visualizer");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boardPanel = new JPanel(new GridLayout(size, size));
        add(boardPanel);
        initializeBoard();
        setVisible(true);
    }

    private void initializeBoard() {
        boardPanel.removeAll();
        for (int i = 0; i < size * size; i++) {
            JLabel label = new JLabel("", SwingConstants.CENTER);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            boardPanel.add(label);
        }
        updateBoard();
    }

    private void updateBoard() {
        boardPanel.removeAll();
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                JLabel label = new JLabel("", SwingConstants.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                if (board[row] == col) {
                    label.setText("Q");
                    label.setForeground(Color.RED);
                }
                boardPanel.add(label);
            }
        }
        boardPanel.revalidate();
        boardPanel.repaint();
        sleep(500);
    }

    public void solve() {
        solve(0);
    }

    private boolean solve(int row) {
        if (row == size) {
            return true;
        }

        for (int col = 0; col < size; col++) {
            board[row] = col;
            updateBoard();

            if (isSafe(row, col) && solve(row + 1)) {
                return true;
            }

            // Backtrack
            board[row] = -1;
            updateBoard();
        }

        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < row; i++) {
            int otherCol = board[i];
            if (otherCol == col || Math.abs(otherCol - col) == row - i) {
                return false;
            }
        }
        return true;
    }

    private void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the board: ");
        int n = scanner.nextInt();
        scanner.close();

        SwingUtilities.invokeLater(() -> {
            NQueensVisualizer visualizer = new NQueensVisualizer(n);
            visualizer.solve();
            JOptionPane.showMessageDialog(null, "All cases shown.");
        });
    }
}
