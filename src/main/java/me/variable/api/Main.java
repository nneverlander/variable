/*
 * Copyright (c) 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not  use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package me.variable.api;

import com.google.api.server.spi.config.ApiMethod;

public class Main extends Base {

    @ApiMethod(
            httpMethod = ApiMethod.HttpMethod.GET,
            path = "main"
    )
    public Response getMain() {

        return getStatus(1);
    }

    private Response getStatus(int n) {
        StringBuilder sb = new StringBuilder();
        if (n >= 1) {
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append("up");
            }
        }
        return new Response(sb.toString());
    }

    private static class Response {

        String response;

        private Response(String response) {
            this.response = response;
        }
    }

}
