            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzart extends zzagg implements zzaho {
                private static final zzart zzb;
                private static volatile zzahv zze;
                private int zzf;
                private long zzg;
                private long zzh;
                private long zzi;
                private long zzj;
                private long zzk;
                private long zzl;
                private long zzm;
                private float zzn;
                private zzagn zzo = zzagg.zzw();
                private long zzp;
                private long zzq;
                private long zzr;
                private long zzs;
                private long zzt;
                private long zzu;

                static {
/* 3 */             zzart zzartVar = new zzart();
/* 6 */             zzb = zzartVar;
/* 10 */            zzagg.zzD(zzart.class, zzartVar);
                }

                private zzart() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 111 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 105 */               return zzagg.zzA(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001ဂ\u0003\u0002ဂ\u0004\u0003ဂ\u0005\u0004ဂ\u0006\u0005ခ\u0007\u0006ဂ\u0000\u0007ဂ\u0002\b\u0014\tဂ\b\nဂ\n\u000bဂ\u000b\fဂ\r\rဂ\u0001\u000eဂ\t\u000fဂ\f", new Object[]{"zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzg", "zzi", "zzo", "zzp", "zzr", "zzs", "zzu", "zzh", "zzq", "zzt"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzart();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzars(zzarwVar);
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
                    synchronized (zzart.class) {
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
            }
