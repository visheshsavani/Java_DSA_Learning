import java.util.Scanner;
class postofsocialmedia{
private int postid;
 int likescount=50;
int commentscount=100;
private String like;
private String comment;
public int  getLikescount(){
return likescount;
}
public int getCommentscount(){ return commentscount;}
public void likeincrement(){
likescount++;
}
public void commentincrement(){
commentscount++;
}
}
class user extends postofsocialmedia {
    private String username;
    private int password;

    public String getUsername() { return username;}

    public void setUsername(String n) {this.username = n;}

    public int getPassword() {return password;}

    public void setPassword(int x) {this.password = x;}

    postofsocialmedia a = new postofsocialmedia();

    public void toLike(String n) {
        if (n == "yes" || n == "Yes"){ a.likeincrement();}
    }

    public void toComment(String x) {
        if (x == "yes" || x == "Yes") {a.commentincrement();}
        //System.out.println(a.commentafterincrement());
    }
}

    class socialmedia {
        public static void main(String[] args) {
            user obj1 = new user();
            Scanner data = new Scanner(System.in);
            System.out.println("The username and password of user is");
            obj1.setUsername("Vishu");
            obj1.setPassword(526568);
            System.out.println(obj1.getUsername());
            System.out.println(obj1.getPassword());
            postofsocialmedia obj2 = new postofsocialmedia();
            System.out.println("No of likes and Comments on socialmedia post is");
            System.out.println(obj2.getLikescount());
            System.out.println(obj2.getCommentscount());
            System.out.println("Do you want to add comment and line?");
            System.out.println("yes or no");
            obj1.toLike(data.nextLine());
            obj1.toComment(data.nextLine());
System.out.println(obj1.getLikescount());
System.out.println(obj1.getCommentscount());
        }
    }

