package com.maylbus.collectives.cleanarchitecturelogin.login.model

import com.maylbus.collectives.cleanarchitecturelogin.model.BaseForm

internal data class LoginState(
    override val email: String = "",
    override val password: String = "",
    val isValidating: Boolean = false
) : BaseForm(email, password) {

    val loginIsEnabled: Boolean
        get() = this.email.isNotEmpty() && this.password.isNotEmpty()
}