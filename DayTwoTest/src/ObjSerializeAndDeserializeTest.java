import java.io.*;

public class ObjSerializeAndDeserializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializePerson();
        Student person = DeserializePerson();
        System.out.println(person.getName()+" "+person.getId());

    }

    public static void  SerializePerson() throws IOException {
        Student person = new Student();
        person.setName("Hellokitty2");
        person.setId(2000);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("D:/Person.txt")));
        objectOutputStream.writeObject(person);
        System.out.println("序列化成功");
        objectOutputStream.close();

    }

    public static Student DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("D:/Person.txt")));
        Student person = (Student) objectInputStream.readObject();
        System.out.println("反序列化成功");
        objectInputStream.close();
        return person;
    }




}

