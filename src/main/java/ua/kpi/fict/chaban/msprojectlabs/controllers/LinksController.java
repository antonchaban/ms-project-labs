package ua.kpi.fict.chaban.msprojectlabs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ua.kpi.fict.chaban.msprojectlabs.services.LinksServiceImpl;

@RestController
public class LinksController {
    @Autowired
    private LinksServiceImpl linksService;
}
