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
            for (Libro l: libros) {
                System.out.println(l);
                
            }
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
        System.out.println("Identificacion del usuario:");
        int posUsuario=buscaDni(solicitaDni());
        if (posUsuario==-1){
            System.out.println("No es socio de la Biblioteca");
            //En su momento aqui habria que poner que pregunte si quiere darse de alta como socio y en caso afirmativo llevarlo a nuevoUsuario().
        }else{
            int posLibro=buscaIsbn(solicitaIsbn());
            if(posLibro==-1){
                System.out.println("El ISBN no pertenece a un libro existente en nuestro Catalogo. \n Lo sentimos");
            }else if(libros.get(posLibro).getEjemplares()>0){
                LocalDate hoy=LocalDate.now();
                prestamos.add(new Prestamo(libros.get(posLibro),usuarios.get(posUsuario),hoy,hoy.plusDays(15)));
                libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares()-1);
            }else{
                System.out.println("No quedan unidades de este");
            }
        }
    }

    private void eliminarPrestamo() {
        
    }

    private void modificarPrestamo() {
        
    }

    private void listaPrestamos() {
        for (Prestamo p: prestamos) {
            System.out.println(p);
            
        }
        
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
    
    
    /**
     * Metodo para buscar un DNI en un ArrayList, devuelve la posicion en este, si no le encuentra devuelve un -1
     * @param dni Recibe el DNI (String) a buscar
     * @return Devuelve la posicion (int) del DNI en el ArrayList, si no le encuentra devuelve un -1
     */
    public int buscaDni (String dni){
        int pos = -1;
        for (int i = 0; i<usuarios.size(); i++) {
                if(usuarios.get(i).getDni().equalsIgnoreCase(dni) ){
                    pos = i;
                    break;
                }
                
            }
        
        
        return pos;
    }
    
    /**
     * Metodo para buscar un ISBN en un ArrayList, devuelve la posicion en este, si no le encuentra devuelve un -1
     * @param isbn Recibe el Isbn (String) a buscar
     * @return Devulve la posicion (int) del DNI en el ArrayList, si no lo encuentra devuelve un -1
     */
    public int buscaIsbn (String isbn){
        int pos = -1;
        for (int i = 0; i<libros.size(); i++) {
                if(libros.get(i).getIsbn().equalsIgnoreCase(isbn) ){
                    pos = i;
                    break;
                }
                
            }
        
        
        return pos;
    }
    /**
     * Metodo que solicita un DNI. Pdte de validacion
     * @return (String) Devuelve el DNI introducido 
     */
    public String solicitaDni (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el dni del usuario: ");
        String dni=sc.next();
        return dni;
    }
    /**
     * Metodo que solicita un ISBN. Pdte de validacion
     * @return (String) Devuelve el ISBN introducido 
     */
    public String solicitaIsbn (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el isbn del libro: ");
        String isbn=sc.next();
        return isbn;
    }
    //</editor-fold>

}
