
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
    public void imprimeEstadistica()
    {
        System.out.println("Nombre:                            " + this.nombre);
        System.out.println("Gramos de proteinas ingeridos:     " + this.proteinas);
        System.out.println("Gramos de carbohidratos ingeridos: " + this.carbohidratos);
        System.out.println("Gramos de grasas ingeridos:        " + this.grasas);
        System.out.println("Calorias ingeridas:                " + this.calorias);
    }

    /**
     * retorna estadisticas sobre la ingesta enporcentaje
     */
    public void imprimeEstadisticaPorcentaje()
    {
        float total = this.proteinas +this.carbohidratos +this.grasas;
        System.out.println("Nombre:                            " + this.nombre);
        System.out.println("Gramos de proteinas ingeridos:     " + this.proteinas       + "  " + (this.proteinas/total) + "%");
        System.out.println("Gramos de carbohidratos ingeridos: " + this.carbohidratos   + "  " + (this.proteinas/total) + "%");
        System.out.println("Gramos de grasas ingeridos:        " + this.grasas          + "  " + (this.proteinas/total) + "%");
        System.out.println("Calorias ingeridas:                " + this.calorias);

    }

    /**
     * retorna numero de calorias consumidas hasta el momento
     */
    public float getCalorias()
    {
        return this.calorias;
    }
    
    /**
     * retorna nombre usuario
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * realiza una comparativa de ingesta de calorias e imprime un mensaje indicando quien tiene un mayor consumo de calorias
     */
    public void comparativa(Usuario usuario)
    {
        String compara = "mas";
        if (this.calorias < usuario.getCalorias())
        {
            compara = "menos";
        }
         System.out.println(this.nombre + " ha consumido " + compara + " calorias que " + usuario.getNombre());
    }
}