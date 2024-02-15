
//Viikko viisi harjoitukset Java
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