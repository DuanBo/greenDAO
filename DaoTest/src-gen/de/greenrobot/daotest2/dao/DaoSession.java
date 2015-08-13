package de.greenrobot.daotest2.dao;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.database.Database;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import de.greenrobot.daotest2.KeepEntity;
import de.greenrobot.daotest2.ToManyTarget2;
import de.greenrobot.daotest2.to1_specialentity.ToOneTarget2;
import de.greenrobot.daotest2.specialentity.RelationSource2;

import de.greenrobot.daotest2.dao.KeepEntityDao;
import de.greenrobot.daotest2.dao.ToManyTarget2Dao;
import de.greenrobot.daotest2.to1_specialdao.ToOneTarget2Dao;
import de.greenrobot.daotest2.specialdao.RelationSource2Dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig keepEntityDaoConfig;
    private final DaoConfig toManyTarget2DaoConfig;
    private final DaoConfig toOneTarget2DaoConfig;
    private final DaoConfig relationSource2DaoConfig;

    private final KeepEntityDao keepEntityDao;
    private final ToManyTarget2Dao toManyTarget2Dao;
    private final ToOneTarget2Dao toOneTarget2Dao;
    private final RelationSource2Dao relationSource2Dao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        keepEntityDaoConfig = daoConfigMap.get(KeepEntityDao.class).clone();
        keepEntityDaoConfig.initIdentityScope(type);

        toManyTarget2DaoConfig = daoConfigMap.get(ToManyTarget2Dao.class).clone();
        toManyTarget2DaoConfig.initIdentityScope(type);

        toOneTarget2DaoConfig = daoConfigMap.get(ToOneTarget2Dao.class).clone();
        toOneTarget2DaoConfig.initIdentityScope(type);

        relationSource2DaoConfig = daoConfigMap.get(RelationSource2Dao.class).clone();
        relationSource2DaoConfig.initIdentityScope(type);

        keepEntityDao = new KeepEntityDao(keepEntityDaoConfig, this);
        toManyTarget2Dao = new ToManyTarget2Dao(toManyTarget2DaoConfig, this);
        toOneTarget2Dao = new ToOneTarget2Dao(toOneTarget2DaoConfig, this);
        relationSource2Dao = new RelationSource2Dao(relationSource2DaoConfig, this);

        registerDao(KeepEntity.class, keepEntityDao);
        registerDao(ToManyTarget2.class, toManyTarget2Dao);
        registerDao(ToOneTarget2.class, toOneTarget2Dao);
        registerDao(RelationSource2.class, relationSource2Dao);
    }
    
    public void clear() {
        keepEntityDaoConfig.getIdentityScope().clear();
        toManyTarget2DaoConfig.getIdentityScope().clear();
        toOneTarget2DaoConfig.getIdentityScope().clear();
        relationSource2DaoConfig.getIdentityScope().clear();
    }

    public KeepEntityDao getKeepEntityDao() {
        return keepEntityDao;
    }

    public ToManyTarget2Dao getToManyTarget2Dao() {
        return toManyTarget2Dao;
    }

    public ToOneTarget2Dao getToOneTarget2Dao() {
        return toOneTarget2Dao;
    }

    public RelationSource2Dao getRelationSource2Dao() {
        return relationSource2Dao;
    }

}
