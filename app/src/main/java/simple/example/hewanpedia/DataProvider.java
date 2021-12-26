package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Capung;
import simple.example.hewanpedia.model.Kupukupu;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Capung> initDataAnjing(Context ctx) {
        List<Capung> capungs = new ArrayList<>();
        capungs.add(new Capung("Brachydiplax chalybea", "India",
                "capung ini berukuran kecil hingga sedang, di mana jantan berwarna abu-abu putih kebiruan dengan perut yang lebar", R.drawable.brachydiplax_chalybea));
        capungs.add(new Capung("brachythemis contaminata", "Indonesia ",
                "Capung ini termasuk jenis capung berukuran sedang dengan rentang sayap belakang 20-24mm", R.drawable.brachythemis_contaminata));
        capungs.add(new Capung("crocothemis servilia", "Indonesia",
                "capung ini berukuran besar dengan rentang sayap belakang 31-33mm, habitat capung ini adalah area terbuka seperti lahan pertanian ", R.drawable.crocothemis_servilia));
        capungs.add(new Capung("diplacodes terivialis", "negara asia tengah",
                "capung ini berukuran kecil dengan rentang sayap belakang 22-24mm, capung ini dapat ditemukan dirawa-rawa terbuka.", R.drawable.diplacodes_terivialis));
        capungs.add(new Capung("neurothemis stigmatizans", "indonesia",
                "capung ini termasuk kedalam marga capung bersayap merah kecoklatan yang mencolok, capung ini tersebar luas di asia salah satunya indonesia", R.drawable.neurothemis_stigmatizans));
        capungs.add(new Capung("orthetrum sabina", "asia",
                "capung ini dikenal sebagai species capung paling umum di asia", R.drawable.orthetrum_sabina));
        return capungs;
    }
    private static List<Kupukupu> initDataKupukupu(Context ctx) {
        List<Kupukupu> kupukupus = new ArrayList<>();
        kupukupus.add(new Kupukupu("kupukupu_Antheraea_Mylitta ", "Brasil",
                "Antheraea Mylitta adalah salah satu kupukupu tercantik di dunia ", R.drawable.kupukupu_antheraea_mylitta));
        kupukupus.add(new Kupukupu("kupukupu_Silvery_Blue", "Canada",
                "Spesies asli Kanada ini suka mengambil mineral dari tanah yang basah ", R.drawable.kupukupu_silvery_blue));
        kupukupus.add(new Kupukupu("Kupukupu_Sayap_Peri", "Indonesia",
                "bisa ditemukan di beberapa wilayah di Papua", R.drawable.kupukupu_sapho_longwing));
        kupukupus.add(new Kupukupu("Banded_Orange", "sulawesi",
                "adalah spesies kupu-kupu langka asal Brasil yang bisa menyerap nutrisi dari lumpur", R.drawable.kupukupu_banded_orange));

        return kupukupus;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataKupukupu(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
