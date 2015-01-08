/*
Copyright 2015 Joel Parrish

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
specific language governing permissions and limitations under the License.

Strategy:
After removing items under a certain threshold apply an average across existing items

Example:
[2,8,5,4,1,8,3,5,0,2]
Threshold = 3
Score = (8+5+4+8+5)/5
 */
package com.staticvillage.recommender.strategy;

public class AverageWithoutMiseryStrategy implements Strategy {

}