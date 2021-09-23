package Week2;
public class CatNames {
    static String catName = "Momo";
    

    public static void main(String[] args) {
        String catName = "Appa";
        System.out.println(catName);
        CatNames cat = new CatNames();
        System.out.println(cat.catName);
        System.out.println(CatNames.catName);

        Access gregHouse = new Access();
       // System.out.println(gregHouse.cat1);
        System.out.println(gregHouse.getCat1());
        System.out.println(gregHouse.getCat2());

    }


}
