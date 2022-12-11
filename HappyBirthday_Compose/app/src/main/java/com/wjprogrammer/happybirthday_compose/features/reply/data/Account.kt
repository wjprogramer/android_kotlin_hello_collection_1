package com.wjprogrammer.happybirthday_compose.features.reply.data

import androidx.annotation.DrawableRes

/**
 * A class which represents an account
 */
data class Account(
    /** Unique ID of a user **/
    val id: Int,
    /** User's first name **/
    val firstName: String,
    /** User's last name **/
    val lastName: String,
    /** User's email address **/
    val email: String,
    /** User's avatar image resource id **/
    @DrawableRes val avatar: Int
) {
    /** User's full name **/
    val fullName: String = "$firstName $lastName"
}
