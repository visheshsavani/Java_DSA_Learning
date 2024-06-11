import java.util.Arrays;

public class BankersAlgorithm {

    // Number of processes and resources
    private int numProcesses;
    private int numResources;

    // Maximum demand matrix (Max)
    private int[][] max;

    // Currently allocated resources matrix (Allocation)
    private int[][] allocation;

    // Available resources vector (Available)
    private int[] available;

    // Need matrix (calculated as Max - Allocation)
    private int[][] need;

    public BankersAlgorithm(int[][] max, int[][] allocation, int[] available) {
        this.numProcesses = max.length;
        this.numResources = available.length;
        this.max = max;
        this.allocation = allocation;
        this.available = available;
        this.need = new int[numProcesses][numResources];

        // Calculate the Need matrix
        for (int i = 0; i < numProcesses; i++) {
            for (int j = 0; j < numResources; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
    }

    // Check if the system is in a safe state
    public boolean isSafeState() {
        int[] work = Arrays.copyOf(available, numResources);
        boolean[] finish = new boolean[numProcesses];

        // Initialize finish array
        Arrays.fill(finish, false);

        int count = 0;
        while (count < numProcesses) {
            boolean found = false;
            for (int i = 0; i < numProcesses; i++) {
                if (!finish[i]) {
                    boolean canExecute = true;
                    for (int j = 0; j < numResources; j++) {
                        if (need[i][j] > work[j]) {
                            canExecute = false;
                            break;
                        }
                    }
                    if (canExecute) {
                        // Release resources
                        for (int j = 0; j < numResources; j++) {
                            work[j] += allocation[i][j];
                        }
                        finish[i] = true;
                        found = true;
                        count++;
                    }
                }
            }
            if (!found) {
                return false; // No process found that can be executed
            }
        }
        return true; // All processes executed successfully
    }

    public static void main(String[] args) {
        int[][] max = {{7, 5, 3}, {3, 2, 2}, {9, 0, 2}, {2, 2, 2}, {4, 3, 3}};
        int[][] allocation = {{0, 1, 0}, {2, 0, 0}, {3, 0, 2}, {2, 1, 1}, {0, 0, 2}};
        int[] available = {3, 3, 2};

        BankersAlgorithm bankersAlgorithm = new BankersAlgorithm(max, allocation, available);

        if (bankersAlgorithm.isSafeState()) {
            System.out.println("System is in a safe state.");
        } else {
            System.out.println("System is not in a safe state.");
        }
    }
}

