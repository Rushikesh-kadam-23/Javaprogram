package String;

public class StringBufferProgram {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());              // 16

        sb.append("hello");
        System.out.println(sb.capacity());              // 16 Default value

        sb.append("Rushi java");
        System.out.println(sb.capacity());              // (old capacity*2)+2 or (old capacity+1)*2
    }
    // (34*2)+2=70
}

