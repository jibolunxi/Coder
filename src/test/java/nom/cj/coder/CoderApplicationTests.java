package nom.cj.coder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class CoderApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	void testMybatis() {
		Connection conn;
		try {
			conn = dataSource.getConnection();
			System.err.println(conn);
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	@Test
	void contextLoads() {
	}


}
