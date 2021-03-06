package com.cglean.infrastructure.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Cost {
	LocalDate start;
	LocalDate end;
	String total;
	String application;
	String platform;
	String cpu;
	String memory;
	String disk;
}
