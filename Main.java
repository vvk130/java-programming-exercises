
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

// Ohjelmassa on määritelty rajapintaluokka Astia ja sen toteuttavat luokat Tynnyri ja Pullo.

// Kirjoita metodi

// public static int montakoMahtuu(Astia isoAstia, Astia pieniAstia)
// joka palauttaa kokonaislukuna tiedon siitä, kuinka monta pientä astiallista mahtuu kokonaan isoon astiaan. 

// Esimerkki metodin kutsumisesta:

// public static void main(String[] args) {
//     Tynnyri tynnyri = new Tynnyri("tammi", 5.0);
//     Pullo pullo = new Pullo("jaffa", 1.5);
    
//     System.out.println(montakoMahtuu(tynnyri, pullo));
// }
// Ohjelma tulostaa:

// 3

public static int montakoMahtuu(Astia isoAstia, Astia pieniAstia){
    double montako = isoAstia.getTilavuus() / pieniAstia.getTilavuus();
    return (int) montako;
}

// Ohjelmassa on määritelty luokka Auto ja sen perivä luokka KuormaAuto.

// Kirjoita metodi

// public static int lastiaYhteensa(ArrayList<Auto> autot)
// joka saa parametrikseen listan KuormaAuto-olioita. Metodi laskee ja palauttaa 
// tiedon kuorma-autojen yhteenlasketusta lastista.

// Huomaa, että listan tyyppi on Auto, ei KuormaAuto!

public static int lastiaYhteensa(ArrayList<Auto> autot){
    double lasti = 0;
    for (Auto a: autot){
        KuormaAuto k = (KuormaAuto) a;
        lasti += k.getLasti();
    }
    return (int) lasti;
}
// Ohjelmassa on taas määritelty luokka Satuhahmo ja sen perivät luokat 
// Velho, Veljenpoika ja Supersankari.

// Kirjoita metodi

// public static int laskeVelhot(ArrayList<Satuhahmo> hahmot) 
// joka saa parametriksi listan eri satuhahmoja, ja 
// palauttaa listassa olevien velhojen määrän kokonaislukuna.

public static int laskeVelhot(ArrayList<Satuhahmo> hahmot) {
    int maara = 0;
    for (Satuhahmo s: hahmot){
        if (s.getClass() == Velho.class){
            maara++;
        }
    }
    return maara;
}

// Ohjelmassa on määritelty luokka Laiva. Luokka Matkustajalaiva perii Laiva-luokan.
//  Lisäksi luokka Luksusristeilija perii Matkustajalaiva-luokan.

// Laivassa on henkilöstä. Matkustajalaivassa on lisäksi matkustajia. 
// Luksusristeilijässä on näiden lisäksi myös palvelijoita.

// Tutustu luokkien tarjoamiin havainnointimetodeihin, ja kirjoita sitten metodi

// public static int ihmisiaLaivoissa(ArrayList<Laiva> laivat)
// joka saa parametrikseen listan eri tyyppisiä laivoja, ja laskee ja 
// palauttaa kaikkien laivojen kaikkien ihmisten yhteismäärän. Luku sisältää siis henkilöstön, 
// matkustajat ja palvelijat.

public static int ihmisiaLaivoissa(ArrayList<Laiva> laivat){
    int maara = 0;
    for (Laiva l: laivat) {
        if (l instanceof Laiva) {
            maara += l.getHenkilosto();
        }
        if (l instanceof Matkustajalaiva) {
            maara += ((Matkustajalaiva) l).getMatkustajat();
        }
        if (l instanceof Luksusristeilija) {
            maara += ((Luksusristeilija) l).getPalvelijat();
        }
    }
    return maara;
}


// Kirjoita rajapintaluokka Laskin. Luokalla on seuraavat ominaisuudet:

// Metodit lisaa, vahenna, kerro ja jaa. Kaikki metodit ovat void-tyyppisiä ja jokainen 
// saa parametriksi yhden kokonaisluvun.
// Metodi annaTulos, jolla ei ole parametreja. Metodi palauttaa double-tyyppisen liukuluvun.

interface Laskin {
    void lisaa(int luku);
    void vahenna(int luku);
    void kerro(int luku);
    void jaa(int luku);
    double annaTulos();
}

