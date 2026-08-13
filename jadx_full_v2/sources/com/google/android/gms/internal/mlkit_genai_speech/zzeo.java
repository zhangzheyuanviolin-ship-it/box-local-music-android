            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzeo extends zzagg implements zzaho {
                private static final zzeo zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private int zzh;

                static {
/* 3 */             zzeo zzeoVar = new zzeo();
/* 6 */             zzb = zzeoVar;
/* 10 */            zzagg.zzD(zzeo.class, zzeoVar);
                }

                private zzeo() {
                }

                public static zzeo zzc() {
/* 1 */             return zzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 89 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 83 */                return zzagg.zzA(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzf", "zzg", zzem.zza, "zzh", zzek.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzeo();
                    }
/* 12 */            zzep zzepVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzej(zzepVar);
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
                    synchronized (zzeo.class) {
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

                public final int zzd() {
/* 3 */             int iZza = zzel.zza(this.zzh);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 20 */            return iZza;
                }

                public final int zze() {
/* 3 */             int iZza = zzen.zza(this.zzg);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 20 */            return iZza;
                }
            }
