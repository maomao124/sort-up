import java.util.Arrays;

/**
 * Project name(项目名称)：sort()数组排序 升序
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/9/26
 * Time(创建时间)： 19:40
 * Version(版本): 1.0
 * Description(描述)：
 * 使用 java.util.Arrays 类中的 sort() 方法对数组进行升序分为以下两步：
 * 导入 java.util.Arrays 包。
 * 使用 Arrays.sort(数组名) 语法对数组进行排序，排序规则是从小到大，即升序。
 * 假设在数组 scores 中存放了 5 名学生的成绩，现在要实现从低到高排列的功能。在这里使用 Arrays.sort() 方法来实现，
 * 具体代码如下：
 */

public class test
{
    public static void main(String[] args)
    {
        double[] scores = new double[]{78, 98, 65, 82, 36};
        System.out.println("排序前：");
        for (double i : scores)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("排序后的数组如下：");
        Arrays.sort(scores);
        for (double s : scores)
        {
            System.out.print(s + "\t");
        }
        System.out.println();
    }
}
