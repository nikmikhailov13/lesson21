package annotation;

public class UserDto {

  private String name;
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "UserDto{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
