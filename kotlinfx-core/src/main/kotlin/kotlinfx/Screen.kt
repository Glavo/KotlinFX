package kotlinfx

typealias Screen = javafx.stage.Screen

val primaryScreen: Screen
    inline get() = Screen.getPrimary()