public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 22; j++) {
                if ((i == 0 && j != 3 && j != 4 && j != 7 && j != 8 && j != 13 && j != 14 && j != 17 && j != 18) || (i == 1 && j != 1 && j != 2 && j != 3 && j != 5 && j != 6  &&
                        j != 8 && j != 10 && j != 11 && j != 12 && j != 13 && j != 15 && j != 16
                        && j != 18 && j != 20)||(i==2&&j!=3&&j!=8&&j!=13&&j!=18)||
                        (i == 3 && j != 0 && j != 1 && j != 3 && j != 5 && j != 6 && j != 8 && j != 10 && j != 13
                                &&j!=15&&j!=16&&j!=18&&j!=21)||(i == 4 && j != 3 && j != 5 && j != 6 
                        && j != 8 && j != 6 && j != 8 && j != 13 && j != 15&&j!=16&&j!=18&&j!=20)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }


            }
            System.out.println("");
        }
    }
}
