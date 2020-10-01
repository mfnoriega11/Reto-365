package com.reto.formacion.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;




import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class AdvantageonlineshoppingPageObject extends PageObject {

    //Opciones para crear Usuario
    @FindBy(xpath = "//*[@id='menuUser']")
    public WebElementFacade menuUser;
    @FindBy(xpath="//*[@translate='CREATE_NEW_ACCOUNT']")
    public WebElementFacade opcionCrearUsuario;

    //Campos para ingresar Información para registro del usuario
    @FindBy(xpath = "//input[@name='usernameRegisterPage']")
    public WebElementFacade txtUserName;
    @FindBy(xpath = "//input[@name='emailRegisterPage']")
    public WebElementFacade txtEmail;
    @FindBy(xpath = "//input[@name='passwordRegisterPage']")
    public  WebElementFacade txtPassWord;
    @FindBy(xpath = "//input[@name='confirm_passwordRegisterPage']")
    public  WebElementFacade txtConfirmPassWord;
    @FindBy(xpath = "//input[@name='first_nameRegisterPage']")
    public WebElementFacade txtFirstName;
    @FindBy(xpath = "//input[@name='last_nameRegisterPage']")
    public  WebElementFacade txtLastName;
    @FindBy(xpath = "//input[@name='phone_numberRegisterPage']")
    public WebElementFacade txtPhone;
    @FindBy(xpath = "//select[@name='countryListboxRegisterPage']")
    public  WebElementFacade selecCountry;
    @FindBy(xpath = "//input[@name='cityRegisterPage']")
    public WebElementFacade txtCity;
    @FindBy(xpath = "//input[@name='addressRegisterPage']")
    public WebElementFacade txtAddress;
    @FindBy(xpath = "//input[@name='state_/_province_/_regionRegisterPage']")
    public WebElementFacade txtState;
    @FindBy(xpath = "//input[@name='postal_codeRegisterPage']")
    public WebElementFacade txtPostal;
    @FindBy(xpath = "//input[@name='i_agree']")
    public WebElementFacade txtAceptar;
    @FindBy(xpath = "//*[@id='register_btnundefined']")
    public WebElementFacade btnRegistrar;
    @FindBy(xpath = "//*[@id='menuUserLink']/span")
    public WebElementFacade btnSeleccionarPerfil;
    @FindBy(xpath = "//*[@id='loginMiniTitle']/label[3]")
    public WebElementFacade btnCerraSesion;

    //Iniciar Sesion
    @FindBy(xpath = "/html/body/login-modal/div/div/div[3]")
    public WebElementFacade areaFormulario;
    @FindBy(xpath = "//input[@name='username']")
    public WebElementFacade txtUserNameLogin;
    @FindBy(xpath = "//input[@name='password']")
    public  WebElementFacade txtPassWordLogin;
    @FindBy(xpath = "//*[@id='sign_in_btnundefined']")
    public WebElementFacade btnInciarSesion;


    //Seleccionar elemento
    @FindBy(xpath = "//*[@id='tabletsTxt']")
    public WebElementFacade lblElementoTable;
    @FindBy(xpath = ".//a[text()='HP Elite x2 1011 G1 Tablet']")
    public WebElementFacade txtElemento;
    @FindBy(xpath = "//*[@id='productProperties']/div[4]/button")
    public WebElementFacade btnAgregarElementoCarrito;

    //ValidarCompra
    @FindBy(xpath = "//*[@id='menuCart']")
    public WebElementFacade btnMenuCart;
    @FindBy(xpath = "//*[@id='product']/td[2]/a/h3")
    public WebElementFacade lbelElementoEnCart;



    public void MenuOpcionCrearUser(){
        menuUser.click();
        opcionCrearUsuario.click();
    }

    public void CrearUsuario(String userName,
                             String email,
                             String passWord,
                             String firstName,
                             String lastName,
                             String phoneNumber,
                             String country,
                             String city,
                             String address,
                             String state,
                             String postalCode) {
        txtUserName.sendKeys(userName);
        txtEmail.sendKeys(email);
        txtPassWord.sendKeys(passWord);
        txtConfirmPassWord.sendKeys(passWord);
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtPhone.sendKeys(phoneNumber);
        selecCountry.sendKeys(country);
        txtCity.sendKeys(city);
        txtAddress.sendKeys(address);
        txtState.sendKeys(state);
        txtPostal.sendKeys(postalCode);
        txtAceptar.click();
        btnRegistrar.click();
        //btnSeleccionarPerfil.click();
       // btnCerraSesion.click();

    }

    public void IniciarSesion(String UserName,String PassWord){
        menuUser.click();
        areaFormulario.click();
        txtUserNameLogin.sendKeys(UserName);
        txtPassWordLogin.sendKeys(PassWord);
        btnInciarSesion.click();
    }

    public void SeleccionarElemento(String elemento){
        waitFor(5).second();
        lblElementoTable.click();
        txtElemento.click();
        //txtElemento.findBy(By.xpath(".//a[text()='"+elemento+"']")).click();
        btnAgregarElementoCarrito.click();
    }

    public void ValidarCompra(String elemento) {
        waitFor(5).second();
        btnMenuCart.click();
        String labelMensajeValidarCompra = elemento;
        String strMensajeValidarCompra = lbelElementoEnCart.getText();
        assertThat(strMensajeValidarCompra,containsString(labelMensajeValidarCompra));
    }
}
