package ua.kpi.fict.chaban.linkservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kpi.fict.chaban.linkservice.entities.Link;
import ua.kpi.fict.chaban.linkservice.repositories.LinksRepo;

import javax.naming.NameAlreadyBoundException;
import java.time.Instant;

@Service
public class LinksServiceImpl implements LinksService {
    @Autowired
    private LinksRepo linksRepo;

    @Override
    public Link createLink(Link link) throws NameAlreadyBoundException {
        if (linksRepo.findLinkByCode(link.getCode()) != null){
            throw new NameAlreadyBoundException("This code is already taken");
        }
        if (link.getExpiresStamp() == null){
            link.setExpiresStamp(null);
        }
        link.setCreatedStamp(Instant.now());
        return linksRepo.save(link);
    }

    @Override
    public Iterable<Link> getUserLinks(Long userId) {
        return linksRepo.findLinksByUserId(userId);
    }

    @Override
    public Long deleteLink(Long linkId) {
        linksRepo.deleteById(linkId);
        return linkId;
    }

    @Override
    public Link updateLink(Link link, String newShortLink) throws NameAlreadyBoundException {
        if (linksRepo.findLinkByCode(newShortLink) != null){
            throw new NameAlreadyBoundException("This code is already taken");
        }
        link.setCode(newShortLink);
        return linksRepo.save(link);
    }

    @Override
    public Link updateLinkById(Long linkId, String newShortLink) throws NameAlreadyBoundException {
        Link link = linksRepo.findById(linkId).get();
        if (linksRepo.findLinkByCode(newShortLink) != null){
            throw new NameAlreadyBoundException("This code is already taken");
        }
        link.setCode(newShortLink);
        return linksRepo.save(link);
    }
}

