package Structural.AbstractDocument;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("constructing food and materials...");
        Map<String,Object> cheese=Map.of(
                Property.TYPE.toString(),"Mozzarella",
                Property.BRAND.toString(),"Orfa",
                Property.PRICE.toString(),43
        );

        Map<String,Object> tomatoSauce=Map.of(
                Property.TYPE.toString(),"Tomato Sauce",
                Property.BRAND.toString(),"Hao Ren Jia",
                Property.PRICE.toString(),38
        );

        Map<String,Object> food=Map.of(
                Property.BRAND.toString(),"Pizza",
                Property.PRICE.toString(),100,
                Property.PARTS.toString(), List.of(cheese,tomatoSauce)
        );



        Food food1=new Food(food);
        System.out.println("Here is new food:");
        System.out.println("Brand : "+food1.getBrand());
        System.out.println("Price : "+food1.getPrice());
        System.out.println("materials: ");
        food1.getParts().forEach(p-> System.out.println(p.getType()+" " +p.getBrand()+ " " + p.getPrice()));
        food1.getParts().filter(elem->(int) elem.getPrice().get()>30).forEach(System.out::println);


    }
}
