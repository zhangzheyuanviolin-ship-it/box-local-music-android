            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Locale;
            import java.util.concurrent.TimeUnit;
            import p000.IlIi0I0;
            import p000.OoOil11Ol1o;
            
            public final class zzgs {
                private boolean zza;
                private long zzb;

                public zzgs() {
/* 4 */             int i = zzgx.zza;
                }

                public static zzgs zzb() {
/* 3 */             return new zzgs();
                }

                private final long zze() {
/* 3 */             if (this.zza) {
/* 11 */                return System.nanoTime() - this.zzb;
                    }
/* 13 */            return 0L;
                }

                public final String toString() {
                    String str;
/* 1 */             long jZze = zze();
/* 86 */            TimeUnit timeUnit = jZze / 86400000000000L > 0 ? TimeUnit.DAYS : jZze / 3600000000000L > 0 ? TimeUnit.HOURS : jZze / 60000000000L > 0 ? TimeUnit.MINUTES : jZze / 1000000000 > 0 ? TimeUnit.SECONDS : jZze / 1000000 > 0 ? TimeUnit.MILLISECONDS : jZze / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
/* 108 */           String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZze / r2.convert(1L, timeUnit)));
                    switch (zzgr.zza[timeUnit.ordinal()]) {
                        case 1:
/* 146 */                   str = "ns";
                            break;
                        case 2:
/* 143 */                   str = "μs";
                            break;
                        case 3:
/* 140 */                   str = "ms";
                            break;
                        case 4:
/* 137 */                   str = "s";
                            break;
                        case 5:
/* 134 */                   str = "min";
                            break;
                        case 6:
/* 131 */                   str = "h";
                            break;
                        case 7:
/* 128 */                   str = "d";
                            break;
                        default:
/* 123 */                   OoOil11Ol1o.I0000Il00O();
/* 126 */                   return null;
                    }
/* 150 */           return IlIi0I0.I000lI(str2, " ", str);
                }

                public final long zza(TimeUnit timeUnit) {
/* 7 */             return timeUnit.convert(zze(), TimeUnit.NANOSECONDS);
                }

                public final zzgs zzc() {
/* 2 */             this.zza = false;
/* 20 */            return this;
                }

                public final zzgs zzd() {
/* 7 */             zzgo.zzn(!this.zza, "This stopwatch is already running.");
/* 10 */            this.zza = true;
/* 16 */            this.zzb = System.nanoTime();
/* 20 */            return this;
                }
            }
