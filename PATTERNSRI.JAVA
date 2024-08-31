public class Main{
    public static void main(String[] args) {
        for(int i =0;i<5;i++)
        {
            for(int j=0;j<8;j++) {
                if ( (i==0&&j!=6)||(i==1&&j!=1&&j!=2&&j!=4&&j!=6)||(i==2&&j!=6)||(i==3&&j!=0&&j!=1&&j!=6&&j!=5)||(i==4&&j!=4&&j!=6)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

    }
}

