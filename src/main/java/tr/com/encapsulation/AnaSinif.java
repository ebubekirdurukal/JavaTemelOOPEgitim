package tr.com.encapsulation;

import tr.com.abstaction.MYSQLBaglanti;
import tr.com.abstaction.Ogrenci;
import tr.com.abstaction.OyunIslemleri;
import tr.com.abstaction.PCOyunIslemleri;
import tr.com.abstaction.VeriTabaniBaglanti;

public class AnaSinif {

    public static void main(String[] args) {
        //Developer developer = new Developer();
        // developer.name = "Ali";  // artık böyle yapmıycaz
        // developer.company = "EmlakJet";

        //developer.setName("Ali");
        //developer.setCompany("Testinium");
        //System.out.println(developer.getCompany());


        // ItGuy harun = new ItGuy();
        //System.out.println(harun.mesaiYap());


        Tester tester = new Tester("Hatice", "EmlakJet", "Dell", "JIRA");
        System.out.println(tester.kendiniTanit());

        // bir field final ise değiştirilemez.
        // bir method final is override edilemez.
        // bir sınıf final is extend edilemez.
        Tester ayse = new Tester();
        Yazilimci ahmet = new Tester();
        ahmet.kendiniTanit();

        if(ayse instanceof Yazilimci){
            System.out.println("Ayşe bir yazilimci");
        }

        System.out.println("***********************");


        // OyunIslemleri oyunIslemleri = new OyunIslemleri();     // interface den nesne oluşturulamaz.
        PCOyunIslemleri pcOyunIslemleri = new PCOyunIslemleri();
        System.out.println(pcOyunIslemleri.oyunIndir());

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.antremanYap();

        MYSQLBaglanti mysqlBaglanti = new MYSQLBaglanti();
        // VeriTabaniBaglanti veriTabaniBaglanti = new VeriTabaniBaglanti(); // abstact class dan nesne oluşmaz
        mysqlBaglanti.connect();
        mysqlBaglanti.topla(3,5);




    }

}
