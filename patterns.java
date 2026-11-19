// PATTERN 1 (SIMPLE PATTERN)

/*public class patterns{
    public static void main(String[]args){
        for(int line = 1; line <= 4; line++){
            for( int star = 1; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}*/

//PATTERN 2 ( INVERTED PATTERN LINE =6)

/*public class patterns{
    public static void main(String[] args) {
        for ( int line = 1; line <= 6; line++){
            for(int star = 1;star <= 6- line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}*/

// PATTERN 3 (CHARACTER PATTERN)

public class patterns{
    public static void main(String[] args) {
        int  n = 8;
        char  ch = 'A';
         
         for ( int line = 1; line <= n;line ++){
            for( int chars = 1 ; chars <= line ; chars++){
                System.out.print(ch);
                ch++;

            }
            System.out.println("");
         }
    }}





