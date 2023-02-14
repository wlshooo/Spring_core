package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan( excludeFilters = @ComponentScan.Filter
        (type = FilterType.ANNOTATION,classes = Condition.class))
public class AutoAppConfig {
}
