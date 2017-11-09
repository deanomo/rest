/*
 * Copyright 2016 the original author or authors.
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
package com.navis.app;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
//@ContextConfiguration(locations={"/applicationContext.xml"})
public class ControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAName() throws Exception {
        this.mockMvc.perform(get("/name")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void getAPerson() throws Exception {
        this.mockMvc.perform(get("/person"))
                .andDo(print()).andExpect(status().isOk());
//                .andExpect(jsonPath("$.content").value("Hello, test!"));
    }

    @Test
    public void postAPerson() throws Exception {
        this.mockMvc.perform(post("/person")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"id\":\"5555\", " +
                        "\"name\":{\"given\":[\"dean\", \"huck\"], \"last\":\"burson\"}," +
                        "\"address\":{\"street\":\"1325 27th avenue\", \"city\":\"San Francisco\", \"state\":\"CA\", \"zip\":\"94122\"}," +
                        "\"birthday\":\"11-04-2017\"}"))
                .andDo(print())
                .andExpect(status().isOk());

//        this.mockMvc.perform(get("/person").param("id", "1234"))
//                .andDo(print()).andExpect(status().isOk())
//                .andExpect(jsonPath("$.color").value("Blue"));
    }

}