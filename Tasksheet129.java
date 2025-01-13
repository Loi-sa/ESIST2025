interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Feeding the gorilla...");
            // put gorilla food into cage
            return true;
        } else {
            System.out.println("It's not feeding time yet.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming the gorilla...");
        // lather, rinse, repeat
    }

    @Override
    public void pet() {
        System.out.println("Petting the gorilla...");
        // pet at your own risk
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        // Test feeding
        boolean isFeedingTime = true;
        if (gorilla.feed(isFeedingTime)) {
            System.out.println("Gorilla fed successfully.");
        }

        // Groom the gorilla
        gorilla.groom();

        // Attempt to pet the gorilla (with caution!)
        gorilla.pet();
    }
}