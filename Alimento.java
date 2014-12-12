
/**
 * Simulara un alimento con las calorias de cada macronutriente
 * 
 * @author Marcelino José Granda Muñoz
 * @version (a version number or a date)
 */
public class Alimento
{
    private String nombre;
    //gramos de las proteinas 4calorias por gramo
    private float gramosProteínas;
    //gramos de carboidratos 4 caloraias por gramo
    private float gramosCarbohidratos;
    //gramos grasas 9 clorias por cada gramo
    private float gramosGrasas;

    /**
     * Constructor donde se indica el nombre y 
     * cantidad en gramos de por cada 100g de producto
     * proteínas, carbohidratos y grasas
     */
    public Alimento(String nombre, float gramosProteínas, float gramosCarbohidratos , float gramosGrasas)
    {
        //nombre alimento
        this.nombre = nombre;
        
        //macronutrientes por cien gramos de producto
        this.gramosProteínas     = gramosProteínas;
        this.gramosCarbohidratos = gramosCarbohidratos;
        this.gramosGrasas        = gramosGrasas;
    }

    /**
     * muestra los datos nutricionles del alimento
     */

    public void muestraDatos()
    {
        System.out.println("Nombre:                            " + nombre);
        System.out.println("Proteinas por cada 100 gramos:     " + this.gramosProteínas);
        System.out.println("Carbohidratos por cada 100 gramos: " + this.gramosCarbohidratos);
        System.out.println("Grasas por cada 100 gramos:        " + this.gramosGrasas);
        System.out.println("Calorias:                          " + getCalorias100Gramos());
        System.out.println("Componente/s mayoritario/s:        " + componenteMayor());

    }

    /**
     * retorna el numero de calorias por cada 100 gramos de producto
     */
    public float getCalorias100Gramos()
    {
        return  (this.gramosProteínas * 4) + 
                (this.gramosCarbohidratos * 4) + 
                (this.gramosGrasas * 9);
    }

    /**
     * retorna elnombre
     */
    public String getNombre()
    {
        return this.nombre;
    }
    
    /**
     * retorna la cantidad de proteinas
     */
    public float getProteinas()
    {
        return this.gramosProteínas;
    }
    
    /**
     * retorna la cantidad de hidratosdecarbono
     */
    public float getCarbohidratos()
    {
        return this.gramosCarbohidratos;
    }
    
      /**
     * retorna la cantidad de grasas
     */
    public float getGrasas()
    {
        return this.gramosGrasas ;
    }
    
    
    /**
     * retorna cadena de caracteres con macronutriente con mayor cantidad en el producto 
     */
    private String componenteMayor()
    {
        String macro;
        macro = "";
        //todos estan en la misma proporcion
        if(this.gramosProteínas == this.gramosGrasas &&  this.gramosCarbohidratos == this.gramosGrasas )
        {
            macro = "Todos los macronutrientes se encuentran en la misma proporción";
        }

        //proteinas y carboidratos en nmisma proporcion
        else if(this.gramosProteínas == this.gramosCarbohidratos)
        {   

            //grasas y proteinas estan en mayor proporcion
            if(this.gramosProteínas > this.gramosGrasas)
            {
                macro = "Proteinas y grasas";
            }
            else
            {
                macro = "hidratos de carbono";
            }
        }

        //carbohidratos y grasas en misma proporcion
        else if (this.gramosCarbohidratos == this.gramosGrasas) 
        {
            if(this.gramosCarbohidratos > this.gramosProteínas )
            {
                macro = "Carbohidratos y grasas";
            }
            else
            {
                macro = "Proteinas";
            }
        }

        //carboidratos y proteinas en misma proporcion
        else if (this.gramosCarbohidratos == this.gramosProteínas)
        {
            if( this.gramosCarbohidratos > this.gramosGrasas)
            {
                macro = "Carbohidratos y proteinas";
            }
            else
            {
                macro = "Grasas";
            }
        }
        else if (this.gramosProteínas > this.gramosCarbohidratos )
        {
            if (this.gramosProteínas > this.gramosGrasas )
            {
                macro = "Proteinas ";
            }
            else
            {
                macro = "Grasas";
            }
        }
        else if (this.gramosCarbohidratos > this.gramosGrasas)
        {
            macro = "Carbohidratos";
        }
        else
        {
            macro = "Grasas";
        }
        return macro;
    }

}
