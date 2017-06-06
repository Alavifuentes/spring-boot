package com.dh.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Alavi on 03/06/2017.
 */
@Document
public class Teacher {

    @Id
    @Transient
    private String id;
    private String nombre;
    private long ci;
    private String prefession;
    public Teacher(String id, String nombre, long ci, String profession)
    {
        this.id=id;
        this.nombre=nombre;
        this.ci=ci;
        this.prefession=profession;
    }
public Teacher()
{

}
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public void setPrefession(String prefession) {
        this.prefession = prefession;
    }

    public String getId() {

        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public long getCi() {
        return ci;
    }

    public String getPrefession() {
        return prefession;
    }
}
