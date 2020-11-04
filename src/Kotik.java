
public class Kotik {


    int fedUp = 10;
    String food;

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
        System.out.println("Я съел 1 мышь");
    }

    public void eat(int fedUp, String food){
        this.fedUp += fedUp;
        this.food = food;
        System.out.println("Я съел " + fedUp + " " + food);
    }

    public void eatMore(){
        eat(1, "котлету");
    }

    public void liveAnotherDay() {
        int h = 6;
        for (int i = 0; i <= 24; i++) {
            int action = (int) (Math.random() * h) + 1;
            fedUp -= 2;
            if (fedUp <= 0) {
                System.out.println("Сытость = " + fedUp);
                System.out.println("Я хочу есть");
                eat(5, "мышей");
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
                    break;
                case (6):
                    yawn();
                    break;
            }
            System.out.println("Сытость = " + fedUp);
        }
    }
}
