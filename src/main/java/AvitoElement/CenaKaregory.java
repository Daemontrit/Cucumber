package AvitoElement;
public enum CenaKaregory {
    По_умолчанию("101"),
    Дороже("2"),
    Дешевле("1"),
    По_дате("104");

    public final String value;

    CenaKaregory(String value) {
        this.value = value;
    }
}

