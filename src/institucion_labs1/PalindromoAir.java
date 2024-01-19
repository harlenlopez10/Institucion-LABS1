/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institucion_labs1;

/**
 *
 * @author harle
 */
public class PalindromoAir {
    
    private Ticket[] Asiento = new Ticket[30];
    
    public int firstAvailable() {
        return firstAvailableRecursiva(0);
    }

    private int firstAvailableRecursiva(int index) {
        if (index >= Asiento.length) {
            return -1;
        } else if (Asiento[index] == null) {
            return index;
        } else {
            return firstAvailableRecursiva(index + 1);
        }
    }

    public int searchPassenger(String name) {
        return searchPassengerRecursiva(name, 0);
    }

    private int searchPassengerRecursiva(String name, int index) {
        if (index >= Asiento.length) {
            return -1;
        } else if (Asiento[index] != null && Asiento[index].getNombrePasajero().equals(name)) {
            return index;
        } else {
            return searchPassengerRecursiva(name, index + 1);
        }
    }

     private static boolean isPalindromo(String palabra, int posInicio, int posFin){
        if (posFin >= posInicio) {
            if (palabra.charAt(posInicio)==palabra.charAt(posFin)) {
                return isPalindromo(palabra,posInicio+1,posFin-1);
            }
            return false;
        }
        return true;
    }
    
    public static boolean isPalindromo(String palabra){
        return isPalindromo(palabra,0,palabra.length()-1);
    }

    public void printPassengers() {
        printPassengersRecursiva(0);
    }

    private void printPassengersRecursiva(int index) {
        if (index >= Asiento.length) {
            return;
        } else if (Asiento[index] != null) {
            Asiento[index].print();
        }
        printPassengersRecursiva(index + 1);
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
            Asiento[index] = null;
        }
        resetRecursiva(index + 1);
    }

    public void sellTicket(String name) {
        int availableIndex = firstAvailable();
        if (availableIndex == -1) {
            System.out.println("Lo siento, no hay asientos disponible");
        } else {
            double ticketPrice = 800.0;
            if (isPalindromo(name)) {
                ticketPrice *= 0.8;
            }
            Asiento[availableIndex] = new Ticket(name, ticketPrice);
            System.out.println("Ticket vendido a " + name + " por $" + ticketPrice);
        }
    }

    public boolean cancelTicket(String name) {
        int index = searchPassenger(name);
        if (index == -1) {
            return false;
        } else {
            Asiento[index] = null;
            return true;
        }
    }
    
    
}
