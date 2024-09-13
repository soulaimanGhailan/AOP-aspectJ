package aspects;

import buisness.Account;
import buisness.AccountServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PatchAspect {
    @Pointcut("execution(* buisness.AccountServiceImpl.retrieveMoney(..))")
    public void pc1(){}

    @Around("pc1() && args(account , amount)")
    public Object aroundRetrieving(ProceedingJoinPoint point , JoinPoint joinPoint , Account account , double amount) throws Throwable {
        AccountServiceImpl service = (AccountServiceImpl) joinPoint.getTarget();
        if(account.getBalance() >= amount){
          return   point.proceed() ;
        }else {
            throw new RuntimeException("Not enough money");
        }
    }
}
