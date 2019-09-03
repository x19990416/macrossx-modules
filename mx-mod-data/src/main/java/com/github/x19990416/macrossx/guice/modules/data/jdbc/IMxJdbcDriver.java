/*
 * Copyright (C) 2019 The mx-mod-data Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.x19990416.macrossx.guice.modules.data.jdbc;

import java.sql.SQLException;
import java.util.List;
import com.github.x19990416.macrossx.guice.modules.data.Page;

public interface IMxJdbcDriver {
  
  public <T> List<T> find(String sql,Object[] values,Class<T> clazz)  throws SQLException;
  
  public <T> Page<T> find(String sql,Object[] values,int pageSize,int pageNum,Class<T> clazz) throws SQLException;
  
  public  int saveOrUpdate(String sql,String ...values) throws SQLException;

}
