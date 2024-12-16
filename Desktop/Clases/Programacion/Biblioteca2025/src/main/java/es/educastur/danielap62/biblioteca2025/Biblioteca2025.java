/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.educastur.danielap62.biblioteca2025;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Daniel Alonso Perez
 */
public class Biblioteca2025 {

    private ArrayList <Libro> libros;
    
    private ArrayList <Usuario> usuarios;
    
    private ArrayList <Prestamo> prestamos;

    public Biblioteca2025() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();    
    }
    
    
    
    public static void main(String[] args) {
        Biblioteca2025 b= new Biblioteca2025();
        b.cargaDatos();
        b.menu();
    }

    

    //<editor-fold defaultstate="collapsed" desc="MENUS">
    public void menu(){
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("BIBLIOTECA\n");
            System.out.println("1 - LIBROS");
            System.out.println("2 - USUARIOS");
            System.out.println("3 - PRESTAMOS");
            System.out.println("9 - Salir");
            opcion = sc.nextInt();
             
            switch(opcion){
                case 1:{
                    menuLibros();
                    break;
                }

                case 2:{
                    menuUsuarios();
                    break;
                }

                case 3:{
                    menuPrestamos();
                    break;
                }
            }
        }while(opcion != 9);
    }



    private void menuLibros() {
      
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("LIBROS\n");
            System.out.println("1 - NUEVO LIBRO");
            System.out.println("2 - ELIMINAR LIBRO");
            System.out.println("3 - MODIFICAR LIBRO");
            System.out.println("4 - LISTA DE LIBROS");
            System.out.println("9 - Salir");
            opcion = sc.nextInt();
             
            switch(opcion){
                case 1:{
                    nuevoLibro();
                    break;
                }

                case 2:{
                    eliminarLibro();
                    break;
                }

                case 3:{
                    modificarLibro();
                    break;
                }

                case 4:{
                    listaLibros();
                    break;
                }
                
            }
        }while(opcion != 9);
    }  
    
    


    private void menuUsuarios() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("USUARIOS\n");
            System.out.println("1 - NUEVO USUARIO");
            System.out.println("2 - ELIMINAR USUARIO");
            System.out.println("3 - MODIFICAR USUARIO");
            System.out.println("4 - LISTA DE USUARIOS");
            System.out.println("9 - Salir");
            opcion = sc.nextInt();
             
            switch(opcion){
                case 1:{
                    nuevoUsuario();
                    break;
                }

                case 2:{
                    eliminarUsuario();
                    break;
                }

                case 3:{
                    modificarUsuario();
                    break;
                }

                case 4:{
                    listaUsuarios();
                    break;
                }
            }
        }while(opcion != 9);
    }
    
    private void menuPrestamos() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("PRESTAMOS\n");
            System.out.println("1 - NUEVO PRESTAMO");
            System.out.println("2 - ELIMINAR PRESTAMO");
            System.out.println("3 - MODIFICAR PRESTAMO");
            System.out.println("4 - LISTA DE PRESTAMO");
            System.out.println("9 - Salir");
            opcion = sc.nextInt();
             
            switch(opcion){
                case 1:{
                    nuevoPrestamo();
                    break;
                }

                case 2:{
                    eliminarPrestamo();
                    break;
                }

                case 3:{
                    modificarPrestamo();
                    break;
                }

                case 4:{
                    listaPrestamos();
                    break;
                }
            }
        }while(opcion != 9);
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Gestion Libros">
        private void nuevoLibro() {

        }

        private void eliminarLibro() {

        }

        private void modificarLibro() {

        }

        private void listaLibros() {

        }
    //</editor-fold>
    
        
    //<editor-fold defaultstate="collapsed" desc="Gestion Usuarios">
    private void nuevoUsuario() {
        
    }

    private void eliminarUsuario() {
        
    }

    private void modificarUsuario() {
        
    }

    private void listaUsuarios() {
       
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Gestion Prestamos">
    

    private void nuevoPrestamo() {
        
    }

    private void eliminarPrestamo() {
        
    }

    private void modificarPrestamo() {
        
    }

    private void listaPrestamos() {
        
    }
    //</editor-fold>
    
    
    //<editor-fold defaultstate="collapsed" desc="Metodos Auxiliares">
    public void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Médico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chamán","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraíso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudú","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El último barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",2)); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
    
        for (Libro l:libros) {
            System.out.println(l);
        }
        System.out.println("");
        for (Usuario u:usuarios) {
            System.out.println(u);
        }
        System.out.println("");
        for (Prestamo p:prestamos) {
            System.out.println(p);
        }
    }
    //</editor-fold>

}
