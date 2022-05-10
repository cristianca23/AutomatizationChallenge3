package co.com.choucair.certification.SISTECREDITO.util;

import com.github.javafaker.Faker;

public class HelpersLogin {

    /**
     * PATH DEL CHROMEDRIVER
     */
    public static final String FALABELLA_LINK = "environments.default.webdriver.base.url";


    /**Variables para asersiones*/

    public static final String WELCOME = "Bienvenid@,";
    /**Metodos, Variables de Ayudas*/

    private static Faker faker = new Faker();

    /**Generar un apellido random*/
    public static String apellidoRandom(){
        return faker.name().lastName();

    }

    public static String apellidoRandomMother(){
        return apellidoRandom();
    }

    /**Generar un email aleatorio*/
    public static String randomEmail(){
        return faker.internet().emailAddress();

    }

    /**Generar una identificación aleatoria*/
    public static String randomId(){
        return  String.valueOf(faker.number().numberBetween(10000000,100000000));

    }

    /**Generar una clave aleatoria*/

    public static String randomPassword(){
        return faker.internet().password();

    }


    /** Seleccionar un genero random*/
    public static String randomSelectorGender(){
        int variableTemporal = faker.number().numberBetween(1,2);
        if (variableTemporal == 1){
            return  "male";

        }else {
            return  "female";

        }
    }
    /** Seleccionar un día random*/

    public static int randomDaySelector(){
        return faker.number().numberBetween(1,31);

    }

    /**Seleccionar un mes random*/
    public static String randomMonthSelector(){
         int mesRandom =faker.number().numberBetween(1,12);

         if (mesRandom < 10){
             return "0"+mesRandom+"";
         }else {
             return String.valueOf(mesRandom);
         }

    }

    /**Generar un año aleatorio y que sea mayor a 18 años de antigueadad*/
    public static int randomYearSelector(){
        int variableTemporal = faker.number().numberBetween(1912,2022);

        if (variableTemporal > 2004){
            return variableTemporal-18;

        }else {
            return variableTemporal;
        }
    }

    /**Generar un celular aleatorio*/

    public static String randomPhoneNumber(){
        String phoneNumber = String.valueOf(faker.number().numberBetween(100000000,1000000000));

        return "03"+phoneNumber+"";

    }
    
}
