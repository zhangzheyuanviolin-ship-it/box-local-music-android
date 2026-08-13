            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzdz extends zzagg implements zzaho {
                private static final zzdz zzb;
                private static volatile zzahv zze;
                private int zzf;
                private String zzg = "";
                private zzago zzh = zzagg.zzx();
                private zzagl zzi = zzagg.zzu();
                private zzago zzj = zzagg.zzx();

                static {
/* 3 */             zzdz zzdzVar = new zzdz();
/* 6 */             zzb = zzdzVar;
/* 10 */            zzagg.zzD(zzdz.class, zzdzVar);
                }

                private zzdz() {
                }

                public static zzdz zzc() {
/* 1 */             return zzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzagg.zzA(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003$\u0004\u001b", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", zzei.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzdz();
                    }
/* 12 */            zzep zzepVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzdy(zzepVar);
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
                    synchronized (zzdz.class) {
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

                public final String zzd(int i) {
/* 8 */             return (String) this.zzh.get(0);
                }
            }
