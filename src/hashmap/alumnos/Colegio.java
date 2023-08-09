/*
Un Colegio nos pide un sistema para llevar un registro de los alumnos que se encuentran
cursando actualmente. Los datos que necesita de un Alumno son: legajo, apellido, nombre y año
que cursa. El sistema debe permitir agregar alumnos al Colegio sin que se repitan, quitar alumnos
en base a su legajo, listar los alumnos ordenados alfabéticamente por su apellido y listar los
alumnos cuyos apellidos comiencen por un carácter en particular.*/
package hashmap.alumnos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Colegio {
    
   Set<Alumnos> alumno = new HashSet<>();
  
      
   
   public void incorporarAlumno(Alumnos alumnos){
   alumno.add(alumnos);
   }
   public void quitarAlumno(int legajo){
      for(Alumnos alu: alumno){
          if(alu.getLegajo()==legajo){
             alumno.remove(legajo);
              System.out.println("El alumno fue eliminado");
            }
        }
    }
     public void OrdenarNombre(){
       ArrayList<Alumnos>alumno= new ArrayList<>();
     
      Collections.sort(alumno,Comparator.comparing(Alumnos::getApellido));
     for(Alumnos alu: alumno){
         System.out.println(alu.getApellido());
     }
   
    }
    public void listarporCaracterEspecial(char letra){
       for(Alumnos alu: alumno){
           //nuevo nombre de la lista alu traemos apellido le hacemos metodo char en posicion cero
           //por parecerse al un vector y le preguntamos si la misma letra ingresada por parametro desde 
           //el main.
            if(alu.getApellido().charAt(0)==letra){
                System.out.println(alu.getApellido());
           }
         }
    }

    @Override
    public String toString() {
        return "Colegio{" + "alumno=" + alumno + '}';
    }
    

    
    
} 

