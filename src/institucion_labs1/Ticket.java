/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institucion_labs1;

/**
 *
 * @author harle
 */
public class Ticket {
    
    private String NombrePasajero;
    private double TotalPagado;

    public Ticket(String passengerName, double totalPaid) {
        this.NombrePasajero = passengerName;
        this.TotalPagado = totalPaid;
    }

    public String getPassengerName() {
        return NombrePasajero;
    }

    public double getTotalPaid() {
        return TotalPagado;
    }

    public void print() {
        System.out.println("Passenger Name: " + NombrePasajero + ", Total Paid: $" + TotalPagado);
    }
}

