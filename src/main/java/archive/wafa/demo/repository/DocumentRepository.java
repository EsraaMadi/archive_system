package archive.wafa.demo.repository;

import archive.wafa.demo.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DocumentRepository extends JpaRepository <Document, Long> {

}
