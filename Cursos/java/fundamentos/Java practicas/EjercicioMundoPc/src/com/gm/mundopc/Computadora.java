package com.gm.mundopc;

public class Computadora {
    private final int  idComputadora;

    private static int contadorComputadoras;

    private String nombre;

    private Monitor monitor;

    private Teclado teclado;

    private Raton raton;

    public Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public static int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static void setContadorComputadoras(int contadorComputadoras) {
        Computadora.contadorComputadoras = contadorComputadoras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Computadora {idComputadora=");
        builder.append(idComputadora);
        builder.append(", monitor=");
        builder.append(monitor);
        builder.append(", nombre=");
        builder.append(nombre);
        builder.append(", raton=");
        builder.append(raton);
        builder.append(", teclado=");
        builder.append(teclado);
        builder.append("}");
        return builder.toString();
    }

    
}
