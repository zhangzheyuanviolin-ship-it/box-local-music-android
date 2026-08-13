            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.text.MessageFormat;
            import java.util.logging.Level;
            
            final class zzbdb extends zzauc {
                private final zzbdc zza;

                public zzbdb(zzbdc zzbdcVar, zzbnl zzbnlVar) {
/* 6 */             zzgo.zzc(zzbdcVar, "tracer");
/* 9 */             this.zza = zzbdcVar;
/* 13 */            zzgo.zzc(zzbnlVar, "time");
                }

                public static void zzc(zzawd zzawdVar, int i, String str) {
/* 1 */             Level levelZze = zze(i);
/* 11 */            if (zzbdc.zza.isLoggable(levelZze)) {
/* 13 */                zzbdc.zzb(zzawdVar, levelZze, str);
                    }
                }

                public static void zzd(zzawd zzawdVar, int i, String str, Object... objArr) {
/* 2 */             Level levelZze = zze(2);
/* 12 */            if (zzbdc.zza.isLoggable(levelZze)) {
/* 18 */                zzbdc.zzb(zzawdVar, levelZze, MessageFormat.format(str, objArr));
                    }
                }

                private static Level zze(int i) {
                    int i2 = i - 1;
                    return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
                }

                private final boolean zzf(int i) {
/* 2 */             if (i == 1) {
/* 9 */                 return false;
                    }
/* 6 */             this.zza.zzd();
/* 9 */             return false;
                }

                @Override
                public final void zza(int i, String str) {
/* 7 */             zzc(this.zza.zza(), i, str);
/* 10 */            zzf(i);
                }

                @Override
                public final void zzb(int i, String str, Object... objArr) {
/* 1 */             Level levelZze = zze(i);
/* 5 */             zzf(i);
/* 22 */            zza(i, zzbdc.zza.isLoggable(levelZze) ? MessageFormat.format(str, objArr) : null);
                }
            }
