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

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlin.reflect.KClass

/**
 * Created on   : 21/01/17
 * Author       : muhrifqii
 * Name         : Muhammad Rifqi Fatchurrahman Putra Danar
 * Github       : https://github.com/muhrifqii
 * LinkedIn     : https://linkedin.com/in/muhrifqii
 */

fun Context.intentToClass(clazz: KClass<*>) = Intent(this, clazz.java)

fun Context.intentAppInfo() = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
    .addCategory(Intent.CATEGORY_DEFAULT)
    .setData(Uri.parse("package:%s".format(this.applicationContext.packageName)))

fun Context.inflateLayout(@LayoutRes layoutResId: Int, parent: ViewGroup, attachToRoot: Boolean): View {
  return LayoutInflater.from(this).inflate(layoutResId, parent, attachToRoot)
}