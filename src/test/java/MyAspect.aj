import com.nyse.model.Company;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by TT on 8.11.2015 г..
 */
@Aspect
@Component
public aspect MyAspect {

    @Around("execution(* *com.*.*.CompanyService.get*(..))")
    public List<Company> getAllCatsAroundMethod(ProceedingJoinPoint pjp){

        List<Company> companies = null;

        try {

            System.out.println("Bofore "+pjp.getSignature());
            companies = (List<Company>)pjp.proceed();
            System.out.println("After "+pjp.getSignature());

        }catch (Throwable e){
            System.out.println("Proceed exception! "+e.getMessage());
        }

        return  companies;
    }
}
