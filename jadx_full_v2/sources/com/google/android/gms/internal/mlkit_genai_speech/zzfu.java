            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzfu extends zzagg implements zzaho {
                private static final zzfu zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzk;
                private int zzl;
                private long zzm;
                private zzahh zzo = zzahh.zza();
                private zzago zzg = zzagg.zzx();
                private zzago zzh = zzagg.zzx();
                private zzago zzi = zzagg.zzx();
                private zzago zzj = zzagg.zzx();
                private String zzn = "";

                static {
/* 3 */             zzfu zzfuVar = new zzfu();
/* 6 */             zzb = zzfuVar;
/* 10 */            zzagg.zzD(zzfu.class, zzfuVar);
                }

                private zzfu() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 107 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 101 */               return zzagg.zzA(zzb, "\u0004\t\u0000\u0001\u0003\f\t\u0001\u0004\u0000\u0003Ț\u0004င\u0000\u0005ဌ\u0001\u0006ဂ\u0002\b\u001b\t\u001b\nለ\u0003\u000b2\f\u001b", new Object[]{"zzf", "zzj", "zzk", "zzl", "zzm", "zzg", zzfq.class, "zzh", zzfs.class, "zzn", "zzo", zzfn.zza, "zzi", zzfs.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzfu();
                    }
/* 12 */            zzft zzftVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzfo(zzftVar);
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
                    synchronized (zzfu.class) {
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
