package project;

/*
        Author: Oleg Poliakov
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    static int[][] maze4 = {
            { 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 0 , 0 , 0 , 1 , 1 , 1 , 1 , 1 , 0 , 0 , 0 , 0 , 1 , 0 , 2 , 1 },
            { 1 , 0 , 1 , 0 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 0 , 1 , 3 , 1 , 1 },
            { 1 , 0 , 1 , 0 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 0 , 1 , 0 , 1 , 1 },
            { 1 , 4 , 1 , 0 , 0 , 0 , 1 , 1 , 1 , 0 , 1 , 0 , 0 , 1 , 0 , 0 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 1 , 0 , 1 , 0 , 1 , 1 , 1 , 0 , 1 },
            { 1 , 9 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 0 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 },

    };

    static int[][] maze1 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 1},
            {1, 9, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1},
    };

    static int[][] maze2 = {
            { 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 },
            { 1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 0 , 1 },
            { 1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 0 , 1 },
            { 1 , 0 , 1 , 2 , 0 , 0 , 0 , 0 , 1 , 1 , 0 , 1 },
            { 1 , 0 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 0 , 1 },
            { 1 , 0 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 0 , 1 },
            { 1 , 0 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 0 , 1 },
            { 1 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 1 , 1 , 0 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 0 , 1 , 0 , 0 , 0 , 0 , 1 },
            { 1 , 9 , 0 , 0 , 0 , 0 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 },
    };
    static int[][] maze3 = {
            { 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 2 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 3 , 1 , 4 , 0 , 0 , 0 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 3 , 1 , 1 , 1 , 1 , 0 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 1 , 1 , 0 , 1 },
            { 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 },
            { 1 , 0 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 0 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 0 , 0 , 0 , 4 , 1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 0 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 9 , 1 , 1 , 1 , 1 , 1 , 1 },
            { 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 },
    };

    static int[][][] mazes = {
            maze1, maze2, maze3, maze4
    };

    public static class Player {
        int x;
        int y;
        int keys = 0;
        String rotation = "u";

        public Player(int pos_x, int pos_y) {
            x = pos_x;
            y = pos_y;
        }
    }
    
    public static String path = ANSI_BLACK_BACKGROUND + "·";
    public static String wall = ANSI_RED_BACKGROUND + " ";
    public static String exit = ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "E";
    public static String door = ANSI_RED_BACKGROUND + "#";
    public static String key = ANSI_YELLOW_BACKGROUND + ANSI_BLACK + "K";


    public static Player player;
    public static Scanner scanner = new Scanner(System.in);
    public static int level = 0;
    public static int[][] maze;

    public static void main(String[] args) {

        System.out.println("Is this you first time playing the game?");
        String input = scanner.nextLine();
        if(!input.toLowerCase().startsWith("n")){
            System.out.println("You see a maze in front of you.");
            System.out.println("Inside this maze there is a robot.");
            System.out.println("Robot is represented by:");
            System.out.println("'▲' when facing up");
            System.out.println("'▼' when facing down");
            System.out.println("'►' when facing right");
            System.out.println("'◄' when facing left.");
            System.out.println();
            System.out.println("Your goal is to program the robot to escape the maze. To do so, you have these commands:");
            System.out.println("1. move:<int> The robot will move forward that amount of cells.");
            System.out.println("2. rotate:<String> The robot will rotate 90 degrees clockwise (c) or counterclockwise (cc).");
            System.out.println("3. collect The robot will collect the item on the cell it is facing.");
            System.out.println("2. open The robot will open the door it is facing.");
            System.out.println();
            System.out.println("Example:");
            System.out.println(">>> move:3 collect rotate:c move:2 rotate:cc open move:4");
            System.out.println();
            System.out.println("Only the first letter of the command matters.");
            System.out.println(">>> m:3 c r:c m:2 r:cc o m:4");
            System.out.println("Will also work.");
            System.out.println();
            System.out.println("wall -> " + wall + ANSI_RESET);
            System.out.println("path -> " + path  + ANSI_RESET);
            System.out.println("exit -> " + exit  + ANSI_RESET);
            System.out.println("door -> " + door  + ANSI_RESET);
            System.out.println("key  -> " + key  + ANSI_RESET);
            System.out.println();
            System.out.print("Press enter to continue...");
            scanner.nextLine();

        }
        game();
    }

    public static void print_maze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {

                if (player.x == j && player.y == i) {
                    String player_symbol = switch (player.rotation) {
                        case "u" -> "▲";
                        case "d" -> "▼";
                        case "r" -> "►";
                        case "l" -> "◄";
                        default -> throw new IllegalStateException("Unexpected value: " + player.rotation);
                    };
                    System.out.print(ANSI_BLACK_BACKGROUND + player_symbol);
                } else {
                    if (maze[i][j] == 0) {
                        System.out.print(path);
                    } else if (maze[i][j] == 1) {
                        System.out.print(wall);
                    } else if (maze[i][j] == 2) {
                        System.out.print(exit);
                    } else if (maze[i][j] == 3) {
                        System.out.print(door);
                    } else if (maze[i][j] == 4) {
                        System.out.print(key);
                    }
                }

                System.out.print(ANSI_RESET);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void game() {


        maze = Arrays.stream(mazes[level]).map(int[]::clone).toArray(int[][]::new);

//        coping from a maze from mazes depending on which level it is.

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 9){
                    player = new Player(j, i);
                    maze[i][j] = 0;
                }
            }
        }


        print_maze();

        System.out.print(">>> ");
        String input = scanner.nextLine();

        if(input.equals("skip")){
            gameover(true);
        }else {

            try {
                String[] commands = input.split(" ");

                for (String command : commands) {
//                    System.out.println("command: " + command);
                    String function = String.valueOf(command.split(":")[0].charAt(0)).toLowerCase();
                    switch (function) {
                        case "m" -> move(command.split(":")[1]);
                        case "r" -> rotate(command.split(":")[1]);
                        case "c" -> collect();
                        case "o" -> open();
                        default -> throw new IllegalStateException("Unexpected value: " + function);
                    }
                }

                if (maze[player.y][player.x] == 2) {
                    gameover(true);
                } else {
                    System.out.println(ANSI_BLACK + ANSI_RED_BACKGROUND + "ERROR: EXIT NOT REACHED" + ANSI_RESET);
                }

            } catch (Exception e) {
                System.out.println(ANSI_BLACK + ANSI_RED_BACKGROUND + "ERROR: " + e.getMessage() + ANSI_RESET);
            }
        }

        gameover(false);

    }

    private static void open() throws Exception {
        int[] facing_cell = get_facing_cell();
        if(maze[facing_cell[0]][facing_cell[1]] == 3){
            if (player.keys > 0) {
                maze[facing_cell[0]][facing_cell[1]] = 0;
                player.keys--;
            } else {
                throw new Exception("ROBOT DOES NOT HAVE ANY KEYS");
            }
        } else {
            throw new Exception("ROBOT IS NOT FACING A DOOR");
        }
        update();
    }

    private static void collect() throws Exception {
        int[] facing_cell = get_facing_cell();
        if(maze[facing_cell[0]][facing_cell[1]] == 4){
            maze[facing_cell[0]][facing_cell[1]] = 0;
            player.keys++;
        } else {
            throw new Exception("THERE IS NO ITEM TO COLLECT");
        }
        update();
    }

    private static void rotate(String direction) {
        if (direction.equals("c")) {
            player.rotation = switch (player.rotation) {
                case "u" -> "r";
                case "r" -> "d";
                case "d" -> "l";
                case "l" -> "u";
                default -> throw new IllegalStateException("Unexpected value: " + player.rotation);
            };
        } else {
            player.rotation = switch (player.rotation) {
                case "u" -> "l";
                case "l" -> "d";
                case "d" -> "r";
                case "r" -> "u";
                default -> throw new IllegalStateException("Unexpected value: " + player.rotation);
            };
        }
        update();
    }

    public static int[] get_facing_cell(){
        return switch (player.rotation) {
            case "u" -> new int[]{player.y-1, player.x};
            case "l" -> new int[]{player.y, player.x-1};
            case "d" -> new int[]{player.y+1, player.x};
            case "r" -> new int[]{player.y, player.x+1};
            default -> throw new IllegalStateException("Unexpected value: " + player.rotation);
        };
    }

    public static void move(String cells_str) throws Exception {
        int cells = Integer.parseInt(cells_str);
        for (int i = 0; i < cells; i++) {
            switch (player.rotation) {
                case "u" -> player.y--;
                case "l" -> player.x--;
                case "d" -> player.y++;
                case "r" -> player.x++;
            }
            update();
            if (maze[player.y][player.x] == 1) {
                throw new Exception("ROBOT OUT OF BOUNDS");
//                TODO
            } else if (maze[player.y][player.x] == 3) {
                throw new Exception("DOOR IS NOT OPEN");
            }
        }
    }

    private static void gameover(boolean is_win) {
        if (is_win) {
            if(level>mazes.length-2){
                System.out.println(ANSI_BLACK + ANSI_YELLOW_BACKGROUND + "Congratulations! You have finished the game!" + ANSI_RESET);
                System.out.println("Press enter to restart.");
                System.out.println("Type quit to exit.");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("quit")) {
                    System.exit(0);
                } else {
                    level = 0;
                    game();
                }
            }
            System.out.println(ANSI_BLACK + ANSI_YELLOW_BACKGROUND + "LEVEL COMPLETE" + ANSI_RESET);
            System.out.println();
            level++;
            game();
        } else {
            System.out.println("\u001B[41m\u001B[30mGAME OVER" + ANSI_RESET);
            System.out.println("Press enter to restart.");
            System.out.println("Type quit to exit.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                System.exit(0);
            } else {
                game();
            }
        }
    }

    public static void update() {
        print_maze();
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}