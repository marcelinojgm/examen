
/**
 * Clase que simula un usuario.
 * 
 * @author Marcelino José Granda Muñoz
 * @version (a version number or a date)
 */
public class Usuario
{
    // instance variables - replace the example below with your own
    private String nombre;
      
    //maronutriente ingeridos
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    
    //calorias ingeridas
    private float calorias;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario( String nombre)
    {
        this.nombre   = nombre;
    }

    /**
     * incrementa valores de macronutrientes y calorias de los alimentos segun el alimento y su ingesta
     */
    public void comer(Alimento alimento, float cantidad)
    {
        this.proteinas     = this.proteinas     +(cantidad * alimento.getProteinas()/100 );
        this.carbohidratos = this.carbohidratos +(cantidad * alimento.getCarbohidratos()/100 );
        this.grasas        = this.grasas        +(cantidad * alimento.getGrasas()/100 );
        this.calorias      = this.calorias      +(cantidad * alimento.getCalorias100Gramos()/100 );
        
    }

    /**
     * retorna estadisticas sobre la ingesta que ha hecho el usuario
     */
    public void ingesta()
    {
        System.out.println("Nombre:                            " + this.nombre);
        System.out.println("Gramos de proteinas ingeridos:     " + this.proteinas);
        System.out.println("Gramos de carbohidratos ingeridos: " + this.carbohidratos);
        System.out.println("Gramos de grasas ingeridos:        " + this.grasas);
        System.out.println("Calorias ingeridas:                " + this.calorias);
    }
    
   
   
    
    

}
