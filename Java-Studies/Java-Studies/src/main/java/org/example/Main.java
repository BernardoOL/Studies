package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path:");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> registros = new TreeMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if (registros.containsKey(name)) {
                    registros.put(name, (registros.get(name) + votes));
                    line = br.readLine();
                } else {
                    registros.put(name, votes);
                    line = br.readLine();
                }

            }

            System.out.println("All Votes: ");
            for (String registro : registros.keySet()){
                System.out.println(registro + ": " + registros.get(registro));
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

//In the vote counting of an election, several voting records are generated containing the candidate's name
// and the number of votes (in .csv format) that they received from a ballot box.
// You need to create a program to read the voting records from a file and then generate a consolidated report with the totals for each candidate.

//Create a text file with the information below
//C:\tmp\in.txt

//Alex Blue,15
//Maria Green,22
//Bob Brown,21
//Alex Blue,30
//Bob Brown,15
//Maria Green,27
//Maria Green,22
//Bob Brown,25
//Alex Blue,31

//Na contagem de votos de uma eleição, são gerados vários registros
//de votação contendo o nome do candidato e a quantidade de votos
//(formato .csv) que ele obteve em uma urna de votação. Você deve
//fazer um programa para ler os registros de votação a partir de um
//arquivo, e daí gerar um relatório consolidado com os totais de cada
//candidato