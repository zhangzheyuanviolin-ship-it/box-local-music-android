            package com.google.android.libraries.intelligence.acceleration;
            
            public abstract class AndroidSystemDetectionJNI {
                public static final native byte[] GetDeviceInfo();

                public static final native byte[] GetNNAPIInfo();
            }
