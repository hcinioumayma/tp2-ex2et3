public class TestPoint {
    public static void main(String[] args) {
        Point p=new Point();
             System.out.println("les coordonnées du  point "+p.numero+" sont:");
        p.affichePoint();
        Point q=new Point(4,7);
              System.out.println("les nouvelles coordonnées du point  "+q.numero+" sont:");
        q.affichePoint();
        p.setcoordonnerPoint(6,9);
              System.out.println("les nouvelles coordonnées du  point "+p.numero+" sont:");
        p.affichePoint();
        p.translate(2,2);
              System.out.println("les nouvelles coordonnées du point "+p.numero+" sont:");
        p.affichePoint();
          if(p.origine()){
             System.out.println("le point "+p.numero+"est dans  le centre");
        }
          else {
            System.out.println("le point "+p.numero+" n'est pas dans  le centre");
        }
          if (p.egale(p,q)){
            System.out.println("les coordonnées de point p et q sont le méme");
        }
          else {
            System.out.println("les coordonnées de point p et q n'sont pas le méme");
        }
        System.out.println("le nombre de point est "+Point.nombre);
    }
}

