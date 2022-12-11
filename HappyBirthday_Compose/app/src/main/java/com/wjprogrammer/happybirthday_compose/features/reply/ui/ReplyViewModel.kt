package com.wjprogrammer.happybirthday_compose.features.reply.ui

import androidx.lifecycle.ViewModel
import com.wjprogrammer.happybirthday_compose.features.reply.data.Email
import com.wjprogrammer.happybirthday_compose.features.reply.data.MailboxType
import com.wjprogrammer.happybirthday_compose.features.reply.data.local.LocalEmailsDataProvider
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

/**
 * View Model for Reply app
 */
class ReplyViewModel : ViewModel() {

    /** UI state exposed to the UI **/
    private val _uiState = MutableStateFlow(ReplyUiState())
    val uiState: StateFlow<ReplyUiState> = _uiState

    init {
        initializeUIState()
    }

    /**
     * Initializing mailbox emails by getting them from [LocalEmailsDataProvider]
     */
    private fun initializeUIState() {
        var mailboxes: Map<MailboxType, List<Email>> =
            LocalEmailsDataProvider.allEmails.groupBy { it.mailbox }
        _uiState.value =
            ReplyUiState(
                mailboxes = mailboxes,
                currentSelectedEmail = mailboxes[MailboxType.Inbox]?.get(0)
                    ?: LocalEmailsDataProvider.defaultEmail
            )
    }

    /**
     * Update [currentSelectedEmail] state
     * and [isShowingHomepage] to false
     */
    fun updateDetailsScreenStates(email: Email) {
        _uiState.update {
            it.copy(
                currentSelectedEmail = email,
                isShowingHomepage = false
            )
        }
    }

    /**
     * Reset [currentSelectedEmail] state to first email
     * and [isShowingHomepage] to true
     */
    fun resetHomeScreenStates() {
        _uiState.update {
            it.copy(
                currentSelectedEmail = it.mailboxes[it.currentMailbox]?.get(0)
                    ?: LocalEmailsDataProvider.defaultEmail,
                isShowingHomepage = true
            )
        }
    }

    /**
     * Update [currentMailbox]
     */
    fun updateCurrentMailbox(mailboxType: MailboxType) {
        _uiState.update {
            it.copy(
                currentMailbox = mailboxType
            )
        }
    }
}
