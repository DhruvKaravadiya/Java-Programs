import java.util.Scanner;
public class tic_tac_toe1 {
    public static void main(String[] args) {
        int count = 0;
        int draw = 0;
        Scanner sc1 = new Scanner(System.in);
        char[][] ch = new char[4][4];
        System.out.println("Choose X or O");
        char choice = sc1.next().charAt(0);
        if (choice == 'O') {
            getout: for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println("Where to enter  O ?");
                    int placeChoice = sc1.nextInt();
                    if (placeChoice == 1) {
                        ch[1][1] = 'O';
                        count++;
                    } else if (placeChoice == 2) {
                        ch[1][2] = 'O';
                        count++;
                    } else if (placeChoice == 3) {
                        ch[1][3] = 'O';
                        count++;
                    } else if (placeChoice == 4) {
                        ch[2][1] = 'O';
                        count++;
                    } else if (placeChoice == 5) {
                        ch[2][2] = 'O';
                        count++;
                    } else if (placeChoice == 6) {
                        ch[2][3] = 'O';
                        count++;
                    } else if (placeChoice == 7) {
                        ch[3][1] = 'O';
                        count++;
                    } else if (placeChoice == 8) {
                        ch[3][2] = 'O';
                        count++;
                    } else if (placeChoice == 9) {
                        ch[3][3] = 'O';
                        count++;
                    }
                    for (int x = 1; x <+ 3; x++) {

                        System.out.print("| ");
                        for (int y = 1; y <= 3; y++) {
                            System.out.printf("%s | ", ch[x][y]);
                        }
                        System.out.println();
                    }

                    if (count >= 5) {
                        if ((ch[1][1] == ch[1][2] && ch[1][2] == ch[1][3])
                                || (ch[2][1] == ch[2][2] && ch[2][2] == ch[2][3])
                                || (ch[3][1] == ch[3][2] && ch[3][2] == ch[3][3])
                                || (ch[1][1] == ch[2][1] && ch[2][1] == ch[3][1])
                                || (ch[1][2] == ch[2][2] && ch[2][2] == ch[3][2])
                                || (ch[1][3] == ch[2][3] && ch[2][3] == ch[3][3])
                                || (ch[1][1] == ch[2][2] && ch[2][2] == ch[3][3])
                                || (ch[1][3] == ch[2][2] && ch[2][2] == ch[3][1])) {
                            System.out.println("------------------------- O WINS");
                            draw++;
                            break getout;
                        }
                    }

                }

                if (count == 9) {
                    break;
                }
                for (int k = 0; k < 1; k++) {
                    System.out.println("Where to enter  X ?");
                    int placeChoice = sc1.nextInt();
                    if (placeChoice == 1) {
                        ch[1][1] = 'X';
                        count++;
                    } else if (placeChoice == 2) {
                        ch[1][2] = 'X';
                        count++;
                    } else if (placeChoice == 3) {
                        ch[1][3] = 'X';
                        count++;
                    } else if (placeChoice == 4) {
                        ch[2][1] = 'X';
                        count++;
                    } else if (placeChoice == 5) {
                        ch[2][2] = 'X';
                        count++;
                    } else if (placeChoice == 6) {
                        ch[2][3] = 'X';
                        count++;
                    } else if (placeChoice == 7) {
                        ch[3][1] = 'X';
                        count++;
                    } else if (placeChoice == 8) {
                        ch[3][2] = 'X';
                        count++;
                    } else if (placeChoice == 9) {
                        ch[3][3] = 'X';
                        count++;
                    }
                    for (int x = 1; x <= 3; x++) {

                        System.out.print("| ");
                        for (int y = 1; y <= 3; y++) {
                            System.out.printf("%s | ", ch[x][y]);
                        }
                        System.out.println();
                    }
                    if (count >= 5) {
                        if ((ch[1][1] == ch[1][2] && ch[1][2] == ch[1][3])
                        || (ch[2][1] == ch[2][2] && ch[2][2] == ch[2][3])
                        || (ch[3][1] == ch[3][2] && ch[3][2] == ch[3][3])
                        || (ch[1][1] == ch[2][1] && ch[2][1] == ch[3][1])
                        || (ch[1][2] == ch[2][2] && ch[2][2] == ch[3][2])
                        || (ch[1][3] == ch[2][3] && ch[2][3] == ch[3][3])
                        || (ch[1][1] == ch[2][2] && ch[2][2] == ch[3][3])
                        || (ch[1][3] == ch[2][2] && ch[2][2] == ch[3][1])) {
                            System.out.println("------------------------- O WINS");
                            draw++;
                            break getout;
                        }
                    }
                }

            }
        } else if (choice == 'X') {

            getout2: for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println("Where to enter  X ?");
                    int placeChoice = sc1.nextInt();
                    if (placeChoice == 1) {
                        ch[1][1] = 'X';
                        count++;
                    } else if (placeChoice == 2) {
                        ch[1][2] = 'X';
                        count++;
                    } else if (placeChoice == 3) {
                        ch[1][3] = 'X';
                        count++;
                    } else if (placeChoice == 4) {
                        ch[2][1] = 'X';
                        count++;
                    } else if (placeChoice == 5) {
                        ch[2][2] = 'X';
                        count++;
                    } else if (placeChoice == 6) {
                        ch[2][3] = 'X';
                        count++;
                    } else if (placeChoice == 7) {
                        ch[3][1] = 'X';
                        count++;
                    } else if (placeChoice == 8) {
                        ch[3][2] = 'X';
                        count++;
                    } else if (placeChoice == 9) {
                        ch[3][3] = 'X';
                        count++;
                    }
                    for (int x = 1; x <= 3; x++) {

                        System.out.print("| ");
                        for (int y = 1; y <= 3; y++) {
                            System.out.printf("%s | ", ch[x][y]);
                        }
                        System.out.println();
                    }
                    if (count >= 5) {
                        if ((ch[1][1] == ch[1][2] && ch[1][2] == ch[1][3])
                        || (ch[2][1] == ch[2][2] && ch[2][2] == ch[2][3])
                        || (ch[3][1] == ch[3][2] && ch[3][2] == ch[3][3])
                        || (ch[1][1] == ch[2][1] && ch[2][1] == ch[3][1])
                        || (ch[1][2] == ch[2][2] && ch[2][2] == ch[3][2])
                        || (ch[1][3] == ch[2][3] && ch[2][3] == ch[3][3])
                        || (ch[1][1] == ch[2][2] && ch[2][2] == ch[3][3])
                        || (ch[1][3] == ch[2][2] && ch[2][2] == ch[3][1])) {
                            System.out.println("------------------------- X WINS");
                            draw++;
                            break getout2;
                        }
                    }

                }

                if (count == 9) {
                    break;
                }
                for (int k = 0; k < 1; k++) {
                    System.out.println("Where to enter  O ?");
                    int placeChoice = sc1.nextInt();
                    if (placeChoice == 1) {
                        ch[1][1] = 'O';
                        count++;
                    } else if (placeChoice == 2) {
                        ch[1][2] = 'O';
                        count++;
                    } else if (placeChoice == 3) {
                        ch[1][3] = 'O';
                        count++;
                    } else if (placeChoice == 4) {
                        ch[2][1] = 'O';
                        count++;
                    } else if (placeChoice == 5) {
                        ch[2][2] = 'O';
                        count++;
                    } else if (placeChoice == 6) {
                        ch[2][3] = 'O';
                        count++;
                    } else if (placeChoice == 7) {
                        ch[3][1] = 'O';
                        count++;
                    } else if (placeChoice == 8) {
                        ch[3][2] = 'O';
                        count++;
                    } else if (placeChoice == 9) {
                        ch[3][3] = 'O';
                        count++;
                    }
                    for (int x = 1; x <= 3; x++) {

                        System.out.print("| ");
                        for (int y = 1; y <= 3; y++) {
                            System.out.printf("%s | ", ch[x][y]);
                        }
                        System.out.println();
                    }
                    if (count >= 5) {
                        if ((ch[1][1] == ch[1][2] && ch[1][2] == ch[1][3])
                        || (ch[2][1] == ch[2][2] && ch[2][2] == ch[2][3])
                        || (ch[3][1] == ch[3][2] && ch[3][2] == ch[3][3])
                        || (ch[1][1] == ch[2][1] && ch[2][1] == ch[3][1])
                        || (ch[1][2] == ch[2][2] && ch[2][2] == ch[3][2])
                        || (ch[1][3] == ch[2][3] && ch[2][3] == ch[3][3])
                        || (ch[1][1] == ch[2][2] && ch[2][2] == ch[3][3])
                        || (ch[1][3] == ch[2][2] && ch[2][2] == ch[3][1])) {
                            System.out.println("------------------------- X WINS");
                            draw++;
                            break getout2;
                        }
                    }
                }

            }
        } 
        else if((choice=='X'||choice=='0')&&draw==0){
            System.out.println("Draw");
        }
        else {
            System.out.println("Invalid input");
        }

    }
}
