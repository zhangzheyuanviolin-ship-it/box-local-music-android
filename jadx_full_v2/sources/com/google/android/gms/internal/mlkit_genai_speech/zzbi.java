            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbi extends zzagg implements zzaho {
                private static final zzbi zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private int zzh;
                private boolean zzi;

                static {
/* 3 */             zzbi zzbiVar = new zzbi();
/* 6 */             zzb = zzbiVar;
/* 10 */            zzagg.zzD(zzbi.class, zzbiVar);
                }

                private zzbi() {
                }

                public static zzbe zza() {
/* 7 */             return (zzbe) zzb.zzo();
                }

                public static void zzd(zzbi zzbiVar, boolean z) {
                    zzbiVar.zzf |= 1;
/* 7 */             zzbiVar.zzg = true;
                }

                public static void zze(zzbi zzbiVar, zzbg zzbgVar) {
/* 5 */             zzbiVar.zzh = zzbgVar.zza();
                    zzbiVar.zzf |= 2;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"zzf", "zzg", "zzh", zzbf.zza, "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzbi();
                    }
/* 12 */            zzbh zzbhVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzbe(zzbhVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 48 */                return zzahvVar;
                    }
                    synchronized (zzbi.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzagbVar;
                }
            }
