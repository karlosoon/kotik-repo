import javax.sound.midi.Soundbank;

public class Kotik {


    int fedUp = 10;
    String food = "мышей";

    public void play(){
        System.out.println("Я поиграл");
    }

    public void sleep(){
        System.out.println("Я поспал");
    }

    public void chaseMouse(){
        System.out.println("Я поймал мышь");
    }

    public void meow(){
        System.out.println("Я мяукнул");
    }

    public void scratch(){
        System.out.println("Я царапнул");
    }

    public void yawn(){
        System.out.println("Я зевнул");
    }

    public void eat(){
        fedUp += 1;
    }

    public void eat(int fedUp, String food){
        this.fedUp += fedUp;
        this.food = food;
    }

    public void eatMore(){
        eat(10, "котлет");
    }

    public void liveAnotherDay() {
        int h = 6;
        for (int i = 0; i < 24; i++) {
            int action = (int) (Math.random() * h) + 1;
            fedUp--;
            if (fedUp <= 0) {
                eat(7, "мышей");
                System.out.println("Я съел " + fedUp + " " + food);
                return;
            }
            switch (action) {
                case (1):
                    play();
                    break;
                case (2):
                    sleep();
                    break;
                case (3):
                    chaseMouse();
                    eat();
                    break;
                case (4):
                    meow();
                    break;
                case (5):
                    scratch();
                    eatMore();
                    System.out.println(fedUp);
                    break;
                case (6):
                    yawn();
                    break;
            }
        }
    }
}
