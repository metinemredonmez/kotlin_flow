package com.metinemre.flowcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class myViewModel :ViewModel() {

    val countDownTimerFlow =  flow<Int> {
        val countDownfrom = 10
        var counter = countDownfrom
        // emit ı olalaım ve yayalım !
        emit(countDownfrom)

        while (counter > 0 ) {
            delay(1000)
            counter--
            emit(counter)
        }
    }


    }



