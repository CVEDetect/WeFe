/**
 * Copyright 2021 Tianmian Tech. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.welab.wefe.board.service.service.modelexport;

/**
 * haskell language
 *
 * @author aaron.li
 **/
public class LogisticRegressionHaskellLanguage extends BaseLogisticRegressionLanguage {

    @Override
    protected String generatePreMethodSignNameCode() {
        StringBuilder preMethodCode = new StringBuilder();
        preMethodCode.append("module Model where")
                .append("\n")
                .append("score :: [Double] -> Double")
                .append("\n")
                .append("score input =")
                .append("\n")
                .append(INDENTATION_UNIT_CHAR)
                .append(METHOD_BODY_PLACEHOLDER);

        return preMethodCode.toString();
    }

    @Override
    protected String generateCompareVarName(int index) {
        return "(input) !! (" + index + ")";
    }

    @Override
    protected String lineEndSymbol() {
        return "";
    }

    @Override
    protected String generateReturnChar() {
        return "";
    }
}
