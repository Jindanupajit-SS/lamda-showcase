package com.smoothstack.jan2020.ssday5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class StringUtils {

    public static List<String> generateListOfString() {

        return new ArrayList<>(
                Arrays.asList(
                "Somer Simkins",
                "Kristal Kleinschmidt",
                "Pandora Portalatin",
                "Shantelle Sugg",
                "Jaquelyn Johanson",
                "Desiree Dilday",
                "Zena Zachery",
                "Travis Tillson",
                "Luanna Leopold",
                "Carolina Clear",
                "Hollis Hoffmeister",
                "Krysten Kin",
                "Sanford Scarpa",
                "Alina Aldinger",
                "Ilana Ingerson",
                "Ardell Alcantara",
                "Nickole Negley",
                "Tawanna Tarbell",
                "Berta Borger",
                "Corene Cassette",
                "Ronda Rizo",
                "Burl Buxton",
                "Darren Dobson",
                "Jacki Jaime",
                "Casimira Calahan",
                "Deanne Daves",
                "Page Porcaro",
                "Dinah Ducksworth",
                "Carie Challis",
                "Danita Delahanty",
                "Arthur Alcala",
                "Annette Alcon",
                "Cindy Corella",
                "Caroyln Canino",
                "Laurel Lehmann",
                "Neely Newbern",
                "Lakeesha Leto",
                "Israel Ivie",
                "Clarence Castrejon",
                "Kellie Kahan",
                "Kimbery Klopfenstein",
                "Sook Sowers",
                "Brain Bal",
                "Ruthie Randall",
                "Dick Duclos",
                "Laurice Lebow",
                "Milton Mirando",
                "Edris Elkins",
                "Latarsha Lovato",
                "Lawrence Lalli",
                        "aaa", "Aaa","baa", "aaaa", "abce", "abc", "Abce"

                        ) );

    }


    public static int sortedByContainingE(String s1, String s2) {

        if (!s1.toString().toLowerCase().contains("e"))
            return s2.toString().toLowerCase().contains("e")?1:0;
        else
            return -1;
    }
}
