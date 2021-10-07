import org.hbrs.se1.ws21.uebung1.view.Client;


    class GermanTranslatorTest {
        private Client client = new Client();

        public GermanTranslatorTest() {
        }

        // Test gültiger Zahlen von 1 bis einschließlich 10
        public void test() {
            this.client.display(1);
            this.client.display(2);
            this.client.display(3);
            this.client.display(4);
            this.client.display(5);
            this.client.display(6);
            this.client.display(7);
            this.client.display(8);
            this.client.display(9);
            this.client.display(10);

        // Test ungültiger Zahlen
            this.client.display(100);
            this.client.display(-10);
        }
        // Main Methode
        public static void main(String[] args) {
            GermanTranslatorTest assembler = new GermanTranslatorTest();
            assembler.test();
        }
    }
