/*
public class OOPSBaneerApp {
    public static void main(String[] args) {
		system.out.println("oops"):
	}
}public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(" ****    ****    ****    **** ");
        System.out.println("*    *  *    *  *    *  *     ");
        System.out.println("*    *  *    *   ****    **** ");
        System.out.println("*    *  *    *  *           *");
        System.out.println(" ****    ****   *        **** ");
    }
}


public class OOPSBannerApp{

    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join(" ",
                " ********* ",
                " ********* ",
                " ********* ",
                " ********* "
        ));

        // Line 2
        System.out.println(String.join(" ",
                " *       * ",
                " *       * ",
                " *       * ",
                " *        "
        ));

        // Line 3
        System.out.println(String.join(" ",
                " *       * ",
                " *       * ",
                " ********* ",
                " ********* "
        ));

        // Line 4
        System.out.println(String.join(" ",
                " *       * ",
                " *       * ",
                " *        ",
                "         * "
        ));

        // Line 5
        System.out.println(String.join(" ",
                " *       * ",
                " *       * ",
                " *        ",
                "         * "
        ));

        // Line 6
        System.out.println(String.join(" ",
                " *       * ",
                " *       * ",
                " *        ",
                " *       * "
        ));

        // Line 7
        System.out.println(String.join(" ",
                " ********* ",
                " ********* ",
                " *        ",
                " ********* "
        ));
    }
}
*/

public class OOPSBannerApp{
    public static void main(String[] args) {
        String[] lines = new String[7];
        lines[0] = String.join("  ","   ***  ", "   ***  ", "  ***** ", "***** ");
        lines[1] = String.join("  "," **   **", " **   **", " **   **", "**     ");
        lines[2] = String.join("  "," **   **", " **   **", " ***** ", " ***** ");
        lines[3] = String.join("  "," **   **", " **   **", " **     ", "     **");
        lines[4] = String.join("  "," **   **", " **   **", " **     ", " **   **");
        lines[5] = String.join("  "," **   **", " **   **", " **     ", " **   **");
        lines[6] = String.join("  ","    ***  ", "  ***  ", " **     ", " ***** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
*/
public class OOPSBannerUC5 {
	public static void main (String[] args) {
		String lines[] = {
			String.join("  ","   ***   ","   ***   ","******** "," ******* "),
			String.join("  "," **   ** "," **   ** ","*       *","*        "),
			String.join("  ","**     **","**     **","*       *","*        "),
			String.join("  ","**     **","**     **","******** "," ******* "),
			String.join("  ","**     **","**     **","*        ","        *"),
			String.join("  "," **   ** "," **   ** ","*        ","        *"),
			String.join("  ","   ***   ","   ***   ","*        "," ******* ")
		};
		
		for (String line : lines) {
			System.out.println(line);
		}
	}
}