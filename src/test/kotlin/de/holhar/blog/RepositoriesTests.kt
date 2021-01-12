package de.holhar.blog

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
        val entityManager: TestEntityManager,
        val userRepository: UserRepository,
        val articleRepository: ArticleRepository) {

    @Test
    fun `When findByIdOrNull then return Article`() {
        val peter = User("springpeter", "Peter", "Lustig")
        entityManager.persist(peter)
        val article = Article("Alles ist so lustig", "Liebe Community...", "Lorem ipsum", peter)
        entityManager.persist(article)
        entityManager.flush()

        val found = articleRepository.findByIdOrNull(article.id!!)

        assertThat(found).isEqualTo(article)
    }

    @Test
    fun `When findByLogin then return User`() {
        val peter = User("spingpeter", "Peter", "Lustig")
        entityManager.persist(peter)
        entityManager.flush()

        val user = userRepository.findByLogin(peter.login)

        assertThat(user).isEqualTo(peter)
    }
}