            package com.google.mlkit.genai.rewriting;

            import android.content.Context;
            import com.google.mlkit.genai.common.BaseOptions;
            
            public abstract class RewriterOptions extends BaseOptions {

                public static abstract class Builder {
                    public abstract RewriterOptions build();

                    public abstract Builder setLanguage(int i);

                    public abstract Builder setOutputType(int i);
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

                public @interface OutputType {
                    public static final int ELABORATE = 1;
                    public static final int EMOJIFY = 2;
                    public static final int FRIENDLY = 4;
                    public static final int PROFESSIONAL = 5;
                    public static final int REPHRASE = 6;
                    public static final int SHORTEN = 3;
                }

                public static Builder builder(Context context) {
/* 3 */             zza zzaVar = new zza();
/* 6 */             zzaVar.zza(context);
/* 10 */            zzaVar.setOutputType(1);
/* 14 */            zzaVar.setLanguage(0);
/* 49 */            return zzaVar;
                }

                public abstract int zza();

                public abstract int zzb();

                public abstract Context zzc();
            }
