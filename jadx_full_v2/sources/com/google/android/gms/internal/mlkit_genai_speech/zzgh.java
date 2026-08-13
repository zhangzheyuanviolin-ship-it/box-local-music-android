            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.Objects;
            
            public final class zzgh {
                private final String zza = ",";

                private zzgh(String str) {
                }

                public static zzgh zza(char c) {
/* 5 */             return new zzgh(",");
                }

                public static final CharSequence zzc(Object obj) {
/* 1 */             Objects.requireNonNull(obj);
                    return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
                }

                public final Appendable zzb(Appendable appendable, Iterator it) throws IOException {
/* 5 */             if (it.hasNext()) {
/* 15 */                appendable.append(zzc(it.next()));
/* 22 */                while (it.hasNext()) {
/* 26 */                    appendable.append(this.zza);
/* 37 */                    appendable.append(zzc(it.next()));
                        }
                    }
/* 106 */           return appendable;
                }
            }
