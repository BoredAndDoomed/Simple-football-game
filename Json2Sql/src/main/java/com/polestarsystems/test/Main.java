package com.polestarsystems.test;

import com.google.gson.Gson;

import java.io.*;
import java.util.Scanner;

public class Main {



    static  Scanner scanner=new Scanner(System.in);
    
    
    public static void main(String [] args){


        Gson gson = new Gson();



         System.out.println("Please enter your input file url  (right click your json file copy the path and paste here) ");
         String path=scanner.nextLine();
         System.out.println(path);
         File file = new File(path);
         PrintStream console = System.out;
    	 
         System.out.println("Please enter your output file url like this (right click your json file copy the path and paste here) and enter blank for console output");
         String path2 = scanner.nextLine();
         System.out.println(path2);
         if (path2.isEmpty()) {
        	 System.setOut(console);
         }
         else {
        	try {
        		PrintStream p = new PrintStream(new File(path2));
				System.setOut(p);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("Output file path does not exist! Redirecting output to console instead!");
			} 
         }
         
         
         
         



        try (


                Reader reader = new FileReader(file)) {

            // Convert JSON File to Java Object
            Data [] data = gson.fromJson(reader, Data[].class);

            // print staff


            System.out.println("" +
                    "CREATE TABLE Towerdata(\n" +
                    "    towerId int NOT NULL AUTO_INCREMENT,\n" +
                    "    Name  varchar(255),\n" +
                    "    AlarmColor varchar(255),\n" +
                    "    Id int,\n" +
                    "    DatasourcesCount varchar(255),\n" +
                    "   alertIcon varchar(255),\n" +
                    "   ElementCount varchar(255),\n" +
                    "   UniqueID varchar(255),\n" +
                    "   PRIMARY KEY (towerId)\n" +

                    ");");

            System.out.println("" +
                    "CREATE TABLE Parameters (\n" +
                    "    parameterid int NOT NULL AUTO_INCREMENT,\n" +
                    "    keyvalue  varchar(255),\n" +
                    "    value  varchar(255),\n" +
                    "    Id  varchar(255),\n" +
                    "    PRIMARY KEY (parameterid),\n" +
                    "    FOREIGN KEY (parameterid) REFERENCES Towerdata(towerId)\n" +

                    ");");
            for(Data user : data) {
                System.out.println("INSERT INTO Towerdata ( Name,AlarmColor,Id,DatasourcesCount,alertIcon,ElementCount,UniqueID) values ('"+user.getName()+"','"+user.getAlarmColor()+"','"+user.getId()+"','"+user.getDatasourcesCount()+"','"+user.getAlertIcon()+"'," +
                        "'"+user.getElementCount()+"','"+user.getUniqueID()+"'); ");
            }

            System.out.println("/*insert parameter table*/");
            for(Data user : data) {
                System.out.println("INSERT INTO Parameters ( keyvalue,value,Id) values ('"+user.getParameters().get(0).getKey()+"','"+user.getParameters().get(0).getValue()+"','"+user.getId()+"'); ");
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
