/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package ai.djl.ndarray.index.full;

import ai.djl.ndarray.NDArray;
import ai.djl.ndarray.index.NDIndex;

/** A simplified representation of a pick-based {@link NDIndex}. */
public class NDIndexFullPick {

    private NDArray indices;
    private int axis;

    /**
     * Constructs a new {@link NDIndexFullPick}.
     *
     * @param indices the indices to pick
     * @param axis the axis to pick at
     */
    public NDIndexFullPick(NDArray indices, int axis) {
        this.indices = indices;
        this.axis = axis;
    }

    /**
     * Returns the indices to pick.
     *
     * @return the indices to pick
     */
    public NDArray getIndices() {
        return indices;
    }

    /**
     * Returns the axis to pick.
     *
     * @return the axis to pick
     */
    public int getAxis() {
        return axis;
    }
}
