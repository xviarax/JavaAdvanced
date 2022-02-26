package OpinionPoll;

public class Opinion {
   private String name;
   private int age;  // private за да е достъпно за класа Опиниън

      public Opinion(String name, int age) {
         this.name = name; // на новия обект, който създавам искам да му задам да е стринг нейм от скобите
         this.age = age;
      }

      public String getName() {
         return name;
      }
      public int getAge() {
         return age;
      }


}
