            package com.google.mlkit.genai.proofreading;
            
            public final class Proofreading {
                private Proofreading() {
                }

                public static Proofreader getClient(ProofreaderOptions proofreaderOptions) {
/* 3 */             return new Proofreader(proofreaderOptions);
                }
            }
