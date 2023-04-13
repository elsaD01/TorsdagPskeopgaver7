package task3ArvInterfaces;

public class umm {
//Hvad har dyr og frugt tilfælles? Vi spiser (nogle af) demJ
//Udgangspunktet for denne opgave er følgende interfaces og abstrakte klasser:

    // A.
    public interface Edible {
        /**
         * describe how to eat
         */
        public abstract String howToEat();

        // B.
        abstract class Animal {
            private double weight;

            public double getWeight() {
                return weight;
            }

            public void setWeight(double weight) {
                this.weight = weight;
            }

            /**
             * Return animal sound
             */
            public abstract String sound();
        }

        // C.
        abstract class Fruit implements Edible {
            // Data fields, constructors, and methods omitted here
        }

        // Du skal nu implementere flg. klasser (find selv på indhold i de metoder, som du selv skal implementere):
        class Chicken extends Animal implements Edible

        class Tiger extends Animal

        class Apple extends Fruit

        class Orange extends Fruit

        //  Skriv en testklasse med følgende main metode:
        public class TestEdible {
            public static void main(String[] args) {
                Object[] objects = {new Tiger(), new Chicken(), new Apple()};
                for (int i = 0; i < objects.length; i++) {
                    if (objects[i] instanceof Edible) System.out.println(((Edible) objects[i]).howToEat());
                    if (objects[i] instanceof Animal) {
                        System.out.println(((Animal) objects[i]).sound());
                    }
                }
            }
        }


    }
}
