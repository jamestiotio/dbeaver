/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
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
package org.jkiss.dbeaver.ext.exasol.model.dict;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.DBPNamedObject;

public enum ExasolScriptResultType implements DBPNamedObject {

    TABLE("Table"),
    ROWCOUNT("Row Count"),
    RETURNS("Returns value"),
    EMITS("Emits Table");


    private String name;

    private ExasolScriptResultType(String name) {
        this.name = name;
    }

    @Override
    @NotNull
    public String toString() {
        return name;
    }


    @Override
    public String getName() {
        return name;
    }

}
