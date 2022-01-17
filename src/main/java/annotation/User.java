package annotation;

@ControlledObject(name = "Human", code = 1)
public class User {

  @NotNull
  private String name;
  private String password;
  private int years;

  public int getYears() {
    return years;
  }

  public void setYears(int years) {
    this.years = years;
  }

  @Start
  public static User createUser() {
    return new User();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Stop
  public void deleteUser() {
    System.out.println("user deleted");
  }
}
