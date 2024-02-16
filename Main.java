
//Viikko viisi harjoitukset Java, luokkahierarkiat
//
//Ohjelmassa on määritelty luokka Kirja. Luokasta voidaan muodostaa olio antamalla sille nimi ja kirjailija seuraavasti:
//
//Kirja k = new Kirja("Vanhus ja Meri", "Ernest Hemingway");
//Kirjoita  luokka Lopputyo, joka perii luokan Kirja.
//
//Luokalla on seuraavat piirteet:
//
//Konstruktori, joka saa parametriksi nimen, kirjailijan ja arvosanan (kokonaisluku). Konstruktori  asettaa nimen ja kirjailijan kutsumalla yliluokan konstruktoria. Arvosana on Lopputyo-luokan attribuutti
//Asetus- ja havainnointimetodit arvosanalle

import java.util.ArrayList;

class Lopputyo extends Kirja {
    int arvosana;
    
    public Lopputyo(String nimi, String kirjailija, int arvosana){
        super(nimi, kirjailija);
        this.arvosana = arvosana; 
    }
    
    public int getArvosana() {
        return arvosana;
    }
    
    public void setArvosana(int arvosana) {
        this.arvosana = arvosana;
    }  
    
}

//
//Oheisessa ohjelmassa on määritelty luokat Puhelu ja Videopuhelu. Tutustu luokkien määrittelyihin.
//
//Kirjoita sitten metodi
//
//public static ArrayList<Videopuhelu> jamesinPuhelut(ArrayList<Videopuhelu> puhelut)
//joka saa parametrikseen listan videopuheluita. Metodin tehtävänä on muodostaa ja palauttaa uusi lista, johon lisätään alkuperäiseltä listalta vain ne puhelut, joissa
//
//jompi kumpi henkilöistä on nimeltään "James Bond" ja
//puhelussa on video päällä.
//Puheluiden järjestyksen tulee noudattaa alkuperäisen listan järjestystä.

public static ArrayList<Videopuhelu> jamesinPuhelut(ArrayList<Videopuhelu> puhelut){
    ArrayList<Videopuhelu> jamesinPuhelut = new ArrayList<Videopuhelu>();
    for (Videopuhelu vp : puhelut) {
        if Videopuhelu
    }
    return jamesinPuhelut;
    }

//
//Oheisessa ohjelmassa on määritelty luokat Puhelu ja Videopuhelu. Tutustu luokkien määrittelyihin.
//
//Kirjoita sitten metodi
//
//public static ArrayList<Videopuhelu> jamesinPuhelut(ArrayList<Videopuhelu> puhelut)
//joka saa parametrikseen listan videopuheluita. Metodin tehtävänä on muodostaa ja palauttaa uusi lista, johon lisätään alkuperäiseltä listalta vain ne puhelut, joissa
//
//jompi kumpi henkilöistä on nimeltään "James Bond" ja
//puhelussa on video päällä.
//Puheluiden järjestyksen tulee noudattaa alkuperäisen listan järjestystä.

public static ArrayList<Videopuhelu> jamesinPuhelut(ArrayList<Videopuhelu> puhelut) {
    ArrayList<Videopuhelu> jamesinPuhelut = new ArrayList<Videopuhelu>();
    for (Videopuhelu vp : puhelut) {
        if ((vp.getHenkilo1().equals("James Bond") || vp.getHenkilo2().equals("James Bond")) && vp.isVideoPaalla()) {
            jamesinPuhelut.add(vp);
        }
    }
    return jamesinPuhelut;
}

//Ohjelmassa on määritelty luokka Piste.
//
//Kirjoita luokka MuokattavaPiste, joka perii luokan Piste. Luokalla tulee olla seuraavat ominaisuudet:
//
//Konstruktori, joka saa parametriksi x:n ja y:n ja asettaa yliluokasta perittyjen attribuuttien arvot näiden mukaan
//Havainnointimetodit getX ja getY
//Asetusmetodi setX ja setY

class MuokattavaPiste extends Piste {
    
    public MuokattavaPiste(int x, int y){
        super(x, y);
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}

// Kirjoita luokka Arvostelukirja, jolla on seuraavat ominaisuudet

// Attribuutti omistaja, jonka tyyppi on merkkijono
// Attribuutti arvosanat, jonka tyyppi on lista. Listaan tulee voida tallentaa Arvosana-tyyppisiä olioita (luokka löytyy oheisesta ohjelmasta)
// Konstruktori, joka saa parametriksi omistajan ja asettaa attribuutin arvon. Lisäksi konstruktori alustaa arvosanalistan.
// Attribuuttien tulee olla suojattuja, jotta asiakas ei näe niitä, mutta mahdolliset perivät luokat näkevät.

class Arvostelukirja {
    protected String omistaja;
    protected ArrayList<Arvosana> arvosanat;

