package com.eoa.webapp.ea.bc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eoa.webapp.ea.dac.condition.SelectByConditionForUserDetailCondition;
import com.eoa.webapp.ea.dac.dao.MuserDao;
import com.eoa.webapp.ea.dac.entity.MuserEntity;
import com.eoa.webapp.ea.ic.dto.TestInDto;
import com.eoa.webapp.ea.ic.dto.TestOutDto;

@Service
public class TestService {

    //dao
	@Autowired
    MuserDao muserDao;

    public TestOutDto test(TestInDto testInDto) {
        SelectByConditionForUserDetailCondition condition = new SelectByConditionForUserDetailCondition();
        condition.setUserCode(testInDto.getUserCode());

        MuserEntity muserEntity = muserDao.selectByConditionForUserDetail(condition);
        if (muserEntity != null) {
            TestOutDto outDto = new TestOutDto();
            outDto.setUserName(muserEntity.getUserName());
            outDto.setUserCode(muserEntity.getUserCode());
            outDto.setLoginPassword(muserEntity.getLoginPassword());
            outDto.setLoginFailureCount(muserEntity.getLoginFailureCount());
            outDto.setUserAccountLockFlag(muserEntity.getUserAccountLockFlag());
            outDto.setFirstLoginFlag(muserEntity.getFirstLoginFlag());
            return outDto;
        }

        return null;
    }
}
