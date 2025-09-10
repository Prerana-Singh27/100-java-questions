
package Collection;
class challenge1 {
    public static String concatenate(String...elements) {
        StringBuilder sb = new StringBuilder();
        for (String element : elements) {
            sb.append(element).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatenate(" shruti "," is "," a ", " beautiful "," girl !!!!"));
        System.out.println( concatenate("Finally","my","java","course","is","over"));

    }
}
