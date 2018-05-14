package src.test.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bt.jcfg.TestConfig;
import com.bt.test.TestBean;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit4ClassRunner 在junit环境下提供Spring TestContext Framwork功能
@ContextConfiguration(
    classes = { TestConfig.class }) // 加载AppicationContext
@ActiveProfiles("dev") // 声明活动的prod
public class DemoBeanIntegerationTest {

    // 注入Bean
    @Autowired
    private TestBean testBean;

    // 测试
    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);

    }

}
