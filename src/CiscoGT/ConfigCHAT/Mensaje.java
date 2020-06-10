/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CiscoGT.ConfigCHAT;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Carlos Bautista
 * @CanalOficcial Cisco GT
 * @Carrera Ingenieria en Sistemas y TICs
 *
 */

public class Mensaje implements Serializable
{
    // para pasar un objeto creado por el usuario como parámetro en RMI, debe ser serializable
    
    private String usuario;
    private String msg;
    private String tipo;
    private Date datos;
    private String smil;

    
    public String getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(String usuario) 
    {
        this.usuario = usuario;
    }

    public String getMsg() 
    {
        return msg;
    }

    public void setMsg(String msg) 
    {
        this.msg = msg;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public Date getDatos() 
    {
        return datos;
    }

    public void setDatos(Date datos) 
    {
        this.datos = datos;
    }

    public String getSmil() 
    {
        return smil;
    }

    public void setSmil(String smil) 
    {
        this.smil = smil;
    }    
}
