            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaqt extends zzagg implements zzaho {
                private static final zzaqt zzb;
                private static volatile zzahv zze;
                private int zzf;
                private zzakp zzg;
                private zzakp zzh;
                private int zzi;
                private int zzj;
                private int zzk;
                private float zzl;
                private zzakp zzm;
                private zzakp zzn;
                private long zzo;
                private zzaoz zzp;
                private zzakp zzq;

                static {
/* 3 */             zzaqt zzaqtVar = new zzaqt();
/* 6 */             zzb = zzaqtVar;
/* 10 */            zzagg.zzD(zzaqt.class, zzaqtVar);
                }

                private zzaqt() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 104 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 98 */                return zzagg.zzA(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0002\u0003င\u0003\u0004င\u0004\u0005ခ\u0005\u0006ဉ\u0001\u0007ဉ\u0006\bဉ\u0007\tဂ\b\nဉ\t\u000bဉ\n", new Object[]{"zzf", "zzg", "zzi", "zzj", "zzk", "zzl", "zzh", "zzm", "zzn", "zzo", "zzp", "zzq"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzaqt();
                    }
/* 12 */            zzarw zzarwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzaqs(zzarwVar);
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
                    synchronized (zzaqt.class) {
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
