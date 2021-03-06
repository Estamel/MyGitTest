package Test03;

public class Test {
    public static void main(String[] args) {
        examine(new ConvertStringToStudent() {
            @Override
            public Student convert(String str) {
                String[] split = str.split(",");
                return new Student(split[0],Integer.parseInt(split[1]));
            }
        }, "张三,88");
    }

    public static void examine(ConvertStringToStudent csts, String stuInfo) {
        csts.convert(stuInfo).printGrade();
    }
}
