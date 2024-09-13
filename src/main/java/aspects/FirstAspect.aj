package aspects;

public aspect FirstAspect {
    pointcut pc1(): execution(* test.Application.main(..))  ;
    before():pc1(){
        System.out.println("before aspect =====================");
    }
    after():pc1(){
        System.out.println("after aspect ====================" );
    }
}
