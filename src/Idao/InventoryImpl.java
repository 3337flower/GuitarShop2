package Idao;

import java.sql.ResultSet;

import DB.DbUtil;
import dao.Builder;
import dao.GuitarSpec;
import dao.Inventory;
import dao.Type;
import dao.Wood;

public class InventoryImpl implements InventoryIDao  {
	
	
	@Override
	public boolean LoadGuitars() throws Exception {
		// TODO Auto-generated method stub
		Inventory inventory = new Inventory();
		// ≥ı ºªØinventory
		String sql = "select * from guitar";
		DbUtil db = new DbUtil();
		try {
			ResultSet rs = db.query(sql);
			while (rs.next()) {
				Builder builder = Builder.valueOf(rs.getString("builder").toUpperCase());
				String model = rs.getString("model");
				Type type = Type.valueOf(rs.getString("type").toUpperCase());
				int numStrings = Integer.parseInt(rs.getString("numstrings"));
				Wood backWood = Wood.valueOf(rs.getString("backWood").toUpperCase());
				Wood topWood = Wood.valueOf(rs.getString("topWood").toUpperCase());
				
				
				GuitarSpec Spec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
				inventory.addGuitar(rs.getString("serialNumber"), Double.parseDouble(rs.getString("price")), Spec);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
}