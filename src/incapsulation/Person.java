package incapsulation;
/*
* Created by serj  on  23.11.2023*/
public class Person {
    private String preFix = "Mr";
    private String name = "Max";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

