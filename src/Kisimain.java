import java.util.ArrayList;

public class Kisimain {
    public static void main(String[] args) {
        ArrayList<Kisi> bireyler = new ArrayList<Kisi>();
        bireyler.add(new Kisi("Bashir", 21));
        bireyler.add(new Kisi("nimca", 20));
        bireyler.add(new Kisi("Dahir", 18));

        bireyler.forEach(birey ->{
            System.out.println("isim: "+birey.getIsim()+",yas: "+birey.getYas());
        });
        System.out.println();
        for(Kisi birey:bireyler){
            System.out.println("isim: "+birey.getIsim()+",yas:"+birey.getYas());
        }

    }
}
