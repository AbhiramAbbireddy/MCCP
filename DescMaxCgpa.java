import java.util.*;
class Student {
    int rno;
    String sname, branch;
    int total;
    double cgpa;
    public Student(int rno, String sname, String branch, int total, double cgpa) {
        this.rno = rno;
        this.sname = sname;
        this.branch = branch;
        this.total = total;
        this.cgpa = cgpa;
    }
}
class CGPAMaxComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.cgpa == s2.cgpa)
            return 0;
        else if (s1.cgpa > s2.cgpa)
            return -1;
        else
            return 1;
    }
}
class DescMaxCgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        PriorityQueue<Student> pq = new PriorityQueue<>(new CGPAMaxComparator());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter rno, name, branch, total, cgpa for s" + (i+1) + ":");
            int rno = sc.nextInt();
            String sname = sc.next();
            String branch = sc.next();
            int total = sc.nextInt();
            double cgpa = sc.nextDouble();
            pq.add(new Student(rno, sname, branch, total, cgpa));
        }
        ArrayList<Student> al = new ArrayList<>();
        while (!pq.isEmpty()) {
            al.add(pq.poll());
        }
        System.out.println("Students by CGPA(DESC):");
        for (Student s : al) {
            System.out.println(s.rno+" "+s.sname+" "+s.branch+" "+s.total+" "+s.cgpa);
        }
    }
}