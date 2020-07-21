package crud1;

import utils.Leer;

public class CRUD {
    public static String[] nombre = new String[100];
    public static String[] dni = new String[100];
    public static String[] procesador = new String[100];
    public static String[] memoria_instalada = new String[100];
    public static String[] sistema_operativo = new String[100];
    public static String[] espacio_almacenamiento = new String[100];
    public static int posicion= -1;
    
    public static void agregarpedido(){
        String continuar;
        do{
            posicion ++;
            System.out.println("Agregar pedido");
            System.out.print("Nombre: ");
            nombre[posicion] = Leer.cadena();
         
            System.out.print("DNI: ");
            dni[posicion] = Leer.cadena();
         
            System.out.print("Tipo de procesador: ");
            procesador[posicion] = Leer.cadena();
            
            System.out.print("Memoria instalada (RAM): ");
            memoria_instalada[posicion] = Leer.cadena();
            
            System.out.print("System operativo de 32/64(Bits): ");
            sistema_operativo[posicion] = Leer.cadena();
            
            System.out.print("Cantidad de espacio 250gb/500gb/1tera: ");
            espacio_almacenamiento[posicion] = Leer.cadena();
            
            System.out.println("Deseas agregar otro? (S/N)");
            continuar = Leer.cadena();
        }while(continuar.equalsIgnoreCase("S")); 
    }
    
    public static void eliminarpedido(){
        String continuar;
        do{ 
            listarpedido();
            System.out.println("Ingrese el numero de la perosna a eliminar: ");
            int numero = Leer.entero();
            numero--;
            for (int i = numero; i < posicion; i++) {
            nombre[i]=nombre[i+1];
            dni[i] = dni[i+1];
            procesador[i] = procesador[i+1];
            memoria_instalada[i] = memoria_instalada[i+1];
            sistema_operativo[i] = sistema_operativo[i+1];
            espacio_almacenamiento[i] = espacio_almacenamiento[i+1];
        }
            nombre[posicion]="";
            dni[posicion]="";
            procesador[posicion]="";
            memoria_instalada[posicion]="";
            sistema_operativo[posicion]="";
            espacio_almacenamiento[posicion]="";
            posicion--; 
            System.out.println("Deseas agregar otro? (S/N)");
            continuar = Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    
    public static void editarpedido(){
        String continuar;
        do{ 
            listarpedido();
            System.out.print("Ingresar el numero de la persona que voy a editar: ");
            int numero=Leer.entero();
            numero--;
            System.out.println("Resultado: "+nombre[numero]+"( "+ dni[numero] +")- "+ procesador[numero]+"( "+memoria_instalada[numero]+")- "+ sistema_operativo[numero]+"( "+ espacio_almacenamiento[numero]);
            System.out.print("Nuevo Nombre: ");
            nombre[numero]= Leer.cadena();
            System.out.print("Nuevo DNI: ");
            dni[numero] = Leer.cadena();
            System.out.print("Nuevo tipo de procesador: ");
            procesador[numero] = Leer.cadena();
            System.out.print("Nueva cantidad de memoria: ");
            memoria_instalada[numero] = Leer.cadena();
            System.out.print("Nuevo sistema operativo: ");
            sistema_operativo[numero] = Leer.cadena();
            System.out.print("Nuevo tamaño de almacenamiento: ");
            espacio_almacenamiento[numero] = Leer.cadena();
            System.out.println("Deseas agregar otro? (S/N)");
            continuar = Leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    
    public static void listarpedido(){
        System.out.println("Listado:");
        System.out.println("N°\tNombre\t\tDNI\t\tT.procesador\t\tC.memoria\t\tS.operativo\t\tC.espacio");
        for (int i = 0; i <=posicion; i++) {
            System.out.println((i+1)+"\t"+nombre[i]+"\t"+dni[i]+"\t"+procesador[i]+"\t\t"+memoria_instalada[i]+"\t\t\t"+sistema_operativo[i]+"\t\t\t"+espacio_almacenamiento[i]);
        }
    }
    
    public static void salir(){
        System.out.println("Gracias por su visita");
         
    }
    
    public static void error(){
        System.out.println("Error, Opcion incorrecta");
         
    }
    
    public static void menu(){
        System.out.println("Venta de computadoras LUCHITO");
        System.out.println("Menu principal");
        System.out.println("1. Agregar Pedido");
        System.out.println("2. Eliminar Pedido");
        System.out.println("3. Editar Pedido");
        System.out.println("4. Listar Pedido");
        System.out.println("5. Salir");
        System.out.print("opc: ");
    }
    
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: agregarpedido();
                         break;
                case 2:  eliminarpedido();
                         break;
                case 3: editarpedido();
                         break;
                case 4: listarpedido();
                         break;
                case 5: salir();
                         break;
                default:  error();
            }
             
        }while(opcion != 5);
    }
    
    public static void main(String[] args) {
        inicio();
    }
}
