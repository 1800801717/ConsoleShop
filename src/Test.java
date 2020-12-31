import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        boolean bo=true;
        while (bo) {
            System.out.println("请输入用户名：");
            Scanner sc = new Scanner(System.in);
            String username = sc.next();//阻塞方法
            System.out.println("请输入密码：");
            String password = sc.next();

            //File file = new File("C:\\Users\\Administrator\\IdeaProjects\\ConsoleShop\\src\\users.xlsx");
            InputStream in = Class.forName("Test").getResourceAsStream("/users.xlsx");
            ReadUserExcel readExcel = new ReadUserExcel();//创建对象
            User users[] = readExcel.readExcel(in);
            for (int i = 0; i < users.length; i++) {
                if (username.equals(users[i].getUsername()) && password.equals(users[i].getPassword())) {
                    System.out.println("登录成功");
                    bo=false;
                    ReadProductExcel readProductExcel=new ReadProductExcel();
                    Product products[]=readProductExcel.readExcel(inProduct);
                    for(Product product:products)
                    {
                        System.out.print(product.getpId());
                        System.out.print("\t"+product.getpName());
                        System.out.print("\t"+product.getPrice());
                        System.out.println("\t"+product.getpDesc());
                    }
                    System.out.println("请输入商品ID把该商品加入购物车");
                    String pId=sc.next();


                    int count=0;
                    Product products[]=new Product[3];//创建购物车用数组模拟
                    System.out.println("请输入商品ID，把商品加入购物车:");
                    String pId=sc.next();
                    ReadProductExcel readProductExcel1=new ReadProductExcel();
                    inPro=null;
                    inPro=Class.forName("Test").getResourceAsSteam(name:"/product.xlsx");//表示的就是classpath
                    Product product=readProductExcel1.getProductById(pId,inPro);
                    if(product!=null)
                    {
                        productes[count++]=product;
                    }
                    break;
                } else {
                    System.out.println("登录失败");
                }
            }
        }
    }
}
