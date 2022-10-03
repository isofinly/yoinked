public class Lab0 {
public static void main(String[] args) {
int vremya = Integer.parseInt(args[1]);
if (vremya>=17){
Evening h = new Evening();
h.setName(args[0]);
h.say();
} else {
Morning h = new Morning();
h.setName(args[0]);
h.say();
}
}
}