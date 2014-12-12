
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
    public Alimento(float gramosProteínas, float gramosCarbohidratos , float gramosGrasas)
    {
        this.gramosProteínas     = gramosProteínas;
        this.gramosCarbohidratos = gramosCarbohidratos;
        this.gramosGrasas        = gramosGrasas;
    }

   
}
