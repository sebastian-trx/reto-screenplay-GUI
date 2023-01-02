package co.com.sofka.models;

import com.github.javafaker.Faker;


public class UserInformation {

    private UserInformation(){}
    static Faker faker = new Faker();
    public static final String FIRST_NAME = faker.name().firstName().replaceAll("\\s","");

    public static final String LAST_NAME = faker.name().lastName().replaceAll("\\s","");

    public static final String EMAIL = faker.color().name().replaceAll("\\s","")+"@yopmail.com";

    public static final String COUNTRY = faker.country().name().replaceAll("\\s","");

    public static final String CITY = faker.country().capital().replaceAll("\\s","");

    public static final String ADDRESS = faker.address().streetAddress().replaceAll("\\s","");

    public static final String ZIP_CODE = faker.address().zipCode();

    public static final String CELULAR = faker.phoneNumber().cellPhone();







}
