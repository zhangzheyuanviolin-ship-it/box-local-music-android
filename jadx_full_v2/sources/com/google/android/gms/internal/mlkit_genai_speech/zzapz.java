            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapz extends zzagd implements zzaho {
                private static final zzapz zze;
                private static volatile zzahv zzf;
                private int zzg;
                private int zzi;
                private int zzk;
                private int zzl;
                private byte zzm = 2;
                private zzago zzh = zzagg.zzx();
                private zzago zzj = zzagg.zzx();

                static {
/* 3 */             zzapz zzapzVar = new zzapz();
/* 6 */             zze = zzapzVar;
/* 10 */            zzagg.zzD(zzapz.class, zzapzVar);
                }

                private zzapz() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 108 */               return Byte.valueOf(this.zzm);
                    }
/* 6 */             if (i2 == 2) {
/* 101 */               return zzagg.zzA(zze, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001Л\u0002᠌\u0000\u0003᠌\u0001\u0004\u001a\u0005᠌\u0002", new Object[]{"zzg", "zzh", zzaqb.class, "zzi", zzapy.zza, "zzk", zzapw.zza, "zzj", "zzl", zzapv.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzapz();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzapx(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzm = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzapz.class) {
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
