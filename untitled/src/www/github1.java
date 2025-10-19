package www;
import java.util.Scanner;
public class github1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.println("=== 简单计算器 ===");
                System.out.println("支持的操作: +, -, *, /");
                System.out.println("输入 'quit' 退出程序");

                while (true) {
                    try {
                        System.out.print("\n请输入第一个数字: ");
                        String input1 = scanner.next();
                        if ("quit".equalsIgnoreCase(input1)) {
                            System.out.println("退出计算器");
                            break;
                        }
                        double num1 = Double.parseDouble(input1);

                        System.out.print("请输入操作符 (+, -, *, /): ");
                        String operator = scanner.next();

                        System.out.print("请输入第二个数字: ");
                        String input2 = scanner.next();
                        if ("quit".equalsIgnoreCase(input2)) {
                            System.out.println("退出计算器");
                            break;
                        }
                        double num2 = Double.parseDouble(input2);

                        double result = calculate(num1, num2, operator);
                        System.out.println("结果: " + num1 + " " + operator + " " + num2 + " = " + result);

                    } catch (NumberFormatException e) {
                        System.out.println("输入错误，请输入有效的数字");
                    } catch (ArithmeticException e) {
                        System.out.println("计算错误: " + e.getMessage());
                    } catch (IllegalArgumentException e) {
                        System.out.println("操作错误: " + e.getMessage());
                    }
                }

                scanner.close();
            }

            /**
             * 执行基本数学运算
             * @param num1 第一个数字
             * @param num2 第二个数字
             * @param operator 操作符
             * @return 计算结果
             */
            public static double calculate(double num1, double num2, String operator) {
                switch (operator) {
                    case "+":
                        return num1 + num2;
                    case "-":
                        return num1 - num2;
                    case "*":
                        return num1 * num2;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("除数不能为零");
                        }
                        return num1 / num2;
                    default:
                        throw new IllegalArgumentException("不支持的操作符: " + operator);
                }
            }
        }










