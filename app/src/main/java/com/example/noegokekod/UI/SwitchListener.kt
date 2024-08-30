package com.example.noegokekod.UI

interface SwitchListener {
    fun onSwitchEgoValueChanged(isChecked: Boolean)
    fun onHappinessSwitchValueChanged(isChecked: Boolean)
    fun onOptimismSwitchValueChanged(isChecked: Boolean)
    fun onGivingSwitchValueChanged(isChecked: Boolean)
    fun onRespectSwitchValueChanged(isChecked: Boolean)
    fun onKindnessSwitchValueChanged(isChecked: Boolean)
}