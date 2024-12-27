package entidades;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private Categoria categoria;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "codigo", unique = true)
    private String codigo;

    @Column(name = "precioVentaUnitario")
    private Double precioVentaUnitario;

    @Column(name = "precioCostoUnitario")
    private Double precioCostoUnitario;

    @Column(name = "stock")
    private int stock;

    @Column(name = "disponibilidad")
    private String disponibilidad;

    public Producto(Categoria categoria, String nombre, String descripcion, String codigo, Double precioVentaUnitario, Double precioCostoUnitario, int stock, String disponibilidad) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precioVentaUnitario = precioVentaUnitario;
        this.precioCostoUnitario = precioCostoUnitario;
        this.stock = stock;
        this.disponibilidad = disponibilidad;
    }

    public Producto(Categoria categoria, String nombre, String codigo, Double precioVentaUnitario, Double precioCostoUnitario, int stock, String disponibilidad) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precioVentaUnitario = precioVentaUnitario;
        this.precioCostoUnitario = precioCostoUnitario;
        this.stock = stock;
        this.disponibilidad = disponibilidad;
    }

    public Producto(int idProducto, Categoria categoria, String nombre, String descripcion, String codigo, Double precioVentaUnitario, Double precioCostoUnitario, int stock, String disponibilidad) {
        this.idProducto = idProducto;
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precioVentaUnitario = precioVentaUnitario;
        this.precioCostoUnitario = precioCostoUnitario;
        this.stock = stock;
        this.disponibilidad = disponibilidad;
    }

    public Producto() {
    }

    public Producto(Categoria categoria, String nombre, String descripcion, String codigo, int stock, String disponibilidad) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.stock = stock;
        this.disponibilidad = disponibilidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrecioVentaUnitario() {
        return precioVentaUnitario;
    }

    public void setPrecioVentaUnitario(Double precioVentaUnitario) {
        this.precioVentaUnitario = precioVentaUnitario;
    }

    public Double getPrecioCostoUnitario() {
        return precioCostoUnitario;
    }

    public void setPrecioCostoUnitario(Double precioCostoUnitario) {
        this.precioCostoUnitario = precioCostoUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
