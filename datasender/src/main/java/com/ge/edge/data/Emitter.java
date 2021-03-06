/********************************************************************************
 * Copyright (c) 2015-2017 GE Digital. All rights reserved.                     *
 *                                                                              *
 * The copyright to the computer software herein is the property of GE Digital. *
 * The software may be used and/or copied only with the written permission of   *
 * GE Digital or in accordance with the terms and conditions stipulated in the  *
 * agreement/contract under which the software has been supplied.               *
 ********************************************************************************/

package com.ge.edge.data;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Emitter implements IDataGenerator {

    ExecutorService executor = Executors.newFixedThreadPool(10);

    @Override
    public void generateData() {

    }
}
