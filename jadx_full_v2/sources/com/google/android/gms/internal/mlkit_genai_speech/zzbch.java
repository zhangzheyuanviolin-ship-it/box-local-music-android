            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.Context;
            import android.os.UserHandle;
            import java.lang.reflect.Method;
            
            final class zzbch {
                private static volatile Method zza;

                private zzbch() {
                }

                public static Context zza(Context context, UserHandle userHandle, int i) {
/* 3 */             if (zza == null) {
                        synchronized (zzbch.class) {
                            try {
/* 10 */                        if (zza == null) {
/* 28 */                            zza = Context.class.getMethod("createContextAsUser", UserHandle.class, Integer.TYPE);
                                }
                            } finally {
                            }
                        }
                    }
/* 52 */            return (Context) zza.invoke(context, userHandle, 0);
                }
            }
