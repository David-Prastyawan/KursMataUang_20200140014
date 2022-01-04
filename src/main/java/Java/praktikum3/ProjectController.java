/*
 * @author David Prastyawan
 */
package Java.praktikum3;

import java.text.DecimalFormat;
import java.util.Scanner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProjectController {
    @RequestMapping("/KursMataUang")
    @ResponseBody
    public static void main(String[]args){
    double uang, dollar, rupiah, ringgit;
    int code;
    
    DecimalFormat f = new DecimalFormat("##.##");
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("====================================================================");
    System.out.println("\t\tConverter Mata Uang");
    System.out.println("\t\t Pilih mata uang?");
    System.out.println("====================================================================");
    System.out.println("1:Dollar-Rupiah  2:Rupiah-Dollar  3:Rupiah-Ringggit  4:Ringgit-Dollar ");
    code = sc.nextInt();
    
    System.out.println("Berapa jumlah uang yang akan di Convert?");
    uang = sc.nextFloat();
    
    if (code == 1)
    {
        rupiah = uang * 14340;
	System.out.println(uang + " dollars : " + f.format(rupiah) + " Rupiah");
    }
    else if (code == 2)
    {
            dollar = uang / 14340;
            System.out.println( uang + " rupiah : " + f.format(dollar) + " Dollars");
 
    }
    else if (code == 3)
    {
            ringgit = uang / 3408;
            System.out.println(uang + " rupiah : " + f.format(ringgit) + " ringgit");
    }
    else if (code == 4)
    {
            dollar = uang * 0.24;
            System.out.println(uang + " ringgit : " + f.format(dollar) + " dollar");
    }
    else
    {
            System.out.println("Invalid input");
    }
    System.out.println("");    
    
    }
}
