public class Main {
    public static void main(String[] args) {
        System.out.println("Task#1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task#2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task#3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Task#4");
        var friend = 19;
        System.out.println(friend);
        friend +=2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);

        System.out.println("Task#5");
        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);

        System.out.println("Task#6");
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = (boxerWeight1 + boxerWeight2);
        System.out.println("Сумма = " + totalWeight + " кг");
        var differenceWeight = (boxerWeight2 - boxerWeight1);;
        System.out.println("Разница = " + differenceWeight + " кг");

        System.out.println("Task#7");
        var differenceWeight1 = boxerWeight2 %boxerWeight1;
        System.out.println("Остаток от деления = " + differenceWeight1 + " кг");

        System.out.println("Task#8");
        var worksHours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = worksHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человека");
        totalEmployees +=94;
        var newWorksHours = totalEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человека, то всего " + newWorksHours + " часов работы может быть поделено между сотрудниками");
    }
}