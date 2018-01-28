class Queue {
   private  char q[]; //tablica przechowująca kolejkę
    private int putloc, getloc; //indeksy operacji put i get


    //konstruktor klasy tworzący kolejkę o podanym rozmiarze
    Queue(int size) {
        q = new char[size]; //przydziela pamięć kolejce
        putloc = getloc = 0;
    }

    // wstawia znaki do kolejki
    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" -- kolejka pelna --");
            return;
        }
        q[putloc++] = ch;
    }

    //pobiera znak kolejki
    char get() {
        if(getloc == putloc) {
            System.out.println(" -- Kolejka pusta --");
            return (char) 0;
        }
        return q[getloc++];
    }
}