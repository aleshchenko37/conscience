package ru.petrojectgroup.conscience.storage.post;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.petrojectgroup.conscience.model.post.Post;

import java.util.Collection;
import java.util.NoSuchElementException;

public interface PostStorage extends JpaRepository<Post, Long> {
    Collection<Post> findAllByUser_id(long id);

    default Post existingCheck(long id) {
        return findById(id)
                .orElseThrow(() -> new NoSuchElementException("Пост " + id + " не найден"));
    }
    // TODO: разнести метод на два, один для проверки, другой для возврата значения из БД.
    //  Использовать стандартный метод JPA репозитория existsById(). Аналогично для UserStorage
}
