import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PantallaGrafica
{
    private ArrayList<Terreno> terrenos;
    private int cantTerrenos;
    private double precio;
    
    public void preguntarDatos()
    {
        cantTerrenos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de terrenos: "));//Cuantos terrenos se requiere crear
        
        //Recorrido por el conjunto de arreglo de terrenos.
        for(int i=0; i < cantTerrenos; i++)//Se hace con un "for" porque se debe ingresar la información de 5 terrenos, asi que las preguntas se deben hacer 5 veces.
        {
            String forma = JOptionPane.showInputDialog(null, "Ingrese la forma del terreno: " + (i +1) + "(rectangular, triangular o trapezoidal): ");
            double largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo del terreno: " + (i +1) + ":"));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho del terreno: " + (i +1) + ":"));
            String sector = JOptionPane.showInputDialog(null, "Ingrese el sector del terreno: " + (i +1) + "(Urbano/Rural): ");
            
            if(forma.toLowerCase().equals("rectangular"))
            {
                terrenos.add(new TerrenoRectangular(largo, ancho, sector));
            }
            else if(forma.toLowerCase().equals("triangular"))
            {
                terrenos.add(new TerrenoTriangular(largo, ancho, sector));
            }
            else if(forma.toLowerCase().equals("trapezoidal"))
            {
                double largo2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo largo del terreno: " + (i +1) + ":"));
                terrenos.add(new TerrenoTrapezoidal(largo, ancho, sector, largo2));
            }
        }
        
    }
       
    public void calcularPrecios()
    {
        precio = 0;//Acumulador
        for (int i = 0; i < cantTerrenos; i++)
        {
            precio = precio + terrenos.get(i).getPrecio();
        }
    }
    
    public void mostrarPrecio()
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        for(int i = 0; i < cantTerrenos; i++)
        {
            JOptionPane.showMessageDialog(null, terrenos.get(i).toString());
        }
        JOptionPane.showMessageDialog(null, "El valor total de los terrenos es $ " + formato.format(precio));
    }
    
}
