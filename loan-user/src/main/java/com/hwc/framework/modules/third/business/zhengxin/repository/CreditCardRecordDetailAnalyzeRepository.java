package com.hwc.framework.modules.third.business.zhengxin.repository;

import com.hwc.framework.modules.service.base.BaseDAO;
import com.hwc.framework.modules.third.business.zhengxin.entity.CreditCardRecordDetailAnalyzeEntity;
import com.hwc.framework.modules.third.util.DateUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 
 * ClassName: CreditCardRecordDetailAnalyzeRepository    
 * date: 2017年1月11日 下午7:29:14   
 * @author yuandong  
 * @version   
 * @since JDK 1.6
 */
@Repository
public class CreditCardRecordDetailAnalyzeRepository extends BaseDAO<CreditCardRecordDetailAnalyzeEntity> {
//
//	@Resource(name="templateZhengxin")
//    private JdbcTemplate jdbcTemplate;
//
//    public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
    
    public void saveCreditCardRecordDetailAnalyze(CreditCardRecordDetailAnalyzeEntity entity)throws Exception  {
    	entity.setCreateTime(DateUtil.getCurrentDate());
    	entity.setLastModifyTime(DateUtil.getCurrentDate());
		this.add(entity);
    }
    
    

   public void deleteCreditCardRecordDetailAnalyze(String userId,String mappingId,String reportNo){
	   String tableName = "t_creditcardrecorddetailanalyze";
	        StringBuilder sql = new StringBuilder("DELETE FROM ").append(tableName).append(" WHERE ").
	                append("userId='").append(userId).append("'").
	                append("and mappingId='").append(mappingId).append("'")
	                .append("and reportNo='").append(reportNo).append("'");

	         this.getJdbcTemplate().update(sql.toString());
   }
    
    
    
}
