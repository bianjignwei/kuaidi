package com.laike.kuaidi.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@Configuration//配置类
@MapperScan("")
public class MyBatisPlusConfig {


    //注册乐观锁插件
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    //分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }



    /**
     * `xxxMapper.xml`文件中的`databaseId`会自动识别使用的数据库类型与这里相对应
     * 注: 如果没有指定`databaseId`则该SQL语句适用于所有数据库哦~
     *
     * databaseIdProvider：支持多数据库厂商
     * VendorDatabaseIdProvider: 得到数据库厂商的标识(驱动getDatabaseProductName())，mybatis就能根据数据库厂商标识来执行不同的sql;
     * MySQL，Oracle，SQL Server,xxxx
     */

	/*public DatabaseIdProvider getDatabaseIdProvider(){
		DatabaseIdProvider databaseIdProvider = new VendorDatabaseIdProvider();
		Properties properties = new Properties();
		// 为不同的数据库厂商起别名
		properties.setProperty("MySQL","mysql");
		properties.setProperty("Oracle","oracle");
		databaseIdProvider.setProperties(properties);
		return databaseIdProvider;
	}*/

}
