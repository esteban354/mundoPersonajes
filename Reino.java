import java.util.Scanner;

class Personaje {
    private String nombre;
    private String secreto;
    private int vida;
    private int ataque;

    public Personaje(String nombre, String secreto, int vida, int ataque) {
        this.nombre = nombre;
        this.secreto = secreto;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String mostarNombre() {
        return nombre;
    }

    public int mostarVida() {
        return vida;
    }

    public int mostarAtaque() {
        return ataque;
    }

    public String revelarSecreto() {
        return secreto;
    }

     public void accion() {
        System.out.println(nombre + " hace un ataque");
    }
}

class Spiderman extends Personaje {
    public Spiderman(String nombre, String secreto, int vida, int ataque) {
        super(nombre, secreto, vida, ataque);
    }

    public void accion() {
        System.out.println("Ataque especial: lanza telarañas");
    }
}

class Ironman extends Personaje {
    public Ironman(String nombre, String secreto, int vida, int ataque) {
        super(nombre, secreto, vida, ataque);
    }
    
    public void accion() {
        System.out.println("Ataque especial: rayo laser");
    }
}

class Thor extends Personaje {
    public Thor(String nombre, String secreto, int vida, int ataque) {
        super(nombre, secreto, vida, ataque);
    }

    public void accion() {
        System.out.println("Ataque especial: rayo ");
    }
}

class CapitanAmerica extends Personaje {
    public CapitanAmerica(String nombre, String secreto, int vida, int ataque) {
        super(nombre, secreto, vida, ataque);
    }

    public void accion() {
        System.out.println("Ataque especial: rayo ");
    }
}

public class Reino {
    public static void main(String[] args) {
        Personaje spiderman = new Spiderman("Spiderman", "Tiene sentido arácnido", 100, 25);
        Personaje ironman = new Ironman("Ironman", "Su traje tiene inteligencia artificial", 120, 30);
        Personaje thor = new Thor("Thor", "Es el dios del trueno", 150, 35);
        Personaje capitanAmerica = new CapitanAmerica("Capitan America", "Le inyectaron un suero", 100, 20);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número del personaje que desea ver:\n 1. Ironman\n 2. Spiderman\n 3. Thor");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println(ironman.mostarNombre() + " Vida: " + ironman.mostarVida());
                System.out.println(ironman.mostarNombre() + " Ataque: " + ironman.mostarAtaque());
                System.out.println("Secreto: " + ironman.revelarSecreto()); 
                ironman.accion();
            break;

            case 2:
                System.out.println(spiderman.mostarNombre() + " Vida: " + spiderman.mostarVida());
                System.out.println(spiderman.mostarNombre() + " Ataque: " + spiderman.mostarAtaque());
                System.out.println("Secreto: " + spiderman.revelarSecreto());
                spiderman.accion();
            break;

            case 3:
                System.out.println(thor.mostarNombre() + " Vida: " + thor.mostarVida());
                System.out.println(thor.mostarNombre() + " Ataque: " + thor.mostarAtaque());
                System.out.println("Secreto: " + thor.revelarSecreto());
                thor.accion();
            break;

            case 4:
                System.out.println(capitanAmerica.mostarNombre() + " Vida: " + capitanAmerica.mostarVida());
                System.out.println(capitanAmerica.mostarNombre() + " Ataque: " + capitanAmerica.mostarAtaque());
                System.out.println("Secreto: " + thor.revelarSecreto());
                thor.accion();
            break;

            default:
                System.out.println("Error");
            break;
        }
        scanner.close();
    }
}
