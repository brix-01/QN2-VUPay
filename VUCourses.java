/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vuexams.vupay;

/**
 *
 * @author Kibuuka Hamis Mahad_VU-BSF-2503-1740-DAY
 */
import java.util.Scanner;
        
public class VUCourses {

    public static void main(String[] args) {

        String moduleCode;
        String moduleName = "";
        int tuition = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Module Code (BSF, BIT, BCS, BCE): ");
        moduleCode = input.nextLine().toUpperCase();

        switch (moduleCode) {

            case "BSF":
                moduleName = "BSc. Software Engineering";
                tuition = 900000;
                break;

            case "BIT":
                moduleName = "BSc. Information Technology";
                tuition = 750000;
                break;

            case "BCS":
                moduleName = "BSc. Computer Science";
                tuition = 800000;
                break;

            case "BCE":
                moduleName = "BSc. Computer Engineering";
                tuition = 950000;
                break;

            default:
                System.out.println("Wrong Module Code details");
                return;
        }

        System.out.println("Course Name: " + moduleName);
        System.out.println("Module Code: " + moduleCode);
        System.out.println("Tuition: UGX " + tuition);
    }
}
