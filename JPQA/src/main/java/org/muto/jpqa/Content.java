/*
 * Copyright 2015 murat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.muto.jpqa;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * This is the basic class for JPQA.
 * Everything is a content e.g: Posts, Comments, Questions, Answers
 * This types are extendable
 * @author murat
 */
public abstract class Content {
    /*
    * ID and parent Id, may be a child content like comments 
    */
    @NotNull
    private Long id;
    private Long parentId;
    /*
    * Content Fields
    */
    @NotNull
    private String content;
    private String title;
    private String excerpt;    
    /*
    * Date Fields related to data manipulation and publish
    */
    private Date createdAt;    
    private Date updatedAt;    
    private Date activatedAt;    
    /*
    * name is a url freindly string generated from title
    * type is content type like comment or post
    * status is for active-passive or other cases
    */
    @Size (min=1, max=256)
    private String name;
    @Size (min=1, max=16)
    private String type;
    @Size (min=1, max=16)
    private String status;
}
