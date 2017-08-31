import java.util.Scanner;

/**
 * Created by almazi on 8/31/17, 7:48 PM.
 */
public class _1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String layer1 = scan.nextLine();
        String layer2 = scan.nextLine();
        String layer3 = scan.nextLine();
        String animal = "";
        if (layer1.equals("vertebrado")){
            if (layer2.equals("ave")){
                if (layer3.equals("carnivoro")){
                    animal = "aguia";
                }
                if (layer3.equals("onivoro")){
                    animal = "pomba";
                }
            }
            if (layer2.equals("mamifero")){
                if (layer3.equals("onivoro")){
                    animal = "homem";
                }
                if (layer3.equals("herbivoro")){
                    animal = "vaca";
                }

            }
        }
        if (layer1.equals("invertebrado")){
            if (layer2.equals("inseto")){
                if (layer3.equals("hematofago")){
                    animal = "pulga";
                }
                if (layer3.equals("herbivoro")){
                    animal = "lagarta";
                }

            }
            if (layer2.equals("anelideo")){
                if (layer3.equals("hematofago")){
                    animal = "sanguessuga";
                }
                if (layer3.equals("onivoro")){
                    animal = "minhoca";
                }

            }
        }
        System.out.printf(animal+"\n");
    }
}
