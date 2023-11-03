// Alex Moore

import java.util.*;

public class AStar {
    // Sets paramaters of a 15x15 grid with 10% of the Nodes being unpathable
    private static final int SIZE = 15;
    private static final double BLOCKED_PROBABILITY = 0.1;
    private static int[][] grid = new int[SIZE][SIZE];

    public static void main(String[] args) {
        generateGrid();
        printGrid();

        Scanner scanner = new Scanner(System.in);
        // Loops through method to allow user to continue specifying start and goal nodes after paths have been found
        while (true) {
            System.out.println("Enter the starting node in format row col:");
            int startRow = scanner.nextInt();
            int startCol = scanner.nextInt();

            System.out.println("Enter the goal node in format row col:");
            int goalRow = scanner.nextInt();
            int goalCol = scanner.nextInt();

            // Node objects created based on user input
            Node startNode = new Node(startRow, startCol, 0);
            Node goalNode = new Node(goalRow, goalCol, 0);

            // A* algorithm finds the path from starting node to goal node
            List<Node> path = findPath(startNode, goalNode);
            // Prints path from given start and goal nodes if one exists
            if (path != null) {
                System.out.println("Path found:");
                // prints each instance of exploration until path is found
                visualizePath(path);
                System.out.println("END");
            } else {
                System.out.println("No path could be found.");
            }
        }
    }

    // generates random 15x15 grid with 10% of nodes being unpathable
    private static void generateGrid() {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = random.nextDouble() >= BLOCKED_PROBABILITY ? 0 : 1;
            }
        }
    }

    // . = pathable and # = unpathable
    private static void printGrid() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] == 0 ? "." : "#");
            }
            System.out.println();
        }
    }

    // finds path from start to goal node
    private static List<Node> findPath(Node start, Node goal) {
        // openList keeps track of unexplored nodes, sorted by F value of nodes
        PriorityQueue<Node> openList = new PriorityQueue<>(Comparator.comparingInt(Node::getF));
        // closedList keeps track of explored nodes
        Set<Node> closedList = new HashSet<>();

        start.setG(0);
        start.setH(manhattanDistance(start, goal));
        start.setF();
        openList.add(start);

        // adds node with lowest g value from openList to closedList
        while (!openList.isEmpty()) {
            Node current = openList.poll();
            closedList.add(current);

            // if node is equal to goal, builds a path to it
            if (current.equals(goal)) {
                return buildPath(current);
            }

            // finds neighbor nodes g, h, f values and adds to openList
            for (Node neighbor : getNeighbors(current)) {
                if (closedList.contains(neighbor)) {
                    continue;
                }

                int tentativeG = current.getG() + 1;
                if (!openList.contains(neighbor) || tentativeG < neighbor.getG()) {
                    neighbor.setParent(current);
                    neighbor.setG(tentativeG);
                    neighbor.setH(manhattanDistance(neighbor, goal));
                    neighbor.setF();

                    // no path found + openList is empty
                    if (!openList.contains(neighbor)) {
                        openList.add(neighbor);
                    }
                }
            }
        }

        return null;
    }

    // builds path from goal to start node
    private static List<Node> buildPath(Node node) {
        // Starts at goal node then adds each of the following parent nodes of parent
        List<Node> path = new ArrayList<>();
        while (node != null) {
            path.add(node);
            node = node.getParent();
        }
        Collections.reverse(path);
        return path;
    }

    // generates neighboring nodes of given node
    private static List<Node> getNeighbors(Node node) {
        List<Node> neighbors = new ArrayList<>();
        // movements of up, down, left, and right
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int[] direction : directions) {
            int newRow = node.getRow() + direction[0];
            int newCol = node.getCol() + direction[1];

            // checks if coordinates are valid and if grid cell is pathable (0)
            if (isValid(newRow, newCol) && grid[newRow][newCol] == 0) {
                neighbors.add(new Node(newRow, newCol, 0));
            }
        }

        return neighbors;
    }

    // checks if user input row and col are valid (15x15)
    private static boolean isValid(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE;
    }

    // calculates the Manhattan Distance between two nodes
    private static int manhattanDistance(Node a, Node b) {
        return Math.abs(a.getRow() - b.getRow()) + Math.abs(a.getCol() - b.getCol());
    }

    // visualizes node exploration from start to goal nodes
    private static void visualizePath(List<Node> path) {
        int[][] visualizationGrid = new int[SIZE][SIZE];
        for (Node node : path) {
            visualizationGrid[node.getRow()][node.getCol()] = 1;
            printVisualizationGrid(visualizationGrid);
            wait(500);
        }
    }

    // prints current state of node exploration. X = 1 . = 0
    private static void printVisualizationGrid(int[][] visualizationGrid) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (visualizationGrid[i][j] == 1) {
                    System.out.print("X");
                } else {
                    System.out.print(grid[i][j] == 0 ? "." : "#");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

