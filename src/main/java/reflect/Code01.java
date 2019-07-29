package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @Author: jiangjiabin
 * @Description: test reflect
 * Constructor、Field、Method、Modifier
 * @Date: Create in 21:40 2019/7/29
 */
public class Code01 {

    public static void main(String[] args) {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter class name(e.g. java.util.Date、chapter3.param.Employee): ");
            name = scanner.next();
        }
        try {
            Class cls = Class.forName(name);
            Class superCls = cls.getSuperclass();
            String modifier = Modifier.toString(cls.getModifiers());
            if (modifier.length() > 0) {
                System.out.println(modifier + " ");
            }
            System.out.println("class: " + name);
            if (superCls != null && superCls != Object.class) {
                System.out.println("extends " + superCls.getName());
            }

            System.out.println("\n{\n");
            printConstructor(cls);
            System.out.println("=================");
            printMethod(cls);
            System.out.println("=================");
            printFields(cls);
            System.out.println("=================");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * @param cls
     */
    private static void printFields(Class cls) {
        Field[] fields = cls.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println(" ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }

    /**
     * @param cls
     */
    private static void printMethod(Class cls) {
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();

            System.out.println("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * @param cls
     */
    private static void printConstructor(Class cls) {
        Constructor[] constructors = cls.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }


}
