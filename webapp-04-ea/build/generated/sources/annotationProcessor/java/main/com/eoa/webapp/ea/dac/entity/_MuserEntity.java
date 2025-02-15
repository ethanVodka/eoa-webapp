package com.eoa.webapp.ea.dac.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.56.0" }, date = "2025-02-15T23:35:15.647+0900")
@org.seasar.doma.EntityTypeImplementation
public final class _MuserEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.eoa.webapp.ea.dac.entity.MuserEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.56.0");
    }

    private static final _MuserEntity __singleton = new _MuserEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_LOWER_CASE;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.eoa.webapp.ea.dac.entity.MuserEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __embeddedPropertyTypeMap;

    private _MuserEntity() {
        __listenerSupplier = org.seasar.doma.internal.jdbc.entity.NullEntityListenerSuppliers.of();
        __immutable = false;
        __name = "MuserEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __list = new java.util.ArrayList<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __map = new java.util.LinkedHashMap<>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __embeddedMap = new java.util.LinkedHashMap<>(6);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __embeddedMap) {
        __map.put("userCode", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, java.lang.String, java.lang.String>(com.eoa.webapp.ea.dac.entity.MuserEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "userCode", "", __namingType, true, true, false));
        __map.put("userName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, java.lang.String, java.lang.String>(com.eoa.webapp.ea.dac.entity.MuserEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "userName", "", __namingType, true, true, false));
        __map.put("loginPassword", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, java.lang.String, java.lang.String>(com.eoa.webapp.ea.dac.entity.MuserEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "loginPassword", "", __namingType, true, true, false));
        __map.put("userAccountLockFlag", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, java.lang.String, java.lang.String>(com.eoa.webapp.ea.dac.entity.MuserEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "userAccountLockFlag", "", __namingType, true, true, false));
        __map.put("firstLoginFlag", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, java.lang.String, java.lang.String>(com.eoa.webapp.ea.dac.entity.MuserEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofString(), "firstLoginFlag", "", __namingType, true, true, false));
        __map.put("loginFailureCount", new org.seasar.doma.jdbc.entity.DefaultPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, java.math.BigDecimal, java.math.BigDecimal>(com.eoa.webapp.ea.dac.entity.MuserEntity.class, org.seasar.doma.internal.jdbc.scalar.BasicScalarSuppliers.ofBigDecimal(), "loginFailureCount", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __idList) {
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    @Deprecated
    public String getTableName() {
        return getTableName(org.seasar.doma.internal.jdbc.entity.TableNames.namingFunction);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.eoa.webapp.ea.dac.entity.MuserEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.eoa.webapp.ea.dac.entity.MuserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.eoa.webapp.ea.dac.entity.MuserEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.eoa.webapp.ea.dac.entity.MuserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.eoa.webapp.ea.dac.entity.MuserEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.eoa.webapp.ea.dac.entity.MuserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.eoa.webapp.ea.dac.entity.MuserEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.eoa.webapp.ea.dac.entity.MuserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.eoa.webapp.ea.dac.entity.MuserEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.eoa.webapp.ea.dac.entity.MuserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.eoa.webapp.ea.dac.entity.MuserEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.eoa.webapp.ea.dac.entity.MuserEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.eoa.webapp.ea.dac.entity.MuserEntity, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public com.eoa.webapp.ea.dac.entity.MuserEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.eoa.webapp.ea.dac.entity.MuserEntity, ?>> __args) {
        com.eoa.webapp.ea.dac.entity.MuserEntity entity = new com.eoa.webapp.ea.dac.entity.MuserEntity();
        if (__args.get("userCode") != null) __args.get("userCode").save(entity);
        if (__args.get("userName") != null) __args.get("userName").save(entity);
        if (__args.get("loginPassword") != null) __args.get("loginPassword").save(entity);
        if (__args.get("userAccountLockFlag") != null) __args.get("userAccountLockFlag").save(entity);
        if (__args.get("firstLoginFlag") != null) __args.get("firstLoginFlag").save(entity);
        if (__args.get("loginFailureCount") != null) __args.get("loginFailureCount").save(entity);
        return entity;
    }

    @Override
    public Class<com.eoa.webapp.ea.dac.entity.MuserEntity> getEntityClass() {
        return com.eoa.webapp.ea.dac.entity.MuserEntity.class;
    }

    @Override
    public com.eoa.webapp.ea.dac.entity.MuserEntity getOriginalStates(com.eoa.webapp.ea.dac.entity.MuserEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.eoa.webapp.ea.dac.entity.MuserEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MuserEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MuserEntity newInstance() {
        return new _MuserEntity();
    }

}
