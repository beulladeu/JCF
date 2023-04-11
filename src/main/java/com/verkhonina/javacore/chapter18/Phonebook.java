package main.java.com.verkhonina.javacore.chapter18;


import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.bat");
        } catch (FileNotFoundException e) { }

        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }

        String name;
        String number;
        do {
            System.out.println("Введите имя или 'выход' для завершения: ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while(!name.equals("выход"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.bat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }

        do {
            System.out.println("Введите имя для поиска 'выход' для завершения: ");
            name = br.readLine();
            if (name.equals("выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while(!name.equals("выход"));
    }
}
