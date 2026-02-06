package kr.co.koreait;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Ex30_1_UserDao {
	private final String URL;

	public Ex30_1_UserDao(String dbpath) {
		this.URL =  "jdbc:sqlite:" + dbpath;
		initSchema();
	}

	private Connection conn() {
		Connection c = null;
		try {
			c = DriverManager.getConnection(URL);
			Statement s = c.createStatement();
			s.execute("PRAGMA foreign_keys=ON"); // PRAGMA foreign_keys=ON : 외래키 제약 허용
		} catch (SQLException e) {
			e.printStackTrace();
		}return c;
	}

//	IF NOT EXISTS : 존재하면 실행하지 말아라.
	public void initSchema() {
		String sql = """
				CREATE TABLE IF NOT EXISTS users (
				   id     INTEGER PRIMARY KEY AUTOINCREMENT,
				   name   TEXT   NOT NULL,
				   age    INTEGER,
				   email  TEXT UNIQUE
				)
				""";
// Statement : 문자열 조합 (쿼리문에서 보안 굉장히 취약.'OR'1=1'-- 작성하면 쿼리문에 따라 트루로 적용되어 모든 정보 확인가능)
		try(Connection c = conn(); Statement st = c.createStatement()){
			st.execute(sql);
		} catch(SQLException e) {

		}
	}

//	Statement VS PreparedStatement(?,..) : PreparedStatement가 우세 (강력한 보안기능 탑재)
//		1. 유저 입력
	public void insert(Ex30_1_User user) throws SQLException {
		String sql = """
				INSERT INTO users(name, age, email) 
				VALUES(?,?,?)
				""";

		try(Connection c = conn(); PreparedStatement ps = c.prepareStatement(sql)) {
			ps.setString(1, user.getName());
			ps.setInt(2, user.getAge());
			ps.setString(3, user.getEmail());
			ps.executeUpdate();
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	
//		2. 전체 유저 조회
	public List<Ex30_1_User> findAll() throws SQLException {
		String sql = """
				SELECT * FROM users
				ORDER BY id
				""";
		try(Connection c = conn(); PreparedStatement ps = c.prepareStatement(sql)) {
			ResultSet rs = ps.executeQuery();
			List<Ex30_1_User> list = new ArrayList<>();

//			rs.next() : 실행시 행을 아래로 이동하며 조회한다. ex.행이 100번 있다면 100번 실행
			while(rs.next()) {
				Integer id = rs.getInt("id");  // "id" -> 문자열이 아닌 int 타입 컬럼명을 뜻함
				String name = rs.getString ("name");
				Integer age = rs.getInt("age");
				String email = rs.getString ("email");
				Ex30_1_User user = new Ex30_1_User(id, name, age, email);
				list.add(user); //리스트 'add'에 조회된 유저들 추가
			}
			return list;
		}
	}

//		3. 특정 유저 조회
	public Ex30_1_User find(int id) throws SQLException {
		String sql = """
				SELECT * FROM users
				WHERE id=?
				""";
		try(Connection c = conn(); PreparedStatement ps = c.prepareStatement(sql))	{
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Integer resultId = rs.getInt("id");
				String name = rs.getString ("name");
				Integer age = rs.getInt("age");
				String email = rs.getString ("email");
				return new Ex30_1_User(resultId, name, age, email);
			}
			return null;
		}
	}
	
	
	
	
//	 	4. 유저 수정
	public int update(Ex30_1_User user) throws SQLException {
		String sql = """
				UPDATE users
				SET name=?, age=?, email=?
				WHERE id=?
				""";
		try(Connection c = conn(); PreparedStatement ps = c.prepareStatement(sql)) {
			ps.setString(1, user.getName());
			ps.setInt(2, user.getAge());
			ps.setString(3, user.getEmail());
			ps.setInt(4, user.getId());
			return ps.executeUpdate(); // insert,update 등 쿼리문 실행할때 (executeUpdate) 작성.
		} 
	}

//		5. 유저 삭제
	public int delete(int id) throws SQLException {
		String sql = """
				DELETE FROM users
				WHERE id=?
				""";
		try(Connection c = conn(); PreparedStatement ps = c.prepareStatement(sql)) {
			ps.setInt(1, id);  // 쿼리 작성
			return ps.executeUpdate(); // 쿼리 실행
		} 
	}
}










