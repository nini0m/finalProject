package org.example.tests;

import org.example.BaseTest;
import org.example.pages.ChatPage;
import org.testng.Assert;
import org.testng.annotations.Test;


//test chat functionality: opens chat, sends a message,
//checks if the name input field is visible after sending
public class ChatTest extends BaseTest {

    @Test
    public void sendingMessageInChat() {
        ChatPage chatPage = new ChatPage(driver);

        chatPage.openChat();

        chatPage.typeMessage("hello");

        chatPage.clickSendArrow();

        chatPage.waitForNameField();

        Assert.assertTrue(chatPage.isNameFieldVisible(), "Name field should be visible");
    }

}
