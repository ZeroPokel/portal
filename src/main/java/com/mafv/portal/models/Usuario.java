package com.mafv.portal.models;

import java.util.List;

public class Usuario {

    private int codigo;
    private String nombre;
    private String password;
    private String email;


    private List<Permiso> permissions;
    
    public Usuario() {
    }

    public Usuario(int codigo) {
        this.codigo = codigo;
    }

    public Usuario(int codigo, String nombre, String password, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.password = password;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    public List<Permiso> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permiso> permissions) {
        this.permissions = permissions;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     
}

