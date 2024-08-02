package site.lawmate.lawyer.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import site.lawmate.lawyer.domain.model.Lawyer;
import site.lawmate.lawyer.domain.model.LawyerDetail;


@Repository
public interface LawyerRepository extends ReactiveMongoRepository<Lawyer, String> {

    Flux<Lawyer> findByName(String name);
    Mono<Lawyer> findByEmail(String email);
    Mono<Lawyer> findByDetail(LawyerDetail detail);

    Flux<Lawyer> findByDetail();
}
