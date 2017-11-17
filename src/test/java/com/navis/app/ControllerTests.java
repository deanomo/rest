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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.navis.entities.CarrierVisit;
import com.navis.entities.ObjectWrapper;
import com.navis.entities.ObjectWrapperDeserializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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
    public void postSomeData() throws Exception {
        String payload = "[" + getTestOwMap() + "]";

        this.mockMvc.perform(post("/data")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .content(payload.getBytes("UTF-8")))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void testObjectWrapperDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWrapperDeserializer owd = new ObjectWrapperDeserializer();
        String jsonTestString = getTestOwMap();
        InputStream stream = new ByteArrayInputStream(jsonTestString.getBytes(StandardCharsets.UTF_8));
        JsonParser parser = mapper.getFactory().createParser(stream);
        DeserializationContext ctxt = mapper.getDeserializationContext();
        ObjectWrapper ow = owd.deserialize(parser, ctxt);
        assert(ow instanceof ObjectWrapper);
        assert(ow.getType().getName().equals("com.navis.entities.CarrierVisit"));
    }

    private String getTestOwMap() throws JsonProcessingException, ParseException {
        Map map = new HashMap();
        List<CarrierVisit> cvl = new ArrayList<>();
        cvl.add(createTestCV());
        map.put("type", "cvs");
        map.put("objects", cvl);
        return new ObjectMapper().writeValueAsString(map);
    }

    private CarrierVisit createTestCV() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        CarrierVisit cv = new CarrierVisit();
        cv.setCvId("ALE731C");
        cv.setCvCarrierMode("LocTypeEnum[VESSEL]");
        cv.setCvVisitNbr("0");
        cv.setCvVisitPhase("CarrierVisitPhaseEnum[70CLOSED]");
        cv.setCvATA(df.parse("2007-08-01 03:40:00.0"));
        cv.setCvATD(df.parse("2007-08-01 12:40:00.0"));
        cv.setCvCreated(df.parse("2017-11-02 09:30:11.041"));
        cv.setCvCreator("-system-");
        cv.setCvChanged(df.parse("2017-11-02 09:30:12.49"));
        cv.setCvChanger("-system-");
        cv.setCvGkey("1");
        return cv;
    }
}
