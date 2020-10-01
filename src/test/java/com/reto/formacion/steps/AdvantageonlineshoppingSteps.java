package com.reto.formacion.steps;

import com.reto.formacion.pageobjects.AdvantageonlineshoppingPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class AdvantageonlineshoppingSteps {

    AdvantageonlineshoppingPageObject advantageonlineshoppingPageObject;
    @Step
    public void ingresarPagina() {
        // TODO Auto-generated method stub
        advantageonlineshoppingPageObject.open();
        advantageonlineshoppingPageObject.MenuOpcionCrearUser();
    }

    public void CrearUsuario(String userName, String email, String passWord, String firstName, String lastName, String phoneNumber, String country, String city, String address, String state, String postalCode) {
        advantageonlineshoppingPageObject.CrearUsuario(userName,email,passWord,firstName,lastName,phoneNumber,country,city,address,state,postalCode);
    }

    public void SeleccionarElemento(String elemento) {
        advantageonlineshoppingPageObject.SeleccionarElemento(elemento);
    }

    public void IniciarSesion(String userName, String passWord) {
        advantageonlineshoppingPageObject.IniciarSesion(userName,passWord);
    }

    public void ValidarCompra(String elemento) {
        advantageonlineshoppingPageObject.ValidarCompra(elemento);
    }
}
