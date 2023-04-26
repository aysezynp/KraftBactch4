package day39_ConstructorOverloading;

public class Cat {
    public String eyeColor;
    public String breed;
    public boolean isFat;
    public boolean isPet;

    public Cat() {

    }

    public Cat(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Cat(String eyeColor, String breed) {
        this.eyeColor = eyeColor;
        this.breed = breed;
    }

    public Cat(String eyeColor, String breed, boolean isFat) {
        this(eyeColor, breed);
        this.isFat = isFat;
    }

    public Cat(String eyeColor, String breed, boolean isFat, boolean isPet) {
        this(eyeColor, breed, isFat);
        this.isPet = isPet;
    }

    public void sleep() {
        System.out.println(eyeColor + " gözlü " + breed + " cinsi kedi uyuyor");
    }

    public void food() {
        if (isFat) {
            System.out.println(eyeColor + " gözlü " + breed + " cinsi şişman kedi çok yemek yiyiyor");
        } else {
            System.out.println(eyeColor + " gözlü " + breed + " cinsi zayıf kedi çok az yiyiyor");
        }
    }

    public void run() {
        if (isFat && isPet) {
            System.out.println(eyeColor + " gözlü " + breed + " cinsi şişman ve evcil olan kedi yavaş koşuyor");
        } else {
            System.out.println(eyeColor + " gözlü " + breed + " cinsi sokak kedisi çok hızlı koşuyor");
        }
    }

    public String toString() {
        return "Cat{" +
                "eyecolor='" + eyeColor + "', " +
                "breed='" + breed + "', " +
                "isFat='" + isFat + "', " +
                "isPet='" + isPet + "'}";

    }
   public Cat cinsDegistir(Cat cat,String breed){
        cat.breed=breed;
        return cat;
   }

}