//priorityqueue of a custom class Student with name and age....
package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        queue.offer(new Student("Supriya" , 'C'));
        queue.offer(new Student("Shruti" , 'A'));
        queue.offer(new Student("Prerana" , 'A'));
        queue.offer(new Student("Rehan" , 'D'));
        queue.offer(new Student("Subhojeet" , 'B'));

        System.out.printf("Queue is: %s" ,queue);
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());
        System.out.printf("Queue is: %s\n",queue.poll());
    }
    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public char getGrade() {
            return grade;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}
