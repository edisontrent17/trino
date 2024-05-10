/*
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
package io.trino.plugin.jdbc;

import org.junit.jupiter.api.Test;

import static io.trino.plugin.jdbc.H2QueryRunner.createH2QueryRunner;
import static io.trino.testing.ThreadAssertions.assertNoThreadLeakedInQueryRunner;
import static io.trino.tpch.TpchTable.REGION;

public class TestJdbcQueryRunner
{
    @Test
    public void testNoThreadLeaked()
            throws Exception
    {
        assertNoThreadLeakedInQueryRunner(
                () -> createH2QueryRunner(REGION),
                queryRunner -> queryRunner.execute("TABLE region"));
    }
}