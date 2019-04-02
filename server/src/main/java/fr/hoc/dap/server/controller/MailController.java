package fr.hoc.dap.server.controller;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.hoc.dap.server.service.GMailService;

/** . */
@RestController
public class MailController {
    /** Acces to Gmail API. */
    @Autowired
    private GMailService gs;

    /**
     * @return .
     * @param userKey .
     * @param role    .
     * @throws GeneralSecurityException .
     * @throws IOException              .
     * @throws NumberFormatException    .
     */
    @RequestMapping("/email/nbunread")
    public String index(@RequestParam(name = "userKey") final String userKey)
            throws NumberFormatException, IOException, GeneralSecurityException {
        return "Number of unread emails " + gs.getNumberUnreadEmails(userKey);
    }
}
