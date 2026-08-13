            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzasi extends zzagd implements zzaho {
                private static final zzasi zze;
                private static volatile zzahv zzf;
                private int zzg;
                private int zzh;
                private boolean zzi;
                private int zzj;
                private zzasd zzk;
                private zzasf zzl;
                private byte zzn = 2;
                private zzagm zzm = zzagg.zzv();

                static {
/* 3 */             zzasi zzasiVar = new zzasi();
/* 6 */             zze = zzasiVar;
/* 10 */            zzagg.zzD(zzasi.class, zzasiVar);
                }

                private zzasi() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 106 */               return Byte.valueOf(this.zzn);
                    }
/* 6 */             if (i2 == 2) {
/* 99 */                return zzagg.zzA(zze, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005\u0016\u0006᠌\u0002", new Object[]{"zzg", "zzh", zzasa.zza, "zzi", "zzk", "zzl", "zzm", "zzj", zzash.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzasi();
                    }
/* 12 */            zzasj zzasjVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzasg(zzasjVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzn = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzasi.class) {
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
