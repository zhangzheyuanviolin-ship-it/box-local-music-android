            package com.google.mlkit.genai.summarization;

            import android.content.Context;
            import com.google.mlkit.genai.common.BaseOptions;
            
            public abstract class SummarizerOptions extends BaseOptions {

                public static abstract class Builder {
                    public abstract SummarizerOptions build();

                    public abstract Builder setInputType(int i);

                    public abstract Builder setLanguage(int i);

                    public abstract Builder setLongInputAutoTruncationEnabled(boolean z);

                    public abstract Builder setOutputType(int i);
                }

                public @interface InputType {
                    public static final int ARTICLE = 1;
                    public static final int CONVERSATION = 2;
                }

                public @interface Language {
                    public static final int ENGLISH = 0;
                    public static final int JAPANESE = 1;
                    public static final int KOREAN = 2;
                }

                public @interface OutputType {
                    public static final int ONE_BULLET = 1;
                    public static final int THREE_BULLETS = 3;
                    public static final int TWO_BULLETS = 2;
                }

                public static Builder builder(Context context) {
/* 3 */             zzd zzdVar = new zzd();
/* 6 */             zzdVar.zza(context);
/* 10 */            zzdVar.setInputType(1);
/* 13 */            zzdVar.setOutputType(1);
/* 17 */            zzdVar.setLanguage(0);
/* 20 */            zzdVar.setLongInputAutoTruncationEnabled(false);
/* 49 */            return zzdVar;
                }

                public abstract int zza();

                public abstract int zzb();

                public abstract int zzc();

                public abstract Context zzd();

                public abstract boolean zze();
            }
