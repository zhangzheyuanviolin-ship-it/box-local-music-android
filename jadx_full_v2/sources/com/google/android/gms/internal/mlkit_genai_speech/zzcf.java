            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzcf extends zzagg implements zzaho {
                private static final zzcf zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private int zzj;
                private int zzg = 0;
                private String zzi = "";
                private zzagm zzk = zzagg.zzv();

                static {
/* 3 */             zzcf zzcfVar = new zzcf();
/* 6 */             zzb = zzcfVar;
/* 10 */            zzagg.zzD(zzcf.class, zzcfVar);
                }

                private zzcf() {
                }

                public final zzs zza() {
                    return this.zzg == 6 ? (zzs) this.zzh : zzs.zzd();
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 104 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 98 */                return zzagg.zzA(zzb, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ࠬ\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"zzh", "zzg", "zzf", "zzi", "zzj", "zzk", zzajx.zza(), zzbw.class, zzfu.class, zzs.class, zzfj.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzcf();
                    }
/* 12 */            zzcg zzcgVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzce(zzcgVar);
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
                    synchronized (zzcf.class) {
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

                public final zzbw zzc() {
                    return this.zzg == 4 ? (zzbw) this.zzh : zzbw.zzc();
                }
            }
