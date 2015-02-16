package com.fjab.jossoclient;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/*

EL OBJETIVO DE ESTA APP ES CREAR UN CLIENTE ANDROID DE UN RESTSERVICE SPRING CON SEGURIDAD SPRING INTEGRADO
CON JOSSO. EL SERVICIO JOSSO PUEDE ESTAR BASADO EN EL SERVICIO REST RSINMEMORY MODIFICADO PARA INTEGRARLO
CON JOSSO SEGUN ANDREA BANDERA. DEBE PODER LOGUEARSE Y UNA VEZ HECHO MANEJARSE CON LA SESSION CREADA. EL
SERVICIO REST PUEDE USAR UNA BASE NO ES NECESARIO USAR LDAP, ES TRANSPARENTE PARA EL REST CUAL ES EL ORIGEN
DE DATOS.

EL SERVICIO REST ESTA FUNCIONANDO OK ES RSJOSSO /home/francisco/Documents/proyectos/rsjosso

ABRIR NAVEGADOR EN VENTANA LOGUEARSE EN JOSSO Y OBTENER EL VALOR  DE LA SESSION JOSSO (ID DE COOKIE).
LUEGO DE OBTENIDO EL ID DE COOKIE MANDARLO CON CADA REQUEST PARA ACCEDER A METODOS DE SERVICIO REST

LO IDEAL ES ENVIAR EL REQUEST A UNA DETERMINADA URL, AL NO ESTAR LOGUEADO PASAS POR EL LOGIN Y DESPUES DE ESTO
RETORNA EL VALOR DE LA SESSION JOSSO EN LA RESPUESTA (TODO DE UNA), LUEGO EN CADA REQUEST ENVIAS LA COOKIE SETEADA

 */


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
