package by.bsuir.service.core.base;

import java.util.Optional;

public interface FindOptionalOperationService<T> {

    Optional<T> findById(Long id);
}
