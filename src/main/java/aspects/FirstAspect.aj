package aspects;

public aspect FirstAspect {
    pointcut pc1(): execution(* test.Application.mainggg(..))  ;
//    before():pc1(){
//        System.out.println("before aspect =====================");
//    }
//    after():pc1(){
//        System.out.println("after aspect ====================" );
//    }
//
    void around() : pc1(){
        System.out.println("before aspect =====================");
        proceed();
        System.out.println("after aspect ====================" );
    }
}
