package com.cn.zj.breakpoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * 断点种类：源断点，行断点，方法断点，属性断点，异常断点。
 * 源断点，行断点
 * 场景：
 * 条件断点
 * 获取值和设置值。
 * 方法断点，属性断点，异常断点。
 * 工具栏讲述简述。
 * 断点回退
 * 安全退出
 * java8流式断点
 * 多线程断点调试
 * 远程调试，在之前的那期已经讲了。如果不动的小伙伴可以看上一期。
 * @Author: wangdakai
 * @Date: 2022/1/11
 */
public class BreakPoint {
    public static void main(String[] args) {
        // 行断点，源断点
//        lineBreakPoint(10);
//        a();
//        b();
//        Person person = new Person();
//        InstanceAgain(person);
        // 方法断点
//        methodBreakPoint();
        // 属性断点
//        attributeBreakPoint();
        // 异常断点
//        exceptionBreakPoint();
        // 安全退出和断点回退
//        int i = 0;
//        System.out.println();
        safeQuit();
        // java8流式断点
//        stream();
    }

    private static void InstanceAgain(Person person1) {
        System.out.println("执行中间操作");
        System.out.println(person1);
    }


    /**
     * java8流式断点
     */
    private static void stream() {
        List<String> list = new ArrayList<>(Arrays.asList("回龙观","泷泽","西二旗","清河","上地","五道口"));
        list.stream()
                .filter(s -> s.length()==2)
                .map(s -> s+"xx")
                .forEach(s->{
                    System.out.println(s);
                });
    }

    /**
     * 1.我执行完了计算，因为计算过程很复杂，我还想在执行一遍，怎么处理？难道重新启动吗？
     * 2.我执行完成计算，后边的资源操作我不想执行，我直接关闭程序可以吗？
     */
    private static void safeQuit() {
        System.out.println("执行计算操作");
        System.out.println("插入数据库");
        System.out.println("发送kafka。。。");
        int i=0;
        int j=1;
        System.out.println(i+j);
    }


    /**
     * 行断点和源断点。方法断点，属性断点。
     * 1.我想打印出sum日志。且不想停顿 如何打印？
     * 源断点的作用是用来做日志的。
     * 2.每次停顿，每次记录sum每次的值。 如何看的更加详细一些，如果行号，线程。
     * 我想看调用堆栈信息。（1.直观的，2打印的）
     * 3.循环太多了，10次循环太多了，我想从第8次开始。跳过前边7次。
     * 4.我想从指定条件处开始。
     * 5.我这个人习惯不太好。每次执行完成的断点都不删除，后来在跑程序的时候总会听这些断点处。
     *         1.断点执行一次就清除
     *         2.专心跑程序，关闭所有的断点
     *         3.通过断点的设置页面进行
     * 6. a方法调用了lineBreakPoint，b方法也调用了lineBreakPoint，我想只看b方法调用，
     * 常常我们有好多地方调用一个方法，我们只想看某个方法调用时候的。并不常用。我是没用过。
     *
     * 7.对象监控，我们同一个对对象传到下边，由于代码不是一个人写的，他把名称改了
     * 这个时候我们不确定是否一个对象怎么处理？1.看id，2.事先做好标记。（看源码时有用）
     *
     * 8.属性赋值，我虽然传递的n是10，但是我就想看11的结果
     * 9.预执行1.提前执行，2.拿着已有参数进行执行，不影响后边执行的。
     */
    private static int lineBreakPoint(int n) {
        // 触发断点方法
        int sum = 0;
        for (int i = 0;i< n;i++){
            sum = sum+i;
        }
        return sum;
    }
    private static void a() {
        System.out.println("我是 a");
        lineBreakPoint(10);
    }

    private static void b() {
        System.out.println("我是 b");
        lineBreakPoint(10);
    }
    /**
     * 1.我想在运行到某个异常的时候就停下来。
     * 2.自定义异常是否也能做到上边效果？
     */
    private static void exceptionBreakPoint() {
//        String s = null;
//        s.toString();

        throw new MyException("666","我是自定义异常");
    }

    /**
     * 属性断点
     * 1.我想在对象的某个属性赋值的时候停下来查看
     * 2.我想在获取某个对象的属性的时候停下来查看
     */
    private static void attributeBreakPoint() {
        Person person = new Person();
        person.setName("Java兵长");

        String name = person.getName();
    }

    /**
     * 方法断点
     * 1.我想在进入方法的时候停下，出方法的时候停一下。「就类似切面那种」
     * 2.我想快速找到接口中方法的实现类。（读源码非常有用）
     * 我们日长工作开发中service都是一个接口一个实现类所以不太常用，在源码中一个接口多个实现了，
     * 这个时候通过鼠标左键去找就很难找到对应的方法。
     */
    private static void methodBreakPoint() {
        Hello hello = new HelloImpl();
        hello.sayHello("Java兵长");
    }

}
