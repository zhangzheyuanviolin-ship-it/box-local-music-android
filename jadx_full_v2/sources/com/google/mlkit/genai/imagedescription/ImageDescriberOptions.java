            package com.google.mlkit.genai.imagedescription;

            import android.content.Context;
            
            public abstract class ImageDescriberOptions {

                public static abstract class Builder {
                    public abstract ImageDescriberOptions build();
                }

                public static Builder builder(Context context) {
/* 3 */             zza zzaVar = new zza();
/* 6 */             zzaVar.zza(context);
/* 49 */            return zzaVar;
                }

                public abstract Context zza();
            }
