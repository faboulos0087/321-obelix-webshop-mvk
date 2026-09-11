package ch.bbw.obelix.quarry.Repository;

import ch.bbw.obelix.webshop.entity.MenhirEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

package ch.bbw.obelix.quarry.entity;

@Repository
public interface MenhirRepository extends JpaRepository<MenhirEntity, UUID> {

	List<MenhirEntity> findByStoneTypeContainingIgnoreCase(String stoneType);

	List<MenhirEntity> findMenhirByDecorativeness(MenhirEntity.Decorativeness decorativeness);

}
