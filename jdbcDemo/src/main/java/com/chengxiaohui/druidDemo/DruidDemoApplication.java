package com.chengxiaohui.druidDemo;

import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
@Slf4j
@RequestMapping
public class DruidDemoApplication {

	public static void main(String[] args) {
		System.out.println("hello xiaohui");
		String sql = "select * from from table";
		boolean checkResult = checkSQL(sql);
		System.out.println(checkResult);
	}

	private static boolean checkSQL(String sql) {
		MySqlStatementParser parser = new MySqlStatementParser(sql);
		boolean flag=true;
		try{
			List<SQLStatement> smtList=parser.parseStatementList();
		}catch(Exception e){
			flag=false;
			e.printStackTrace();
		}
		return flag;
	}


	/*@Override
	public void run(String... args) throws SQLException {
		showConnection();
	}

	private void showConnection() throws SQLException {
		log.info(dataSource.toString());
		Connection conn = dataSource.getConnection();
		log.info(conn.toString());
		conn.close();
	}*/

}
