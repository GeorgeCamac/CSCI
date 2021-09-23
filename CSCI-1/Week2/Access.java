package Week2;

public class Access {
    // default, public, private, protected
    //default is used to give access to everything in the package
    //public is similar to default but gives access to everywhere
    //private is only in this class
    //protected on this package and extend (subclass)

    private String cat1 = "Momo";
    private String cat2 = "Appa";

    public String getCat1(){
        return cat1;
    }
    public String getCat2(){
        return cat2;
    }
    public void setCat1(String catName){
        cat1 = catName;
    }
}
