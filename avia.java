import java.io.PrintStream;
import java.util.Scanner;
class avia {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out =System.out;

    private static int countOfObjects=0;
    public String country; //    - Страна происхождения
    public String name; //    - Название
    public String model; //    - Модель
    public String length; //    - Длинна
    public String weight; //    - Вес
    public String material; //    - Осносвной материал фюзеляжа
    public String power;//    - Мощность двигателя

    public static int getCountOfObjects() {
        return countOfObjects;
    }

    public static void setCountOfObjects(int countOfObjects) {
        avia.countOfObjects = countOfObjects;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getAllInfo(){
        return country+"; "+name+"; "+model+"; "+length+"; "+weight+"; "+material+"; "+power;
    }

    public avia(String country, String name, String model, String length, String weight, String material, String power){
        this.country = country;
        this.name = name;
        this.model = model;
        this.length = length;
        this.weight = weight;
        this.material=material;
        this.power = power;
        countOfObjects++;

    }

//    static int getCountOfObjects() {
//        return countOfObjects;
//    }


    public static void main(String[] args){
        sport sport1 = new sport("Italia","Macchi","M39","8m","1257kg","metal","597 kVt",1);
        sport sport2=new sport("Germany","Extra","EA-300","7m","682kg","metal","224kVt",1);
        sport sport3 = new sport("USA","Gee Bee","R-1 Super Sport","5,4m","1400kg","metal","1491kVt",1);
        passenger passenger1 = new passenger("France","Airbus","A380","73m","280 000 kg","metal","8000kVt",4,525);
        passenger passenger2=new passenger("USA","Boeing","787 Dreamliner","60m","120 000 kg","metal","320кН",2,300);
        passenger passenger3 = new passenger("USA","Piper","PA-34 Seneca","9m","1457kg","metal","162кВт",2,6);
        battle battle1 = new battle("USA","McDonnell","XF-85 Goblin","4,5m","1807kg","metal","13,3 kN","bomber","M2 Machine Gun");
        battle battle2=new battle ("USA","Northrop","B-2 Spirit","21m","71 700kg","metal","76кН","bomber","nuclear bombs");
        battle battle3 = new battle ("USA","Fairchild Republic","A-10 Thunderbolt II","16m","9176kg","metal","40kN","attack aircraft","Air-to-air missile");
        out.println(sport1.getAllInfo());
        out.println(sport2.getAllInfo());
        out.println(sport3.getAllInfo());
        out.println(passenger1.getAllInfo());
        out.println(passenger2.getAllInfo());
        out.println(passenger3.getAllInfo());
        out.println(battle1.getAllInfo());
        out.println(battle2.getAllInfo());
        out.println(battle3.getAllInfo());

        out.println("Number of created planes: "+countOfObjects);

    }
}
class sport extends avia{
    public int pilots; // количество пилотов

    public sport(String country, String name, String model, String length, String weight, String material, String power,int pilots) {
        super(country, name, model, length, weight, material, power);
        this.pilots=pilots;
    }

    public int getPilots() {
        return pilots;
    }

    public void setPilots(int pilots) {
        this.pilots = pilots;
    }

    @Override
    public String getAllInfo(){
        return country+"; "+name+"; "+model+"; "+length+"; "+weight+"; "+material+"; "+power+"; "+pilots;
    }
}

class passenger extends avia{
    public int engines, people;

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public passenger(String country, String name, String model, String length, String weight, String material, String power, int engines, int people) {
        super(country, name, model, length, weight, material, power);
        this.people=people;
        this.engines=engines;
    }

    @Override
    public String getAllInfo(){
        return country+"; "+name+"; "+model+"; "+length+"; "+weight+"; "+material+"; "+power+"; "+engines+"; "+people;
    }

}
class battle extends avia{
    public String type,weapon;

    public battle(String country, String name, String model, String length, String weight, String material, String power, String type, String weapon) {
        super(country, name, model, length, weight, material, power);
        this.type=type;
        this.weapon=weapon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getAllInfo(){
        return country+"; "+name+"; "+model+"; "+length+"; "+weight+"; "+material+"; "+power+"; "+type+"; "+weapon;
    }
}

