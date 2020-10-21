package com.bzsomi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Orszagut {
    private static ArrayList<KisGepjarmu> lista;

    public Orszagut(String fajlNev) {
        this.lista = new ArrayList<>();
        jarmuvekJonnek(fajlNev);
    }

    public static void jarmuvekJonnek(String fajlNev){
        try {
            FileReader f = new FileReader(fajlNev);
            BufferedReader br = new BufferedReader(f);
            String sor = br.readLine();
            while (sor != null){
                String[] x = sor.split(";");
                if (x[0] == "audi"){
                    String tabla = x[1];
                    int sebesseg = Integer.parseInt(x[2]);
                    boolean lezer = Boolean.parseBoolean(x[3]);
                    lista.add( new Audi58(tabla, sebesseg, lezer));
                }
                else{
                    String tabla = x[1];
                    int sebesseg = Integer.parseInt(x[2]);
                    int sebessegMax = Integer.parseInt(x[3]);
                    lista.add( new Robogo(tabla, sebesseg, sebessegMax));
                }
                f.close();
                br.close();
            }
        }
        catch (FileNotFoundException e){e.printStackTrace();}
        catch (IOException e){e.printStackTrace();}

        for (KisGepjarmu kocsi: lista) {System.out.println(kocsi);}
    }


}
