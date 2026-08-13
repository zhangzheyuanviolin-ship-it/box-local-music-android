            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbt extends zzagg implements zzaho {
                private static final zzbt zzb;
                private static volatile zzahv zze;
                private int zzf;
                private String zzg = "";
                private int zzh;
                private boolean zzi;

                static {
/* 3 */             zzbt zzbtVar = new zzbt();
/* 6 */             zzb = zzbtVar;
/* 10 */            zzagg.zzD(zzbt.class, zzbtVar);
                }

                private zzbt() {
                }

                public static zzbr zza() {
/* 7 */             return (zzbr) zzb.zzo();
                }

                public static void zzd(zzbt zzbtVar, zzakm zzakmVar) {
/* 5 */             zzbtVar.zzh = zzakmVar.zza();
                    zzbtVar.zzf |= 2;
                }

                public static void zze(zzbt zzbtVar, String str) {
/* 1 */             str.getClass();
                    zzbtVar.zzf |= 1;
/* 10 */            zzbtVar.zzg = str;
                }

                public static void zzf(zzbt zzbtVar, boolean z) {
                    zzbtVar.zzf |= 4;
/* 8 */             zzbtVar.zzi = false;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 91 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 85 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"zzf", "zzg", "zzh", zzakm.zzb(), "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzbt();
                    }
/* 12 */            zzbs zzbsVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzbr(zzbsVar);
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
                    synchronized (zzbt.class) {
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
