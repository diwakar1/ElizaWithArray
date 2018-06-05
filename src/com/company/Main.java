package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

        public class Main {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                Random rand = new Random();

                ArrayList<String> qualifiers = new ArrayList<String>();
                ArrayList<String> hedges = new ArrayList<String>();

                String hedg;
                String qual;

                hedges.add("Please tell me more");
                hedges.add("Many of my patients tell me the same thing");
                hedges.add("It is getting late, maybe we had better quit");

                qualifiers.add("Why do you say that");
                qualifiers.add("You seem to think that");
                qualifiers.add("So, you are concerned that");

                System.out.println(" I am aliza. How can I help you?");
                System.out.println(".......................................");

                System.out.println(" can you tell me your problem, please ");
                String question = input.nextLine();

                String[] inpt = (question.split(" "));
                String[] message = new String[inpt.length];
                while (!question.toLowerCase().equals("q")) {
                    inpt = (question.split(" "));
                    if (question.contains("I") || question.contains("me") || question.contains("my") || question.contains("am")) {


                        for (int i = 0; i < inpt.length; i++) {


                            if (inpt[i].contains("I")) {

                                inpt[i] = inpt[i].replace("I", "you");

                            } else if (inpt[i].contains("me")) {

                                inpt[i] = inpt[i].replace("me", "you");

                            } else if (inpt[i].contains("my")) {

                                inpt[i] = inpt[i].replace("my", "your");


                            } else if (inpt[i].contains("am")) {

                                inpt[i] = inpt[i].replace("am", "are");


                            } else {
                                inpt[i] = inpt[i];
                            }
                        }
                        int ra = rand.nextInt(qualifiers.size());
                        qual = qualifiers.get(ra);
                        System.out.print(qual + " ");
                        for (int i = 0; i < inpt.length; i++) {
                            System.out.print(inpt[i] + " ");
                        }
                        System.out.println("?");
                        System.out.println("..............................................");
                        question = input.nextLine();

                    } else {
                        int ran = rand.nextInt(hedges.size());
                        hedg = hedges.get(ran);
                        System.out.println(hedg);
                        question = input.nextLine();

                    }


                }
                System.out.println("thank you for playing");


            }
        }