    public Arvostelukirja(String omistaja){
        this.omistaja = omistaja;
        this.arvosanat = new ArrayList<Arvosana>();
    }
}

// Ohjelmassa on määritelty luokka Ohjaaja. Kirjoita luokka Erityisohjaaja, joka perii Ohjaaja-luokan.
// Luokassa tulee olla konstruktori, joka saa parametriksi tässä järjestyksessä nimen, tunnit, ylitunnit 
// ja uutena parametrina erityistunnit. Myös tämä parametri on kokonaisluku.
// Ylikirjoita perivässä luokassa metodi tunnitYhteensa siten, että se laskee yhteistuntimäärään myös erityistunnit mukaan.


class Erityisohjaaja extends Ohjaaja {
    protected int erityistunnit;

    public Erityisohjaaja(String nimi, int ohjaustunnit, int ylitunnit, int erityistunnit){
        super(nimi, ohjaustunnit, ylitunnit);
        this.erityistunnit = erityistunnit;
    }

    public int tunnitYhteensa(){
        int yhtTunnit = erityistunnit + ohjaustunnit + ylitunnit;
        return yhtTunnit;
    }
}

// Oheisessa ohjelmassa on määritelty luokka Kauppalista. Kirjoita luokka LuomuKauppalista, 
//joka perii luokan Kauppalista.

// Luokalla tulee olla seuraavat ominaisuudet:

// Konstruktori, jolla ei ole yhtään parametria
// Ylikirjoitettu metodi annaLista(), joka hyödyntää yliluokan toteutusta. Metodi palauttaa 
// merkkijonossa kaikki listalle lisätyt tuotteet, joissa esiintyy sana "luomu". 
// Voit olettaa, että kaikki tuotteet on kirjoitettu kokonaan pienillä kirjaimilla. 
// Tuotteet on erotettu toisistaan rivinvaihdoilla. Katso mallia esimerkkitulosteesta alla.
// Esimerkki luokan käytöstä:

// public static void main(String[] args) {
//     LuomuKauppalista lista = new LuomuKauppalista();
//     lista.lisaaTuote("porkkanat");
//     lista.lisaaTuote("luomubanaanit");
//     lista.lisaaTuote("ananas");
//     lista.lisaaTuote("luomuvessapaperi");
    
//     System.out.println(lista.annaLista());
// }
// Ohjelma tulostaa:

// luomubanaanit
// luomuvessapaperi

class LuomuKauppalista extends Kauppalista {

    public LuomuKauppalista(){
        super();
    }

    public String annaLista(){
        String[] lista = super.annaLista().split("\\s+");
        String luomut = "";
        int i = 0;
        while (i < lista.length) {
            String s = lista[i];
            if (s.contains("luomu")) {
                luomut += s + "\n";
            }
            i++;
        }
        return luomut; 
    }
}


// Kirjoita luokka Merkkijonoapuri, jolla on seuraavat staattiset metodit:

// int laskeVokaalit(String jono), joka palauttaa parametrina annetun merkkijonon 
// vokaalien määrän ja
// int laskeMuut(String jono), joka palauttaa parametrina annetun merkkijono 
// kaikkien muiden merkkien paitsi vokaalien määrän
// Voit olettaa, että kaikissa käsiteltävissä merkkijonoissa on vain pieniä kirjaimia.



// Kirjoita luokka SalainenAgentti, jolla on seuraavat ominaisuudet:

// Konstruktori, joka saa parametrikseen nimen (merkkijono) ja koodin (merkkijono)
// Havainnointimetodit getNimi ja getKoodi
// Asetusmetodi setKoodi(String koodi), joka asettaa koodiattribuutin, jos annettu parametri on 
// sääntöjen mukainen (säännöt alempana); muuten koodiksi asetetaan "000"
// Staattinen metodi static boolean koodiOk(String koodi), joka palauttaa true, jos koodi on sääntöjen mukainen
// Koodi on sääntöjen mukainen, jos siinä on tasan kolme numeroa, eikä muita merkkejä. Kahden ensimmäisen 
// numeron pitää olla nollia.


// Ohjelmassa on määritelty luokka Satuhahmo sekä useita muita luokkia, jotka perivät luokan.

// Kirjoita metodi

// public static Satuhahmo vanhinHahmo(ArrayList<Satuhahmo> hahmot)
// joka saa parametrikseen listan satuhahmon perillisiä. Metodi etsii ja palauttaa listan vanhimman hahmon.

// Huomaa, että luokat eivät nyt toteuta Comparable-rajapintaa, joten vanhin hahmo pitää etsiä jollain muulla tavalla.

public static Satuhahmo vanhinHahmo(ArrayList<Satuhahmo> hahmot) {
    int vanhin = 0;
    Satuhahmo vanhinHahmo = hahmot.get(0);
    for (Satuhahmo s : hahmot){
        if (vanhin < s.getIka()){
        vanhin = s.getIka();
        vanhinHahmo = s;
        }
    }
    return vanhinHahmo;
}