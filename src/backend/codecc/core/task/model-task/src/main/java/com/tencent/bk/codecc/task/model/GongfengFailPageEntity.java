/*
 * Tencent is pleased to support the open source community by making BlueKing available.
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 * Licensed under the MIT License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * http://opensource.org/licenses/MIT
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tencent.bk.codecc.task.model;

import com.tencent.codecc.common.db.CommonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * 工蜂处理失败页面记录
 *
 * @version V1.0
 * @date 2019/10/15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "t_gongfeng_fail_page")
public class GongfengFailPageEntity extends CommonEntity
{
    @Field("page_num")
    private Integer pageNum;

    @Field("proj_id_list")
    private List<Integer> projIdList;

    @Field("fail_step")
    private String failStep;

    @Field("err_message")
    private String errMessage;

    @Field("err_stack")
    private String errStack;
}
