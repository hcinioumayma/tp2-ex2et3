public class TestPersonne {
    public static void main(String[] args) {
        Personne personne=new Personne();
        personne.setFirstName("oumayma");
        personne.setName("hcini");
        personne.setDaeNaiss(27,04,2001);
        System.out.println(personne.firstName+" "+personne.name+" votre age est:"+personne.ageEn2023());
    }
}
