package com.juanpedrosanchez.entities;

import java.io.Serializable;

/**
 * Created by Juan Pedro Sánchez on 11/11/17.
 */


public class Usuario implements Serializable{
    private String nickname;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String password;

    public Usuario(String nickname) {
        this.nickname = nickname;
    }

    public Usuario(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public Usuario(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public Usuario(String nickname, String nombre, String apellido1, String apellido2, String email,
                   String password) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.password = password;
    }

    public Usuario (){

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void extraerDatos(String datos){
        String [] info = datos.split(":");
        nickname = info[0];
        nombre = info[1];
        apellido1 = info[2];
        apellido2 = info[3];
        email = info[4];
        password = info[5];

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;

        Usuario usuario = (Usuario) o;

        if (!getNickname().equals(usuario.getNickname())) return false;
        return getPassword().equals(usuario.getPassword());
    }

    @Override
    public int hashCode() {
        int result = getNickname().hashCode();
        result = 31 * result + getPassword().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nickname='" + nickname + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
