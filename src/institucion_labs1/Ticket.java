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

    public Ticket(String NombrePasajero, double totalPagado) {
        this.NombrePasajero = NombrePasajero;
        this.TotalPagado = totalPagado;
    }

    public String getNombrePasajero() {
        return NombrePasajero;
    }

    public double getTotalPagado() {
        return TotalPagado;
    }

    public void print() {
        System.out.println("Nombre del Pasajero: " + NombrePasajero + ", Total Pagado: $" + TotalPagado);
    }
}

