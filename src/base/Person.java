package base;

import java.util.ArrayList;


public class Person {
    int person_id;
    static ArrayList<Person> persons = new ArrayList<Person>();
    String name;
    String national_Id;


        public Person(String name, String national_Id) {
            this.name = name;
            this.national_Id = national_Id;
            persons.add(this);
            person_id =  persons.size();
        }

        public static Person findById(int person_id){
            for(Person person : persons){
                if(person.person_id == person_id){
                    return person;
                }
            }
            return null;
        }

    @Override
    public String toString() {
        return name;
    }


}
