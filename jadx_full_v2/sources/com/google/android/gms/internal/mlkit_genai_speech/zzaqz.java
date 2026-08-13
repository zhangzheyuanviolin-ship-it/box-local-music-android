            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaqz extends zzagd implements zzaho {
                private static final zzaqz zze;
                private static volatile zzahv zzf;
                private int zzg;
                private float zzj;
                private float zzk;
                private float zzl;
                private zzart zzm;
                private zzarm zzn;
                private float zzo;
                private float zzp;
                private zzaor zzq;
                private zzanj zzr;
                private byte zzs = 2;
                private zzago zzh = zzagg.zzx();
                private zzago zzi = zzagg.zzx();

                static {
/* 3 */             zzaqz zzaqzVar = new zzaqz();
/* 6 */             zze = zzaqzVar;
/* 10 */            zzagg.zzD(zzaqz.class, zzaqzVar);
                }

                private zzaqz() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 114 */               return Byte.valueOf(this.zzs);
                    }
/* 6 */             if (i2 == 2) {
/* 107 */               return zzagg.zzA(zze, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0001\u0001\u001a\u0002ခ\u0000\u0003ခ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ခ\u0005\u0007ခ\u0006\bЛ\tခ\u0002\nဉ\u0007\u000bဉ\b", new Object[]{"zzg", "zzh", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzi", zzapr.class, "zzl", "zzq", "zzr"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzaqz();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzaqy(zzarwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zze;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzs = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zzf;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzaqz.class) {
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
