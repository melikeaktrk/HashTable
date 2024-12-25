public class HashTable {
    private String[] table; // Basit bir String tablosu (değerler tutulacak)
    private int capacity;   // Tablo boyutu

    // Hash fonksiyonu (anahtarı tablo boyutuna göre küçültür)
    private int hashFunction(int key) {
        return key % capacity;
    }

    // Tabloyu başlatma
    public void initializeTable(int capacity) {
        this.capacity = capacity;
        table = new String[capacity]; // Boyuta göre tablo oluştur
        System.out.println("Hash tablosu " + capacity + " boyutunda oluşturuldu.");
    }

    // Eleman ekleme (put)
    public void put(int key, String value) {
        int index = hashFunction(key);
        table[index] = value;
        System.out.println("Anahtar: " + key + ", Değer: " + value + " tabloya eklendi.");
    }

    // Eleman sorgulama (get)
    public String get(int key) {
        int index = hashFunction(key);
        return table[index];
    }

    // Eleman silme (remove)
    public void remove(int key) {
        int index = hashFunction(key);
        if (table[index] != null) {
            System.out.println("Anahtar: " + key + ", Değer: " + table[index] + " tablodan silindi.");
            table[index] = null;
        } else {
            System.out.println("Anahtar bulunamadı: " + key);
        }
    }

    // Tabloyu yazdırma
    public void printHashTable() {
        System.out.println("Hash Tablosu:");
        for (int i = 0; i < capacity; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }
}
