            package com.google.mlkit.genai.proofreading;

            import android.content.Context;
            import com.google.mlkit.genai.common.BaseOptions;
            
            public abstract class ProofreaderOptions extends BaseOptions {

                public static abstract class Builder {
                    public abstract ProofreaderOptions build();

                    public abstract Builder setInputType(int i);

                    public abstract Builder setLanguage(int i);
                }

                public @interface InputType {
                    public static final int KEYBOARD = 1;
                    public static final int VOICE = 2;
                }

                public @interface Language {
                    public static final int ENGLISH = 0;
                    public static final int FRENCH = 4;
                    public static final int GERMAN = 3;
                    public static final int ITALIAN = 5;
                    public static final int JAPANESE = 1;
                    public static final int KOREAN = 2;
                    public static final int SPANISH = 6;
                }

                public static Builder builder(Context context) {
/* 3 */             zza zzaVar = new zza();
/* 6 */             zzaVar.zza(context);
/* 10 */            zzaVar.setInputType(1);
/* 14 */            zzaVar.setLanguage(0);
/* 49 */            return zzaVar;
                }

                public abstract int zza();

                public abstract int zzb();

                public abstract Context zzc();
            }
