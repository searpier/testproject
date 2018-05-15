package Manager;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import VO.Airplane;
import VO.Passenger;

public class AirManager {

	private ArrayList<Airplane> aList;
	private HashMap<String, Passenger> pList;
	private final static String FILENAME = "save.dat";

	public AirManager() {
		loadFile();
		pList = new HashMap<>();
	}

	public boolean addAirplane(Airplane a) {// 항공기 등록 , 항공기 고유번호 무결성

		boolean result = true;

		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i).getAirplaneNum().equals(a.getAirplaneNum()))
				result = false;
		}

		if (result) {
			aList.add(a);
			saveFile();
		}
		return result;
	}

	public void deleteAirplane(int index) {// 항공기 삭제
		aList.remove(index);
		saveFile();
	}

	public void fixAirplane(Airplane a, int index) {// 항공기 수정
		if (index != -1) {
			a.setPassengerList(aList.get(index).getPassengerList());
			aList.set(index, a);
			saveFile();
		}
	}

	public int searchAirplane(String planeNum) { // 항공기 검색
		int result = -1;
		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i).getAirplaneNum().equals(planeNum)) {
				return i;
			}
		}
		return result;
	}

	public boolean addPassenger(Passenger p, int address) {// 승객등록, 여권번호 무결성
		boolean result = true;

		for (int i = 0; i < aList.size(); i++) {
			if (aList.get(i).getPassengerList().containsKey(p.getPassportNum()))
				result = false;
		}

		if (result) {
			aList.get(address).getPassengerList().put(p.getPassportNum(), p);
			saveFile();
		}
		return result;
	}

	public void deletePssenger(int airplane, int passenger) {// 승객삭제
		if (airplane != -1 || passenger != -1) {
			Passenger p = (Passenger) (getpList(airplane).values().toArray()[passenger]);
			aList.get(airplane).getPassengerList().remove(p.getPassportNum());
			saveFile();
		}
	}

	public void fixPassenger(Passenger p, int airplane, int passenger) {// 승객수정
		if (airplane != -1 || passenger != -1) {
			Passenger original = (Passenger) (getpList(airplane).values().toArray()[passenger]);
			aList.get(airplane).getPassengerList().replace(original.getPassportNum(), p);
			saveFile();
		}
	}

	public Airplane searchPassenger(String passportNum) {// 승객검색
		for (int i = 0; i < aList.size(); i++) {

			if (aList.get(i).getPassengerList().containsKey(passportNum)) {
				return aList.get(i);
			}

		}

		return null;

	}

	public void saveFile() {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream(FILENAME);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			oos.writeObject(aList);
			oos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	public void loadFile() {
		File file = new File(FILENAME);
		ObjectInputStream ois = null;

		try {
			if (file.exists()) {
				FileInputStream fis = new FileInputStream(file);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);

				aList = (ArrayList<Airplane>) ois.readObject();

			} else {
				aList = new ArrayList<>();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

	public ArrayList<Airplane> getaList() {
		return aList;
	}

	public void setaList(ArrayList<Airplane> aList) {
		this.aList = aList;
	}

	public HashMap<String, Passenger> getpList(int address) {
		return aList.get(address).getPassengerList();
	}

	public void setpList(HashMap<String, Passenger> pList) {
		this.pList = pList;
	}

}
