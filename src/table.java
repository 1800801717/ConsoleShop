import java.io.InputStream;
import java.util.Scanner;

public class table {
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
}
