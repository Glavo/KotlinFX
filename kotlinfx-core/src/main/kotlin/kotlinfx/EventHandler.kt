@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.event.Event
import javafx.event.EventHandler
import javafx.event.WeakEventHandler

inline fun <T : Event> EventHandler<T>.getWeakHandler(): WeakEventHandler<T> = WeakEventHandler(this)