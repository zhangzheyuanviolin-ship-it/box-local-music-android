            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.List;
            
            public final class zzch extends zzagg implements zzaho {
                private static final zzch zzb;
                private static volatile zzahv zze;
                private zzago zzf = zzagg.zzx();
                private zzago zzg = zzagg.zzx();
                private zzago zzh = zzagg.zzx();

                static {
/* 3 */             zzch zzchVar = new zzch();
/* 6 */             zzb = zzchVar;
/* 10 */            zzagg.zzD(zzch.class, zzchVar);
                }

                private zzch() {
                }

                public static zzch zzc() {
/* 1 */             return zzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 90 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 84 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"zzf", zzcf.class, "zzg", zzcf.class, "zzh", zzcf.class});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzch();
                    }
/* 12 */            zzcg zzcgVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzcd(zzcgVar);
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
                    synchronized (zzch.class) {
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

                public final List zzd() {
/* 1 */             return this.zzg;
                }

                public final List zze() {
/* 1 */             return this.zzf;
                }

                public final List zzf() {
/* 1 */             return this.zzh;
                }
            }
