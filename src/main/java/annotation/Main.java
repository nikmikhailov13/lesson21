package annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

  private String appName;

  public static void main(String[] args) {
    User user1 = User.createUser();
    user1.setName("Max");
    user1.setPassword("123");
    user1.setYears(51);
    print(user1);
    UserDto userDto = UserMapper.INSTANCE.userToDto(user1);
    System.out.println(userDto.toString());
  }

  public static void print(User user) {
    Class<User> userClass = User.class;
    Method[] declaredMethods = userClass.getDeclaredMethods();

    for (Method method : declaredMethods) {
      Arrays.stream(method.getDeclaredAnnotations()).forEach(System.out::println);
    }
  }
}
