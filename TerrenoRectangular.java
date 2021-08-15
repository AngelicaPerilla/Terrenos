public class TerrenoRectangular extends Terreno
{
    public TerrenoRectangular(double largo, double ancho, String sector)
    {
        super(largo, ancho, sector);
    }
    
    public double getArea()
    {
        area = this.largo * this.ancho;
        return area;
    }
}
