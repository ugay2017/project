package rali;

public class ArrayExample {

    public static void main(String[] args) {
   User[] users = new User[5];
   users[0]=new User("petr");
   users[1]=new User("jack");
   users[2]=new User("jaccdsk");

   User user=ArrayExample.findname(users,"petr");

        System.out.println(user.name);
    }

    public static User findname(User[] users,String name){
       User result = null;
        for(User user:users) {
            if(name.equals(user.name)){
                result=user;
                break;
            }
        }
        return result;
    }
}
