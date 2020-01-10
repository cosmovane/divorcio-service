package igf.g6.divorciosservice.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "divorcio")
public class Divorcio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre1Esposo")
    private String nombre1Esposo;
    @Column(name = "nombre2Esposo")
    private String nombre2Esposo;
    @Column(name = "apellido1Esposo")
    private String apellido1Esposo;
    @Column(name = "apellido2Esposo")
    private String apellido2Esposo;
    @Column(name = "nombre1Esposa")
    private String nombre1Esposa;
    @Column(name = "nombre2Esposa")
    private String nombre2Esposa;
    @Column(name = "apellido1Esposa")
    private String apellido1Esposa;
    @Column(name = "apellido2Esposa")
    private String apellido2Esposa;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "idEsposo")
    private long idEsposo;
    @Column(name = "idEsposa")
    private long idEsposa;
    @Column(name = "folio")
    private int folio;
    @Column(name = "libro")
    private int libro;
    @Column(name = "departamento")
    private String departamento;
    @Column(name = "nombre1Notario")
    private String nombre1Notario;
    @Column(name = "nombre2Notario")
    private String nombre2Notario;
    @Column(name = "apellido1Notario")
    private String apellido1Notario;
    @Column(name = "apellido2Notario")
    private String apellido2Notario;

    public Divorcio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre1Esposo() {
        return nombre1Esposo;
    }

    public void setNombre1Esposo(String nombre1Esposo) {
        this.nombre1Esposo = nombre1Esposo;
    }

    public String getNombre2Esposo() {
        return nombre2Esposo;
    }

    public void setNombre2Esposo(String nombre2Esposo) {
        this.nombre2Esposo = nombre2Esposo;
    }

    public String getApellido1Esposo() {
        return apellido1Esposo;
    }

    public void setApellido1Esposo(String apellido1Esposo) {
        this.apellido1Esposo = apellido1Esposo;
    }

    public String getApellido2Esposo() {
        return apellido2Esposo;
    }

    public void setApellido2Esposo(String apellido2Esposo) {
        this.apellido2Esposo = apellido2Esposo;
    }

    public String getNombre1Esposa() {
        return nombre1Esposa;
    }

    public void setNombre1Esposa(String nombre1Esposa) {
        this.nombre1Esposa = nombre1Esposa;
    }

    public String getNombre2Esposa() {
        return nombre2Esposa;
    }

    public void setNombre2Esposa(String nombre2Esposa) {
        this.nombre2Esposa = nombre2Esposa;
    }

    public String getApellido1Esposa() {
        return apellido1Esposa;
    }

    public void setApellido1Esposa(String apellido1Esposa) {
        this.apellido1Esposa = apellido1Esposa;
    }

    public String getApellido2Esposa() {
        return apellido2Esposa;
    }

    public void setApellido2Esposa(String apellido2Esposa) {
        this.apellido2Esposa = apellido2Esposa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getIdEsposo() {
        return idEsposo;
    }

    public void setIdEsposo(long idEsposo) {
        this.idEsposo = idEsposo;
    }

    public long getIdEsposa() {
        return idEsposa;
    }

    public void setIdEsposa(long idEsposa) {
        this.idEsposa = idEsposa;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getLibro() {
        return libro;
    }

    public void setLibro(int libro) {
        this.libro = libro;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre1Notario() {
        return nombre1Notario;
    }

    public void setNombre1Notario(String nombre1Notario) {
        this.nombre1Notario = nombre1Notario;
    }

    public String getNombre2Notario() {
        return nombre2Notario;
    }

    public void setNombre2Notario(String nombre2Notario) {
        this.nombre2Notario = nombre2Notario;
    }

    public String getApellido1Notario() {
        return apellido1Notario;
    }

    public void setApellido1Notario(String apellido1Notario) {
        this.apellido1Notario = apellido1Notario;
    }

    public String getApellido2Notario() {
        return apellido2Notario;
    }

    public void setApellido2Notario(String apellido2Notario) {
        this.apellido2Notario = apellido2Notario;
    }
}
