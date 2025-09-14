package car.example.bean;

public class MyBean {
    private String messege;
    private int age;

    public void setMessage(String message) {
        this.messege = message;
    }
    public void showMessege(){
        System.out.println("message"+messege);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "messege='" + messege + '\'' +
                ", age=" + age +
                '}';
    }
}
