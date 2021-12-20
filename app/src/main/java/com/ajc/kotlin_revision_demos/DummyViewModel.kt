package com.ajc.kotlin_revision_demos

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DummyViewModel : ViewModel(){

    fun getResponseFromAPI() {
        viewModelScope.launch {

        }
    }
}