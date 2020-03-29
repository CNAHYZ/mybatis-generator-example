# mybatis-generator-example
The example of learn MBG

## 默认情况下不生dao接口，可在mybatis-generator.xml将此段注释取消
```xml
        <!--        <javaClientGenerator targetPackage="dao" type="ANNOTATEDMAPPER"-->
        <!--                             targetProject="src/main/java">-->
        <!--            &lt;!&ndash; 在targetPackage的基础上，根据数据库的schema再生成一层package，最终生成的类放在这个package下，默认为false &ndash;&gt;-->
        <!--            <property name="enableSubPackages" value="true"/>-->

        <!--            &lt;!&ndash; 可以为所有生成的接口添加一个父接口，但是MBG只负责生成，不负责检查-->
        <!--            <property name="rootInterface" value=""/>-->
        <!--             &ndash;&gt;-->
        <!--        </javaClientGenerator>-->
```
## 使用了自定义注释，可自己在MyCommentGenerator类中修改
```xml
        <commentGenerator type="top.flytop.mybatisgenerator.MyCommentGenerator">
            <property name="author" value="yz"/>
            <property name="dateFormat" value="yyyy/MM/dd"/>
        </commentGenerator>
```
## 直接运行Genrateor主类即可生成代码
