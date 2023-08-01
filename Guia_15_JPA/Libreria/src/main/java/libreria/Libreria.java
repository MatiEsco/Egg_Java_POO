package libreria;

//import javax.persistence.EntityManager;


import libreria.servicios.MenuService;



public class Libreria {

    public static void main(String[] args) {
       MenuService menuService = new MenuService();
       
       menuService.menu();
       
    }
}
