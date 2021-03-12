package Day4;

public class Q22class {
	public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.age);
        // can't access private outside
        System.out.println(e.isWorking);
        System.out.println(e.gender);
    }
}

class Employee {
    private String name;
    public int age;
    protected boolean isWorking;
    char gender;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected boolean isWorking() {
        return isWorking;
    }

    protected void setWorking(boolean working) {
        isWorking = working;
    }

    char getGender() {
        return gender;
    }

    void setGender(char gender) {
        this.gender = gender;
    }
}