// Kirjoita nyt luokka Laskukone, joka toteuttaa edellisessä tehtävässä kirjoitetun rajapinnan Laskin.
// Luokalla tulee olla konstruktori, joka alustaa laskimen alkutilaan (tulos on 0.0).
// Luokalla on lisäksi rajapinnasta tulevat metodit lisaa, vahenna, kerro ja jaa, jotka kaikki 
// muuttavat nimensä mukaisesti muistissa olevaa tulosta.
// Metodi annaTulos() palauttaa muistissa olevan tuloksen.
// Esimerkki luokan käyttämisestä:
// Laskukone laskin = new Laskukone();
// System.out.println(laskin.annaTulos());
// laskin.lisaa(10);
// System.out.println(laskin.annaTulos());
// laskin.vahenna(5);
// System.out.println(laskin.annaTulos());
// laskin.kerro(3);
// System.out.println(laskin.annaTulos());
// laskin.jaa(2);
// System.out.println(laskin.annaTulos());
// Ohjelma tulostaa:

// 0.0
// 10.0
// 5.0
// 15.0
// 7.5

class Laskukone implements Laskin{
    private double tulos;

    public Laskukone(){
        this.tulos = 0.0;
    }

    public void lisaa(int luku){
        tulos += luku;
    };

    public void vahenna(int luku){
        tulos -= luku;
    };

    public void kerro(int luku){
        tulos *= luku;
    };

    public void jaa(int luku){
        tulos = tulos / luku;
    };

    public double annaTulos(){
        return tulos;
    };
}

// Ohjelmassa on määritelty luokka Reitti, joka toteuttaa rajanpinnan Comparable.

// Kirjoita metodi

// public static Reitti pisinReitti(ArrayList<Reitti> reitit) 
// joka palauttaa pisimmän listassa olevan reitin.

// Metodilla ei saa olla sivuvaikutuksia - listaa ei siis saa muuttaa! Huomaa myös, että Reitti-luokalla ei ole havainnointimetodeita.

public static Reitti pisinReitti(ArrayList<Reitti> reitit) {
    ArrayList<Reitti> reititPituudenMukaan = new ArrayList<>(reitit);
    Collections.sort(reititPituudenMukaan);
    return reititPituudenMukaan.get(reititPituudenMukaan.size()-1);
}

// Ohjelmassa on määritelty tutoriaalin alkuosasta tuttu luokka Piste.

// Toteuta luokalle vertailumetodi 

// public int compareTo(Piste toinenPiste)
// Kahden pisteen vertailuarvona käytetään pisteiden etäisyyttä origosta - mitä suurempi 
// etäisyys, sen "suurempi" piste.

// Huomaa, että luokalla on jo valmiina tarpeellinen metodi etäisyyden laskemiseksi.

public int compareTo(Piste toinenPiste){
    if (this.etaisyysOrigosta() == toinenPiste.etaisyysOrigosta()){
        return 0;
    } else if (this.etaisyysOrigosta() < toinenPiste.etaisyysOrigosta()) {
        return -1;
    } else {
        return 1;
    }
}

// Kirjoita kaksi enum-luokkaa:

// Ilmansuunta ja ValiIlmansuunta

// Ilmansuuntia ovat pohjoinen, etelä, itä ja länsi, ja väli-ilmansuuntia koillinen, kaakko, lounas ja luode.

// Muista oikea nimeämistapa!

enum Ilmansuunta {
    POHJOINEN, ETELA, ITA, LANSI
}

enum ValiIlmansuunta{
    KOILLINEN, KAAKKO, LOUNAS, LUODE
}

// Ohjelmassa on määritelty edellisessä tehtävässä esitelty enum ilmansuuntaa varten.

// Kirjoita luokka Reitti, jolla on seuraavat ominaisuudet:

// Konstruktori, joka saa parametrikseen pituuden (liukuluku) ja suunnan (ilmansuunta-enum)
// Asetus- ja havainnointimetodit pituudelle ja suunnalle

class Reitti {
    private double pituus;
    private Ilmansuunta ilmansuunta;
    
    
    public Reitti(double pituus, Ilmansuunta ilmansuunta){
        this.pituus = pituus;
        this.ilmansuunta = ilmansuunta;
    }

    public double getPituus(){
        return pituus;
    }

    public Ilmansuunta getSuunta(){
        return ilmansuunta;
    }

    public void setPituus(double luku){
        pituus = luku;
    }

    public void setSuunta(Ilmansuunta uusiSuunta){
        ilmansuunta = uusiSuunta;
    }
}


// Ohjelmassa on määritelty edellisessä tehtävässä kirjoitettu luokka Reitti.

// Kirjoita metodi

