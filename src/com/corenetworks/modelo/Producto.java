package com.corenetworks.modelo;

import java.util.Objects;

public class Producto {
    private int IdProducto;
    private String nombreProducto;
    private double precioUnid;
    private  int unidadesStock;

    @Override
    public String toString() {
        return "Producto{" +
                "IdProducto=" + IdProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioUnid=" + precioUnid +
                ", unidadesStock=" + unidadesStock +
                '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return IdProducto == producto.IdProducto && Double.compare(precioUnid, producto.precioUnid) == 0 && unidadesStock == producto.unidadesStock && Objects.equals(nombreProducto, producto.nombreProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdProducto, nombreProducto, precioUnid, unidadesStock);
    }

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, double precioUnid, int unidadesStock) {
        IdProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnid = precioUnid;
        this.unidadesStock = unidadesStock;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnid() {
        return precioUnid;
    }

    public void setPrecioUnid(double precioUnid) {
        this.precioUnid = precioUnid;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }
}
