package jp.co.google.ssk.basic;

import jp.co.google.ssk.clz.Cat;

public class PrimitiveTypeTest  {
	
	
	
	 public static void main(String[] args) {  
	        // byte  
		 	byte b = 1;
	        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
	        System.out.println("包装类：java.lang.Byte");  
	        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
	        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
	        System.out.println();  
	  
	        // short  
	        short s = 1;
	        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
	        System.out.println("包装类：java.lang.Short");  
	        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
	        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
	        System.out.println();  
	  
	        // int  
	        int i = 1;

	        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
	        System.out.println("包装类：java.lang.Integer");  
	        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
	        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
	        System.out.println();  
	  
	        // long  
	        long l = 1L;

	        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
	        System.out.println("包装类：java.lang.Long");  
	        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
	        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
	        System.out.println();  
	  
	        // float  
	        float pi = 3.14f;
	        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
	        System.out.println("包装类：java.lang.Float");  
	        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
	        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
	        System.out.println();  
	  
	        // double  
	        double ppi = 3.14159;
	        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
	        System.out.println("包装类：java.lang.Double");  
	        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
	        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
	        System.out.println();  
	  
	        // char  
	        char ch = 'a';
	        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
	        System.out.println("包装类：java.lang.Character");  
	        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
	        System.out.println("最小值：Character.MIN_VALUE="  
	                + (int) Character.MIN_VALUE);  
	        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
	        System.out.println("最大值：Character.MAX_VALUE="  
	                + (int) Character.MAX_VALUE);  
	        
	        // bool
	        
	        
	        
	        System.out.println("基本类型：boolean 布尔值：" + Boolean.FALSE);  
	        System.out.println("包装类：java.lang.Boolean");  
	        
	        
	        boolean isOk = false;
	        System.out.println(isOk);
	        
	        // null 只可以给对象赋值
	        Boolean isClassOk = null;
	        System.out.println(isClassOk);

	        System.out.println(i);
	        
	        
	        // 包装类的对象有更多的方法
	        Integer in = Integer.valueOf(i);
	        System.out.println(in);

	        
	        System.out.println(Cat.NAME_ZH);
	        

	        int num1 = 100;
	        int num2 = 100;
	        System.out.println(num1 == num2);
	        
	        
	        System.out.println("--------------------");
	        
	        String strA = "abc";
	        String strB = new String("abc");
	        String strC = "abc";

	        
	        System.out.println("hash code");
	        System.out.println(strA.hashCode());
	        System.out.println(strB.hashCode());
	        System.out.println(strC.hashCode());
	        
	        System.out.println("---------");
	        
	        System.out.println(strA);
	        System.out.println(strB);
	        
	        System.out.println("strA==strB " + strA==strB);
	        
	        System.out.println("strA==strC " + strA==strC);

	        
	        // 字符串比较一定要用 equals方法
	        System.out.println("strA.equals(strB) " +  strA.equals(strB));
	        
	        
	        
	        
	    }  
}
