public class Stringbuilder {
    public static void main(String[] args){
        int empno = 1001;
        
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM employee ");
        sb.append("WHERE empro = '");
        sb.append(empno);
        sb.append("';");
        System.out.println(sb);
    }
}
