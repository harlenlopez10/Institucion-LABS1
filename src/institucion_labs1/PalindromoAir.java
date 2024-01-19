/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institucion_labs1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author harle
 */
public class PalindromoAir {
    
     private Ticket[] Asiento;

    public PalindromoAir() {
        Asiento = new Ticket[30];
    }
    
    public int firstAvailable() {
        return firstAvailableRecursiva(0);
    }

    private int firstAvailableRecursiva(int index) {

        if (index < Asiento.length) {
            if (Asiento[index] == null) {
                return index;
            }
            return firstAvailableRecursiva(index + 1);
        }
        return -1;
    }

    public int searchPassenger(String name) {
        return searchPassengerRecursiva(name, 0);
    }

    private int searchPassengerRecursiva(String name, int index) {
        if (index >= Asiento.length) {
            return -1; 
        }

        if (Asiento[index] != null && Asiento[index].getNombrePasajero().equals(name)) {
            return index; 
        }

        return searchPassengerRecursiva(name, index + 1); 
    }

    private static boolean isPalindromo(String palabra, int posInicio, int posFin) {
        if (posFin >= posInicio) {
            if (palabra.charAt(posInicio)==palabra.charAt(posFin)) {
                return isPalindromo(palabra,posInicio+1,posFin-1);
            }
            return false;
        }
        return true;
    }

    public static boolean isPalindromo(String palabra) {
        return isPalindromo(palabra, 0, palabra.length() - 1);
    }

    private void printPassengersRecursiva(StringBuilder infoPasajeros, int index) {
        if (index < Asiento.length) {
            if (Asiento[index] != null) {
                infoPasajeros.append(Asiento[index].getNombrePasajero()).append(" - $. ").append(Asiento[index].getTotalPagado()).append("\n");
            }
            printPassengersRecursiva(infoPasajeros, index + 1);
        }
    }

    public String printPassengers() {
        StringBuilder passengersInfo = new StringBuilder();
        printPassengersRecursiva(passengersInfo, 0);
        return passengersInfo.toString();
    }

    public double income() {
        return incomeRecursiva(0);
    }

    private double incomeRecursiva(int index) {
        if (index >= Asiento.length) {
            return 0;
        } else if (Asiento[index] != null) {
            return Asiento[index].getTotalPagado() + incomeRecursiva(index + 1);
        } else {
            return incomeRecursiva(index + 1);
        }
    }

    public void reset() {
        resetRecursiva(0);
    }

    private void resetRecursiva(int index) {
        if (index >= Asiento.length) {
            return;
        } else {
            Asiento[index]=null;
        }
        resetRecursiva(index + 1);
    }

    public void sellTicket(String name) {
        int porcentaje = 0;
        int indexDisponible = firstAvailable();
        
        if (indexDisponible == -1) {
            JOptionPane.showMessageDialog(null,"Lo siento, no hay asientos disponible");
        } else {
            
            double ticketPrice = 800.0;
            
            if (isPalindromo(name)==true) {
                porcentaje=20;
                ticketPrice = ticketPrice-(ticketPrice*porcentaje);
            }
            Asiento[indexDisponible] = new Ticket(name, ticketPrice);
             JOptionPane.showMessageDialog(null, "Descuento aplicado: " + porcentaje + "\nComprador: " + name + "\nCompra Exitosa");
        }
    }

    public boolean cancelTicket(String name) {
        
        int index = searchPassenger(name);
        if (index == -1) {
            return false;
        } else {
            Asiento[index]=null;
            return true;
        }
    }
    
    
}
