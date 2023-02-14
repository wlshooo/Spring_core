package hello.core.order;

import hello.core.annotation.MainDiscountPolicy;
import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
>>>>>>> c09e2d42e921e5da76aedbedecdd99faa98e2d15

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{


    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private  final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    private final DiscountPolicy discountPolicy;
    private final MemberRepository memberRepository;

    @Autowired
<<<<<<< HEAD
    public OrderServiceImpl(@MainDiscountPolicy DiscountPolicy discountPolicy,  MemberRepository memberRepository) {
        this.discountPolicy = discountPolicy;
=======
    public OrderServiceImpl(DiscountPolicy discountPolicy, MemberRepository memberRepository) {
        this.discountPolicy = discountPolicy; //롬복이 대신 만들어줌 @RequiredArgsConstructor
>>>>>>> c09e2d42e921e5da76aedbedecdd99faa98e2d15
        this.memberRepository = memberRepository;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }

    //Test
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
