package com.reto.formacion.definition;

import com.reto.formacion.steps.AdvantageonlineshoppingSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class advantageonlineshoppingDefinition {

    @Steps
    AdvantageonlineshoppingSteps advantageonlineshoppingSteps;

    @Given("^que el usuario ingresa a la pagina$")
    public void que_el_usuario_ingresa_a_la_pagina() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        advantageonlineshoppingSteps.ingresarPagina();
    }

    @Given("^se registrar con \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" y \"([^\"]*)\"$")
    public void se_registrar_con_y(String UserName,String Email,String PassWord,String FirstName,String LastName,String PhoneNumber,String Country,String City,String Address,String State,String PostalCode) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        advantageonlineshoppingSteps.CrearUsuario(UserName,Email,PassWord,FirstName,LastName,PhoneNumber,Country,City,Address,State,PostalCode);
        //advantageonlineshoppingSteps.IniciarSesion(UserName,PassWord);
    }

    @When("^ingresa a la barra de menu y adicionar el elemento \"([^\"]*)\" al carrito de compras$")
    public void ingresa_a_la_barra_de_menu_y_adicionar_el_elemento_al_carrito_de_compras(String elemento) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        advantageonlineshoppingSteps.SeleccionarElemento(elemento);

    }

    @Then("^el carrito de compras debe tener el elemento \"([^\"]*)\"$")
    public void el_carrito_de_compras_debe_tener_el_elemento(String elemento) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        advantageonlineshoppingSteps.ValidarCompra(elemento);

    }
}
