package app;

class Overloading extends DisplayOverloading {
    public static void main(String[] args) {
        DisplayOverloading obj = new DisplayOverloading();
        obj.disp('a');
        obj.disp('a', 10);
    }
}