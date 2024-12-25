import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(); // HashTable nesnesi oluşturma
        Scanner scanner = new Scanner(System.in);

        // Tabloyu başlatma
        System.out.print("Hash tablosu boyutunu girin: ");
        int capacity = scanner.nextInt();
        hashTable.initializeTable(capacity);

        int choice;
        do {
            System.out.println("\n--- Hash Tablosu İşlemleri ---");
            System.out.println("1. Anahtar-Değer Çifti Ekle (Put)");
            System.out.println("2. Anahtar ile Değer Sorgula (Get)");
            System.out.println("3. Anahtar ile Çift Sil (Remove)");
            System.out.println("4. Tüm Anahtar-Değer Çiftlerini Listele");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Put
                    System.out.print("Anahtar (Integer): ");
                    int key = scanner.nextInt();
                    scanner.nextLine(); // Yeni satır temizleme
                    System.out.print("Değer (String): ");
                    String value = scanner.nextLine();
                    hashTable.put(key, value);
                    break;

                case 2: // Get
                    System.out.print("Sorgulamak istediğiniz anahtar (Integer): ");
                    int searchKey = scanner.nextInt();
                    String searchValue = hashTable.get(searchKey);
                    if (searchValue != null) {
                        System.out.println("Anahtar: " + searchKey + ", Değer: " + searchValue);
                    } else {
                        System.out.println("Anahtar bulunamadı.");
                    }
                    break;

                case 3: // Remove
                    System.out.print("Silmek istediğiniz anahtar (Integer): ");
                    int removeKey = scanner.nextInt();
                    hashTable.remove(removeKey);
                    break;

                case 4: // Print HashTable
                    hashTable.printHashTable();
                    break;

                case 0: // Çıkış
                    System.out.println("Programdan çıkılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
