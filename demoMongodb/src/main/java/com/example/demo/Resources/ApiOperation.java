package com.example.demo.Resources;

import org.springframework.data.mongodb.core.aggregation.StringOperators.Concat;

public @interface ApiOperation {

	String value();

	String notes();

	Class<Concat> response();

}
