package proyecto2.proyecto2;

public class Person {
 private String name;
 private int age;
 private int height;
 private int weight;
 private String eyeColor;
 private String gender;
 private String favoriteSport;

 public Person() {
 }
 public Person(String name, int age, int height, int weight, String eyeColor, String gender, String favoriteSport){
   this.name = name;
   this.age = age;
   this.height = height;
   this.weight = weight;
   this.eyeColor = eyeColor;
   this.gender = gender;
   this.favoriteSport = favoriteSport;
  }
  public int getWeight() {
     return weight;
  }
  public int getAge() {
     return age;
  }
  public int getHeight() {
     return height;
  }
  public String getGender() {
     return gender;
  }
  public String getName() {
     return name;
  }
  public String getEyeColor() {
     return eyeColor;
  }
  public String getFavoriteSport() {
     return favoriteSport;
  }
}

