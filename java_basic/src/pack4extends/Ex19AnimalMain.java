package pack4extends;

public class Ex19AnimalMain {

	public static void main(String[] args) {
		Ex19Cow cow = new Ex19Cow();
		System.out.println(cow.name()+" "+cow.action()+"에 "+cow.eat()+"먹음");
		cow.print();
		
		Ex19Lion lion = new Ex19Lion();
		System.out.println(lion.name()+" "+lion.action()+"에 "+lion.eat()+"먹음");
		lion.eatOther();
		lion.print();
		
		Ex19Animal animal;
		animal = cow;
		System.out.println(animal.name()+" "+animal.action()+"에 "+animal.eat()+"먹음");
		animal = lion;
		System.out.println(animal.name()+" "+animal.action()+"에 "+animal.eat()+"먹음");
		
		if(cow instanceof Ex19Cow)
			System.out.println("맞아");
		else
			System.out.println("아니야");
		
		System.out.println(cow instanceof Ex19Animal);
		System.out.println(lion instanceof Ex19Animal);
		
		//메소드 호출하며 매개변수에 주소 치환
		Ex19AnimalFind animalfind = new Ex19AnimalFind();
		animalfind.find(cow); 	// animal = cow;
		animalfind.find(lion);	// animal = lion;
		
	}

}
