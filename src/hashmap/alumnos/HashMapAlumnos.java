
package hashmap.alumnos;

import java.util.Scanner;

public class HashMapAlumnos {

    private static Iterable<Alumnos> alumno;

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read=new Scanner(System.in);
        Colegio cole= new Colegio();
        String apellido; String nombre;
        int legajo; int anio;
       boolean confirmacion= true;
   
        do{
            System.out.println("ingrese numero de legajo");
            legajo= read.nextInt();
            System.out.println("Ingrese nombre de alumno");
            nombre=read.next();
            System.out.println("ingrese apellido");
            apellido= read.next();
           
            System.out.println("Desea ingresar otro alumno? S/N");
                if(read.next().equalsIgnoreCase("N")){
                confirmacion= false;
                }
                System.out.println("Salio del sistema");
        
        }while(confirmacion);
             for(Alumnos alu: alumno){
                System.out.println(alu);}
    }
        
        
}
    

