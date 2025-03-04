public class DrawingShapes {

    public static void main(String[] args) {
        
    }

    // Code to draw Rectangle
    public static void drawRectangle(int l, int h) {
        for(int i = 0; i < h; i++) {        // height of rectangle
            for(int j = 0; j < l; j++) {    // length of rectangle
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Code to draw Traingle
    public static void drawTriangle(int l) {
        int base = 2 * (l - 1) + 1;     // "max" number of dots in each line
        int numWhiteSpace;
        int numDots = 1;
        boolean printDot;
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < base; j++) {
                numWhiteSpace = (base - numDots) / 2;
                
                if(j < numWhiteSpace) {     // makes sure the intial white spaces are printed out before the dots
                    printDot = false;
                } else if (j < numWhiteSpace + numDots) {   // ending index of dots
                    printDot = true;
                } else {
                    break;      // once all dots are printed berak so that no extra stuff is printed after
                }

                System.out.print( ((printDot) ? "*" : " " ) );  // based off status of printing dot, will either print out a dot or whitespace
            }
            System.out.println();
            numDots += 2;       // each line you go down, dots increase by 2
        }
    }

    // Code to draw hexagon
    public static void drawHexagon(int l) {
        int base = 2 * (l - 1) + l;     // widest section of the hexagon
        int numWhiteSpace;
        int numDots = l;
        boolean printDot;
        int increment = 2;

        for(int i = 0; i < l * 2 - 1; i++) {
            for(int j = 0; j < base; j++) {
                numWhiteSpace = (base - numDots) / 2;   // calculates white space needed based off the number of dots on the line
                
                // changes boolean to determine whether a dot or whitespace gets printed
                if(j < numWhiteSpace) {     
                    printDot = false;
                } else if (j < numWhiteSpace + numDots) {
                    printDot = true;
                } else {
                    break; //break once all dots printed
                }

                System.out.print( ((printDot) ? "*" : " " ) );
            }
            System.out.println();

            if(i >= l - 1) {        // once the widest part of the hexagon printed, the dots start to decrease as you go down
                increment = -2;
            }
            numDots += increment;
        }
    }

    // code to draw octagon
    public static void drawOctagon(int l) {
        int base = 2 * (l - 1) + l;
        int numWhiteSpace;
        int numDots = l;
        boolean printDot;
        int increment = 2;

        for(int i = 0; i < l * 3 - 2; i++) {
            for(int j = 0; j < base; j++) {
                numWhiteSpace = (base - numDots) / 2;
                
                // changes boolean to determine whether a dot or whitespace gets printed
                if(j < numWhiteSpace) {
                    printDot = false;
                } else if (j < numWhiteSpace + numDots) {
                    printDot = true;
                } else {
                    break;
                }

                System.out.print( ((printDot) ? "*" : " " ) );
            }
            System.out.println();

            if(i < l - 1) {     // before reaching widest part, dots increase by 2
                increment = 2;
            } else if (i < 2 * l - 2) {     // at widest part, num dots remains costant (no increment) for length l
                increment = 0;
            } else {        // after this, dots decrase by 2 each new line
                increment = -2;
            }
            numDots += increment;
        }
    }

    // code to draw pentagon
    public static void drawPentagon(int l) {
        int base = (2 * l) - 1;     // widest part of pentgon

        // composed of a trangle of lenght l, and a rectangle with height of (l-1) and a width of base
        drawTriangle(l);            
        drawRectangle(base, l - 1);
    }
}
