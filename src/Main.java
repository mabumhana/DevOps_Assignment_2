public class Main {
    public static void main(String []args){
        DevOps obj =new DevOps("Mohammad Abu Mhana");
        obj.print();
        obj.setName("mabumhana");
        String name = obj.getName();
        System.out.println("user1_branch: \n Name : "+name);
        int xuser2_branch = 5;
        System.out.println("x from user2_branch"+xuser2_branch);
    }
}
