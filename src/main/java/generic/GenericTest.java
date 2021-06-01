package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Description : Generic 테스트
 *                     - extends  -> PE
 *                     - super    -> CS
 *
 *
 * </pre>
 *
 * @author skan
 * @version Copyright (C) 2021 by CJENM|MezzoMedia. All right reserved.
 * @since 2021-06-01
 */
public class GenericTest {

    public static void main(String[] args) {
        GenericTest.extendsTest(0.1);

        // Extends 상위 타입은 에러 Error > 자기 자신과 ,자식 객체만 사용.
        GenericTest.extendsTestCase2(new Circle());
        GenericTest.extendsTestCase2(new ShapesGeneric());
        GenericTest.extendsTestCase3(new Circle());
        GenericTest.extendsTestCase3(new ShapesGeneric());

        //  하위 클레스 타입은 에러 > 자기 자신과 상위 객체만 허용
        //GenericTest.superTestCase3(new ArrayList<Circle>()); -> error
        GenericTest.superTestCase3(new ArrayList<ShapesGeneric>());
        GenericTest.superTestCase3(new ArrayList<Original>());

        GenericTest.superTestCase4(new ArrayList<ShapesGeneric>());
        GenericTest.superTestCase4(new ArrayList<Circle>());
        GenericTest.superTestCase4(new ArrayList<Original>());
        
    }


    public static  void superTestCase3(List<? super ShapesGeneric> data){
        System.out.println(data);
    }

    public static  void superTestCase4(List<? super Circle> data){
        System.out.println(data);
    }

    public static  <T extends Number> void extendsTest(T data){
        System.out.println(data);
    }

    public static  <T extends Original> void extendsTestCase2(T data){
        System.out.println(data);
    }

    public static  <T extends Original> void extendsTestCase3(T data){
        System.out.println(data);
    }


}

abstract class Original{
    String name;
}

class ShapesGeneric extends Original{
    String superClass;
}

class Circle extends ShapesGeneric {
  String circleSpecial;
}
