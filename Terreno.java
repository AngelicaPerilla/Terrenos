import java.text.DecimalFormat;

public abstract class Terreno implements ContratoTerreno
{
    protected double largo;
    protected double ancho;
    protected String sector;
    protected double area;
    protected double valorXm2;
    protected double precio;
    
    public Terreno()
    {
        this.largo = 0;
        this.ancho = 0;
        this.sector = "";
    }
    
    public Terreno(double largo, double ancho, String sector)
    {
        this.largo = largo;
        this.ancho = ancho;
        this.sector = sector;
    }
    
    public void setLargo(double largo)
    {
        this.largo = largo;
    }
    
    public void setAncho(double ancho)
    {
        this.ancho = ancho;
    }
    
    public void setSector(String sector)
    {
        this.sector = sector;
    }
    
    public double getLargo()
    {
        return this.largo;
    }
    
    public double getAncho()
    {
        return this.ancho;
    }
    
    public String getSector()
    {
        return this.sector;
    }
    
    public abstract double getArea();
        
    public double getValorXm2()
    {
        //Si sector el igual a "urbano" entonces el valorXm2 es de 3000000
        if (sector.toLowerCase().equals("urbano"))//toLowerCase es un metodo que cambia las mayusculas a minusculas
        {
            valorXm2 = 3000000;
        }
        //si no entonces el valoeXm2 es de 1800000
        else
        {
            valorXm2 = 1800000;
        }
        return valorXm2;        
    }
    
    public double getPrecio()
    {
        precio = getValorXm2() * getArea();
        return precio;
    }
    
    public String toString()//Metodo para imrpimir la informacion que se quiere mostrar
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");//Decimal fotmat es un generador de formato de presentacion de un numero
        String mensaje = "Terreno rectangular" + "\n" +
                         "Área: " + getArea() + "m2" + "\n" +
                         "Valor: $" + formato.format(getPrecio()) + "\n";
        return mensaje;
    }
}
