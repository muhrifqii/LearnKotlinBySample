/*
 *    Copyright 2017 Muhammad Rifqi Fatchurrahman Putra Danar
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.muhrifqii.maos.libs.extensions

import com.trello.rxlifecycle2.android.ActivityEvent
import io.github.muhrifqii.maos.libs.ActivityViewModel
import io.github.muhrifqii.maos.libs.FragmentViewModel
import io.github.muhrifqii.maos.libs.LifecycleType
import io.github.muhrifqii.maos.libs.LifecycleActivityType
import io.github.muhrifqii.maos.libs.LifecycleFragmentType
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.functions.Function

/**
 * Created on   : 24/01/17
 * Author       : muhrifqii
 * Name         : Muhammad Rifqi Fatchurrahman Putra Danar
 * Github       : https://github.com/muhrifqii
 * LinkedIn     : https://linkedin.com/in/muhrifqii
 *
 * Beside extension from rxLifecycle, we create more extension for viewmodel
 */

// These transformer are for ActivityViewModel
fun <T> Observable<T>.bindToLifecycle(provider: ActivityViewModel<LifecycleActivityType>) =
    this.compose<T>(provider.bindToLifecycle())

fun <T> Flowable<T>.bindToLifecycle(provider: ActivityViewModel<LifecycleActivityType>) =
    this.compose<T>(provider.bindToLifecycle())

fun <T> Single<T>.bindToLifecycle(provider: ActivityViewModel<LifecycleActivityType>) =
    this.compose<T>(provider.bindToLifecycle())

fun <T> Maybe<T>.bindToLifecycle(provider: ActivityViewModel<LifecycleActivityType>) =
    this.compose<T>(provider.bindToLifecycle())

fun Completable.bindToLifecycle(provider: ActivityViewModel<LifecycleActivityType>) =
    this.compose(provider.bindToLifecycle<Completable>())

// These transformer are for FragmentViewModel
fun <T> Observable<T>.bindToLifecycle(provider: FragmentViewModel<LifecycleFragmentType>) =
    this.compose<T>(provider.bindToLifecycle())

fun <T> Flowable<T>.bindToLifecycle(provider: FragmentViewModel<LifecycleFragmentType>) =
    this.compose<T>(provider.bindToLifecycle())

fun <T> Single<T>.bindToLifecycle(provider: FragmentViewModel<LifecycleFragmentType>) =
    this.compose<T>(provider.bindToLifecycle())

fun <T> Maybe<T>.bindToLifecycle(provider: FragmentViewModel<LifecycleFragmentType>) =
    this.compose<T>(provider.bindToLifecycle())

fun Completable.bindToLifecycle(provider: FragmentViewModel<LifecycleFragmentType>) =
    this.compose(provider.bindToLifecycle<Completable>())
