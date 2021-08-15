import java.text.DecimalFormat;

public class TerrenoTriangular extends Terreno
{
    public TerrenoTriangular(double largo, double ancho, String sector)
    {
        super(largo, ancho, sector);
    }
    
    @Override
    public double getArea()
    {
        area = this.largo * this.ancho /2;
        return area;
    }
    
    public String toString()//Metodo para imrpimir la informacion que se quiere mostrar
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");//Decimal fotmat es un generador de formato de presentacion de un numero
        String mensaje = "Terreno triangular" + "\n" +
                         "Área: " + getArea() + "m2" + "\n" +
                         "Valor: $" + formato.format(getPrecio()) + "\n";
        return mensaje;
    }
}
