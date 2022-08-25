package com.mycompany.produtos;

import java.net.MalformedURLException;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;

        
public class Main {
    public static void main(String[] args) throws MalformedURLException{
        HttpClient httpClient = (HttpClient) new StdHttpClient.Builder().
            url("http://127.0.0.1:5984").
            username("hacjesse").
            password("1243").
            build();
        
        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        CouchDbConnector connector = dbInstance.createConnector("jcouch", true);
       
        Person person = new Person();
        
        
        person.setName("ale");
        
        connector.create(person);
        System.out.println("CRIANDO PESSOA");
        System.out.println("ID: " + person.getId());
        System.out.println("Rev: " + person.getRevision());
        System.out.println("Nome: " + person.getName());
        
        
        connector.get(Person.class, person.getId());
        person.setName("Mr tst");
        
        
        connector.update(person);
        System.out.println("ATUALIZANDO PESSOA");
        System.out.println("Nome atualizado: " + person.getName());
        
        
        connector.delete(person);
        System.out.println("DELETANDO PESSOA.");
      
    }
}