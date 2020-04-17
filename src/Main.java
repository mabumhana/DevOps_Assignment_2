public class Main {
    public static void main(String []args){
        DevOps obj =new DevOps("Mohammad Abu Mhana");
        obj.print();
        obj.setName("mabumhana");
        String name = obj.getName();
        System.out.println("user1_branch: \n Name : "+name);
    }
}
