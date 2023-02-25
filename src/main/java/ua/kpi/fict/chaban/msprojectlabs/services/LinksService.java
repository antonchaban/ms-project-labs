package ua.kpi.fict.chaban.msprojectlabs.services;

import org.springframework.stereotype.Service;
import ua.kpi.fict.chaban.msprojectlabs.entities.Link;

import javax.naming.NameAlreadyBoundException;

@Service
public interface LinksService {
    public Link createLink(Link link) throws NameAlreadyBoundException;

    public Iterable<Link> getUserLinks(Long userId);

    public Long deleteLink(Long linkId);

    public Link updateLink(Link link, String newShortLink, String newLongLink) throws NameAlreadyBoundException;

    public Link updateLinkById(Long linkId, String newShortLink, String newLongLink) throws NameAlreadyBoundException;
}
