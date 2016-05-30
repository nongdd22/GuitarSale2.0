

package DAO;

import java.util.List;

import model.Guitar;

public interface IGuitarDAO {

		public List<Guitar> selectGuitar(String type);
		
}

