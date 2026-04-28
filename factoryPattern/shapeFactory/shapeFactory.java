import shapes.*;
import java.util.HashMap;
import java.util.function.Supplier;
class shapeFactory{
    public static shape getShape(String shapeType){
        // if(shapeType.equalsIgnoreCase("Square")){
        //     reutrn new shapes.Square();
        // }
        // else if(shapeType.equalsIgnoreCase("Rectangle")){
        //     reutrn new shapes.Rectangle();
        // }
        // else if(shapeType.equalsIgnoreCase("Circle")){
        //     reutrn new shapes.Circle();
        // }
       private static final HashMap<String ,Supplier<shape>> map =new HashMap<>();
        static{
        map.put("square",square::new);
        map.put("rectangle",rectangle::new);
        map.put("circle",circle::new);
        map.put("triangle",triangle::new);
        }
        Supplier<shape> s = map.get(shapeType.toLowerCase());

    }
}