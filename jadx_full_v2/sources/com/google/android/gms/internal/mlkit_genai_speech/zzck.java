            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzck extends zzagg implements zzaho {
                private static final zzck zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private int zzj;
                private boolean zzk;
                private zzar zzm;
                private int zzg = 0;
                private String zzi = "";
                private boolean zzl = true;

                static {
/* 3 */             zzck zzckVar = new zzck();
/* 6 */             zzb = zzckVar;
/* 10 */            zzagg.zzD(zzck.class, zzckVar);
                }

                private zzck() {
                }

                public static zzci zza() {
/* 7 */             return (zzci) zzb.zzo();
                }

                public static zzck zzd() {
/* 1 */             return zzb;
                }

                public static void zze(zzck zzckVar, zzp zzpVar) {
/* 1 */             zzpVar.getClass();
/* 4 */             zzckVar.zzh = zzpVar;
/* 8 */             zzckVar.zzg = 8;
                }

                public static void zzf(zzck zzckVar, zzar zzarVar) {
/* 1 */             zzarVar.getClass();
/* 4 */             zzckVar.zzm = zzarVar;
                    zzckVar.zzf |= 16;
                }

                public static void zzg(zzck zzckVar, boolean z) {
                    zzckVar.zzf |= 8;
/* 8 */             zzckVar.zzl = true;
                }

                public static void zzh(zzck zzckVar, zzbt zzbtVar) {
/* 1 */             zzbtVar.getClass();
/* 4 */             zzckVar.zzh = zzbtVar;
/* 7 */             zzckVar.zzg = 6;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 108 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 102 */               return zzagg.zzA(zzb, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"zzh", "zzg", "zzf", "zzi", "zzj", zzakm.zzb(), "zzk", "zzl", "zzm", zzbt.class, zzfm.class, zzp.class, zzfd.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzck();
                    }
/* 12 */            zzcj zzcjVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzci(zzcjVar);
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
                    synchronized (zzck.class) {
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
