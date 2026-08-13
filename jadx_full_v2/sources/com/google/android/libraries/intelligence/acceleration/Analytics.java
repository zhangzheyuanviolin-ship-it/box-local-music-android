            package com.google.android.libraries.intelligence.acceleration;
            
            public abstract class Analytics {
                public static void I00000oIO(boolean z) {
/* 1 */             nativeNotifyProcessLifecycleState(z);
                }

                public static void I00000oOI() {
/* 1 */             nativeIsProcessInBackground();
                }

                private static native boolean nativeIsProcessInBackground();

                private static native void nativeNotifyProcessLifecycleState(boolean z);
            }
