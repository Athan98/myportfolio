package data;


import entidades.Divisa;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class DivisaData2 {

    private JSONObject json = null;

    public DivisaData2(Conexion2 con) {
        this.json = con.json();
    }
    
    public float cotizacionTipoDolar(Divisa divisa) {

        try {
            return json.getFloat(divisa.getBanco());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la cotizacion");
        }
        return 0.0f;

    }
    
     public float variacionTipoDolar(Divisa divisa) {

        try {
            return json.getFloat(divisa.getVariacion());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener la variacion");
        }
        return 0.0f;

    }
}
