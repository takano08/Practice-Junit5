package com.example.practiceJunit5;

import com.example.practiceJunit5.controller.DemoController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class DemoControllerTests {
    // Spring MVCのモック
    private MockMvc mockMvc;

    @BeforeEach
    void setup() {

        // Spring MVCのモックを設定する
        this.mockMvc = MockMvcBuilders.standaloneSetup(new DemoController()).build();
    }

    @Test
    void GETでアクセスする() throws Exception {

        // GETで「/」にアクセスする
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                // レスポンスのステータスコードが200であることを検証する
                .andExpect(status().isOk())
                // レスポンスボディが「Hello World」であることを検証する
                .andExpect(content().string("Hello World"));
    }

    @Test
    void POSTでアクセスする() throws Exception {

        // POSTで「/」にアクセスする
        mockMvc.perform(MockMvcRequestBuilders.post("/"))
                // レスポンスのステータスコードが405（METHOD_NOT_ALLOWED）であることを検証する
                .andExpect(status().isMethodNotAllowed());
    }
}
