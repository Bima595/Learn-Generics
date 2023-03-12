package PRAKTIKUM;

class Segitiga<A, T> {
    private A alas;

    private T tinggi;

    public A getAlas() {
        return alas;
    }

    public void setAlas(A alas) {
        this.alas = alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public void setTinggi(T tinggi) {
        this.tinggi = tinggi;
    }

    public int getLuasInt() {
        return 1 * (int) getAlas() * (int) getTinggi() / 2;
    }

    public double getLuasDouble() {
        return 1 * (double) getAlas() * (double) getTinggi() / 2;
    }

}
