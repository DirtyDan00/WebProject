package vella.j.PokeDexCreator;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StatsJpaRepository extends JpaRepository<AblilityObj, String> {

}
