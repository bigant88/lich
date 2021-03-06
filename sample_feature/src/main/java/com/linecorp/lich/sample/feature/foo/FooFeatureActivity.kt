/*
 * Copyright 2019 LINE Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linecorp.lich.sample.feature.foo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import com.linecorp.lich.sample.feature.R
import com.linecorp.lich.sample.feature.viewmodel.SampleFeatureViewModel
import com.linecorp.lich.viewmodel.viewModel

class FooFeatureActivity : AppCompatActivity() {

    private val sampleFeatureViewModel by viewModel(SampleFeatureViewModel)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.foo_feature_activity)

        val messageView: TextView = findViewById(R.id.feature_message)
        sampleFeatureViewModel.message.observe(this) {
            messageView.text = it
        }
    }
}
