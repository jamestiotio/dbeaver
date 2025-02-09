/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2023 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ext.oracle.model;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.access.DBAPrivilege;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.model.meta.Property;

import java.sql.ResultSet;

/**
 * OraclePrivRole
 */
public abstract class OraclePriv extends OracleObject<OracleGrantee> implements DBAPrivilege {
    private boolean adminOption;

    public OraclePriv(OracleGrantee user, String name, ResultSet resultSet) {
        super(user, name, true);
        this.adminOption = JDBCUtils.safeGetBoolean(resultSet, "ADMIN_OPTION", OracleConstants.RESULT_YES_VALUE);
    }

    @NotNull
    @Override
    public String getName() {
        return super.getName();
    }

    @Property(viewable = true, order = 3)
    public boolean isAdminOption()
    {
        return adminOption;
    }

}
