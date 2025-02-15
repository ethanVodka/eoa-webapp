package com.eoa.webapp.ea.dac.condition;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Data
@Accessors(chain = true)
public class SelectByConditionForUserDetailCondition {
    /**
     * ユーザーコード.
     * */
    private String userCode;
}
