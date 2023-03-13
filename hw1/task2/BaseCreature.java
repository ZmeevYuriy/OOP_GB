package hw1.task2;

public abstract class BaseCreature implements CreatureAction {

    String name;
    int age;
    Sex sex;
    int safety;
    int mood;
    Stage stage;

    String getName(){
        return name;
    }

    void metabolizm() {
    }

}
