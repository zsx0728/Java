class DataWrap
{
    public int a;
    public int b;
}

public class ReferenceTransferTest
{
    public static void swap(DataWrap dw)
    {
        //下面三行代码实现dw的a,b两个Field值交换
        //定义一个临时变量来保存dw对象的a Field的值
        int tmp = dw.a;
        //把dw对象的b Field的值赋给a Field
        dw.a = dw.b;
        //把临时变量tmp的值赋给dw对象的b Field
        dw.b = tmp;
        System.out.println("swap方法里，a Field的值是" + dw.a + "；b Field的值是" + dw.b);
        dw = null;
    }

    public static void main(String[] args)
    {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换结束后，a Field的值是" + dw.a + "；b Field的值是" + dw.b);
    }
}
