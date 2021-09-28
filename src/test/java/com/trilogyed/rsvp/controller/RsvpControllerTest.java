package com.trilogyed.rsvp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trilogyed.rsvp.dao.RsvpDao;
import com.trilogyed.rsvp.model.Rsvp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(RsvpController.class)
public class RsvpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    RsvpDao dao;

    private ObjectMapper mapper = new ObjectMapper();

    private Rsvp daoRsvp;

    private String daoJson;
    private List<Rsvp> allRsvps = new ArrayList<>();
    private String allRsvpsJson;

    @Before
    public void setUp() throws Exception {
        daoRsvp = new Rsvp();

        daoRsvp.setId(34);
        daoRsvp.setGuestName("Amal");
        daoRsvp.setTotalAttending(297);

        daoJson = mapper.writeValueAsString(daoRsvp);

        Rsvp rsvp = new Rsvp();
        rsvp.setId(45);
        rsvp.setGuestName("Nargiza");
        rsvp.setTotalAttending(22);

        allRsvps.add(daoRsvp);
        allRsvps.add(rsvp);

        allRsvpsJson = mapper.writeValueAsString(allRsvps);
    }

    @Test
    public void shouldReturnAllRsvps() throws Exception {
//        when(dao.getAllRsvps()).thenReturn(allRsvps);
//
//        mockMvc.perform(get("/rsvps"))
//                .andExpect(status().isOk())
//                .andExpect(content().json(allRsvpsJson)
//                );

    }
}