public static void main(string[] args){
	jiujiuchengfabiao();
}	

// 1、通过两层 for 循环
public static void jiujiuchengfabiao(){
	for (int i=1;i<=9;i++){
		for (int j=1;j<=i;j++){
			system.out.print(i+"*"+j+“=”+“i*j”+“\t”);	
			//"i*j" 是字符串，应改为 (i * j) 才能计算乘积
		}
		system.out.println();
	}
}

// 2、通过 while 循环
public static void jiujiuchengfabiao(){
	int i=1;
	while (i<=9){
		int j=1;
		while (j<=i){
			system.out.print(i+"*"+j+“=”+“(i*j)”+“\t”);	
			j++;
			}
		i++;
		system.out.println();
	}
}
/* for 和 while 的区别
1、基本一样，for更简洁。根据意图选择哪种循环
2、当循环次数是确定的（比如遍历一个明确的序列），用 for
3、当循环的继续与否取决于某个在循环开始前未知、且可能在循环过程中动态变化的条件时，用while
*/

// 3、通过 do while 循环
public static void jiujiuchengfabiao(){
	int i = 1;
	do {
		int j = 1;
		do {
			System.out.printf("%d*%d=%2d  ", j, i, i * j);
			/*优化了输出方式：使用 %2d 确保每个乘积结果占两位，不足两位前面补空格
			%2d：确保其至少占用2个字符的宽度​，若结果不足2位（如1-9）则在数字前补空格以达到宽度
			*/
			j++;
		} while (j <= i);	//不换行，紧凑，强调循环的整体性！！
		System.out.println();
		i++;
	} while (i <= 9);
}
/* do while 和 while
唯一的区别就是 do while 先执行一次循环体，才判断。
当while ();括号里为真的话就会返回去执行do里的东西，否则就向下执行。
*/
/* 格式化输出
1、四种方法：printf() 方法、String.format() 方法、DecimalFormat 类、MessageFormat 类
2、printf方法中：
|   -	| 左对齐		|  %-5d	|"42   "|
| （无）	| 默认右对齐	|  %5d	|"   42"|
|   0	| 前导零0	|  %05d	|"00042"|
|   +	| 输出符号	|  %+5d	|"  +42"|
数字5表示总共的位数
d输出十进制数。s输出字符串。f浮点数。c单个字符。b布尔值。
3、简单示例1：宽度与对齐
String name = "Alice";
int score = 85;
System.out.printf("姓名:%-10s 分数:%-5d%n", name, score);
	// %-10s 表示字符串左对齐，宽度为10
	// %-5d 表示整数左对齐，宽度为5
输出：姓名:Alice      分数:85   （后面有空格填充至指定宽度）
*/

// 4、输出到文件​：使用 FileWriter 等 I/O 流类，
// 将乘法表直接写入到一个文本文件中保存，而不是仅仅打印在控制台
import java.io.FileWriter;
import java.io.IOException;
// ...
try {
    FileWriter writer = new FileWriter("乘法表.txt");
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= i; j++) {
            writer.write(String.format("%d*%d=%d\t", j, i, i*j));
        }
        writer.write("\n");
    }
    writer.close();
} catch (IOException e) {
    e.printStackTrace();
}


}