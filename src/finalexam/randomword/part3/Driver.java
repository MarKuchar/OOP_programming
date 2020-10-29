package finalexam.randomword.part3;

public class Driver {
    public static void main(String[] args) {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomWordChooser sChooser = new RandomWordChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChooser.getNext() + " ");
        }
        RandomCharChooser lChooser = new RandomCharChooser("cat");
        for (int k = 0; k < 4; k++) {
            System.out.print(lChooser.getNext());

        }
    }
}
