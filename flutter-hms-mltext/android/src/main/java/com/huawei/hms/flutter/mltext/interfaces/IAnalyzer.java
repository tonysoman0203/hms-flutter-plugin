/*
 * Copyright 2021-2023. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.hms.flutter.mltext.interfaces;

/**
 * Common methods for analyzers
 *
 * @since 2021-11-17
 */
public interface IAnalyzer {
    /**
     * Checks if the analyzer is available.
     */
    void isAvailable();

    /**
     * Destroys the analyzer.
     */
    void destroy();

    /**
     * Stops the analyzer.
     */
    void stop();
}
