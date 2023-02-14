package hello.core;

<<<<<<< HEAD
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Condition;
=======
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
>>>>>>> c09e2d42e921e5da76aedbedecdd99faa98e2d15
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
<<<<<<< HEAD
@ComponentScan( excludeFilters = @ComponentScan.Filter
        (type = FilterType.ANNOTATION,classes = Condition.class))
public class AutoAppConfig {
=======
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
>>>>>>> c09e2d42e921e5da76aedbedecdd99faa98e2d15
}
