package com.tusu.santoecomerch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.tusu.santoecomerch.Pojo_Class.Products;

import java.util.ArrayList;
import java.util.List;

public class SaveProduct extends AppCompatActivity {

    public static final String TAG="SaveProduct";

    private DatabaseReference root;
    private List<Products> productsConfectionary =new ArrayList<>();
    private List<Products> productscosmetic =new ArrayList<>();
    private List<Products> productsObcrockeres =new ArrayList<>();
    private List<Products> productselectronics =new ArrayList<>();
    private List<Products> productsfishMeat =new ArrayList<>();
    private List<Products> productsFruitsVegitable =new ArrayList<>();
    private List<Products> productsGroceery =new ArrayList<>();
    private List<Products> productsKidsTools =new ArrayList<>();
    private List<Products> productsMedicine =new ArrayList<>();
    private List<Products> productsDrinkDesert =new ArrayList<>();
    private List<Products> productsSnacks =new ArrayList<>();
    private List<Products> productsStudyTools =new ArrayList<>();
    private List<Products> productsQuranHadis =new ArrayList<>();
    private List<Products> productsGas =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_product);

        root= FirebaseDatabase.getInstance().getReference("Products");
    }

    public void saveConfectionery(View view) {

        String productNameKey; String productName; String lastPrice; String updatePrice; int currentPrice; String quentityShow;int quentity;

        productsConfectionary.add(new Products("Magi Nuduls",	"ম্যাগি নুডুলস	","0",	"১৩০",	130,	0	,"৪৯৬ গ্রাম",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-7.jpg"));

        productsConfectionary.add(new Products("kokola Nuduls",	"কোকোলা নুডুলস",	"0",	"১৮",	18,	0,	"১৮০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-8.jpg"));
        productsConfectionary.add(new Products("Biskut","বিস্কুট","0","৬০",60,0,"২৫০ গ্রাম","https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-1.jpg"));

        productsConfectionary.add(new Products("Bekare Biskut","বেকারি বিস্কুট","0","১২৫",125,0,"৭০০ গ্রাম","https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-2.jpg"));

        productsConfectionary.add(new Products("Canacur","চানাচুর","0","৬৫",65,0,"৩৫০গ্রাম","https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-3.jpg"));

        productsConfectionary.add(new Products("cake","কেক","0","১২০",120,0,"৩৫০গ্রাম","https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-4.jpg"));

        productsConfectionary.add(new Products("Birthday Cake","জন্মদিনের-কেক","0","২৭০",270,0,"১ পাউন্ড","https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-5.jpg"));

        productsConfectionary.add(new Products("Sos","সস","	0","৯০",	90,	0,"৩৪০ গ্রাম",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-6.jpg"));

        productsConfectionary.add(new Products("mecarni",	"মেকারনি",	"0",	"১৪০",	140,	0,	"৫০০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-9.jpg"));

        productsConfectionary.add(new Products("Pauruty",	"পাউরুটি",	"0",	"৮০",	80,	0,	"৬৫০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-10.jpg"));

        productsConfectionary.add(new Products("Sirka",	"সিরকা",	"0",	"৫০",	50,	0,	"325 ml",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-11.jpg"));

        productsConfectionary.add(new Products("Soyasos",	"সয়াসস",	"0",	"৭০",	70,	0,	"300 ml",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-12.jpg"));

        productsConfectionary.add(new Products("Kasonti",	"কাসন্টি",	"0",	"৪৫",	45,	0,	"285 ml",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-13.jpg"));

        productsConfectionary.add(new Products("Cips",	"চিপস",	"0",	"১৫",	15,	0,	"১ pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-14.jpg"));

        productsConfectionary.add(new Products("Coklet",	"চকলেট",	"0",	"১0",	10,	0,	"10 pc",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-15.jpg"));

        productsConfectionary.add(new Products( "Sup corn",	 "স্যুপ-কর্ন",	"0",	"৩৫",	35,	0,	"২৪ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-16.jpg"));

        productsConfectionary.add(new Products("thay cup",	"থাই-স্যুপ",	"0",	"৩৫",	35,	0,	"24 g",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-17.jpg"));

        productsConfectionary.add(new Products("ice cream",	"আইসক্রিম",	"0",	"২২",	22,	0,	"",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-18.jpg"));

        productsConfectionary.add(new Products("jeli",	"জেলি",	"0",	"১৩০",	130,	0,	"৫০০গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-19.jpg"));

        productsConfectionary.add(new Products("Makon",	"মাখন",	"0",	"১০০",	100,	0,	"১০০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-20.jpg"));

        productsConfectionary.add(new Products("Modu",	"মধু",	"0",	"২০০",	200,	0,	"২৫০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-21.jpg"));

        productsConfectionary.add(new Products("Teng",	"টেং",	"0",	"170",	170,	0,	"২৫০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-22.jpg"));

        productsConfectionary.add(new Products("Horlicks",	"হরলিক্স",	"0",	"১৯৫",	195,	0,	"২৫০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-23.jpg"));

        productsConfectionary.add(new Products("Complan",	"কমপ্লান",	"0",	"২৫০",	250,	0,	"২০০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-24.jpg"));

        productsConfectionary.add(new Products("Cofy",	"কফি",	"0",	"১৬৫",	165,	0,	"৫০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-25.jpg"));

        productsConfectionary.add(new Products("KornFlux",	"কর্নফ্লেক্স",	"0",	"৩৩০",	330,	0,	"২৭৫ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-26.jpg"));

        productsConfectionary.add(new Products("Nan 1-10",	"নান ১-১0",	"0",	"৪৩০",	430,	0,	"৪০০গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-27.jpg"));

        productsConfectionary.add(new Products("Lactozen 1-10",	"লেকটোজেন ১-১০",	"0",	"৪৫০",	450,	0,	"৩৫০ গ্রাম",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-28.jpg"));

        productsConfectionary.add(new Products("Fedar",	"ফিডার",	"0",	"১৯০",	190,	0,	"125 ml",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-29.jpg"));

        productsConfectionary.add(new Products("Nipel",	"নিপেল",	"0",	"৪০",	40,	0,	"",		"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/confectionary-30.jpg"));

        for (int i = 0; i< productsConfectionary.size(); i++){
            Products products= productsConfectionary.get(i);
            String productKeyname=products.getProductName();

            root.child("Confectionary").child(productKeyname).setValue(products);
        }

    }

    public void savedrinksDesert(View view) {
        productsDrinkDesert.add(new Products("Mojo",	"Mojo",	"0",	"৩০",	30,	0,	"500 ml",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-1.jpeg"));
        productsDrinkDesert.add(new Products("Coca Cola",	"Coca Cola",	"0",	"৭০",	70,	0,	"1.25 ltr",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-2.jpeg"));
        productsDrinkDesert.add(new Products("Sprite",	"Sprite",	"0",	"৬৫",	65,	0,	"1.25 ltr",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-3.jpeg"));
        productsDrinkDesert.add(new Products("7up",	"7up",	"0",	"৬০",	60,	0,	"1 ltr",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-4.jpeg"));
        productsDrinkDesert.add(new Products("Fruto",	"Fruto",	"0",	"৮০",	80,	0,	"1 ltr",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-5.jpeg"));
        productsDrinkDesert.add(new Products("Speed",	"Speed",	"0",	"৩৫",	35,	0,	"250 ml",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-6.jpeg"));
        productsDrinkDesert.add(new Products("MUM",	"MUM",	"0",	"৩০",	30,	0,	"2 লিটার",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-7.jpeg"));
        productsDrinkDesert.add(new Products("Fresh",	"Fresh",	"0",	"৩০",	30,	0,	"2 লিটার",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-8.jpeg"));
        productsDrinkDesert.add(new Products("Spa",	"Spa",	"0",	"২০",	20,	0,	"1 ltr",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-9.jpeg"));
        productsDrinkDesert.add(new Products("Pepsi",	"Pepsi",	"0",	"৬০",	60,	0,	"1 ltr",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/drinks-10.jpeg"));
        productsDrinkDesert.add(new Products("kalojam",	"কালোজাম",	"0",	"১৫০",	150,	0,	"1 kg",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/Dessert-1.jpeg"));
        productsDrinkDesert.add(new Products("Rosgolla",	"রসগোল্লা",	"0",	"২৫০",	250,	0,	"1 kg",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/Dessert-2.jpeg"));
        productsDrinkDesert.add(new Products("Rosmalay",	"রসমালাই",	"0",	"৪৫০",	450,	0,	"1 kg",		"https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/Dessert-3.jpeg"));
        productsDrinkDesert.add(new Products("Jilapi",	"জিলাপি",	"0",	"৩৫",	35,	0,	"500 gm","https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/Dessert-4.jpeg"));
        productsDrinkDesert.add(new Products("Doi",	"দই",	"0",	"১২০",	120,	0,	"1 kg","https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/Dessert-5.jpeg"	));
        productsDrinkDesert.add(new Products("Tok Doi",	"টক দই",	"0",	"৮০",	80,	0,	"500 gm","https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/Dessert-6.jpeg"));
        productsDrinkDesert.add(new Products("Sada Misty",	"সাদামিস্টি",	"0",	"১৫০",	150,	0,	"1 kg","https://tannishuvo.000webhostapp.com/wp-content/uploads/2020/04/Dessert-7.jpeg"));

        for (int i = 0; i< productsDrinkDesert.size(); i++){
            Products products= productsDrinkDesert.get(i);
            String productKeyname=products.getProductName();

            root.child("Drinks-Dessert").child(productKeyname).setValue(products);
        }

    }

    public void SaveCosmetic(View view) {
        productscosmetic.add(new Products("Face Wash",	"ফেইস ওয়াস",	"0",	"২২০",	220,	0,	"১০০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-1.jpg"));
        productscosmetic.add(new Products("Saban",	"সাবান",	"0",	"৭৫",	75,	0,	"১০০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-2.jpg"));
        productscosmetic.add(new Products("Snow",	"স্নো",	"0",	"১০০",	100,	0,	"৫০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-3.jpg"));
        productscosmetic.add(new Products("krim",	"ক্রিম",	"0",	"৩৫০",	350,	0,	"৫০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-4.jpg"));
        productscosmetic.add(new Products("paudar",	"পাউডার",	"0",	"১১০",	110,	0,	"১০০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-5.jpg"));
        productscosmetic.add(new Products("kajol",	"কাজল",	"0",	"১৫০",	150,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-6.jpg"));
        productscosmetic.add(new Products("Sampu",	"শ্যাম্পু",	"0",	"২০০",	200,	0,	"১৭০ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-7.jpg"));
        productscosmetic.add(new Products("Konditionar",	"কন্ডিসনার",	"0",	"২৭০",	270,	0,	"১৮০ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-8.jpg"));
        productscosmetic.add(new Products("Perasut Tel",	"প্যারাসুট তেল",	"0",	"১৩০",	130,	0,	"২০০ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-9.jpg"));
        productscosmetic.add(new Products("Amla Tel",	"আমলা তেল",	"0",	"১৯৫",	195,	0,	"২৭৫ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-10.jpg"));
        productscosmetic.add(new Products("Kumarika Tel",	"কুমারিকা তেল",	"0",	"২৪০",	240,	0,	"৪১৫ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-11.jpg"));
        productscosmetic.add(new Products("Novorotno Tel",	"নভোরত্ন তেল",	"0",	"২৫০",	250,	0,	"২০০ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-12.jpg"));
        productscosmetic.add(new Products("HandWash",	"হ্যান্ড ওয়াস",	"0",	"৬৫",	65,	0,	"১৭০ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-13.jpg"));
        productscosmetic.add(new Products("rejar",	"রেজার",	"0",	"৪৫",	45,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-14.jpg"));
        productscosmetic.add(new Products("Fom Seving",	"ফোম সেভিং",	"0",	"১৬০",	160,	0,	"৯৮ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-15.jpg"));
        productscosmetic.add(new Products("Body spry",	"বডি স্প্র্রে",	"0",	"২৮০",	280,	0,	"150 ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-16.jpg"));
        productscosmetic.add(new Products("Loson",	"লোসন",	"0",	"১৫০",	150,	0,	"200 ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-17.jpg"));
        productscosmetic.add(new Products("Ayna",	"আয়না",	"0",	"১৭০",	170,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-18.jpg"));
        productscosmetic.add(new Products("Ciruni",	"চিরুনি",	"0",	"৩০",	30,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-19.jpg"));
        productscosmetic.add(new Products("Koton Bard",	"কটন বার্ড",	"0",	"১০",	10,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-20.jpg"));
        productscosmetic.add(new Products("Tuth Pik",	"টুথ পিক",	"0",	"৩০",	30,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-21.jpg"));
        productscosmetic.add(new Products("Selun Tisu",	"সেলুন টিস্যু",	"0",	"৪৮",	48,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-22.jpg"));
        productscosmetic.add(new Products("Toylet Tisu",	"টয়লেট টিস্যু",	"0",	"২৫",	25,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-23.jpg"));
        productscosmetic.add(new Products("Box Tisi",	"বক্সটিসু",	"0",	"৮০",	80,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics-24.jpg"));
        productscosmetic.add(new Products("Rabar Band",	"রাবার ব্যান্ড",	"0",	"২০",	20,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(25).jpg"));
        productscosmetic.add(new Products("Kakra coto boro",	"কাকড়া",	"0",	"৯০",	90,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(26).jpg"));
        productscosmetic.add(new Products("baccder clip",	"বাচ্চাদে ক্লিপ",	"0",	"৯০",	90,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(27).jpg"));
        productscosmetic.add(new Products("5 minute mehedi",	"৫ মিনিট মেহেদি",	"0",	"৭০",	70,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(29).jpg"));
        productscosmetic.add(new Products("mehedi",	"মেহেদি",	"0",	"৫০",	50,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(28).jpg"));
        productscosmetic.add(new Products("lipstik mat",	"লিপস্টিক ম্যাট",	"0",	"২৫০",	250,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(30).jpg"));
        productscosmetic.add(new Products("lipstik normal",	"লিপস্টিক নরমাল",	"0",	"১৫০",	150,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(31).jpg"));
        productscosmetic.add(new Products("Face Paudar",	"ফেইস পাউডার",	"0",	"৪৫০",	450,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(32).jpg"));
        productscosmetic.add(new Products("EyeLainar",	"আইলাইনার",	"0",	"২০০",	200,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(33).jpg"));
        productscosmetic.add(new Products("Maskara",	"মাসকারা",	"0",	"২৪০",	240,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(34).jpg"));
        productscosmetic.add(new Products("Glisarin",	"গ্লিসারিন",	"0",	"৫৫",	55,	0,	"৬০ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(35).jpg"));
        productscosmetic.add(new Products("Vaslin",	"ভ্যাসলিন",	"0",	"৫০",	50,	0,	"5০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(36).jpg"));
        productscosmetic.add(new Products("Mr.Shain",	"মি শাইন",	"0",	"১২৫",	125,	0,	"৩৫০ ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cosmatics%20(37).jpg"));


        for (int i = 0; i< productscosmetic.size(); i++){
            Products products= productscosmetic.get(i);
            String productKeyname=products.getProductName();

            root.child("cosmetic Product").child(productKeyname).setValue(products);
        }
    }

    public void SaveCrockeries(View view) {

        productsObcrockeres.add(new Products("balty",	"বালতি",	"0",	"৩০",	30,	0,	"30 ltr"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(1).jpg"));
        productsObcrockeres.add(new Products("mora",	"মোড়া",	"0",	"১৮০",	180,	0,	"1 pcs"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro1.jpg"));
        productsObcrockeres.add(new Products("gocoler mog",	"গোসলের মগ 2L",	"0",	"৫৫",	55,	0,	"1 pcs"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro2.jpg"));
        productsObcrockeres.add(new Products("continer",	"কন্টিইনার",	"0",	"১৮৫",	185,	0,	"4 pcs"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro3.jpg"));
        productsObcrockeres.add(new Products("jog",	"জগ",	"0",	"২৫০",	250,	0,	"2.5 ltr"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(2).jpg"));
        productsObcrockeres.add(new Products("mog panir mog",	"মগ বা পানির মগ",	"0",	"৬৫",	65,	0,	"300 ml"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(3).jpg"));
        productsObcrockeres.add(new Products("gamla",	"গামলা",	"0",	"২৯০",	290,	0,	"25 ltr"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(4).jpg"));
        productsObcrockeres.add(new Products("glas set",	"গ্লাস সেট",	"0",	"৬০০",	600,	0,	"6 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(5).jpg"));
        productsObcrockeres.add(new Products("sup set",	"স্যুপ সেট",	"0",	"৬৮০",	680,	0,	"7 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(6).jpg"));
        productsObcrockeres.add(new Products("plat set",	"প্লেট সেট",	"0",	"৮০০",	800,	0,	"6 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(7).jpg"));
        productsObcrockeres.add(new Products("ti camoc",	"টি-চামচ",	"0",	"১১০",	110,	0,	"12 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(8).jpg"));
        productsObcrockeres.add(new Products("tebil camoc",	"টেবিল চামচ",	"0",	"১২০",	120,	0,	"12 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(9).jpg"));
        productsObcrockeres.add(new Products("loboner baty",	"লবনের বাটি",	"0",	"৯৯",	99,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(10).jpg"));
        productsObcrockeres.add(new Products("glas dani",	"গ্লাস দানি",	"0",	"৯৫",	95,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(11).jpg"));
        productsObcrockeres.add(new Products("plat dani",	"প্লেট দানি",	"0",	"৩০০",	300,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(12).jpg"));
        productsObcrockeres.add(new Products("jutar stand",	"জুতার স্টান্ড",	"0",	"৪৯৫",	495,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(13).jpg"));
        productsObcrockeres.add(new Products("self",	"সেল্ফ",	"0",	"৬৭০",	670,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(14).jpg"));
        productsObcrockeres.add(new Products("hengar",	"হেঙ্গার",	"0",	"২০০",	200,	0,	"12 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(15).jpg"));
        productsObcrockeres.add(new Products("melamain plat",	"মেলামাইন প্লেট",	"0",	"৭৫",	122,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro4.jpg"));
        productsObcrockeres.add(new Products("melamain torkarir camoc",	"মেলামাইন তরকারির চামচ",	"0",	"৫৫",	122,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro5.jpg"));
        productsObcrockeres.add(new Products("melamain bol",	"মেলামাইন বল",	"0",	"৩৩০",	122,	0,	"১৪ ইঞ্চি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro6.jpg"));
        productsObcrockeres.add(new Products("melamain vater camoc",	"মেলামাইন ভাতের চামচ",	"0",	"৮০",	122,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro7.jpg"));
        productsObcrockeres.add(new Products("melamain glass",	"মেলামাইন গ্লাস",	"0",	"৬০",	122,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/cro8.jpg"));
        productsObcrockeres.add(new Products("one time plat glas",	"ওয়ান টাইম প্লেট,গ্লাস",	"0",	"১৩৮",	138,	0,	"৫০ pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(17).jpg"));
        productsObcrockeres.add(new Products("cakoni",	"ছাকনি",	"0",	"৫০",	50,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(18).jpg"));
        productsObcrockeres.add(new Products("cure",	"ছুরি",	"0",	"১২০",	120,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(19).jpg"));
        productsObcrockeres.add(new Products("tifen box",	"টিফেন বক্স",	"0",	"৯০",	90,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(20).jpg"));
        productsObcrockeres.add(new Products("tifen kare",	"টিফেন কারি 4 bowl",	"0",	"১২০০",	1200,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(21).jpg"));
        productsObcrockeres.add(new Products("tifen kare",	"টিফেন কারি 3 bowl",	"0",	"৯০০",	900,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(21).jpg"));
        productsObcrockeres.add(new Products("rice kukar",	"রাইস কুকার 3 ltr",	"0",	"২৪৫০",	2450,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(22).jpg"));
        productsObcrockeres.add(new Products("fry pan",	"ফ্রাই প্যান",	"0",	"৫৫০",	550,	0,	"20 cm"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(23).jpg"));
        productsObcrockeres.add(new Products("choping board",	"চপিং বোর্ড",	"0",	"১৭৫",	175,	0,	"34 cm"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(24).jpg"));
        productsObcrockeres.add(new Products("jure",	"ঝুড়ি",	"0",	"৯০",	90,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(25).jpg"));
        productsObcrockeres.add(new Products("belandar",	"বেলেন্ডার",	"0",	"১৮০০",	1800,	0,	"1.5 ltr"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/crockeries%20(26).jpg"));


        for (int i = 0; i< productsObcrockeres.size(); i++){
            Products products= productsObcrockeres.get(i);
            String productKeyname=products.getProductName();

            root.child("Crockeries").child(productKeyname).setValue(products);
        }
    }

    public void SaveElectronics(View view) {
        productselectronics.add(new Products("LED Light",	"এলইডি বাল্ব 12 W",	"0",	"২১০",	210,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(1).jpg"));
        productselectronics.add(new Products("Normal light",	"নরমাল বাল্ব ৪০,৬০,১০০",	"0",	"৪০",	40,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(2).jpg"));
        productselectronics.add(new Products("Energy Light",	"এনার্জি বাল্ব 32 W",	"0",	"১৫০",	150,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(3).jpg"));
        productselectronics.add(new Products("charger Light",	"চার্জার লাইট",	"0",	"৮০০",	800,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(4).jpg"));
        productselectronics.add(new Products("Charger Fan",	"চার্জার ফ্যান",	"0",	"৩৫০০",	3500,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(5).jpg"));
        productselectronics.add(new Products("cheling Fan",	"সিলিং ফ্যান BRB",	"0",	"২৮০০",	2800,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(6).jpg"));
        productselectronics.add(new Products("souro biddut Fan",	"সৌর বিদ্যুৎ ফ্যান",	"0",	"১৫০০",	1500,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(7).jpg"));
        productselectronics.add(new Products("Maltyplug",	"মাল্টিপ্লাগ",	"0",	"৩০০",	300,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(8).jpg"));
        productselectronics.add(new Products("dremLight",	"ড্রিম লাইট",	"0",	"৬০",	60,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(9).jpg"));
        productselectronics.add(new Products("suich board",	"সুইচ বোর্ড",	"0",	"২৯০",	290,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(10).jpg"));
        productselectronics.add(new Products("regulator",	"রেগুলেটর",	"0",	"১২০",	120,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(11).jpg"));
        productselectronics.add(new Products("bed suich",	"বেড সুইচ",	"0",	"৩৫",	35,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(12).jpg"));
        productselectronics.add(new Products("koctep",	"কসটেপ",	"0",	"২০",	20,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(13).jpg"));
        productselectronics.add(new Products("boro koctep",	"বড় কসটেপ",	"0",	"৮০",	80,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(14).jpg"));
        productselectronics.add(new Products("plug",	"প্লাগ",	"0",	"৫০",	50,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(15).jpg"));
        productselectronics.add(new Products("headphone",	"হেডফোন",	"0",	"৫০০",	500,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(16).jpg"));
        productselectronics.add(new Products("charger",	"চার্জার",	"0",	"১৭০",	170,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(17).jpg"));
        productselectronics.add(new Products("tourch Light",	"টর্চ লাইট",	"0",	"১৫০",	150,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/electronics%20(18).jpg"));


        for (int i = 0; i< productselectronics.size(); i++){
            Products products= productselectronics.get(i);
            String productKeyname=products.getProductName();

            root.child("Electronics").child(productKeyname).setValue(products);
        }
    }

    public void SaveFishMeat(View view) {
        productsfishMeat.add(new Products("elis",	"ইলিস",	"0",	"১০০০",	1000,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish1.jpg"));
        productsfishMeat.add(new Products("cingri",	"চিংড়ি",	"0",	"৬০০",	600,	0,	"৫০০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish2.jpg"));
        productsfishMeat.add(new Products("katol",	"কাতল",	"0",	"৩৬০",	360,	0,	"১.৫ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish3.jpg"));
        productsfishMeat.add(new Products("rui",	"রুই",	"0",	"৩০০",	300,	0,	"১.৫ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish4.jpg"));
        productsfishMeat.add(new Products("pangas",	"পাঙ্গাস",	"0",	"২৮০",	280,	0,	"১.৫ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish5.jpg"));
        productsfishMeat.add(new Products("telapiya",	"তেলাপিয়া",	"0",	"১৩০",	130,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish6.jpg"));
        productsfishMeat.add(new Products("koy",	"কই",	"0",	"২৫০",	250,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish7.jpg"));
        productsfishMeat.add(new Products("sing",	"শিং",	"0",	"৩৫০",	350,	0,	"৫০০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish8.jpg"));
        productsfishMeat.add(new Products("ayer",	"আইর",	"0",	"৮০০",	800,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish9.jpg"));
        productsfishMeat.add(new Products("Boyal",	"বোয়াল",	"0",	"৬০০",	600,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish10.jpg"));
        productsfishMeat.add(new Products("pabda",	"পাবদা",	"0",	"৫০০",	500,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish11.jpg"));
        productsfishMeat.add(new Products("tengra",	"টেংরা",	"0",	"৪০০",	400,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish12.jpg"));
        productsfishMeat.add(new Products("tuladadi",	"তুলাডাডি",	"0",	"৩৫০",	350,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish13.jpg"));
        productsfishMeat.add(new Products("rida",	"রিডা",	"0",	"১০০০",	1000,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish14.jpg"));
        productsfishMeat.add(new Products("citol",	"চিতল",	"0",	"৭০০",	700,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish15.jpg"));
        productsfishMeat.add(new Products("mola",	"মলা",	"0",	"৩০০",	300,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish16.jpg"));
        productsfishMeat.add(new Products("nola boro",	"নলা বড়",	"0",	"৩০০",	300,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish17.jpg"));
        productsfishMeat.add(new Products("nola coto",	"নলা ছোট",	"0",	"2০০",	200,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish17.jpg"));
        productsfishMeat.add(new Products("poya",	"পোয়া",	"0",	"৪00",	400,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish18.jpg"));
        productsfishMeat.add(new Products("bele mach",	"বেলে মাছ",	"0",	"৭00",	700,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish19.jpg"));
        productsfishMeat.add(new Products("kacki gura",	"কাচকি গুড়া",	"0",	"৩00",	300,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish20.jpg"));
        productsfishMeat.add(new Products("sol",	"শোল",	"0",	"৬00",	600,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish21.jpg"));
        productsfishMeat.add(new Products("taki",	"টাকি",	"0",	"৩00",	300,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish22.jpg"));
        productsfishMeat.add(new Products("minar karp",	"মিনার কাপ",	"0",	"২৫0",	250,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish23.jpg"));
        productsfishMeat.add(new Products("samudrik Mach",	"সামুদ্রিক মাছ",	"0",	"৬00",	600,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish24.jpg"));
        productsfishMeat.add(new Products("Puti",	"পুটি",	"0",	"২৫০",	250,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish25.jpg"));
        productsfishMeat.add(new Products("ilisha goda",	"ইলশাগাদা",	"0",	"৩০০",	300,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish26.jpg"));
        productsfishMeat.add(new Products("magur",	"মাগুর",	"0",	"৪০০",	400,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish28.jpg"));
        productsfishMeat.add(new Products("fole",	"ফলি",	"0",	"৫০০",	500,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish29.jpg"));
        productsfishMeat.add(new Products("kholisha",	"খলিশা",	"0",	"১৫০",	150,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish30.jpg"));
        productsfishMeat.add(new Products("silvar Carp",	"সিলভার কাপ",	"0",	"২৫০",	250,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish31.jpg"));
        productsfishMeat.add(new Products("sorputi",	"সরপুটি",	"0",	"১৮০",	180,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fish32.jpg"));
        productsfishMeat.add(new Products("goru",	"গরু",	"0",	"৫৫০",	550,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-1.jpg"));
        productsfishMeat.add(new Products("khase",	"খাসি",	"0",	"৮০০",	800,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-2.jpg"));
        productsfishMeat.add(new Products("poltre",	"পল্ট্রি",	"0",	"১২০",	120,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-3.jpg"));
        productsfishMeat.add(new Products("sonali murgi",	"সোনালী মুরগী",	"0",	"২৩০",	230,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-4.jpg"));
        productsfishMeat.add(new Products("kok murgi",	"কক মুরগী",	"0",	"২৩০",	230,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-5.jpg"));
        productsfishMeat.add(new Products("dese murgi",	"দেশি মুরগী",	"0",	"৪০০",	400,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-6.jpg"));
        productsfishMeat.add(new Products("gorur kolija",	"গরুর কলিজা",	"0",	"৫৫০",	550,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-7.jpg"));
        productsfishMeat.add(new Products("gorur Vure",	"গরুর ভুড়ি",	"0",	"২৫০",	250,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-8.jpg"));
        productsfishMeat.add(new Products("gorur paya",	"গরুর পায়া",	"0",	"১০০০",	1000,	0,	"৪ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Meat-9.jpg"));


        for (int i = 0; i< productsfishMeat.size(); i++){
            Products products= productsfishMeat.get(i);
            String productKeyname=products.getProductName();

            root.child("Fish-Meat").child(productKeyname).setValue(products);
        }
    }

    public void SaveFruitsVegitable(View view) {
        productsFruitsVegitable.add(new Products("mango",	"আম",	"0",	"১৫০",	150,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f1.jpg"));
        productsFruitsVegitable.add(new Products("jam",	"জাম",	"0",	"৮০",	80,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f2.jpg"));
        productsFruitsVegitable.add(new Products("kathal",	"কাঁঠাল",	"0",	"১৩০",	130,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f3.jpg"));
        productsFruitsVegitable.add(new Products("Kola",	"কলা",	"0",	"৪০",	40,	0,	"৪ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f4.jpg"));
        productsFruitsVegitable.add(new Products("licu",	"লিচু",	"0",	"৩০০",	300,	0,	"১০০ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f5.jpg"));
        productsFruitsVegitable.add(new Products("aple",	"আপেল",	"0",	"১৩০",	130,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f6.jpg"));
        productsFruitsVegitable.add(new Products("naspoty",	"নাশপতি",	"0",	"২০০",	200,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f7.jpg"));
        productsFruitsVegitable.add(new Products("malta",	"মালটা",	"0",	"২১০",	210,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f8.jpg"));
        productsFruitsVegitable.add(new Products("Angur",	"আঙ্গুর",	"0",	"১৫০",	150,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f9.jpg"));
        productsFruitsVegitable.add(new Products("anar",	"আনার",	"0",	"২৮০",	280,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f10.jpg"));
        productsFruitsVegitable.add(new Products("anaros",	"আনারস",	"0",	"২৫",	25,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f11.jpg"));
        productsFruitsVegitable.add(new Products("kalo angur",	"কালো আঙ্গুর",	"0",	"২০০",	200,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f12.jpg"));
        productsFruitsVegitable.add(new Products("kejur",	"খেজুর",	"0",	"৩৫০",	350,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f13.jpg"));
        productsFruitsVegitable.add(new Products("Peyara",	"পেয়ারা",	"0",	"৮০",	80,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f14.jpg"));
        productsFruitsVegitable.add(new Products("Tormuj",	"তরমুজ",	"0",	"১৫০",	150,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f15.jpg"));
        productsFruitsVegitable.add(new Products("Fut",	"ফুট",	"0",	"১২০",	120,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f16.jpg"));
        productsFruitsVegitable.add(new Products("Komla",	"কমলা",	"0",	"১৭০",	170,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f17.jpg"));
        productsFruitsVegitable.add(new Products("Paka pepe",	"পাকা পেপে",	"0",	"১০০",	100,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f18.jpg"));
        productsFruitsVegitable.add(new Products("Boroy",	"বড়ই",	"0",	"৬০",	60,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f19.jpg"));
        productsFruitsVegitable.add(new Products("monakka",	"মনাক্কা",	"0",	"১৫০",	150,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f20.jpg"));
        productsFruitsVegitable.add(new Products("kaca mango",	"কাচা আম",	"0",	"৫০",	50,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/f21.jpg"));
        productsFruitsVegitable.add(new Products("potol",	"পটল",	"0",	"৩৫",	35,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-3.jpg"));
        productsFruitsVegitable.add(new Products("kaca moric",	"কাচামরিচ",	"0",	"১৫",	15,	0,	"২৫০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-4.jpg"));
        productsFruitsVegitable.add(new Products("filcopy",	"ফুলকফি",	"0",	"৫০",	50,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-5.jpg"));
        productsFruitsVegitable.add(new Products("badhakopy",	"বাধাকফি",	"0",	"৩০",	30,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-6.jpg"));
        productsFruitsVegitable.add(new Products("borboty",	"বরবটি",	"0",	"৭০",	70,	0,	"১ মুঠা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-7.jpg"));
        productsFruitsVegitable.add(new Products("lal shak",	"লাল শাক",	"0",	"১৫",	15,	0,	"১ মুঠা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-8.jpg"));
        productsFruitsVegitable.add(new Products("palong shak",	"পালং শাক",	"0",	"১৫",	15,	0,	"১ মুঠা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-9.jpg"));
        productsFruitsVegitable.add(new Products("kumra",	"কুমড়া",	"0",	"৩৫",	35,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-10.jpg"));
        productsFruitsVegitable.add(new Products("lau",	"লাউ",	"0",	"৩৫",	35,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-11.jpg"));
        productsFruitsVegitable.add(new Products("kackola",	"কাচকলা",	"0",	"৩৫",	35,	0,	"৪ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-12.jpg"));
        productsFruitsVegitable.add(new Products("pepe",	"পেপে",	"0",	"৩৫",	35,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-13.jpg"));
        productsFruitsVegitable.add(new Products("korola",	"করোলা",	"0",	"৩৫",	35,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-14.jpg"));
        productsFruitsVegitable.add(new Products("jinga",	"ঝিঙ্গা",	"0",	"৩৫",	35,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-15.jpg"));
        productsFruitsVegitable.add(new Products("reha",	"রেহা",	"0",	"৪০",	40,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-16.jpg"));
        productsFruitsVegitable.add(new Products("sosha",	"শষা",	"0",	"৭০",	70,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-17.jpg"));
        productsFruitsVegitable.add(new Products("loty",	"লতি",	"0",	"৪০",	40,	0,	"১ মুঠা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-18.jpg"));
        productsFruitsVegitable.add(new Products("khiray",	"খিরাই",	"0",	"৪০",	40,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-19.jpg"));
        productsFruitsVegitable.add(new Products("tomato",	"টমেটো",	"0",	"৩০",	30,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-20.jpg"));
        productsFruitsVegitable.add(new Products("begun",	"বেগুন",	"0",	"৬৫",	65,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-21.jpg"));
        productsFruitsVegitable.add(new Products("gajor",	"গাজর",	"0",	"৫০",	50,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-22.jpg"));
        productsFruitsVegitable.add(new Products("lebu",	"লেবু",	"0",	"৩০",	30,	0,	"৪  পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-23.jpg"));
        productsFruitsVegitable.add(new Products("deros",	"ঢেরস",	"0",	"৪০",	40,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-24.jpg"));
        productsFruitsVegitable.add(new Products("brokly",	"ব্রকলি",	"0",	"৬০",	60,	0,	"১  পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-25.jpg"));
        productsFruitsVegitable.add(new Products("kocu",	"কচু",	"0",	"১৩০",	130,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-26.jpg"));
        productsFruitsVegitable.add(new Products("data",	"ডাটা",	"0",	"২০",	20,	0,	"১ মুঠা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-27.jpg"));
        productsFruitsVegitable.add(new Products("puishak",	"পুইশাক",	"0",	"৩০",	30,	0,	"৬০০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-28.jpg"));
        productsFruitsVegitable.add(new Products("kalrol",	"কারকোল",	"0",	"১১০",	110,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-29.jpg"));
        productsFruitsVegitable.add(new Products("sim",	"শিম",	"0",	"৪০",	40,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-30.jpg"));
        productsFruitsVegitable.add(new Products("salgom",	"শালগম",	"0",	"৫০",	50,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-31.jpg"));
        productsFruitsVegitable.add(new Products("mula",	"মুলা",	"0",	"৩৫",	35,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-32.jpg"));
        productsFruitsVegitable.add(new Products("jolpay",	"জলপাই",	"0",	"৮০",	80,	0,	"১ কেজি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-33.jpg"));
        productsFruitsVegitable.add(new Products("narikel",	"নারিকেল",	"0",	"৭০",	70,	0,	"২ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-34.jpg"));
        productsFruitsVegitable.add(new Products("calta",	"চালতা",	"0",	"৫",	5,	0,	"১  পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/fruits-35.jpg"));

        for (int i = 0; i< productsFruitsVegitable.size(); i++){
            Products products= productsFruitsVegitable.get(i);
            String productKeyname=products.getProductName();

            root.child("Fruits-Vegitable").child(productKeyname).setValue(products);
        }
    }

    public void SaveGroceery(View view) {


        Log.e(TAG, "SaveGroceery: ");
        productsGroceery.add(new Products("Cal",	"চাল",	"0",	"৬০",	60,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-1.jpg"));
        productsGroceery.add(new Products("Tel",	"তেল",	"0",	"১০৯",	109,	0,	"1Litter",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-2.jpg"));
        productsGroceery.add(new Products("Lobon",	"লবন",	"0",	"৩৫",	35,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-3.jpg"));
        productsGroceery.add(new Products("Ata",	"আটা",	"0",	"৩৫",	35,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-4.jpg"));
        productsGroceery.add(new Products("Moyda",	"ময়দা",	"0",	"৪৮",	48,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-5.jpg"));
        productsGroceery.add(new Products("Suji",	"সুজি",	"0",	"৩০",	30,	0,	"500g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-6.jpg"));
        productsGroceery.add(new Products("Musure Dal",	"মুসুরি ডাল",	"0",	"১০০",	100,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-7.jpg"));
        productsGroceery.add(new Products("Mug Dal",	"মুগ ডাল",	"0",	"৭৫",	75,	0,	"500g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-8.jpg"));
        productsGroceery.add(new Products("Enkor Dal",	"এংকর ডাল",	"0",	"৩৫",	35,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-9.jpg"));
        productsGroceery.add(new Products("Dese Murgir Dal",	"দেশি মুসুরি ডাল",	"0",	"১৪০",	140,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery10.jpg"));
        productsGroceery.add(new Products("Buter Dal",	"বুটের ডাল",	"0",	"৫৫",	55,	0,	"500g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery11.jpg"));
        productsGroceery.add(new Products("Cola",	"ছোলা",	"0",	"৮০",	80,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-12.jpg"));
        productsGroceery.add(new Products("Holuder Gura",	"হলুদের গুড়া",	"0",	"৪৮",	48,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-13.jpg"));
        productsGroceery.add(new Products("Moricer Gura",	"মরিচের গুড়া",	"0",	"৫০",	50,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-14.jpg"));
        productsGroceery.add(new Products("Jirar Gura",	"জিরার গুড়া",	"0",	"৪৩",	43,	0,	"50gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery15.jpg"));
        productsGroceery.add(new Products("Doniya Gura",	"ধনিয়া গুড়া",	"0",	"৩০",	30,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-16.jpg"));
        productsGroceery.add(new Products("Gorom Mosla Gura",	"গরম মসলা গুড়া",	"0",	"৬০",	60,	0,	"40gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-17.jpg"));
        productsGroceery.add(new Products("Gorom Mosla",	"গরম মসলা",	"0",	"৫০",	50,	0,	"0",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-18.jpg"));
        productsGroceery.add(new Products("Testing Solt",	"টেস্টিং সল্ট",	"0",	"৩৫",	35,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-19.jpg"));
        productsGroceery.add(new Products("Vim",	"ভিম",	"0",	"৩০",	30,	0,	"300gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-20.jpg"));
        productsGroceery.add(new Products("Vim Liquet",	"ভিম লিকুইড",	"0",	"৫০",	50,	0,	"250ml",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-21.jpg"));
        productsGroceery.add(new Products("Fuler Jaru",	"ফুলের ঝাড়ু",	"0",	"৫০",	50,	0,	"1pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-22.jpg"));
        productsGroceery.add(new Products("Solar Jaru",	"শলার ঝাড়ু",	"0",	"৪৫",	45,	0,	"1pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-23.jpg"));
        productsGroceery.add(new Products("Thala Bati majon",	"থালা-বাটি মাজন",	"0",	"২৮",	28,	0,	"1pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-24.jpg"));
        productsGroceery.add(new Products("Mure",	"মুড়ি",	"0",	"৬২",	62,	0,	"500g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-25.jpg"));
        productsGroceery.add(new Products("Sorisar Tel",	"সরিষার তেল",	"0",	"৬৫",	65,	0,	"250ml",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-26.jpg"));
        productsGroceery.add(new Products("Dim",	"ডিম",	"0",	"৯২",	92,	0,	"12pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-27.jpg"));
        productsGroceery.add(new Products("Kalojira",	"কালোজিরা",	"0",	"৪০",	40,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-28.jpg"));
        productsGroceery.add(new Products("AluBokhra",	"আলু বোখরা",	"0",	"৩৮",	38,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-29.jpg"));
        productsGroceery.add(new Products("JoyFol",	"জয় ফল",	"0",	"৩৭",	37,	0,	"5pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-30.jpg"));
        productsGroceery.add(new Products("Joytre",	"জয়এি",	"0",	"২৭৭",	277,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-31.jpg"));
        productsGroceery.add(new Products("Posta dana",	"পোস্ত দানা",	"0",	"৬৩",	63,	0,	"50gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-32.jpg"));
        productsGroceery.add(new Products("gura dud",	"গুড়া দুধ",	"0",	"৩১৫",	315,	0,	"500g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-33.jpg"));
        productsGroceery.add(new Products("biriyani mosla",	"বিরিয়ানী মসলা",	"0",	"৫৫",	55,	0,	"40gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-34.jpg"));
        productsGroceery.add(new Products("cotpoty mosla",	"চটপটি মসলা",	"0",	"৪০",	40,	0,	"50gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-35.jpg"));
        productsGroceery.add(new Products("halim misk",	"হালিম মিস্ক",	"0",	"৪৫",	45,	0,	"200gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-36.jpg"));
        productsGroceery.add(new Products("gorur manser mosla",	"গরুর মাংসের মসলা",	"0",	"৬৫",	65,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-37.jpg"));
        productsGroceery.add(new Products("murgir manser mosla",	"মুরগীর মাংসের মসলা",	"0",	"১৫",	15,	0,	"20gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-38.jpg"));
        productsGroceery.add(new Products("rost mosla",	"রোস্ট মসলা",	"0",	"৬০",	60,	0,	"35gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-39.jpg"));
        productsGroceery.add(new Products("macer mosla",	"মাছের মসলা",	"0",	"৫৫",	55,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-40.jpg"));
        productsGroceery.add(new Products("bit lobon",	"বিট লবন",	"0",	"৩৫",	35,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-41.jpg"));
        productsGroceery.add(new Products("cotpoty dal",	"চটপটি ডাল",	"0",	"২৫",	25,	0,	"500g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-42.jpg"));
        productsGroceery.add(new Products("veson",	"ভেসন",	"0",	"৬৫",	65,	0,	"500ml",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-43.jpg"));
        productsGroceery.add(new Products("sukna moric",	"শুকনা মরিচ",	"0",	"৩৫",	35,	0,	"100g",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-44.jpg"));
        productsGroceery.add(new Products("cini",	"চিনি",	"0",	"৭২",	72,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-45.jpg"));
        productsGroceery.add(new Products("whel gura",	"হুইল গুড়া",	"0",	"৬০",	60,	0,	"500gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-46.jpg"));
        productsGroceery.add(new Products("kapor kacar saban",	"কাপড় কাচা সাবান",	"0",	"২০",	20,	0,	"130gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-47.jpg"));
        productsGroceery.add(new Products("saban",	"সাবান",	"0",	"৪৫",	45,	0,	"100gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-48.jpg"));
        productsGroceery.add(new Products("diyaslay",	"দিয়াশলাই",	"0",	"২৪",	24,	0,	"12pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-49.jpg"));
        productsGroceery.add(new Products("gas light",	"গ্যাস লাইট",	"0",	"৫০",	50,	0,	"5pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-50.jpg"));
        productsGroceery.add(new Products("mombate",	"মোমবাতি",	"0",	"৬০",	60,	0,	"12pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-51.jpg"));
        productsGroceery.add(new Products("koyel",	"কয়েল",	"0",	"৮০",	80,	0,	"1Packet",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-52.jpg"));
        productsGroceery.add(new Products("nil",	"নীল",	"0",	"৩০",	30,	0,	"100gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-53.jpg"));
        productsGroceery.add(new Products("cira",	"চিড়া",	"0",	"৪৫",	45,	0,	"500gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-54.jpg"));
        productsGroceery.add(new Products("isubgul",	"ইসুবগোল",	"0",	"১১০",	110,	0,	"100gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-55.jpg"));
        productsGroceery.add(new Products("tokma dana",	"তোকমা দানা",	"0",	"৪০",	40,	0,	"100gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-56.jpg"));
        productsGroceery.add(new Products("tuathpaste",	"টুথপেস্ট",	"0",	"১১০",	110,	0,	"160gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-57.jpg"));
        productsGroceery.add(new Products("brash",	"ব্রাশ",	"0",	"৭০",	70,	0,	"1pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-58.jpg"));
        productsGroceery.add(new Products("nihare mosla",	"নিহারি মসলা",	"0",	"০",	0,	0,	"0",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-59.jpg"));
        productsGroceery.add(new Products("kolom",	"কলম",	"0",	"৫০",	50,	0,	"5pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-60.jpg"));
        productsGroceery.add(new Products("khata",	"খাতা",	"0",	"৪০",	40,	0,	"1pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-61.jpg"));
        productsGroceery.add(new Products("coto khate",	"ছোট খাতা",	"0",	"১৫",	15,	0,	"1pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-62.jpg"));
        productsGroceery.add(new Products("alu",	"আলু",	"0",	"৩০",	30,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-63.jpg"));
        productsGroceery.add(new Products("piyaj",	"পিয়াজ",	"0",	"৬০",	60,	0,	"1kg",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-64.jpg"));
        productsGroceery.add(new Products("ada",	"আদা",	"0",	"৯৮",	98,	0,	"250gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-65.jpg"));
        productsGroceery.add(new Products("rosun",	"রসুন",	"0",	"৪৫",	45,	0,	"250gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-66.jpg"));
        productsGroceery.add(new Products("pan",	"পান",	"0",	"৯০",	90,	0,	"1Bira",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-67.jpg"));
        productsGroceery.add(new Products("supare",	"সুপারি",	"0",	"১০০",	100,	0,	"20Pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-68.jpg"));
        productsGroceery.add(new Products("jorda",	"জর্দা",	"0",	"৭২",	72,	0,	"6Pcs",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-69.jpg"));
        productsGroceery.add(new Products("ruh afja",	"রুহ আফজা",	"0",	"১৫০",	150,	0,	"300ml",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-70.jpg"));
        productsGroceery.add(new Products("sarfexcel",	"সার্ফএক্সেল",	"0",	"১০০",	100,	0,	"500gm",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-71.jpg"));
        productsGroceery.add(new Products("harpic",	"হারপিক",	"0",	"১৬০",	160,	0,	"1Litter",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-72.jpg"));
        productsGroceery.add(new Products("toilet brush",	"টয়লেট ব্রাশ",	"0",	"১০০",	100,	0,	"24inch",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-73.jpg"));
        productsGroceery.add(new Products("gor mocar brush",	"ঘর মোছার ব্রাশ",	"0",	"২০০",	200,	0,	"1pc",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/grocery-74.jpg"));


        productsGroceery.add(new Products("cinigura cal",	"চিনিগুড়া চাল",	"0",	"১৩০",	130,	0,	"১ কেজি",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/groc-1.jpg"));
        productsGroceery.add(new Products("benson",	"বেনসন",	"0",	"২৫০",	250,	0,	"১ প্যাকেট",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/groc-2.jpg"));
        productsGroceery.add(new Products("gold lif",	"গোল্ড লিফ",	"0",	"১৮৬",	186,	0,	"১ প্যাকেট",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/groc-3.jpg"));
        productsGroceery.add(new Products("glod lif switch",	"গোল্ড লিফ সুইজ",	"0",	"১৮৬",	186,	0,	"১ প্যাকেট",	"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/groc-4.jpg"));

        for (int i = 0; i< productsGroceery.size(); i++){
            Products products= productsGroceery.get(i);
            String productKeyname=products.getProductName();

            root.child("Grocery").child(productKeyname).setValue(products);
        }
    }

    public void SaveKidsTools(View view) {
        Toast.makeText(this, "Upcoming Featchers", Toast.LENGTH_SHORT).show();
    }

    public void SaveMedicine(View view) {

        Log.e(TAG, "SaveMedicine: " );
        productsMedicine.add(new Products("Napa",	"নাপা",	"0",	"৮",	8,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(1).jpg"));
        productsMedicine.add(new Products("Napa Extra",	"নাপা এক্সট্রা",	"0",	"২৫",	25,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(2).jpg"));
        productsMedicine.add(new Products("Peracitamal",	"প্যারাসিটামল",	"0",	"৮",	8,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(3).jpg"));
        productsMedicine.add(new Products("Tafnil",	"টাফনিল",	"0",	"১০০",	100,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(4).jpg"));
        productsMedicine.add(new Products("komet 500",	"কমেট ৫০০",	"0",	"৪২",	42,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(5).jpg"));
        productsMedicine.add(new Products("savlon molom",	"স্যাভলন মলম",	"0",	"৩৪",	34,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(6).jpg"));
        productsMedicine.add(new Products("savlon liquet",	"স্যভলন লিকুইড",	"0",	"৪৪",	44,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(7).jpg"));
        productsMedicine.add(new Products("dettol liquet",	"ডেটল লিকুইড",	"0",	"৪২",	42,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(8).jpg"));
        productsMedicine.add(new Products("Sanitaijar",	"স্যানিটাইজার ৫০মিলি",	"0",	"১৩০",	130,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(9).jpg"));
        productsMedicine.add(new Products("elatrol",	"এলাট্রোল",	"0",	"৩০",	30,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(10).jpg"));
        productsMedicine.add(new Products("bendej",	"ব্যান্ডেজ",	"0",	"১২",	94,	0,	"৬ ইঞ্চি"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(11).jpg"));
        productsMedicine.add(new Products("hexisol",	"হেক্সিসল 250ml",	"0",	"১৩০",	130,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(12).jpg"));
        productsMedicine.add(new Products("vayodin",	"ভায়োডিন 15ml",	"0",	"২৫",	25,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(13).jpg"));
        productsMedicine.add(new Products("Povisep molom",	"পভিসেপ মলম",	"0",	"২২",	22,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(14).jpg"));
        productsMedicine.add(new Products("Povisep liquet",	"পভিসেপ লিকুইড",	"0",	"৫৫",	55,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(15).jpg"));
        productsMedicine.add(new Products("napa seriap",	"নাপা সিরাপ",	"0",	"২০",	20,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(16).jpg"));
        productsMedicine.add(new Products("Aic Tablet",	"এইস ট্যাবলেট",	"0",	"৮",	8,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(17).jpg"));
        productsMedicine.add(new Products("Aic Serap",	"এইস সিরাপ",	"0",	"২০",	20,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(18).jpg"));
        productsMedicine.add(new Products("Jimax",	"জিমেক্স",	"0",	"৩৫০",	350,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(19).jpg"));
        productsMedicine.add(new Products("Kasir Serap",	"কাসির সিরাপ",	"0",	"১০০",	100,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(20).jpg"));
        productsMedicine.add(new Products("kremir oysod",	"কৃমির ঔসধ",	"0",	"৫",	5,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(21).jpg"));
        productsMedicine.add(new Products("insulain",	"ইনসুলিন ৩০,২২,৭০,১০০",	"0",	"৪০০",	400,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(22).jpg"));
        productsMedicine.add(new Products("Presarer Oysod",	"প্রেসারের ঔসধ",	"0",	"৮",	8,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(23).jpg"));
        productsMedicine.add(new Products("Gastik Oysod",	"গ্যসটিক ঔসধ",	"0",	"৭০",	70,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(24).jpg"));
        productsMedicine.add(new Products("Kondom",	"কনডম",	"0",	"৯৫",	95,	0,	"১ packet"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(25).jpg"));
        productsMedicine.add(new Products("Pempas",	"পেমপাস",	"0",	"১৩০",	130,	0,	"5 pcs"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(26).jpg"));
        productsMedicine.add(new Products("Pil",	"পিল",	"0",	"১৯৫",	195,	0,	"১ পাতা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(27).jpg"));
        productsMedicine.add(new Products("Senera",	"সেনেরা",	"0",	"৫০",	50,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(28).jpg"));
        productsMedicine.add(new Products("plastar",	"প্লাস্টার ৬cm",	"0",	"১৪০",	140,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(29).jpg"));
        productsMedicine.add(new Products("Tula coto",	"তুলা ছোট",	"0",	"২৫",	25,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(30).jpg"));
        productsMedicine.add(new Products("Tula boro",	"তুলা বড়",	"0",	"৪৫",	45,	0,	"১ টা"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/medicine%20(30).jpg"));

        for (int i = 0; i< productsMedicine.size(); i++){
            Products products= productsMedicine.get(i);
            String productKeyname=products.getProductName();

            root.child("Medicine").child(productKeyname).setValue(products);
        }
    }

    public void SaveSnacks(View view) {

        Log.e(TAG, "SaveSnacks: " );
        productsSnacks.add(new Products("Moglai",	"মগলাই",	"0",	"৪০",	40,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-1.jpg"));
        productsSnacks.add(new Products("Pure",	"পুরি",	"0",	"৫",	5,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-2.jpg"));
        productsSnacks.add(new Products("Singara",	"সিংগারা",	"0",	"৫",	5,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-3.jpg"));
        productsSnacks.add(new Products("Somucha",	"সমুছা",	"0",	"৫",	5,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-4.jpg"));
        productsSnacks.add(new Products("Alu cop",	"আলু চপ",	"0",	"৫",	5,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-5.jpg"));
        productsSnacks.add(new Products("dim Cop",	"ডিম চপ",	"0",	"১৫",	15,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-6.jpg"));
        productsSnacks.add(new Products("Piyaju",	"পিয়াজু",	"0",	"৫",	5,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-7.jpg"));
        productsSnacks.add(new Products("beguni",	"বেগুনি",	"0",	"৫",	5,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-8.jpg"));
        productsSnacks.add(new Products("kabab tikka",	"কাবাব-টিক্কা",	"0",	"১০",	10,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-9.jpg"));
        productsSnacks.add(new Products("Halim",	"হালিম",	"0",	"৫০",	50,	0,	"50 gm"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-10.jpg"));
        productsSnacks.add(new Products("cotpoty",	"চটপটি",	"0",	"৩০",	30,	0,	"50 gm"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-11.jpg"));
        productsSnacks.add(new Products("chicken Fry",	"চিকেন ফ্রাই",	"0",	"৮০",	80,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-12.jpg"));
        productsSnacks.add(new Products("Grel",	"গ্রীল",	"0",	"১০০",	100,	0,	"1 Quarter"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-13.jpg"));
        productsSnacks.add(new Products("Nan porota",	"নান-পরোটা",	"0",	"২৫",	25,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-14.jpg"));
        productsSnacks.add(new Products("Caynic nuduls",	"চাইনিজ নুডুলস",	"0",	"১৫০",	150,	0,	"Half"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-15.jpg"));
        productsSnacks.add(new Products("Bargur",	"বার্গার",	"0",	"৮০",	122,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-16.jpg"));
        productsSnacks.add(new Products("Special Bargur",	"স্পেসাল বার্গার",	"0",	"১২০",	120,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-17.jpg"));
        productsSnacks.add(new Products("Rol",	"রোল",	"0",	"২৫",	25,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-18.jpg"));
        productsSnacks.add(new Products("Chicken Tost",	"চিকনে টোস্ট",	"0",	"3৫",	35,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-19.jpg"));
        productsSnacks.add(new Products("Pestry",	"পেষ্ট্রি",	"0",	"২০",	20,	0,	"1 pc"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-20.jpg"));
        productsSnacks.add(new Products("ColaVuna",	"ছোলাভুনা",	"0",	"২০",	20,	0,	"100 gm"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-21.jpg"));
        productsSnacks.add(new Products("Burinda",	"বুরিন্দা",	"0",	"২০",	20,	0,	"৫০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-22.jpg"));
        productsSnacks.add(new Products("Botvaja",	"বটভাজা",	"0",	"৬০",	60,	0,	"৫০ গ্রাম"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/snacks-23.jpg"));


        for (int i = 0; i< productsSnacks.size(); i++){
            Products products= productsSnacks.get(i);
            String productKeyname=products.getProductName();

            root.child("Snacks").child(productKeyname).setValue(products);
        }
    }

    public void SaveStudyTools(View view) {

        Log.e(TAG, "SaveStudyTools: " );
        productsStudyTools.add(new Products("cotoder golper bou",	"ছোটদের গল্পের বই",	"0",	"৩০",	30,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(1).jpg"));
        productsStudyTools.add(new Products("golper boy",	"গল্পের বই",	"0",	"৩০",	30,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(2).jpg"));
        productsStudyTools.add(new Products("uponnas",	"উপন্যাস",	"0",	"১০০",	100,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(3).jpg"));
        productsStudyTools.add(new Products("coto khata",	"ছোট খাতা",	"0",	"২০",	20,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(4).jpg"));
        productsStudyTools.add(new Products("Boro Khata",	"বড় খাতা",	"0",	"৪০",	40,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(5).jpg"));
        productsStudyTools.add(new Products("pencil",	"পেনসিল",	"0",	"১৫",	15,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(6).jpg"));
        productsStudyTools.add(new Products("Rabar",	"রাবার",	"0",	"১০",	10,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(7).jpg"));
        productsStudyTools.add(new Products("Katar",	"কাটার",	"0",	"১০",	10,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(8).jpg"));
        productsStudyTools.add(new Products("Practical khata",	"প্রাকটিক্যাল খাতা",	"0",	"৬০",	60,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(9).jpg"));
        productsStudyTools.add(new Products("Rong pencil",	"রং পেন্সিল",	"0",	"১২০",	120,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(10).jpg"));
        productsStudyTools.add(new Products("Scale",	"স্কেল",	"0",	"৩০",	30,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(11).jpg"));
        productsStudyTools.add(new Products("jamity box",	"জ্যামিতি বক্স",	"0",	"৭০",	70,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(12).jpg"));
        productsStudyTools.add(new Products("Pencil box",	"পেনসিল বক্স",	"0",	"৫০",	50,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(13).jpg"));
        productsStudyTools.add(new Products("clicp board",	"ক্লিপ বোর্ড",	"0",	"৪০",	40,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(14).jpg"));
        productsStudyTools.add(new Products("File",	"ফাইল",	"0",	"২৫",	25,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(15).jpg"));
        productsStudyTools.add(new Products("Stapler",	"স্টাপলার",	"0",	"১২০",	120,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(16).jpg"));
        productsStudyTools.add(new Products("Entre cutter",	"এন্টিকাটার",	"0",	"৫০",	50,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(17).jpg"));
        productsStudyTools.add(new Products("pepar cutter",	"পেপার কাটার",	"0",	"১২০",	120,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/study(18).jpg"));


        for (int i = 0; i< productsStudyTools.size(); i++){
            Products products= productsStudyTools.get(i);
            String productKeyname=products.getProductName();

            root.child("Study Tools").child(productKeyname).setValue(products);
        }
    }

    public void SaveQuranHadis(View view) {

        Log.e(TAG, "SaveQuranHadis: ");

        productsQuranHadis.add(new Products("quran sorif",	"কোরআন শরিফ",	"0",	"৪০০",	400,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(1).jpg"));
        productsQuranHadis.add(new Products("jekono hadiser boi",	"যেকোন হাদিসের বই",	"0",	"২৫০",	250,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(2).jpg"));
        productsQuranHadis.add(new Products("cepara",	"ছেপারা",	"0",	"২০",	20,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(3).jpg"));
        productsQuranHadis.add(new Products("nadiyatul Quran",	"নাদিয়াতুল কুরআন",	"0",	"১৫",	15,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(4).jpg"));
        productsQuranHadis.add(new Products("Tupe",	"টুপি",	"0",	"১৫০",	150,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(5).jpg"));
        productsQuranHadis.add(new Products("ator",	"আতর",	"0",	"১৫০",	150,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(6).jpg"));
        productsQuranHadis.add(new Products("tosbi",	"তাসবি",	"0",	"১০০",	100,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(7).jpg"));
        productsQuranHadis.add(new Products("Meswok",	"মেছওয়াক",	"0",	"৩৫",	35,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(8).jpg"));
        productsQuranHadis.add(new Products("jaynomaj",	"জায়নামাজ",	"0",	"৫০০",	500,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(9).jpg"));
        productsQuranHadis.add(new Products("rehal",	"রেহাল",	"0",	"২০০",	200,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(10).jpg"));
        productsQuranHadis.add(new Products("Surma",	"সুরমা",	"0",	"১৫০",	150,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/Islamic%20(11).jpg"));
        productsQuranHadis.add(new Products("mokcedul muminin",	"মোকছেদুল মুমিনিন",	"0",	"২২০",	220,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/hadis1.jpg"));
        productsQuranHadis.add(new Products("neyamul quran",	"নেয়ামুল কোরআন",	"0",	"১০০",	100,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/hadis2.jpg"));

        for (int i = 0; i< productsQuranHadis.size(); i++){
            Products products= productsQuranHadis.get(i);
            String productKeyname=products.getProductName();

            root.child("Quran Hadis").child(productKeyname).setValue(products);
        }
    }

    public void SaveGas(View view) {

        Log.e(TAG, "SaveGas: " );
        productsGas.add(new Products("Bosundara",	"বসুন্ধরা",	"0",	"৯০০",	900,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/gas-1.jpg"));
        productsGas.add(new Products("Beximko",	"বেক্সিমকো",	"0",	"৯০০",	900,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/gas-2.jpg"));
        productsGas.add(new Products("Jomuna",	"যমুনা",	"0",	"৮৮০",	880,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/gas-3.jpg"));
        productsGas.add(new Products("Omera",	"ওমেরা",	"0",	"৮৮০",	880,	0,	"১ পিছ"	,"https://allmartkalkini.000webhostapp.com/wp-content/uploads/2020/04/gas-4.jpg"));

        for (int i = 0; i< productsGas.size(); i++){
            Products products= productsGas.get(i);
            String productKeyname=products.getProductName();

            root.child("Gas").child(productKeyname).setValue(products);
        }
    }
}
