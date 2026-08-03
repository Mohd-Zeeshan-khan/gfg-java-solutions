class Child extends Parent {
    @Override
    void show(int p) {
        System.out.print(p + " ");
    }

    @Override
    void print(int q) {
         System.out.print(q*q+" ");
        System.out.println();
    }
}