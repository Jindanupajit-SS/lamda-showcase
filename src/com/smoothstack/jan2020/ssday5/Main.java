package com.smoothstack.jan2020.ssday5;

import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n[Sort by Length Asc]");
        List<String> sortedByLengthAsc = StringUtils.generateListOfString();
        sortedByLengthAsc.sort(Comparator.comparingInt(String::length));
        sortedByLengthAsc.iterator().forEachRemaining(System.out::println);

        System.out.println("\n\n[Sort by Length Desc]");
        List<String> sortedByLengthDesc = StringUtils.generateListOfString();
        sortedByLengthDesc.sort(Comparator.comparingInt(String::length).reversed());
        sortedByLengthDesc.iterator().forEachRemaining(System.out::println);

        System.out.println("\n\n[Sort by First Char]");
        List<String> sortedByFirstChar = StringUtils.generateListOfString();
        sortedByFirstChar.sort(Comparator.comparing(s-> s.charAt(0)));
        sortedByFirstChar.iterator().forEachRemaining(System.out::println);

        System.out.println("\n\n[Sort by Containing 'e']");
        List<String> sortedByContainingE = StringUtils.generateListOfString();
        sortedByContainingE.sort(Comparator.comparing(s-> !s.toLowerCase().contains("e")));
        sortedByContainingE.iterator().forEachRemaining(System.out::println);

        System.out.println("\n\n[Sort by Containing 'e' using Util]");
        List<String> sortedByContainingEUsingUtil = StringUtils.generateListOfString();
        sortedByContainingEUsingUtil.sort( (s1,s2)->StringUtils.sortedByContainingE(s1,s2));
        sortedByContainingEUsingUtil.iterator().forEachRemaining(System.out::println);

        System.out.println("\n\n[Lowercase 'a' & three letters ]");
        List<String> findContainingAAndThreeLetter = StringUtils.generateListOfString();
        findContainingAAndThreeLetter.stream().filter(s->s.matches("^a.{2}$"))
            .iterator().forEachRemaining(System.out::println);



    }
}
