            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzar extends zzagg implements zzaho {
                private static final zzar zzb;
                private static volatile zzahv zze;
                private int zzf;
                private String zzg = "";
                private String zzh = "";
                private String zzi = "";
                private String zzj = "";
                private int zzk = 1;

                static {
/* 3 */             zzar zzarVar = new zzar();
/* 6 */             zzb = zzarVar;
/* 10 */            zzagg.zzD(zzar.class, zzarVar);
                }

                private zzar() {
                }

                public static zzao zza() {
/* 7 */             return (zzao) zzb.zzo();
                }

                public static void zzd(zzar zzarVar, zzap zzapVar) {
/* 5 */             zzarVar.zzk = zzapVar.zza();
                    zzarVar.zzf |= 16;
                }

                public static void zze(zzar zzarVar, String str) {
/* 1 */             str.getClass();
                    zzarVar.zzf |= 1;
/* 10 */            zzarVar.zzg = str;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzar();
                    }
/* 12 */            zzaq zzaqVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzao(zzaqVar);
                    }
/* 16 */            if (i2 == 5) {
/* 51 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 49 */                return zzahvVar;
                    }
                    synchronized (zzar.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return zzagbVar;
                }
            }
