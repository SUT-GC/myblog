package classtest;

import java.util.ArrayList;

import dao.MessDao;
import empty.Message;

public class TestMessDao {

	public static void main(String[] args) {
//		int sum = MessDao.countFirstMess();
//		System.out.println(sum);
		
		/*
		 * 测试MessDao.selectMessByLimit
		 */
//		ArrayList<Message> list = new ArrayList<>();
//		list = MessDao.selectMessByLimit(0, 2);
//		for(Message message: list){
//			System.out.println(message);
//		}
		/*
		 * 测试MessDao.selectFirstMessByFloor
		 */
		ArrayList<Message> list = new ArrayList<>();
		list = MessDao.selectSecoundMessByFloor(3);
		for(Message message: list){
			System.out.println(message);
		}
	}

}
