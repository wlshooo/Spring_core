package hello.core.discount;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
@Primary
=======
import org.springframework.stereotype.Component;

@Component
>>>>>>> c09e2d42e921e5da76aedbedecdd99faa98e2d15
public class RateDiscountPolicy implements DiscountPolicy{

    private  int discountPercent =10;
    @Override
    public int discount(Member member, int price) {
       if(member.getGrade()== Grade.VIP)
       {
           return price *discountPercent / 100;
       }
       else
       {
           return 0;
       }
    }
}
