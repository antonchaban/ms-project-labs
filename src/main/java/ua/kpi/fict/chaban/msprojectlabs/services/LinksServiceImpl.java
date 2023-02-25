package ua.kpi.fict.chaban.msprojectlabs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.fict.chaban.msprojectlabs.repositories.LinksRepo;

@Service
public class LinksServiceImpl implements LinksService {
    @Autowired
    private LinksRepo linksRepo;
}

