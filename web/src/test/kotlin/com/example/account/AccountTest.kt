package com.example.account

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

/**
 * Created by wonwoo on 2016. 10. 27..
 */

@DataJpaTest
class AccountTest(private val accountRepository: AccountRepository) {
    

    @Test
    fun newAccountHasNameAndPassword() {
        val account = Account("wonwoo", "pass123")
        val saved = this.accountRepository.save(account)
        assertThat(saved.name).isEqualTo("wonwoo")
        assertThat(saved.passwd).isEqualTo("pass123")
    }
}