class user{
    public static void main(String[] args) {
        // shapeFactory factory = new shapeFactory();
        shape s1 = shapeFactory.getShape("circle");
        s1.draw();
        shape s2 = shapeFactory.getShape("rectangle");
        s2.draw();
    }
}