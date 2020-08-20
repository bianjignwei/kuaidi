package com.laike.kuaidi;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

//代码自动生成
public class SunCode {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        //配置策略

        //1.全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");//路径
        gc.setAuthor("weiZiHao");//设置代码书写的人
        gc.setOpen(false);//是否打开资源管理器
        gc.setFileOverride(false);//是否覆盖原来生成的
        gc.setServiceName("%sService");//去Service的I前缀;
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);//日期类型
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        //设置数据源
        DataSourceConfig dsc = new DataSourceConfig();

        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/febs_base_matter?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2b8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //3.包的配置
        PackageConfig pc = new PackageConfig();

        pc.setModuleName("blog");
        pc.setParent("cn.laike.management");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);


        //4策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("t_remind");//设置映射表名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setLogicDeleteFieldName("deleted");

        //自动填充配置
        TableFill gmtCreate = new TableFill("CREATE_TIME", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("MODIFY_TIME", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);

        //乐观锁
        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);

        mpg.setStrategy(strategy);

        mpg.execute();//执行
    }


}
