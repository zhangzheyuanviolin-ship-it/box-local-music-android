            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapr extends zzagd implements zzaho {
                private static final zzapr zze;
                private static volatile zzahv zzf;
                private int zzg;
                private long zzi;
                private zzaop zzj;
                private boolean zzk;
                private int zzl;
                private float zzn;
                private byte zzo = 2;
                private zzago zzh = zzagg.zzx();
                private zzago zzm = zzagg.zzx();

                static {
/* 3 */             zzapr zzaprVar = new zzapr();
/* 6 */             zze = zzaprVar;
/* 10 */            zzagg.zzD(zzapr.class, zzaprVar);
                }

                private zzapr() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 108 */               return Byte.valueOf(this.zzo);
                    }
/* 6 */             if (i2 == 2) {
/* 101 */               return zzagg.zzA(zze, "\u0001\u0007\u0000\u0001\u0001\u0012\u0007\u0000\u0002\u0000\u0001\u001a\u0002ဂ\u0000\u0003ဉ\u0001\u0004ဇ\u0002\u0005᠌\u0003\u0006ခ\u0004\u0012\u001b", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzard.zza, "zzn", "zzm", zzarv.class});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzapr();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzapq(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzo = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzapr.class) {
                        try {
/* 36 */                    zzagbVar = zzf;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zze);
/* 47 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzagbVar;
                }
            }
