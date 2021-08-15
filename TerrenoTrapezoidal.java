import java.text.DecimalFormat;

public class TerrenoTrapezoidal extends Terreno
{
    private double largo2;
    
    public TerrenoTrapezoidal()
    {
        super();
        this.largo2 = 0;
    }
    
    public TerrenoTrapezoidal(double largo, double ancho, String sector, double largo2)
    {
        super(largo, ancho, sector);
        this.largo2 = largo2;
    }
    
    public void setLargo2(double largo2)
    {
        this.largo2 = largo2;
    }
    
    public double getLargo2()
    {
        return this.largo2;
    }
    
    @Override
    public double getArea()
    {
        area = (this.largo + this.largo2) * this.ancho / 2;
        return area;
    }
    
    public String toString()//Metodo para imrpimir la informacion que se quiere mostrar
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");//Decimal fotmat es un generador de formato de presentacion de un numero
        String mensaje = "Terreno trapezolidal" + "\n" +
                         "Área: " + getArea() + "m2" + "\n" +
                         "Valor: $" + formato.format(getPrecio()) + "\n";
        return mensaje;
    }
}
