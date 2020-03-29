package top.flytop.mybatisgenerator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yz
 * @className Genrateor
 * @description
 * @date 2020/3/25 22:12
 */
public class Genrateor {
        public static void main( String[] args ) throws Exception {
            List<String> warnings = new ArrayList<>();
            File configFile = new File("src/main/resources/mybatis-generator.xml");
            System.out.println(configFile.getAbsolutePath());
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }

}
