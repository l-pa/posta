package org.vsb.project.post.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vsb.project.post.entities.Packet;

/**
 * @author Lukas Papik 17.11.2021
 */

@Service
@Transactional
@Repository
public class PacketRepository {

    @Autowired
    private Packet packet;
}
