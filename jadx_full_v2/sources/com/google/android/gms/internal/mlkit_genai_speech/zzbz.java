            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzbz extends zzagg implements zzaho {
                private static final zzbz zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private zzagm zzh = zzagg.zzv();
                private zzagm zzi = zzagg.zzv();

                static {
/* 3 */             zzbz zzbzVar = new zzbz();
/* 6 */             zzb = zzbzVar;
/* 10 */            zzagg.zzD(zzbz.class, zzbzVar);
                }

                private zzbz() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 100 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 94 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001᠌\u0000\u0002ࠬ\u0003ࠬ", new Object[]{"zzf", "zzg", zzakm.zzb(), "zzh", zzajx.zza(), "zzi", zzajx.zza()});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzbz();
                    }
/* 12 */            zzby zzbyVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzbx(zzbyVar);
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
                    synchronized (zzbz.class) {
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
