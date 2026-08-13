            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapp extends zzagd implements zzaho {
                private static final zzapp zze;
                private static volatile zzahv zzf;
                private int zzg;
                private zzakp zzh;
                private float zzi;
                private long zzj;
                private zzatq zzl;
                private int zzm;
                private int zzn;
                private byte zzo = 2;
                private String zzk = "";

                static {
/* 3 */             zzapp zzappVar = new zzapp();
/* 6 */             zze = zzappVar;
/* 10 */            zzagg.zzD(zzapp.class, zzappVar);
                }

                private zzapp() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 106 */               return Byte.valueOf(this.zzo);
                    }
/* 6 */             if (i2 == 2) {
/* 99 */                return zzagg.zzA(zze, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007င\u0006", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzapo.zza, "zzn"});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzapp();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzapn(zzarwVar);
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
                    synchronized (zzapp.class) {
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
