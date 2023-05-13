package WEEK7HW;
/*Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods(instance methods):
*Method named getFirstName without any parameters, it needsto return the value of the firstName
field.
*Method named getLastName without any parameters, it needs to return the value of the lastName
field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the
firstName field.
*Method named setLastName with one parameter oftype String, it needs to set the value of the
lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is
greaterthan 12 and lessthan 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name ofthe person.
*In case both firstName and lastName fields are empty, Strings return an empty String.
*In case firstName is an empty String, return firstName.
*In case lastName is an empty String, return lastName.*/

public class Q_17 {




        public String firstName;
        public String lastname;
        public int age;

        public static void main(String[] args) {

        }


        public String getfirstName(){
            return firstName;
        }

        public String getLastname(){
            return lastname;
        }
        public int getAge(){
            return age;
        }
    public void setFirstName(String firstName){
        this.firstName = firstName;}}