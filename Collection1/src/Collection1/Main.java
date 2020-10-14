package Collection1;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Laptop l1 = new Laptop("Hp","notebook","windows","core i5");
        Laptop l2 = new Laptop("Dell","inspiron","windows","core i3");
        Laptop l3 = new Laptop("Acer","Aspire","windows","Ryzen 5");
        GeneralSet <Laptop> laptops = new GeneralSet<Laptop>();
        laptops.addObjects(l1);
        laptops.addObjects(l2);
        laptops.addObjects(l3);
        Set <Laptop> lapi= laptops.getObjects();
        for(Laptop i : lapi) {
            System.out.println(i.getModel()+" " + i.getCompany());
        }
        School s1 = new School("CPS","indore","indore",10);
        School s2 = new School("DPS","rau","indore",1);
        School s3 = new School("APS","indore","indore",5);
        School s4 = new School("Emreald heights","indore","indore",2);
        School s5 = new School("Chohitram","indore","indore",3);
        School s6 = new School("NDPS","indore","indore",7);
        GeneralList<School> schools = new GeneralList<School>();
        schools.addObjects(s1);
        schools.addObjects(s2);
        schools.addObjects(s3);
        schools.addObjects(s4);
        schools.addObjects(s5);
        schools.addObjects(s6);

        List<School> sch = schools.getObject();
        System.out.println("Names of school by list");
        for(School i:sch) {
            System.out.print(i.getName()+ " ");
        }
        Car c1 =new Car("Honda" , "Amaze" , 2017,1000000);
        Car c2 =new Car("Hunndai" , "i20" , 2018,300000);
        Car c3 =new Car("Audi" , "Q7" , 2016,10000000);
        TreeSet<Car> carTreeSet =  new TreeSet<Car>();
        carTreeSet.add(c1);
        carTreeSet.add(c2);
        carTreeSet.add(c3);
        System.out.println("\n cars ");
        for(Car c: carTreeSet) {
            System.out.print(c.getModel()+" ");
        }
        Student st1 = new Student("Deepesh" , "Mango");
        Student st2 = new Student("Naman" , "Apple");
        Student st3 = new Student("Pooja" , "Banana");
        Map <String , String > stuMap = new HashMap<String , String>();
        stuMap.put(st1.getName(), st1.getFruit());
        stuMap.put(st2.getName(), st2.getFruit());
        stuMap.put(st3.getName(), st3.getFruit());
        System.out.println("\n printing data of map");
        for(Map.Entry m : stuMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}