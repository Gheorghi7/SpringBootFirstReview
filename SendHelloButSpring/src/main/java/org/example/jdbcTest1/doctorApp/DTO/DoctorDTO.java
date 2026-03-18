package org.example.jdbcTest1.doctorApp.DTO;

public record DoctorDTO(String doctorName, long doctorIdentityCode,
                        int limit, int offset) {}
