package num_aleatorio;
import java.util.Scanner;
/** * @author GUSTAVO */
public class Num_Aleatorio {
    public static void main(String[] args) {
    System.out.println("Monica,Gustavo");
    Scanner teclado = new Scanner(System.in);
      int iPos1, iPos2;  String[][] m1;
      m1 = new String[15][3];
      m1[0][0] = "NOMBRE";
      m1[0][1] = "BINARIO";
      m1[0][2] = "CODIGO POSTAL";
      m1[1][0] = "Duarte Hernández Eduardo Ivan" ;
      m1[1][1] =  "1001";
      m1[1][2] = " 24400";
      m1[2][0] = "Cach Laines Orlando Adriel"  ;
      m1[2][1] = "11";
      m1[2][2] = "24200";
      m1[3][0] = "Vargas Cetz William Manuel"   ;
      m1[3][1] = "101";
      m1[3][2] = " 24080";
      m1[4][0] = "Castillo Canul Gustavo Moises"   ;
      m1[4][1] = "10";
      m1[4][2] = "24050";
      m1[5][0] = "Leon Argaez Eduardo Alejandro"   ;
      m1[5][1] = "11";
      m1[5][2] = "24040";
      m1[6][0] = "Salazar Caballero David Romano"    ;
      m1[6][1] = "10";
      m1[6][2] = "24075";
      m1[7][0] = "Gaytan Balan Rodrigo Manuel"  ;
      m1[7][1] = "10";
      m1[7][2] = "24060";
      m1[8][0] = "Gregorio Duran Julio Cesar"   ;
      m1[8][1] = "11";
      m1[8][2] = "24090";
      m1[9][0] = "Tamay De Los Santos Monica Estefania" ;
      m1[9][1] = "101";
      m1[9][2] =  "24090";
      m1[10][0] = "Zaragoza Burgos Yazuri Elizabeth"  ;
      m1[10][1] = "111";
      m1[10][2] = "24035";
      m1[11][0] = "Uc May Jose Maria Andres"   ;
      m1[11][1] = "1000";
      m1[11][2] = "24080";
      m1[12][0] = "Segovia Alvarado Christopher Raul"   ;
      m1[12][1] = "101";
      m1[12][2] ="24080";
      m1[13][0] = "Colli Aguilar Daniel Alejandro"   ;
      m1[13][1] = "110";
      m1[13][2] = "24026";
      m1[14][0] = "Caballero Ramirez Raul Alejandro"  ;
      m1[14][1] = "100";
      m1[14][2] = "24020";
      System.out.println("");
      System.out.println("Favor de ingresar la informacion de los alumnos a conocer");
      int nn = teclado.nextInt();
      System.out.println("");
      System.out.print(m1[0][0]+ " | ");
      System.out.print(m1[0][1]+ " | ");
      System.out.print(m1[0][2]+ " | ");
      System.out.println("");
      System.out.print(m1[nn][0]+ " | ");
      System.out.print(m1[nn][1]+ " | ");
      System.out.print(m1[nn][2]+ " | ");
      System.out.println("");
      System.out.println("");
      System.out.print(m1[0][0]+ " | ");
      System.out.print(m1[0][1]+ " | ");
      System.out.print(m1[0][2]+ " | ");
      System.out.println("");
      for(int i=0;i<=9;i+=1)
      {
      int numero = (int) (Math.random() * 14 + 1);
      System.out.print(m1[numero][0]+ " | ");
      System.out.print(m1[numero][1]+ " | ");
      System.out.print(m1[numero][2]+ " | ");
      System.out.println("");
      }
    }
}