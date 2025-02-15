package com.eoa.webapp.ea.dac.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.56.0" }, date = "2025-02-15T23:35:15.718+0900")
@org.seasar.doma.DaoImplementation
public class MuserDaoImpl implements com.eoa.webapp.ea.dac.dao.MuserDao, org.seasar.doma.jdbc.ConfigProvider {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.56.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.DaoImplSupport.getDeclaredMethod(com.eoa.webapp.ea.dac.dao.MuserDao.class, "selectByConditionForUserDetail", com.eoa.webapp.ea.dac.condition.SelectByConditionForUserDetailCondition.class);

    private final org.seasar.doma.internal.jdbc.dao.DaoImplSupport __support;

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public MuserDaoImpl(org.seasar.doma.jdbc.Config config) {
        __support = new org.seasar.doma.internal.jdbc.dao.DaoImplSupport(config);
    }

    @Override
    public org.seasar.doma.jdbc.Config getConfig() {
        return __support.getConfig();
    }

    @Override
    public com.eoa.webapp.ea.dac.entity.MuserEntity selectByConditionForUserDetail(com.eoa.webapp.ea.dac.condition.SelectByConditionForUserDetailCondition condition) {
        __support.entering("com.eoa.webapp.ea.dac.dao.MuserDaoImpl", "selectByConditionForUserDetail", condition);
        try {
            if (condition == null) {
                throw new org.seasar.doma.DomaNullPointerException("condition");
            }
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = __support.getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__support.getConfig());
            __query.setSqlFilePath("META-INF/com/eoa/webapp/ea/dac/dao/MuserDao/selectByConditionForUserDetail.sql");
            __query.setEntityType(com.eoa.webapp.ea.dac.entity._MuserEntity.getSingletonInternal());
            __query.addParameter("condition", com.eoa.webapp.ea.dac.condition.SelectByConditionForUserDetailCondition.class, condition);
            __query.setCallerClassName("com.eoa.webapp.ea.dac.dao.MuserDaoImpl");
            __query.setCallerMethodName("selectByConditionForUserDetail");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<com.eoa.webapp.ea.dac.entity.MuserEntity> __command = __support.getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.eoa.webapp.ea.dac.entity.MuserEntity>(com.eoa.webapp.ea.dac.entity._MuserEntity.getSingletonInternal()));
            com.eoa.webapp.ea.dac.entity.MuserEntity __result = __command.execute();
            __query.complete();
            __support.exiting("com.eoa.webapp.ea.dac.dao.MuserDaoImpl", "selectByConditionForUserDetail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            __support.throwing("com.eoa.webapp.ea.dac.dao.MuserDaoImpl", "selectByConditionForUserDetail", __e);
            throw __e;
        }
    }

}