// public static ArrayList<Reitti> reititSuuntaan(ArrayList<Reitti> reitit, Ilmansuunta suunta)
// joka saa parametrikseen listan reittiolioita ja suunnan.

// Metodi palauttaa uudessa listassa ne reitit, jotka kulkevat annettuun suuntaan.

// Reittien järjestyksen uudessa listassa tulee olla sama kuin parametrina annetussa listassa.

public static ArrayList<Reitti> reititSuuntaan(ArrayList<Reitti> reitit, Ilmansuunta suunta){
    ArrayList<Reitti> finalReitit = new ArrayList<>();
    for (Reitti r: reitit){
        if (r.getSuunta() == suunta){
            finalReitit.add(r);
        }
    }
    return finalReitit;
}

// Kirjoita uml kaaviio perusteella

class Peli {
    private String nimi;
    private int pelaajia;
    
    public Peli(String nimi, int pelaajia){
        this.nimi = nimi;
        this.pelaajia = pelaajia;
    }
    
    public String getNimi(){
        return nimi;
    }
    
    public void setNimi(String uusiNimi){
        nimi = uusiNimi; 
    }
    
    public int getPelaajia(){
        return pelaajia;
    }
    
    public void setPelaajia(int uudetPelaajia){
        pelaajia = uudetPelaajia;
    }

}

//Toteuta luokkahierarkia

interface Laskin {
    public double getTulos();
}


class Laskukone implements Laskin {
    private double tulos;
    
    public Laskukone(double tulos){
        this.tulos = tulos;
    }
    
    public double getTulos(){
        return tulos;
    }
    
    public void laske(String operaatio, double parametri){
        if (operaatio == "plus"){
            tulos += parametri;
        }
    }
}

// Lausekkeiden arvot

Lauseke
Muuttujan a arvo
Muuttujan b arvo
int a = 3;
int b = a++ + 1;
4
4
int a = 3;
int b = ++a + 1;
4
5
int a = 1;
int b = ++a + ++a;
3
5
int a = 3;
int b = a++ + a--;
3
7
int a = 3;
int b = --a;
a = --b;
1
1

// Lista 7. veljestä

List<String> veljekset0 = List.of("Juhani", "Tuomas", "Aapo", "Simeoni", "Timo", "Lauri", "Eero");
ArrayList<String> veljekset = new ArrayList<>(veljekset0);

//Ohjelmassa on määritelty luokka Jaakiekkoilija. Tutustu luokan ominaisuuksiin ja kirjoita luokkametodi
//
//public static void tulosta(ArrayList<Jaakiekkoilija> pelaajat)
//joka tulostaa virtaa käyttäen listassa olevien pelaajien tiedot tarkalleen alla näkyvän esimerkin mukaisesti. 
//Pisteisiin siis lasketaan mukaan sekä pelaajan syötöt että maalit.
//
//Esimerkkitulostus:
//
//Mikko Kahilainen, 21 pistettä
//Matti Gretzky, 50 pistettä
//Saku Kamppuri, 5 pistettä

public static void tulosta(ArrayList<Jaakiekkoilija> pelaajat){
    pelaajat.stream().forEach(hlo -> 
    System.out.println(hlo.getNimi() + ", " + (hlo.getSyotot()+hlo.getMaalit()) + " pistettä"));
}

//Kirjoita ohjelma, joka kyselee käyttäjältä nimiä.
//
//Annetut nimet lisätään tiedostoon nimet.txt siten, että jokainen nimi on omalla rivillään.
//
//Kun käyttäjä antaa nimeksi "lopeta", ohjelman suoritus päättyy.

Scanner sc = new Scanner(System.in);
String nimi = "";
ArrayList<String> rivit = new ArrayList<>();
while (nimi != "lopeta"){
    System.out.print("Anna nimi: ");
    nimi = sc.nextLine();
    if (nimi != "lopeta"){
        rivit.add(nimi);
    }
}

try (PrintWriter tiedosto = new PrintWriter("nimet.txt")){
    rivit.stream().forEach(rivi -> tiedosto.write(rivi + "\n"));
} catch (FileNotFoundException e) {
    System.out.println("Tapahtui virhe: " + e);
}

// Kirjoita geneerisesti tyyppimääritelty luokka

// Monistaja<T>

// Luokalla tulee olla seuraavat ominaisuudet:

