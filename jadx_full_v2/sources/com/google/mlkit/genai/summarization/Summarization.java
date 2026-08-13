            package com.google.mlkit.genai.summarization;
            
            public final class Summarization {
                private Summarization() {
                }

                public static Summarizer getClient(SummarizerOptions summarizerOptions) {
/* 3 */             return new Summarizer(summarizerOptions);
                }
            }
