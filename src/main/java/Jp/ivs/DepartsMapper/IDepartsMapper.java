package Jp.ivs.DepartsMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import Jp.ivs.model.Departs;

@Mapper
public interface IDepartsMapper {
	
	@Select("Select Id, Name from tb_departs")
	List<Departs> findAll();

}
