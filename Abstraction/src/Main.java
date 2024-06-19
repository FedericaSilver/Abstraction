public class Main {
    public static void main(String[] args) {
       Forma triangolo = new Triangolo(5.3f, 8.76f);
       Forma rettangolo = new Rettangolo(13.8f, 4.2f);

       float areaRet = rettangolo.calcolaArea();
       float areaTri = triangolo.calcolaArea();

       System.out.println("L'area del rettangolo è " + areaRet);
       System.out.println("L'area del triangolo è " + areaTri);
    }
}