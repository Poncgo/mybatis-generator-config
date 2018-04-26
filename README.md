# mybatis-generator-config
use mybatis generator  to generate mybits dao entity mapper xml file
command line to generate dao entity mapper files.
1 use like this : java -jar mybatis-generator-core-1.3.5.jar --configfile generatorConfig_xxx.xml 
2 configfile inspect:
<!-- config connect url and username & password-->
<jdbcConnection driverClass="com.mysql.jdbc.Driver" connectionURL="jdbc:mysql://127.0.0.1:3306/zwh" userId="root" password="0000">
        </jdbcConnection>
        <javaTypeResolver>
            <property name="forceBigDecimals" value="false"/>
        </javaTypeResolver>
        <!--generate dir of entity-->
        <javaModelGenerator targetPackage="com.example.demo.entity" targetProject="src">
            <property name="enableSubPackages" value="true"/>
            <property name="trimStrings" value="true"/>
        </javaModelGenerator>
        <!--generate dir of mapper class files-->
        <sqlMapGenerator targetPackage="mapper" targetProject="src">
            <property name="enableSubPackages" value="true"/>
        </sqlMapGenerator>
        <!--generate dir of mapper xml files corresponde with mapper class -->
        <javaClientGenerator type="XMLMAPPER" targetPackage="com.example.demo.mapper" targetProject="src">
            <property name="enableSubPackages" value="true"/>
        </javaClientGenerator>
        <!--table-->
        
		<table tableName="sys_role_info"></table>
		<table tableName="sys_role_permission"></table>
		<table tableName="sys_user_info"></table>
		<table tableName="sys_user_role"></table>
		<table tableName="sys_login_info"></table>
		<table tableName="sys_dep_info"></table>
		<table tableName="sys_permission_info"></table>