// Konstruktori, joka saa parametrikseen tyyppiä T olevan alkion
// Asetus ja havainnointimetodit alkiolle (getAlkio ja setAlkio)
// Metodi ArrayList<T> annaMonta(int maara), joka palauttaa uuden listan. Listan koko on parametrina annettu kokonaisluku, ja jokainen listan alkio on oliossa tallessa oleva alkio.
// Esimerkki luokan käytöstä:

// public static void main(String[] args) {
//     Monistaja<String> m1 = new Monistaja<>("abc");
//     System.out.println(m1.annaMonta(3));
    
//     Monistaja<Double> m2 = new Monistaja<>(2.5);
//     System.out.println(m2.annaMonta(4));
// }
// Ohjelma tulostaa:

// [abc, abc, abc]
// [2.5, 2.5, 2.5, 2.5]


// Tutoriaalissa esiteltiin geneerinen luokka Pino.

// Jono on pinoa vastaava tietorakenne. Ero on siinä, että kun pinoon lisätään ja poistetaan alkioita samaan päähän, jonossa alkiot lisätään alkuun mutta poistetaan lopusta (niin kuin jono toimii oikeastikin).

// Kirjoita geneerinen luokka Jono<T>, jolla on seuraavat ominaisuudet:

// Konstruktori, joka ei saa parametreja
// Metodi void lisaa(T alkio), joka lisää alkion jonoon ensimmäiseksi
// Metodi T poista(), joka poistaa ja palauttaa jonon viimeisen alkion
// Metodi boolean onkoAlkioita(), joka palauttaa true, jos jonossa on vähintään yksi alkio



// Ohjelmassa on määritelty geneerinen rajapintaluokka Vaihtaja.

// Kirjoita rajapinnan toteuttava luokka MerkkijonoVaihtaja, joka sitoo geneerisen tyypin merkkijonoksi (eli luokka MerkkijonoVaihtaja ei ole geneerisesti määritelty).

// MerkkijonoVaihtajasta luotu oli toimii niin, että se pitää sisällää aina vain yhden merkkijonoarvon kerrallaan. Luokalla tulee olla

// Konstruktori, joka saa parametrikseen merkkijonon
// Toteutus metodille vaihdaArvo: metodi palauttaa vaihtajan nykyisen arvon ja tallentaa sen tilalle parametrina tulleen uuden arvon.
// Esimerkki luokan käytöstä:

// public static void main(String[] args) {
//     MerkkijonoVaihtaja vaihtaja = new MerkkijonoVaihtaja("moi");
    
//     System.out.println(vaihtaja.vaihdaArvo("heippa"));
//     System.out.println(vaihtaja.vaihdaArvo("heipparallaa"));
//     System.out.println(vaihtaja.vaihdaArvo("terve nyt sitten"));
// }
// Ohjelma tulostaa:

// moi
// heippa
// heipparallaa
 

// Kirjoita geneerinen luokka 

// class MinMax<T extends Comparable<T>>

// ...jonka toteuttavan tyypin pitää siis toteuttaa rajapinta Comparable.

// Luokalla on seuraavat ominaisuudet:

// Konstruktori, joka saa parametrikseen listan. Lista sisältää alkioita, joiden tyyppi on T.
// Metodi public T pienin(), joka palauttaa listan pienimmän alkion
// Metodi public T suurin(), joka palauttaa listan suurimman alkion
// Listan alkioiden vertailuun käytetään Comparable-rajapinnan tarjoamia palveluita.

// Vinkki; tutustu luokan Collections API-kuvaukseen - sieltä löytyy pari käyttökelpoista operaatiota suurimman tai pienimmän alkio löytämiseen...

// Huom! Ohjelmoinititehtävän voi ratkaista myös ilman virtoja - niin kuin itse asiassa kaikki virtoihin liittyvät tehtävät. Tehtävissä ei siis pakoteta käyttämään virtoja - kannattaa kuitenkin yritttää ainakin ensin virtojen avulla.

// Ohjelmassa on määritelty luokka Jaakiekkoilija. Tutustu luokan ominaisuuksiin ja kirjoita luokkametodi

// public static void tulosta(ArrayList<Jaakiekkoilija> pelaajat)
// joka tulostaa virtaa käyttäen listassa olevien pelaajien tiedot tarkalleen alla näkyvän esimerkin mukaisesti. Pisteisiin siis lasketaan mukaan sekä pelaajan syötöt että maalit.

// Esimerkkitulostus:

// Mikko Kahilainen, 21 pistettä
// Matti Gretzky, 50 pistettä
// Saku Kamppuri, 5 pistettä