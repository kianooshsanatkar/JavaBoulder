package com.enterpriseframework.core.domain;

import java.util.UUID;


public abstract class BaseEntity implements IBaseEntity {

    private UUID _entityId;

    public UUID get_entityId() {
        return _entityId;
    }

    public void set_entityId(UUID _entityId) {
        this._entityId = _entityId;
    }

}