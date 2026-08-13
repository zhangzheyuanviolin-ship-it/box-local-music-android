            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.atomic.AtomicLong;
            import p000.IlIi0I0;
            
            public final class zzawd {
                private static final AtomicLong zza = new AtomicLong();
                private final String zzb;
                private final String zzc;
                private final long zzd;

                public zzawd(String str, String str2, long j) {
/* 6 */             zzgo.zzc(str, "typeName");
/* 17 */            zzgo.zzf(!str.isEmpty(), "empty type");
/* 20 */            this.zzb = str;
/* 22 */            this.zzc = str2;
/* 24 */            this.zzd = j;
                }

                public static zzawd zzb(Class cls, String str) {
/* 1 */             String simpleName = cls.getSimpleName();
/* 9 */             if (simpleName.isEmpty()) {
/* 30 */                simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
                    }
/* 34 */            return zzc(simpleName, str);
                }

                public static zzawd zzc(String str, String str2) {
/* 9 */             return new zzawd(str, str2, zza.incrementAndGet());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(this.zzb);
/* 15 */            sb.append("<");
/* 26 */            StringBuilder sb2 = new StringBuilder(IlIi0I0.I000o00OoI0I(sb, this.zzd, ">"));
/* 29 */            String str = this.zzc;
/* 31 */            if (str != null) {
/* 35 */                sb2.append(": (");
/* 38 */                sb2.append(str);
/* 43 */                sb2.append(')');
                    }
/* 46 */            return sb2.toString();
                }

                public final long zza() {
/* 1 */             return this.zzd;
                }
            }
