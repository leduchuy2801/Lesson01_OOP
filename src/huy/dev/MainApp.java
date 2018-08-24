package huy.dev;


import huy.dev.model.Person;
public class MainApp{
	public static void main(String[] agrs) {
			final String arrName[]= {"bao","tu","cu","to","teo"};
			final int    arrOld[]= {15,16,50,45,60};
			Person arrPerson[] =new Person[arrName.length];
			for(int i=0;i<arrPerson.length;i++) {
				Person p= new Person(arrName[i],arrOld[i]);
				arrPerson[i]=p;
			}
			for(int i=0;i<arrPerson.length;i++) {
				arrPerson[i].show();
			}
		}
}