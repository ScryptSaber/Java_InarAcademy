package chapters.chapter10.Exercise28;

public class MyStringBuilder2 {
    private String s;

    public MyStringBuilder2() {
        this.s = "";
    }

    public MyStringBuilder2(char[] chars) {
        this.s = String.valueOf(chars);
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        String start = this.s.substring(0, offset);
        String end = this.s.substring(offset);

        return new MyStringBuilder2(start + s.toString() + end);
    }

    public MyStringBuilder2 reverse() {
        String reverse = "";
        for (int i = this.s.length() - 1; i >= 0; i--) {
            reverse += this.s.charAt(i);
        }
        return new MyStringBuilder2(reverse);
    }

    public MyStringBuilder2 substring(int begin) {
        this.s = this.s.substring(begin);
        return this;
    }

    public MyStringBuilder2 toUpperCase() {
        this.s = this.s.toUpperCase();
        return this;
    }

    public String toString() {
        return this.s;
    }

    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        return this.s.charAt(index);
    }
}
