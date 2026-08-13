            package com.google.mlkit.genai.common;
            
/* 27 */    public interface StreamingCallback {
                void onNewText(String str);

/* 28 */        default void onNewThought(String str) {
                }
            }
