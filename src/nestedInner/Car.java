package nestedInner;

import java.util.Scanner;

public class Car {
    String carBrand;
    public int speed;
    int weight;

    public Car(int weight, String carBrand) {
        this.weight = weight;
        this.carBrand = carBrand;
    }

    public void turnedOn() {
        System.out.println("Машина " + carBrand + " завелась");
        Scanner sc = new Scanner(System.in);
        Engine engine = new Engine();
        engine.isRunning();
        System.out.println("Введи тип резины");
        Wheels wheels = new Wheels("Michelin", sc.next());
        wheels.isRunning();
    }

    private class Engine {
        public void isRunning() {
            System.out.println("Двигатель работает");
            class Piston {
                public void energyTransformation() {
                    System.out.println("Поршни работают преобразовывая топливо в энергию для колёс");
                }
            }
            Piston piston = new Piston();
            piston.energyTransformation();
        }
    }

    private class Wheels {
        String wheelBrand, type;

        public Wheels(String wheelBrand, String type) {
            this.wheelBrand = wheelBrand;
            this.type = type;
        }

        public void isRunning() {
            System.out.println("Колёса марки " + wheelBrand + " вращаются");
            if (type.equalsIgnoreCase("зимняя")) {
                class Spikes {
                    public void theSpikesWorks() {
                        int reducedSpeed = speed - speed / 5;
                        System.out.println("Сцепление с дорогой лучше за счёт зимней резины, но скорость уменьшена до" +
                                " " + reducedSpeed + " km" +
                                "\nИ вес машины увеличен до " + (weight + 30) + " kg"
                        );
                    }
                }
                Spikes spikes = new Spikes();
                spikes.theSpikesWorks();
            } else {
                System.out.println("Колёса вращаются со скоростью " + speed + " km");
            }
        }
    }
}
