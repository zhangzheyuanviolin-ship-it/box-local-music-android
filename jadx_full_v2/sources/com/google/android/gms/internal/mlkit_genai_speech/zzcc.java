            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzcc extends zzagg implements zzaho {
                private static final zzcc zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private zzar zzi;
                private int zzj;
                private int zzg = 0;
                private zzagm zzk = zzagg.zzv();
                private zzagm zzl = zzagg.zzv();

                static {
/* 3 */             zzcc zzccVar = new zzcc();
/* 6 */             zzb = zzccVar;
/* 10 */            zzagg.zzD(zzcc.class, zzccVar);
                }

                private zzcc() {
                }

                public static zzca zza() {
/* 7 */             return (zzca) zzb.zzo();
                }

                public static zzcc zzd() {
/* 1 */             return zzb;
                }

                public static void zze(zzcc zzccVar, zzv zzvVar) {
/* 1 */             zzvVar.getClass();
/* 4 */             zzccVar.zzh = zzvVar;
/* 7 */             zzccVar.zzg = 7;
                }

                public static void zzf(zzcc zzccVar, zzakm zzakmVar) {
/* 5 */             zzccVar.zzj = zzakmVar.zza();
                    zzccVar.zzf |= 2;
                }

                public static void zzg(zzcc zzccVar, zzar zzarVar) {
/* 1 */             zzarVar.getClass();
/* 4 */             zzccVar.zzi = zzarVar;
                    zzccVar.zzf |= 1;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 114 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 108 */               return zzagg.zzA(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ࠬ\u0004ࠬ\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"zzh", "zzg", "zzf", "zzi", "zzj", zzakm.zzb(), "zzk", zzajx.zza(), "zzl", zzajx.zza(), zzbz.class, zzfx.class, zzv.class, zzfg.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzcc();
                    }
/* 12 */            zzcb zzcbVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzca(zzcbVar);
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
                    synchronized (zzcc.class) {
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
