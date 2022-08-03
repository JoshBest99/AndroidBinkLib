package com.bink.binklibrary

import android.content.Context
import androidx.appcompat.app.AlertDialog

class DialogFactory {

    fun showDialog(
        context: Context,
        title: String? = null,
        message: String? = null,
        positiveBtn: String? = null,
        negativeBtn: String? = null,
        cancelable: Boolean = false,
        positiveCallback: () -> Unit = {},
        negativeCallback: () -> Unit = {},
    ) {
        val builder = AlertDialog.Builder(context)
        builder.apply {
            setTitle(title)
            setMessage(message)
            setPositiveButton(positiveBtn) { _, _ ->
                positiveCallback()
            }
            setNegativeButton(negativeBtn) { _, _ ->
                negativeCallback()
            }
            setCancelable(cancelable)
            create()
        }
        builder.show()
    }

}