package VO;

import java.io.Serializable;
import java.util.HashMap;

public class Airplane implements Serializable {

	private String modelName;// �װ���𵨸�
	private String airplaneNum;// �װ��������ȣ
	private String seatNum;// �ִ��¼���
	private HashMap<String, Passenger> passengerList;// �°����

	public Airplane(String modelName, String airplaneNum, String seatNum, HashMap<String, Passenger> passengerList) {
		super();
		this.modelName = modelName;
		this.airplaneNum = airplaneNum;
		this.seatNum = seatNum;
		this.passengerList = passengerList;
	}

	public Airplane(String modelName, String airplaneNum, String seatNum) {
		super();
		this.modelName = modelName;
		this.airplaneNum = airplaneNum;
		this.seatNum = seatNum;
		passengerList = new HashMap<>();
	}

	public Airplane() {
		super();
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getAirplaneNum() {
		return airplaneNum;
	}

	public void setAirplaneNum(String airplaneNum) {
		this.airplaneNum = airplaneNum;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public HashMap<String, Passenger> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(HashMap<String, Passenger> passengerList) {
		this.passengerList = passengerList;
	}

	@Override
	public String toString() {
		return "�𵨸�=" + modelName + ", �װ����ȣ=" + airplaneNum + ", �ִ��¼���=" + seatNum;
	}

}
