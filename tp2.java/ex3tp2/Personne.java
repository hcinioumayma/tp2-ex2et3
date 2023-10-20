public class Personne {
    String name;
   String firstName;
    int dayNaisent;
    int monthNaissent;
    int yearNaaissent;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDaeNaiss(int j,int m, int a){
        dayNaisent=j;
        monthNaissent=m;
        yearNaaissent=a;
    }
    public int ageEn2023(){
        return 2023-yearNaaissent;
    }
}