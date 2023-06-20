package org.acme.quarkussocial.domain.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.quarkussocial.domain.model.Post;
import org.jboss.logging.annotations.Pos;

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {


}
