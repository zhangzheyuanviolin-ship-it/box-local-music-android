            package com.google.android.libraries.vision.visionkit.pipeline;

            import android.content.Context;
            
            public abstract class AndroidAssetUtil {
                public static synchronized void I00000oIO(Context context) {
/* 12 */            nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
                }

                private static native boolean nativeInitializeAssetManager(Context context, String str);
            }
