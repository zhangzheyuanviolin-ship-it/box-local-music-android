            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.TimeUnit;
            import p000.OIlOl1;
            import p000.OlIo0Ooi1loI;
            
            final class zzbgp implements zzaxi {
                @Override
                public final Object zza(String str) throws NumberFormatException {
/* 14 */            zzgo.zzf(str.length() > 0, "empty timeout");
/* 29 */            zzgo.zzf(str.length() <= 9, "bad timeout format");
/* 42 */            long j = Long.parseLong(str.substring(0, str.length() - 1));
/* 52 */            char cCharAt = str.charAt(str.length() - 1);
/* 58 */            if (cCharAt == 'H') {
/* 155 */               return Long.valueOf(TimeUnit.HOURS.toNanos(j));
                    }
/* 62 */            if (cCharAt == 'M') {
/* 144 */               return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
                    }
/* 66 */            if (cCharAt == 'S') {
/* 133 */               return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
                    }
/* 70 */            if (cCharAt == 'u') {
/* 122 */               return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
                    }
/* 74 */            if (cCharAt == 'm') {
/* 111 */               return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
                    }
/* 78 */            if (cCharAt == 'n') {
/* 80 */                return Long.valueOf(j);
                    }
/* 104 */           throw new IllegalArgumentException("Invalid timeout unit: " + cCharAt);
                }

                @Override
                public final String zzb(Object obj) {
/* 9 */             long jMax = Math.max(1L, ((Long) obj).longValue());
/* 18 */            if (jMax < 100000000) {
/* 33 */                return jMax + "n";
                    }
/* 45 */            if (jMax < 100000000000L) {
/* 63 */                return (jMax / 1000) + "u";
                    }
/* 75 */            if (jMax < 100000000000000L) {
/* 94 */                return (jMax / 1000000) + "m";
                    }
/* 106 */           if (jMax < 100000000000000000L) {
/* 125 */               return (jMax / 1000000000) + OIlOl1.I00iiI;
                    }
/* 137 */           if (jMax < 6000000000000000000L) {
/* 158 */               return (jMax / 60000000000L) + "M";
                    }
/* 182 */           return (jMax / 3600000000000L) + OlIo0Ooi1loI.I000o00OoI0I;
                }
            }
