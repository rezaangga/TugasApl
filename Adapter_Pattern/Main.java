class Main {
    public static void main (String[] args) {
        Kucing kucing = new Meow();

        Bebek meowAdapter = new MeowAdapter(kucing);
        System.out.println("Weuk wkwkwkwk");
        meowAdapter.kwek();
    }
}