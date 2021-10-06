package test;

import org.hbrs.se1.ws21.uebung1.view.Client;

class GermanTranlatorTest {
    private Client client;

    public GermanTranlatorTest() {
        client = new Client();
    }

    public void test(){
        // Übersetzung der Zahlen 1 bis 1 einschließlich 10
        client.display( 1 );
        client.display( 2 );
        client.display( 3 );
        client.display( 4 );
        client.display( 5 );
        client.display( 6 );
        client.display( 7 );
        client.display( 8 );
        client.display( 9 );
        client.display( 10 );

        // Übersetzung der Zahlen, die nicht übersetzbar sind
        client.display( 100 );
        client.display( -10 );
    }
    //BlackBoxTest
    public static void main(String[] args) {
        GermanTranlatorTest assembler = new GermanTranlatorTest();
        assembler.test();
    }
}