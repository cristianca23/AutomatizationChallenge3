package co.com.choucair.certification.SISTECREDITO.util;

import com.github.javafaker.Faker;

public class HelpersMain {

    private static Faker faker = new Faker();
    /**Metodo para tomar un número aleatorio*/

    public static String randomProduct(){
        return  String.valueOf(faker.number().numberBetween(1,32));

    }

    public static String randomAdress(){
        return faker.address().buildingNumber();

    }


    public static String randomName(){
        return faker.address().streetName();
    }

    /**Metodo para validar la question de compra*/

    public static final String CHOOSE_METHOD = "Elige tu medio de pago";
}
