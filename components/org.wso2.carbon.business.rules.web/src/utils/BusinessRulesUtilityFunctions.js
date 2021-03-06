/*
 *  Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

class BusinessRulesUtilityFunctions {
    /**
     * Generates UUID for a given Business Rule name
     *
     * @param businessRuleName
     * @returns {string}
     */
    static generateBusinessRuleUUID(businessRuleName) {
        return businessRuleName.toLowerCase().split(' ').join('-')
    }

    /**
     * Checks whether a given object is empty or not
     *
     * @param object
     * @returns {boolean}
     */
    static isEmpty(object) {
        for (let key in object) {
            if (object.hasOwnProperty(key))
                return false;
        }
        return true;
    }

    static generateguid () {
        function s4() {
            return Math.floor((1 + Math.random()) * 0x10000)
                .toString(16)
                .substring(1);
        }

        return s4() + s4() + '-' + s4() + '-' + s4() + '-' +
            s4() + '-' + s4() + s4() + s4();
    }
}

export default BusinessRulesUtilityFunctions;
