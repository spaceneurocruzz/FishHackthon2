/*
 * Copyright (C) 2015 The Android Open Source Project
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

package com.support.android.designlibdemo;

import java.util.Random;

public class Cheeses {

    private static final Random RANDOM = new Random();

    public static int getRandomCheeseDrawable() {
        switch (RANDOM.nextInt(5)) {
            default:
            case 0:
                return R.drawable.cheese_1;
            case 1:
                return R.drawable.cheese_2;
            case 2:
                return R.drawable.cheese_3;
            case 3:
                return R.drawable.cheese_4;
            case 4:
                return R.drawable.cheese_5;
        }
    }

    public static final String[] sCheeseStrings = {
        "Brotula clarkae","Caranx caninus","Centropomus robalito","Coryphaena hippurus","Cynoscion albus","Cynoscion squamipinnis" +
        "Istiophorus platypterus","Kajikia audax","Lutjanus argentiventris","Makaira nigricans","Oncorhynchus mykiss","Oreochromis aureus" +
        "Pangasius hypophthalmus", "Scomberomorus sierra", "Sphyraena ensis","Thunnus albacares"

    };

}
