/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONObject;

/**
 *
 * @author alejo
 */
public class Conexion {

    private static URL url;
    private static HttpURLConnection conexion;
    private static StringBuilder response = null;
    private static JSONObject json = null;

    public Conexion() {
        try {
            url = new URL("https://criptoya.com/api/bancostodos");
            conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        } catch (ProtocolException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion");
        }

        // Inicializa response como un nuevo StringBuilder
        response = new StringBuilder();
    }

    public JSONObject json() {
        if (response.length() == 0) { // Verifica si response ya ha sido llenado
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                json = new JSONObject(response.toString());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error, no se puede acceder al servicio API");
            }
        }
        return json;
    }
}
