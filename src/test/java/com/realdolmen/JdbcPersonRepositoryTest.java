package com.realdolmen;

import junit.framework.Assert;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class JdbcPersonRepositoryTest {

    @Before
    public void initializeDataSets() throws Exception{
        // 1. Create DBUnit connection
        Connection jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test-DBUnit", "root", "");
        IDatabaseConnection databaseConnection = new DatabaseConnection(jdbcConnection);
        // 2. Load dataset "people.xml"
        IDataSet peopleDataset = new FlatXmlDataSetBuilder().build(new File("people.xml"));
        //3. Exe
        DatabaseOperation.CLEAN_INSERT.execute(databaseConnection, peopleDataset);
        //4.
    }
    @Test
    public void testPersonCanBeFoundById() throws Exception{
        PersonRepository repository = new JdbcPersonRepository();
        Person person = repository.find(2);
        assertEquals("Janis", person.getFirstName()) ;
        assertEquals("Joplin", person.getLastName());
    }

    @Test
    public void testCityCanBeFoundById() throws Exception{
        PersonRepository repository = new JdbcPersonRepository();
        Person person = repository.find(2);
        assertEquals("CA", person.getAddress().getCity().getPostalCode());
    }
}
