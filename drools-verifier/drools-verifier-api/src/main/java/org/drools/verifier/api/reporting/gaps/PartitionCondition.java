/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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
package org.drools.verifier.api.reporting.gaps;

public class PartitionCondition {

    private String factType;
    private String fieldName;
    private Object value;

    public PartitionCondition() {

    }

    public PartitionCondition(final String factType,
                              final String fieldName,
                              final Object value) {
        this.factType = factType;
        this.fieldName = fieldName;
        this.value = value;
    }

    public String getFactType() {
        return factType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getValue() {
        return value;
    }
}
